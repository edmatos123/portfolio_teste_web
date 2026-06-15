# 🧪 Teste Web – Automation Exercise

Projeto de automação de testes Web desenvolvido em **Java** utilizando **Selenium WebDriver**, **Cucumber BDD**, **JUnit 5**, **WebDriverManager** e **Allure Report**.

---

## 🚀 Objetivo

Demonstrar a automação de testes Web na aplicação Automation Exercise (https://automationexercise.com/) aplicando boas práticas de mercado, utilizando conceitos como **Page Object Model (POM)**, **Component Pattern**, **massa de dados dinâmica**, **camada de validações** e **integração contínua com GitHub Actions**.

---

## 🧰 Tecnologias Utilizadas

* ☕ **Java 21**
* 🧩 **Maven**
* 🌐 **Selenium WebDriver**
* 🥒 **Cucumber BDD**
* 🧪 **JUnit 5**
* 🚗 **WebDriverManager**
* 📊 **Allure Report**
* ⚙️ **GitHub Actions**

---

## 🏗️ Estrutura do Projeto

```text
portfolio_teste_web
│
├── src
│   ├── main
│   │   └── java
│   │       ├── configuracao/
│   │       ├── dado/
│   │       ├── modelo/
│   │       ├── pages/
│   │       │   └── components/
│   │       └── validation/
│   │
│   ├── test
│   │   ├── java
│   │   │   ├── hooks/
│   │   │   ├── runners/
│   │   │   └── steps/
│   │   │
│   │   └── resources
│   │       ├── features/
│   │       ├── config.properties
│   │       └── allure.properties
│
├── pom.xml
└── README.md
```

---

## 🏛️ Padrões Aplicados

* ✔️ Page Object Model (POM)
* ✔️ Page Component Pattern
* ✔️ Validation Layer
* ✔️ Massa de Dados Dinâmica
* ✔️ Configuração Externa
* ✔️ Integração Contínua (CI/CD)

---

## 🧩 Casos de Teste Implementados

| Nº | Caso                    | Nota |
| -- | ----------------------- | ---- |
| 1  | Cadastrar e excluir usuario     | ✔️   |
| 2  | Login e logout     | ✔️   |
| 3  | Cadastro com email existente        | ✔️   |
| 4  | Pesquisar produto       | ✔️   |
| 5  | Adicionar produtos ao carrinho | ✔️   |

Observação: Apesar de existirem 5 cenários automatizados, o escopo principal do projeto foi concentrado nos fluxos de cadastro e autenticação de usuários. Os demais cenários foram implementados como complemento da cobertura funcional da aplicação.

---

## 📸 Relatório Allure (exemplos)
<img width="1329" height="632" alt="image" src="https://github.com/user-attachments/assets/4f993bd1-fc01-4159-a79d-b6c18040733f" />
<img width="1344" height="634" alt="image" src="https://github.com/user-attachments/assets/742a0441-8430-423a-b432-753c84210e58" />



---

## ⚙️ Pipeline CI/CD

O projeto possui integração com GitHub Actions para execução automática dos testes.

Fluxo da pipeline:

```text
Push
   ↓
Checkout
   ↓
Configuração Java 21
   ↓
Execução dos Testes
   ↓
Geração dos Relatórios
```

---

## ▶️ Como executar

```text
1. Clonar o repositório
git clone https://github.com/edmatos123/portfolio_teste_web.git

2. Executar os testes
Na raiz do diretório do projeto abrir o CMD e executar o comando <mvn clean test>

3. Gerar o relatório
Executar o comando <allure serve target/allure-results>
```

## 👨‍💻 Autor

**Edmilson Matos Santana Júnior**

**LinkedIn:**
linkedin.com/in/edmilson-santana-3934b318b
