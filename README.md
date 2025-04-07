# Projeto Spring Boot - Cadastro e Login de Usuários com BCrypt

Este projeto consiste em uma API REST desenvolvida com **Spring Boot**, que permite o cadastro e a autenticação de usuários. As senhas são armazenadas de forma segura utilizando o algoritmo de criptografia **BCrypt**.

## Funcionalidades

- Cadastro de usuários com e-mail e senha.
- Criptografia de senhas com BCrypt.
- Autenticação de usuários com verificação de senha.
- API estruturada com camadas: Controller, Service, Repository, DTO e Entity.

## Tecnologias Utilizadas

- Java 17+
- Spring Boot
- Spring Web
- Spring Security
- Spring Data JPA
- Banco de dados H2 (ou MySQL)
- Maven

## Endpoints

### `POST /usuario/cadastrar`

Cadastra um novo usuário com e-mail e senha.

**Exemplo de requisição:**

```json
{
  "email": "usuario@example.com",
  "senha": "123456"
}
```

**Exemplo de resposta:**

```json
{
  "id": 1,
  "email": "usuario@example.com",
  "senha": "$2a$10$..."
}
```

---

### `POST /usuario/login`

Realiza o login de um usuário.

**Exemplo de requisição:**

```json
{
  "email": "usuario@example.com",
  "senha": "123456"
}
```

**Respostas possíveis:**

- `200 OK` - Retorna "Sucesso" se a senha estiver correta.
- `400 Bad Request` - Retorna "Senha ou login incorretos!!" se a autenticação falhar.

## Como Executar

1. Clone o repositório.
2. Importe o projeto em sua IDE favorita.
3. Execute a classe principal `SesiApplication`.
4. A API estará disponível em `http://localhost:8080`.

## Estrutura do Projeto

```
com.Bcript.sesi
├── controller        # Controladores REST
├── dto               # Objetos de Transferência de Dados
├── entities          # Entidades JPA
├── repository        # Interfaces de persistência
├── services          # Regras de negócio
└── SecurityConfig    # Configurações de segurança
```

## Observações

- Este projeto é apenas um exemplo básico e não implementa autenticação via token (JWT) ou controle de sessões.
- Recomenda-se adicionar camadas adicionais de segurança em ambientes de produção.

---

**Desenvolvido com fins educacionais.**
