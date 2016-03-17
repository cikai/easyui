<html>
<head>
<title></title>
</head>
<body>
<script>
    function getContextPath() {
        var fullPath = window.location.pathname;
        var contextPath = fullPath.split("/")[1];
        return contextPath;
    }
    window.location.href = "/" + getContextPath() + "/main";
</script>
</body>
</html>
