# DevSuperior - Java Spring Professional

## Desafio 03 - API Rest, camadas, CRUD, exceções, validações
Neste desafio trabalhamos conceitos de implementar uma API REST com todas as açoes de CRUD.

O que utilizamos no backend:
- Java
- Framework Spring Boot

O desafio consiste em usar os conceitos de JPA com Hibernate para criar no banco de dados as tabelas requisitadas bem como suas relações.

As entidades/tabelas criadas foram:
- Cliente

Além de permitir todas as operações de CRUD, também foi implementado exceções e validações.

Foi criado um arquivo de seed para o banco de dados H2: `src/main/resources/import.sql`

## Como executar
Clonar este repositório, importar na IDE de preferência e executar a classe principal `Dsjsp03Application`.

O banco de dados H2 poderá ser consultado pelo client web do H2 no [link](http://localhost:8080/h2-console) e os dados de conexão ao banco H2 estão no arquivo `src/main/resources/application-test.properties`.

A API vai estar disponível no [link](http://localhost:8080) mais especificamente o recurso `/clients`.

Exemplos:
- Obter todos os clientes: **GET** `/clients`
- Obter cliente por Id: **GET** `/clients/1`
- Obter clients com paginação, ordenação: **GET** `/clients?page=0&size=6&sort=name`
- Criar novo cliente: **POST** `/clients` com body JSON
- Atualização de cliente: **PUT** `/clients/1` com body JSON
- Deleção de cliente: **DELETE** `/clients/1`