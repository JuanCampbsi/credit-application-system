![Kotlin](https://img.shields.io/badge/kotlin-%237F52FF.svg?style=for-the-badge&logo=kotlin&logoColor=white)

## Sistema de Análise de Solicitação de Crédito

Este projeto consiste em uma API REST desenvolvida com Spring Boot e Kotlin, projetada para atender às necessidades de uma empresa de empréstimo no processo de análise de solicitações de crédito. A API foi criada para oferecer uma plataforma eficiente e confiável para a avaliação e gestão de pedidos de crédito por parte dos clientes da empresa.

Para a gestão de dados, o projeto utiliza o H2 Database, um banco de dados em memória. Isso proporciona uma maneira rápida e eficiente de gerenciar dados durante o desenvolvimento e teste do aplicativo, simplificando processos como prototipagem, testes de funcionalidades e simulações de cenários de uso sem a necessidade de configurações complexas ou dependência de um banco de dados externo.

A combinação do Spring Boot com Kotlin oferece um ambiente de desenvolvimento ágil e eficiente, permitindo que nos concentremos na implementação de lógicas de negócio complexas sem nos preocuparmos com detalhes de infraestrutura. O uso do H2 Database para gerenciamento de dados em memória e o Flyway para controle de versões do esquema do banco de dados contribuem significativamente para a agilidade e a eficiência do processo de desenvolvimento.

<p align="center">
     <a alt="Java">
        <img src="https://img.shields.io/badge/Java-v17-blue.svg" />
    </a>
    <a alt="Kotlin">
        <img src="https://img.shields.io/badge/Kotlin-v1.9.20-purple.svg" />
    </a>
    <a alt="Spring Boot">
        <img src="https://img.shields.io/badge/Spring%20Boot-v3.2.0-brightgreen.svg" />
    </a>
    <a alt="Gradle">
        <img src="https://img.shields.io/badge/Gradle-v8.5-lightgreen.svg" />
    </a>
    <a alt="H2 ">
        <img src="https://img.shields.io/badge/H2-v2.2.220-darkblue.svg" />
    </a>
    <a alt="Flyway">
        <img src="https://img.shields.io/badge/Flyway-v9.5.1-red.svg">
    </a>
</p>

## Testes Unitários e de Integração
Neste projeto, foi implementado testes unitários e de integração para garantir a qualidade e a confiabilidade do código:

Testes Unitários: Foi utilizado JUnit para implementar testes unitários, focando em validar cada função e método de maneira isolada. Esses testes ajudam a garantir que a lógica de negócio individual de cada componente funcione 
conforme esperado.

Testes de Integração: Com o SpringBootTest, foi realizado testes de integração para verificar a interação entre diferentes módulos do aplicativo. Esses testes são cruciais para assegurar que os componentes do sistema funcionem 
juntos harmoniosamente, identificando problemas que podem ocorrer nas interfaces e na integração de diferentes partes do código.


<p align="center">
  <kbd>
 <img width="800" style="border-radius: 10px" height="400" src="https://github.com/JuanCampbsi/Preview_README/blob/76452820febcd75f9118cc7491f7f613ac792559/assets/kt_test.png" alt="Intro"> 
  </kbd>
  </br>
</p>

<br><br>
<figure>
<p align="center">
  <img src="https://i.imgur.com/7phya16.png" height="250" width="450" alt="API para Sistema de Avaliação de Créditos"/><br>
  Diagrama UML Simplificado de uma API para Sistema de Avaliação de Crédito
</p>
</figure>

### ⌨ Instalação
Para utilizá-lo, é necessário clonar o repositório, instalar as dependências e executar o projeto.

```bash
# Abra terminal/cmd e depois clone este repositório
$ git clone https://github.com/JuanCampbsi/credit-application-system

# Acesse a pasta do projeto no terminal/cmd
$ cd credit-application-system

# Execute o comando 
$ ./gradlew bootrun                           

```

👨‍💻 **Author -  Software Developer ** 💻


[![Linkedin Badge](https://img.shields.io/badge/-Juan_Campos-blue?style=flat-square&logo=Linkedin&logoColor=white&link=https://www.linkedin.com/in/juancampos-ferreira/)](https://www.linkedin.com/in/juancampos-ferreira/) 


