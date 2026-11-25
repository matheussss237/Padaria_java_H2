# 🍞 Padaria API — Spring Boot + H2

API REST para gestão de uma padaria: cadastro de **produtos**, **clientes** e **compras**, com autenticação usando **Spring Security** e senhas criptografadas com **BCrypt**. O projeto também traz um front-end simples em HTML, CSS e JavaScript servido pelo próprio Spring Boot.

> Projeto de estudo desenvolvido durante o curso Técnico em Desenvolvimento de Sistemas (Senac-DF).
> Existe uma versão do mesmo sistema usando MongoDB: [Padaria_java_mongoDB](https://github.com/matheussss237/Padaria_java_mongoDB).

---

## Tecnologias

| Camada | Tecnologia |
|---|---|
| Linguagem | Java 17 |
| Framework | Spring Boot 3.3 (Web, Data JPA, Validation) |
| Segurança | Spring Security + BCrypt |
| Banco de dados | H2 (em memória) |
| Produtividade | Lombok |
| Build | Maven |
| Front-end | HTML, CSS e JavaScript (pasta `static`) |
| Deploy | Docker + Render |

## Arquitetura

```
controller  →  business (services)  →  infrastructure/repository  →  banco H2
                      ↓
              infrastructure/entitys  ·  dto  ·  exceptions (GlobalExceptionHandler)
```

## Endpoints

| Recurso | Método | Rota | Descrição |
|---|---|---|---|
| Autenticação | `POST` | `/auth/register` | Cadastra um usuário do sistema (senha com BCrypt) |
| Produtos | `POST` | `/padaria` | Cadastra um produto |
| Produtos | `GET` | `/padaria?id={id}` | Busca um produto pelo id |
| Produtos | `PUT` | `/padaria/{id}?id={id}` | Atualiza um produto |
| Produtos | `DELETE` | `/padaria?id={id}` | Remove um produto |
| Clientes | `POST` | `/usuario` | Cadastra um cliente |
| Clientes | `GET` | `/usuario?cpf={cpf}` | Busca um cliente pelo CPF |
| Clientes | `PUT` | `/usuario?cpf={cpf}` | Atualiza um cliente |
| Clientes | `DELETE` | `/usuario?cpf={cpf}` | Remove um cliente |
| Compras | `POST` | `/compras` | Registra uma compra e calcula o valor total |

O console do H2 fica em `http://localhost:8080/h2-console` (JDBC URL: `jdbc:h2:mem:usuario`, usuário `root`, sem senha).

## Como executar

**Pré-requisito:** Java 17 ou superior.

```bash
git clone https://github.com/matheussss237/Padaria_java_H2.git
cd Padaria_java_H2
./mvnw spring-boot:run
```

No Windows, use `mvnw.cmd spring-boot:run`, ou abra a pasta no IntelliJ IDEA e rode a classe `CadastroUsuarioApplication`.

Depois, acesse `http://localhost:8080`.

### Com Docker

```bash
docker build -t padaria-h2 .
docker run -p 8080:8080 padaria-h2
```

## Próximos passos

- [ ] Login com geração de token JWT
- [ ] Testes automatizados dos serviços
- [ ] Documentação da API com Swagger / OpenAPI

---

Desenvolvido por **Matheus Henrique** · [Portfólio](https://matheussss237.github.io/Gsap/) · [LinkedIn](https://linkedin.com/in/matheushenriquem)
