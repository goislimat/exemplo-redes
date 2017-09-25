# Simulação da adição de clientes e mensagens usando Threads

Esse é um sisteminha simples que simula um servidor que cria clientes incessantemente e esses clientes ficam enviando mensagens de maneira paralela. Primeira abstração necessária para entender como criar um chat utilizando Sockets em Java.

## Iniciando o projeto

Você tem algumas opções para colocar o projeto rodando na sua máquina e ver o resultado por sua conta. Algumas são listadas abaixo.

1. Clique em **clone or download** e faça um download do arquivo em formato .zip
2. Clone este repositório com https
```
git clone https_url novo_diretorio_onde_clonar
```
3. Clone este repositório com ssh
```
git clone ssh_url novo_diretorio_onde_clonar
```

### Pré Requisitos

Você precisa ter pelo menos o JDK instalado para compilar o projeto

[Download JDK](http://www.oracle.com/technetwork/pt/java/javase/downloads/index.html)

Ou pelo terminal (comando no Ubuntu por exemplo para instalação do JDK 7)
```
sudo apt-get install openjdk-7-jdk
```

### Compilando

Para compilar seu projeto, abra ele na sua IDE (Eclipse, NetBeans, ItelliJ, etc) e compile o arquivo Main.java.

Via terminal do ubuntu:
```
cd caminho/do/projeto/src
javac com/company/Main.java
java com/company/Main
```

