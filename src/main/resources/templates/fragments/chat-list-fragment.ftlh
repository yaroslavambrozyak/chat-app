<div id="chat-list-fragment-root">
    <#list chats as chat>
        <div class="chat-list-chat-name clickable">
            <span class="chat-list-chat-id" class="hidden">${chat.id}</span>
            <span>
                ${chat.title}
            </span>
        </div>
    </#list>
</div>