<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
</head>
<body>
<div>
    <#list chat as c>
        <div>${c.id}</div>
    </#list>
</div>

<div>
    <form action="/create" method="post">
        First name:<br>
        <input type="text" name="title">
        <br><br>
        <input type="submit" value="Submit">
    </form>
</div>
</body>
</html>