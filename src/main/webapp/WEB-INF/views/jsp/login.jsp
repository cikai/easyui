<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="zh-CN">
<head>
<meta charset='utf-8'>
<meta http-equiv="X-UA-Compatible" content="chrome=1">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" type="text/css" href="css/app.css">
<script src="js/libs/jquery-2.1.4.js"></script>
<script src="js/libs/jquery.easyui.min.js"></script>
<script src="js/libs/easyui-lang-zh_CN.js"></script>
<script src="js/libs/jquery.dataTables.js"></script>
<script data-main="js/main" src="js/libs/require.js"></script>

<title>Login</title>
</head>

<body>
  <div id="loginAndRegisterForm">
    <form method="post" id="loginForm">
      <table>
        <tr>
          <th style="text-align: left;">用户名：</th>
          <td>
            <input type="text" id="name" style="width: 150px;" name="name" class="easyui-textbox" />
          </td>
        </tr>
        <tr>
          <th style="text-align: left;">密码：</th>
          <td>
            <input type="password" id="password" style="width: 150px;" name="password" class="easyui-textbox" />
          </td>
        </tr>
      </table>
    </form>
  </div>

  <div id="content"></div>
</body>
</html>
