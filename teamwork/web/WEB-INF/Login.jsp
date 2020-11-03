<%--
  Created by IntelliJ IDEA.
  User: lichao
  Date: 2020/11/2
  Time: 22:47
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>管理登录</title>
    <link rel="stylesheet" href="me.css" />
</head>
<body>
<br>
<br>
<br>
<div class="m-container-small m-padding-tb-massive" style="max-width: 30em !important;">
    <div class="ui container">
        <div class="ui middle aligned center aligned grid">
            <div class="column">
                <h2 class="ui teal image header">
                    <div class="content">
                        用户登录
                    </div>
                </h2>
                <form algin="center" class="ui large form" method="post" action="login.action">
                    <div class="ui segment">
                        <div class="field">
                            <div class="ui left icon input">
                                <i class="user icon"></i>
                                <input type="text" name="username" placeholder="用户名">
                            </div>
                        </div>
                        <div class="field">
                            <div class="ui left icon input">
                                <i class="lock icon"></i>
                                <input type="password" name="password" placeholder="密码">
                            </div>
                        </div>
                        <button class="ui fluid large teal submit button" type="submit">登&nbsp;&nbsp;&nbsp;&nbsp;录</button>
                    </div>

                    <div class="ui error mini message"></div>


                </form>
                <label>${message}</label>

            </div>
        </div>
    </div>
</div>


</body>
</html>
