# projeto-socket
## Requisitos Gerais para a atividade

- A aplicação deve ser desenvolvida em Java (v21).
- A comunicação deve ocorrer via sockets TCP.
- A aplicação deve suportar múltiplos clientes simultaneamente.

## Requisitos do Servidor

- O servidor deve escutar conexões em uma porta fixa (ex: 5000).
- Ao aceitar uma conexão, o servidor deve:
  - Criar uma nova thread para atender o cliente.
  - Exibir no console o IP do cliente conectado.
- O servidor deve ler mensagens enviadas pelos clientes.
- Para cada mensagem recebida, o servidor deve enviar uma resposta aleatória escolhida de uma lista interna de mensagens predefinidas.
  - Exemplo:
    - "Interessante... continue."
    - "Essa é uma boa pergunta."
    - "Você sempre pensa assim?"
- A comunicação com o cliente deve permanecer ativa até que ele envie o comando "sair".

## Requisitos do Cliente

- O cliente deve se conectar ao servidor na porta definida.
- Após enviar uma mensagem, o cliente deve exibir no terminal a resposta do servidor.
- O cliente deve continuar enviando e recebendo mensagens até que o usuário digite "sair".
- Ao digitar "sair", o cliente deve encerrar a conexão de forma limpa.
