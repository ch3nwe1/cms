<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>内容管理系统</title>
	<link href="/img/favicon.ico" rel="icon" type="image/x-icon">
	<link href="/css/bootstrap.min.css" rel="stylesheet">
	<link href="/css/login.css" rel="stylesheet">
	<link href="/css/bootstrapValidator.css" rel="stylesheet">
	<script type="text/javascript" src="/js/jquery-3.3.1.min.js"></script>
	<script type="text/javascript" src="/js/bootstrap.min.js"></script>
	<script type="text/javascript" src="/js/bootstrapValidator.js"></script>
	
</head>
<body>
	
	<div class="container">
        <div class="form row">
            <form action="/login" class="form-horizontal col-md-offset-3" id="login_form" method="post">
                <h3 class="form-title">LOGIN</h3>
                <div class="col-md-9">
                    <div class="form-group">
                        <label for="username">用户名：</label>
                        <input class="form-control required" type="text" placeholder="Username" id="username" name="username" autofocus="autofocus" maxlength="20"/>
                    </div>
                    <div class="form-group">
                        <label for="password">密码：</label>
                        <input class="form-control required" type="password" placeholder="Password" id="password" name="password" maxlength="16"/>
                    </div>
                    <div class="form-group">
                        <h3><span id="tip" class="label label-success"></span></h3>
                    </div>
                    <div class="form-group">
                        <label class="checkbox">
                            <input type="checkbox" id="keepLogin" value="1"/>记住我
                        </label>
                    </div>
                    <div class="form-group col-md-offset-9">
                        <button type="button" class="btn btn-success pull-left" id="signUp">登录</button>
                    	<button type="reset" class="btn btn-success pull-right" name="reset">重置</button>
                    </div>
                </div>
            </form>
        </div>
    </div>
	
</body>
<script type="text/javascript" >
	$(document).ready(function() {
		$('#login_form').bootstrapValidator(
			{
				//live: 'submitted',//验证时机，enabled是内容有变化就验证（默认），disabled和submitted是提交再验证  
				//excluded: [':disabled', ':hidden', ':not(:visible)'], //排除无需验证的控件，比如被禁用的或者被隐藏的  
				submitButtons: '#signUp',//指定提交按钮，如果验证失败则变成disabled，但我没试成功，反而加了这句话非submit按钮也会提交到action指定页面
				message : 'This value is not valid',
				
				feedbackIcons : {
					valid : 'glyphicon glyphicon-ok',
					invalid : 'glyphicon glyphicon-remove',
					validating : 'glyphicon glyphicon-refresh'
				},
				fields : {
					username : {
						validators: {
							notEmpty : {
								message : '用户名不能为空'
							},
							/* stringLength : {
								min : 8,
								max : 8,
								message : '用户名为8位'
							}, */
							regexp : {
								regexp : '^[0-9]{8}$',
								message : '用户名为8位数字'
							}
						}
					},
					password : {
						validators : {
							notEmpty : {
								message : '密码不能为空'
							}
						}
					}
				},
				/* submitHandler: function (validator, form, submitButton) {
					alert(validator.isValid());
					if(check()){
						form.submit();
					}
	            } */
			}
		);
		$("#signUp").click(function () {//非submit按钮点击后进行验证，如果是submit则无需此句直接验证  
		     $("#login_form").bootstrapValidator('validate');//提交验证  
		     if ($("#login_form").data('bootstrapValidator').isValid()) {// 获取验证结果，如果成功，执行下面代码 
		    	var _url = '/login/validate';
		 		var _username = $('#username').val();
		 		var _password = $('#password').val();
		 		var _data = {
		 				username : _username,
		 				password : _password
		 		};
		 		/* 验证用户密码是否匹配 */
		 		$.ajax({
					type : "post",
					url : _url,
					data : _data,
					/* async : false, */
					success : function(result){
						if(result.status == 200){
							$('#tip').html(result.msg);
					        document.getElementById("login_form").submit();
						}else{
							$('#tip').html(result.msg);
						}
					}
				});
		     }  
		});

	});
	
	
</script>

</html>