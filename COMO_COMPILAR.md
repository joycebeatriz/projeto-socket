# Como Compilar e Executar o Projeto

## Pré-requisitos

- **Java 21** instalado (JDK 21 ou superior)
- Terminal ou prompt de comando

## Compilando os Arquivos

Abra o terminal na raiz do projeto.

### 1. Compilar o Servidor e o Cliente

No Windows:
```sh
javac -d bin src/Servidor.java src/Cliente.java
```
No Linux/Mac:
```sh
javac -d bin src/Servidor.java src/Cliente.java
```

Isso criará os arquivos `.class` na pasta `bin`.

## Executando o Servidor

No terminal, execute:
```sh
java -cp bin Servidor
```
O servidor ficará aguardando conexões na porta 5000.

## Executando o Cliente

Abra outro terminal e execute:
```sh
java -cp bin Cliente
```

Agora você pode digitar mensagens. Para encerrar, digite `sair`.

---

Se tiver dúvidas ou problemas, verifique se o Java está instalado corretamente com:
```sh
java -version
``` 