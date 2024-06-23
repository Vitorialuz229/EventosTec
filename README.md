# Backend EventosTec

## Objetivo: 
Desenvolver o backend de uma aplicação para gerenciar eventos de tecnologia, permitindo
o cadastro, listagem, filtragem e detalhamento de eventos, bem como a associação de cupons 
de desconto. 

## Detalhamento: 
- [ ] O sistema deve permitir que o usuário cadastre um evento com os seguintes campos:
    * Título (obrigatório)
    * Descrição (opcional)
    * Data (obrigatório)
    * Local (obrigatório, se presencial)
    * Imagem (opcional)
    * URL do evento (obrigatório, se remoto)

- [ ] Eventos podem ser classificados como remotos ou presencial.
- [ ] O sistema deve permitir que o usuário associe um ou mais cupons de desconto a um evento. 
Cada cupom deve possuir os seguintes campos:
    * Código do cupom (obrigatório)
    * Desconto percentual ou valor fixo(obrigatório)
    * Data de validade (opcional)

- [ ] O sistema deve listar os eventos cadastrados, com paginação.
A listagem deve incluir: 
    * Título
    * Data
    * Local
    * Tipo (remoto ou presencial)
    * Banner
    * Descrição

- [ ] O sistema deve retornar somente eventos que ainda não aconteceram
- [ ] O sistema deve permitir que o usuário filtre a lista de eventos pelos seguintes critérios: 
    * Título
    * Data 
    * Local
- [ ] O sistema deve permitir que o usuário consulte todas os detalhes de um evento específico, incluíndo: 
    * Título
    * Descrição 
    * Data 
    * Local 
    * Imagem 
    * URL do evento
    * Lista de cupons ativos, com seus respectivos detalhes (código do cupom, desconto, data de validade)


## Proposto:
Proposta no canal da Fernanda Kipper | Dev: [Assista ao vídeo](https://www.youtube.com/watch?v=d0KaNzAMVO4&t=1270s&ab_channel=FernandaKipper%7CDev)

