<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <link rel="stylesheet" href="/css/chat-fragment-style.css">
    <link rel="stylesheet" href="/css/message-fragment-style.css">
    <link rel="stylesheet" href="/css/main.css">
    <link rel="stylesheet" href="/css/chat-list-fragment.css">
    <meta name="viewport" content="width=device-width, initial-scale=1">
</head>
<body>
<div id="main">
    <#include "fragments/chat-list-fragment.ftlh">
    <#include "fragments/chat-fragment.ftlh">
</div>
<script src="/js/chat-fragment.js"></script>
</body>
</html>