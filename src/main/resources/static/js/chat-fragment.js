let currentChatId = '';
let chatListElements = document.getElementsByClassName('chat-list-chat-name');

Array.from(chatListElements).forEach(element => {
    element.addEventListener("click", () => {
        let chatIdElement = element.getElementsByClassName('chat-list-chat-id')[0];
        let chatId = chatIdElement.innerHTML;
        let xhr = new XMLHttpRequest();
        xhr.open('GET', '/chats/' + chatId + '/messages', false);
        xhr.send();
        if (xhr.status !== 200) {
            alert(xhr.status + ': ' + xhr.statusText);
        } else {
            let chatRootElement = document.getElementById('chat-fragment-root');
            chatRootElement.outerHTML = xhr.responseText;
            currentChatId = chatId;
        }
    });
});

let chatSendElement = document.getElementById('chat-send');
chatSendElement.addEventListener('click', () => {
    let text = document.getElementById('chat-input').value;
    console.log(text);
    let xhr = new XMLHttpRequest();
    xhr.open('POST', '/chats/' + currentChatId + '/messages', false);
    xhr.setRequestHeader("Content-Type", "application/json");
    xhr.send(JSON.stringify({text: text}));
    if (xhr.status !== 200) {
        alert(xhr.status + ': ' + xhr.statusText);
    } else {
        alert(xhr.responseText);
        let chatRootElement = document.getElementById('chat-fragment-root');
        chatRootElement.outerHTML = xhr.responseText;
    }
});

