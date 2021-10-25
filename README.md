
# Desafio Next 2021.2 - Grupo E

## Criação de um micro serviço (API-only) para prover dados de projetos

Considerando a migração de um sistema monolito, que permite o acompanhamento detalhado de projetos sendo executados na linha de inovação do cliente, para uma arquitetura de micro serviço, extrair (criar) o [micro]serviço que gerencia a criação e manutenção de novos projetos para que possa ser a fonte da verdade em relação a essa informação dentro da instituição e permita prover uma API que será utilizada por outros sistemas dentro do ecossistema digital da empresa.

### Objetivo
Implementar o micro serviço descrito acima com o intuito de que seja a fonte da verdade para os dados de projetos dentro da organização. O micro serviço deve considerar as seguintes características:

- Um project deve possuir os seguintes dados: identificador único (pode ser sequencial ou um UUID), nome do project, centro de custo do project, gerente responsável pelo project (aqui pode ser uma referência a uma entidade usuário), data de início e data de término do project, status (e.g., iniciado, on-hold, finalizado, outros), flag (e.g., vermelho, amarelo, verde => indicando como o project está em relação ao acompanhamento)
- a entidade usuário é básica e precisa estar no modelo de dados do sistema. Para todos os efeitos, um usuário pode conter, pelo menos, id único, o primeiro nome, último nome, um número de matrícula da organização e se está ativo ou não. Mas podem acrescentar outros dados, tais como data de nascimento e/ou centro de custo ao qual está associado.
<<<<<<< HEAD
- Prover uma API que será consumida por outros micro serviços que precisem das informações de projeto dentro da organização. As seguintes URLs podem ser providas (não precisa limitar ao que está aqui):

### REST API:

=======
- Prover uma API que será consumida por outros micro serviços que precisem das informações de project dentro da organização. As seguintes URLs podem ser providas (não precisa limitar ao que está aqui):
>>>>>>> 5ca5609 (alterações 21_nov)
- GET http://<servidor>/projects; retornar a lista de projetos cadastrados no banco de dados; OPCIONAL: incluir filtros por certas entidades mencionadas acima
- POST http://<servidor>/projects; adicionar um novo project ao banco de dados.
- PUT http://<servidor>/projects/<id>; editar project existente no banco de dados.
- GET http://<servidor>/projects/<id>; retornar um project em específico.
- GET http://<servidor>/users; retornar a lista de usuários do sistema
- POST http://<servidor>/users; adicionar um novo usuário ao banco de dados.

### Objetivos Extras

Pode-se usar ferramentas como o Postman para testar a API construída.

Caso haja tempo e tarefas possam ser paralelizadas, outras coisas podem ser feitas para incrementar o desafio. Como, por exemplo:
- Criação de uma UI (pode ser em React, Vue, Angular, etc)
- Criar containers docker para rodar o servidor, banco de dados e UI
Gerar uma autenticação ao sistema usando JWT



### Referências
https://spring.io/guides/tutorials/rest/



