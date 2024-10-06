# Sistema de Gerenciamento de Clientes e Departamentos em MySQL

## 📖 Introdução
Este projeto é um sistema de gerenciamento de clientes e seus departamentos, desenvolvido utilizando MySQL Workbench e Java. O sistema permite cadastrar, consultar, atualizar e excluir dados de clientes, assim como gerenciar informações sobre os departamentos aos quais eles pertencem.

## 💻 Tecnologias Utilizadas
![Java](https://img.shields.io/badge/java-%23ED8B00.svg?style=for-the-badge&logo=openjdk&logoColor=white)
![MySQL](https://img.shields.io/badge/mysql-4479A1.svg?style=for-the-badge&logo=mysql&logoColor=white)

### Funcionalidades
- **Cadastro de Clientes:** Adicionar novos clientes com informações relevantes, como nome, e-mail e telefone.
- **Gerenciamento de Departamentos:** Cadastrar e atualizar informações sobre departamentos.
- **Consultas:** Realizar consultas para visualizar clientes e seus respectivos departamentos.
- **Atualizações e Exclusões:** Atualizar informações de clientes e departamentos, assim como remover registros quando necessário.

## Como Configurar e Executar
Para configurar e executar o projeto:
1. **Configurar o Banco de Dados:**
   - Instale e inicie o MySQL Workbench.
   - Crie o banco de dados exatamente como está no db.properties, na pasta "other Sources - src\main\resources - default package"
   - Abra o script SQL fornecido em `database.sql` para criar as tabelas necessárias (`clientes`, `departamentos`).
   - Execute o programa na sua IDE.
2. **Estrutura do Banco de Dados:**
   - O script contém a estrutura das tabelas e os relacionamentos entre clientes e departamentos.

### Telas do Sistema

Aqui estão algumas telas principais do sistema:

<img src="https://github.com/user-attachments/assets/05b0aad6-712c-43f0-93b6-7314e9e904a5" alt="Gerenciador Clientes" width="300" style="display:inline-block; margin-right:10px;" />
<img src="https://github.com/user-attachments/assets/5f66bb20-d037-47bf-a367-9b9186aeb4a6" alt="Gerenciador Departamentos" width="300" style="display:inline-block;" />


