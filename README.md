# SchedLock demo

Exemplo de utilização da lib [SchedLock](https://github.com/lukas-krecan/ShedLock) em um projeto Spring boot.

O código completo do exemplo está na branch *solucao_completa*.

## O que você precisa para rodar este projeto:
* JDK 11
* Docker
* Docker Compose

## Build

Entre na pasta raiz do projeto e execute os comandos a seguir para realizar o buid:

```shell script
./mvnw clean install
docker build -t schedlockdemo:1.0.0 .
```

## Run

Após realizar o build, execute o seguinte comando para executar o projeto:

```shell script
docker-compose up
```

O comando acima irá instanciar dois containers:

* um container derivado da imagem que acabamos de construir 
* um container do `SGDB PostgreSQL`.

## Scale

Para realizar o escalonamento horizontal da aplicação, execute o comando a seguir em outra aba/terminal:

```shell script
docker-compose scale shedlockdemo=4
```

O comando acima irá garantir que 4 instâncias fiquem disponíveis para utilização.

## Referência

* Biblioteca ShedLock: [https://github.com/lukas-krecan/ShedLock](https://github.com/lukas-krecan/ShedLock)