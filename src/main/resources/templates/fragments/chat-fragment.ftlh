<div id="chat-fragment-root">
    <#list messages as message>
        <#include "message-fragment.ftlh">
    </#list>
    <div id="chat-input-root">
        <input id="chat-input" type="text"/>
        <div id="chat-send" class='clickable'>Send</div>
    </div>
</div>
