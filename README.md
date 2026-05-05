# 🚀 API REST - Checkpoint 2 (Microservices & Web Engineering) - API 1

## 📚 Descrição

Este projeto foi desenvolvido como parte do Checkpoint 2 da disciplina **Microservices and Web Engineering**.

A aplicação consiste em uma API RESTful construída com Spring Boot, responsável pelo gerenciamento de dados relacionados a **Empresas** e **Jogos**, permitindo operações de CRUD (Create, Read, Update, Delete) com persistência em banco de dados MySQL.

---

## 🛠️ Tecnologias utilizadas

* Java 17
* Spring Boot
* Spring Web
* Spring Data JPA
* MySQL
* Docker
* Swagger / OpenAPI

---

## ⚙️ Como executar o projeto

### 🔹 1. Clonar o repositório

```bash id="2i8u3n"
git clone https://github.com/MarcusDev01/checkpoint-api1
```

---

### 🔹 2. Subir o banco de dados com Docker

Certifique-se de ter o Docker instalado e em execução.

Execute o comando abaixo na raiz do projeto:

```bash id="8avl7v"
docker-compose up -d
```

Isso irá subir um container MySQL com as seguintes configurações:

* Banco: `checkpoint`
* Usuário: `root`
* Senha: `root`
* Porta: `3306`

---

### 🔹 3. Configurar a aplicação

O arquivo `application.properties` já está configurado:

```properties id="6l5g4j"
server.port=8080

spring.datasource.url=jdbc:mysql://localhost:3306/checkpoint
spring.datasource.username=root
spring.datasource.password=root

spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
```

---

### 🔹 4. Executar a aplicação

Você pode rodar pelo IntelliJ ou via terminal:

```bash id="a4dzr3"
mvn spring-boot:run
```

---

## 🌐 Acesso à API

A API estará disponível em:

```id="k3j9la"
http://localhost:8080
```

---

## 📖 Documentação Swagger

Acesse a documentação interativa em:

```id="7zv2nq"
http://localhost:8080/swagger-ui.html
```

---

## 📌 Endpoints da API

### 🏢 Empresas

| Método | Endpoint         | Descrição     |
| ------ | ---------------- | ------------- |
| GET    | `/empresas`      | Listar todas  |
| GET    | `/empresas/{id}` | Buscar por ID |
| POST   | `/empresas`      | Criar empresa |
| PUT    | `/empresas/{id}` | Atualizar     |
| DELETE | `/empresas/{id}` | Deletar       |

---

### 🎮 Jogos

| Método | Endpoint      | Descrição     |
| ------ | ------------- | ------------- |
| GET    | `/jogos`      | Listar todos  |
| GET    | `/jogos/{id}` | Buscar por ID |
| POST   | `/jogos`      | Criar jogo    |
| PUT    | `/jogos/{id}` | Atualizar     |
| DELETE | `/jogos/{id}` | Deletar       |

---

## 🧪 Exemplo de JSON (POST - Empresa)

```json id="m3k8sx"
{
  "nome": "Nintendo",
  "pais": "Japão",
  "anoFundacao": 1889,
  "ceo": "Shuntaro Furukawa",
  "descricao": "Empresa de jogos"
}
```

---

## 🐳 Estrutura do Docker

Arquivo `docker-compose.yml`:

```yaml id="n7c2vd"
services:
  mysql:
    image: mysql:8
    container_name: mysql-checkpoint
    restart: always
    environment:
      MYSQL_ROOT_PASSWORD: root
      MYSQL_DATABASE: checkpoint
    ports:
      - "3306:3306"
```

---

## 🧠 Observações

* As tabelas são criadas automaticamente pelo Hibernate (`ddl-auto=update`)
* O projeto segue o padrão MVC (Model, Controller, Repository)
* As entidades utilizam nomenclatura singular e tabelas no plural
* A API está totalmente integrada ao banco de dados MySQL

---

## 👨‍💻 Autor

Henry Titotto
Projeto acadêmico - FIAP
