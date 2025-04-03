# 📝 **To-Do Microservice - Tasks** 📝

## 📜 **Descrição**

Este repositório contém um microsserviço desenvolvido para integrar um sistema de gerenciamento de tarefas (To-Do). Ele é responsável pelo processamento e administração das tarefas disponíveis, garantindo escalabilidade, organização e eficiência no fluxo de informações entre diferentes partes do sistema.

Projetado com arquitetura baseada em microsserviços, o sistema permite fácil integração com outros serviços e mantém um alto nível de desacoplamento, favorecendo manutenção e evolução contínua. O projeto é constituído por alguns microsserviços e repositório de configuraçöes. A seguir, estão os principais componentes do sistema:

- **[ms-service-notification](https://github.com/iaugustoz/ms-service-notification/)**: reponsável pelo gerenciamento e envio de notificações no sistema de To-Do List
- **[ms-main-service](https://github.com/iaugustoz/ms-main-service/)**: microsserviço centralizador responsável por atuar como servidor de configuração (Config Server) e serviço de descoberta (Eureka Server).
- **[config-server](https://github.com/iaugustoz/config-server/)**: repositório de configurações para os MS de tasks e notification

---

## 🚀 **Status do Projeto**

✅ Projeto Concluído.

---

## 💻 **Tecnologias Utilizadas**

- **Java** (v21.0.0)
- **Spring Boot** (v3.4.3)

---

## 📦 **Dependências**

- [Spring Web](https://mvnrepository.com/artifact/org.springframework.boot/spring-boot-starter-web) - para trabalhar com requisições web
- [Lombok](https://mvnrepository.com/artifact/org.projectlombok/lombok) - dependência para facilitar o desenvolvimento gerando códigos boilerplate
- [Spring Cloud Config Client](https://mvnrepository.com/artifact/org.springframework.cloud/spring-cloud-starter-config) - fornece suporte do lado do cliente e do servidor para configurar microsserviços
- [Spring Cloud Eureka Discovery Client](https://mvnrepository.com/artifact/org.springframework.cloud/spring-cloud-starter-netflix-eureka-client) - permite que microsserviços se registrem e descubram outros microsserviços
- [Spring Cloud Starter OpenFeign](https://mvnrepository.com/artifact/org.springframework.cloud/spring-cloud-starter-openfeign) - permite a comunicação entre os microsserviços
- [Spring Data JPA](https://mvnrepository.com/artifact/org.springframework.boot/spring-boot-starter-data-jpa) - para persistir dados em armazenamentos SQL
- [H2 Database](https://mvnrepository.com/artifact/com.h2database/h2) - banco de dados em memória

---

## 🔧 **Instalação**

Siga os passos abaixo para rodar o projeto localmente:

1. **Clone o repositório:**

```bash
git clone https://github.com/iaugustoz/ms-service-tasks
```

2. **Navegue até o diretório do projeto:**

```
cd service-tasks
```

3. **Instale as dependências no Maven**

4. **Inicie o projeto**

---

## 🤝 Contribuindo

Contribuições são sempre bem-vindas! Para contribuir com este projeto, siga estas etapas:

1. **Faça um fork do projeto e clone o repositório.**
2. **Crie uma branch para suas alterações:**

```
git checkout -b minha-contribuicao
```

3. **Implemente suas mudanças e faça o commit:**

```
git commit -m "Minha contribuição"
```

4. **Envie suas alterações para o repositório remoto:**

```
git push origin minha-contribuicao
```

---

## 👨‍💻 Autor

- Igor Augusto
- 📧 E-mail: iaugustodeveloper@gmail.com
- [Instagram](https://www.instagram.com/iaugusto__/) | [Portfólio](https://iaugusto.vercel.app/) | [LinkedIn](https://www.linkedin.com/in/igorbrz/)

---

## ⚠️ Aviso Importante

Este projeto ainda está em desenvolvimento, portanto, algumas funcionalidades podem estar incompletas ou sujeitas a alterações. Se você encontrar algum bug, não hesite em abrir uma issue!
