# Projeto Final do Módulo de Lógica da Programação - Formação Back-end Ada Tech
[![NPM](https://img.shields.io/npm/l/react)](https://github.com/almeidapietra/projeto_1171/blob/main/LICENSE)

## Descrição do Projeto

O sistema desenvolvido é uma agenda com funcionalidades básicas para manipulação de contatos. Este projeto foi desenvolvido como trabalho final do módulo Lógica da Programação da formação Back-end Ada Tech, parte do programa Santander Coders, pela equipe "Code Queens", composta por Clarissa Mapelli, Mariana Miziara, Mayara Santos, Pietra Almeida e Rosângela Batista.


## Funcionalidades

- **Exibir Menu**
- **Adicionar Contato**
- **Remover Contato**
- **Detalhar Contato**
- **Editar Contato**
- **Excluir Contato**

## Requisitos

- **Java** (versão 21.0.1)
- **IDE** (como IntelliJ IDEA, Eclipse ou VS Code)

## Istalação

```bash
 #Clone o repositório:
  git clone https://github.com/almeidapietra/projeto_1171.git

 #Navegue até o diretório do projeto:
  cd projeto_1171

 #Instale as dependências:
 npm install

#Compile o projeto::
javac -d bin src/*.java

#Navegue até o diretório onde o arquivo .class está localizado e execute o programa:
java AgendaAtual


 A aplicação estará disponível no console.
```

## Uso

A aplicação permite o gerenciamento de contatos em uma agenda. Abaixo estão os detalhes sobre como usar cada uma das funcionalidades:

### Adicionar Contato

- **Como usar:** Escolha a opção 1 no menu principal.
- **Descrição:** Permite adicionar um novo contato com nome, telefone e e-mail. Se o telefone já estiver cadastrado, uma mensagem de erro será exibida.

### Remover Contato

- **Como usar:** Escolha a opção 2 no menu principal.
- **Descrição:** Permite remover um contato da agenda. A remoção é feita com base no número de telefone do contato.

### Detalhar Contato

- **Como usar:** Escolha a opção 3 no menu principal.
- **Descrição:** Permite visualizar detalhes de um contato específico com base no número de telefone fornecido.

### Editar Contato

- **Como usar:** Escolha a opção 4 no menu principal.
- **Descrição:** Permite editar as informações de um contato existente. Você pode alterar o nome, telefone e e-mail.

### Sair

- **Como usar:** Escolha a opção 5 no menu principal.
- **Descrição:** Encerra a aplicação.

## Contribuição

Para contribuir com este projeto, siga as etapas abaixo:

1. Crie um fork deste repositório.
2. Clone o fork para a sua máquina local:

   ```bash
   git clone https://github.com/seu-usuario/seu-fork.git

3. Crie uma nova branch para sua contribuição:

   ```bash
   git checkout -b minha-contribuicao

4. Faça suas alterações e commit:

  ```bash
   git commit -m "Adiciona funcionalidade X" 
   ```

5. Envie suas alterações para o GitHub:

  ```bash
    git push origin minha-contribuicao
   ```
6. Abra uma solicitação de pull descrevendo suas alterações.

<br>
<br>
### *******************************

# Relatório

## Implementação das Funções

### Adicionar Contato

- **Estruturas e Métodos Utilizados**:
    - **ArrayList**: Utilizada para armazenar os dados dos contatos, incluindo nomes, números de telefone e e-mails. A estrutura `ArrayList<String>` foi escolhida para facilitar a adição e a verificação de duplicidade dos números de telefone.
    - **Método `contains`**: Usado para verificar se o número de telefone já está presente na lista antes de adicionar um novo contato. Isso previne duplicidades.
    - **Tratamento de Exceções**: Implementado para capturar e informar o usuário caso tente adicionar um número de telefone que já está cadastrado.

 ### Remover Contato

- **Estruturas e Métodos Utilizados**:
    - **ArrayList**: Utilizada para armazenar os dados dos contatos, como números, nomes, e-mails e IDs. O método `indexOf` é usado para localizar o índice do contato a ser removido com base no número de telefone.
    - **Método `contains`**: Verifica se o número de telefone existe na lista antes de tentar removê-lo.
    - **Tratamento de Exceções**: Implementado para capturar a tentativa de remoção de um contato inexistente, exibindo uma mensagem de erro apropriada ao usuário.


### Detalhar Contato

- **Estruturas e Métodos Utilizados**:
    - **ArrayList**: Usada para acessar os dados do contato pelo índice. O método `indexOf`  é usado para encontrar o índice do contato com base no número de telefone fornecido.
    - **Método `get`**: Recupera os detalhes do contato para exibição.
    - **Validação**: Verifica se o telefone existe na lista antes de exibir os detalhes. Se o contato não for encontrado, uma mensagem de erro é exibida.

### Editar Contato

- **Estruturas e Métodos Utilizados**:
    - **ArrayList**: Utilizada para armazenar e atualizar os dados dos contatos. O método `indexOf` é usado para encontrar o índice do contato que será editado, e o método `set` atualiza os dados existentes.
    - **Método `isEmpty`**: Verifica se os novos valores fornecidos pelo usuário são não vazios antes de atualizar os dados.
    - **Verificação de ID**: Exibe todos os IDs disponíveis e valida se o ID fornecido pelo usuário existe na lista. Se o contato não for encontrado, uma mensagem de erro é exibida.

### Exibir Menu

- **Estruturas e Métodos Utilizados**:
    - **Método `System.out.println`**: Utilizado para exibir o menu de opções para o usuário. O método `System.out.print` é usado para capturar a entrada do usuário.

## Desafios no Projeto

Um dos principais desafios foi garantir que todas as funcionalidades do sistema fossem integradas corretamente e funcionassem conforme o esperado. A integração de diferentes componentes desenvolvidos por vários membros da equipe exigiu uma coordenação cuidadosa e uma comunicação eficaz. Além disso, foi essencial realizar testes por cada membro da equipe para identificar e resolver problemas de integração e assegurar que o sistema operasse sem falhas.

## Aspectos Interessantes

Durante o desenvolvimento deste projeto, tivemos a oportunidade de aprender e aplicar várias habilidades e conceitos importantes no desenvolvimento de aplicativos Java. Aqui estão algumas das lições valiosas que adquirimos:

### Colaboração em Equipe

Trabalhar em equipe foi uma experiência enriquecedora. A divisão de tarefas permitiu que cada membro se concentrasse em uma área específica, enquanto a comunicação e coordenação garantiram que todas as partes do projeto se integrassem perfeitamente. O compartilhamento de conhecimento, a resolução colaborativa de problemas e as revisões de código foram fundamentais para a melhoria contínua do projeto.

### Estruturas de Dados em Java

Aprendemos a usar diferentes estruturas de dados, como `ArrayList`, para armazenar e manipular informações. A utilização de listas dinâmicas ajudou a gerenciar os contatos de forma eficiente, possibilitando a adição, remoção e atualização de dados com flexibilidade.

### Manipulação de Exceções

Implementar o tratamento de exceções foi crucial para garantir que o sistema fosse robusto e amigável ao usuário. Usamos o bloco `try-catch` para capturar erros e fornecer mensagens de erro claras e informativas, melhorando a experiência do usuário ao lidar com entradas inválidas ou duplicadas.

### Métodos e Funções

O uso de métodos para organizar o código e realizar tarefas específicas foi essencial para manter a clareza e a modularidade do projeto. Criar métodos como `adicionarContato`, `removerContato`, `detalharContato` e `editarContato` permitiu uma abordagem mais estruturada e facilitou a manutenção e expansão do sistema.

### Interação com o Usuário

Desenvolver a interação com o usuário através de menus e prompts no console foi uma parte interessante do projeto. Aprendemos a usar `System.out.println` e `Scanner` para exibir informações e capturar entradas, proporcionando uma experiência interativa e funcional para o usuário.

### Documentação e README

A criação de uma documentação clara e detalhada no README foi uma parte crucial do projeto. Aprendemos a importância de descrever a estrutura do código, as funcionalidades e a divisão de tarefas, o que ajuda na compreensão e manutenção do projeto a longo prazo.

### Versionamento de Código com Git

O uso de Git para controle de versão do código foi essencial para a colaboração em equipe. Aprendemos a gerenciar alterações no código, realizar commits e colaborar de forma eficiente, o que facilitou a integração das diferentes partes do projeto desenvolvidas pelos membros da equipe.

Cada uma dessas áreas contribuiu significativamente para o sucesso do projeto e proporcionou uma rica experiência de aprendizado que será valiosa em futuros desenvolvimentos.


## O que Pode ser Melhorado

Para futuras versões do projeto, seria benéfico implementar uma camada de testes automatizados para garantir que todas as funcionalidades estejam operando corretamente. Também seria interessante explorar a adição de uma interface gráfica ou outras formas de interação com o usuário para enriquecer a experiência geral do sistema.

## Divisão de Tarefas

A divisão de tarefas para este projeto foi organizada da seguinte forma:

- **Adicionar Contato e Criação do README**: Pietra Almeida
- **Editar Contato**: Clarissa Mapelli
- **Exibir Menu**: Mayara Santos
- **Detalhar Contato**: Rosângela Batista
- **Excluir Contato**: Mariana

Cada membro da equipe foi responsável por uma parte específica do código, contribuindo para o desenvolvimento bem-sucedido do projeto.

## Agradecimentos

Agradecemos ao  [Santander](https://www.santander.com.br/ "Site do Banco Santander"), pela oportunidade de participar da formação Back-end através do programa Santander Coders, pelo investimento em nosso crescimento profissional, à [Ada Tech](https://ada.tech/ "Site da Ada tech") e ao nosso queridíssimo professor [Igor Mascarenhas ]() por todo conhecimento passado através de uma excelente didática e pela disposição em sempre ajudar. Suas orientações, conhecimentos e apoio foram fundamentais para o sucesso deste projeto.  

## Equipe Code Queens:

Clarissa Mapelli </br>
Mariana Miziara <br>
Mayara Santos </br>
Pietra Almeida </br>
Rosângela Batista</b>

## contatos Clarissa Mapelli:
<div> 
    <a href = "mailto:clarissa.mapelli@gmail.com"><img loading="lazy" src="https://img.shields.io/badge/Gmail-D14836?style=for-the-badge&logo=gmail&logoColor=white" target="_blank"></a>
    <a href="https://www.linkedin.com/in/clarissamapelli/" target="_blank"><img loading="lazy" src="https://img.shields.io/badge/-LinkedIn-%230077B5?style=for-the-badge&logo=linkedin&logoColor=white" target="_blank"></a>   
</div>

## contatos Mariana Miziara:
<div> 
    <a href = "mailto:marianahelou.dv@gmail.com"><img loading="lazy" src="https://img.shields.io/badge/Gmail-D14836?style=for-the-badge&logo=gmail&logoColor=white" target="_blank"></a>
    <a href="https://www.linkedin.com/in/marianamiziara/" target="_blank"><img loading="lazy" src="https://img.shields.io/badge/-LinkedIn-%230077B5?style=for-the-badge&logo=linkedin&logoColor=white" target="_blank"></a>   
</div>

## contatos Mayara Santos :
<div> 
    <a href = "mailto:mayarawasantos@gmail.com"><img loading="lazy" src="https://img.shields.io/badge/Gmail-D14836?style=for-the-badge&logo=gmail&logoColor=white" target="_blank"></a>
    <a href="https://www.linkedin.com/in/mayarawas/" target="_blank"><img loading="lazy" src="https://img.shields.io/badge/-LinkedIn-%230077B5?style=for-the-badge&logo=linkedin&logoColor=white" target="_blank"></a>   
</div>

## contatos Pietra Almeida :
<div> 
    <a href = "mailto:costapietra@gmail.com"><img loading="lazy" src="https://img.shields.io/badge/Gmail-D14836?style=for-the-badge&logo=gmail&logoColor=white" target="_blank"></a>
    <a href="https://www.linkedin.com/in/almeidapietra" target="_blank"><img loading="lazy" src="https://img.shields.io/badge/-LinkedIn-%230077B5?style=for-the-badge&logo=linkedin&logoColor=white" target="_blank"></a>   
</div>

## contatos Rosângela Batista :
<div> 
    <a href = "mailto:rosangela.almeida.1988@hotmail.com"><img loading="lazy" src="https://img.shields.io/badge/Gmail-D14836?style=for-the-badge&logo=gmail&logoColor=white" target="_blank"></a>
    <a href="https://www.linkedin.com/in/rosangelaalmeidabatista/" target="_blank"><img loading="lazy" src="https://img.shields.io/badge/-LinkedIn-%230077B5?style=for-the-badge&logo=linkedin&logoColor=white" target="_blank"></a>   
</div>


