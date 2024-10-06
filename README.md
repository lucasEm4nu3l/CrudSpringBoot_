# Projeto API Rest

## Detalhamento do Time

Este projeto foi desenvolvido pela equipe, composta pelos seguintes membros:

- **Jackson Soares de Lima**
- **Lucas Emanuel Borges**
- **Giovanna Macedo Cox**
- **Maurelline Costa**

Cada membro contribuiu com a implementação de um ou mais endpoints, além dos requisitos discutidos em sala de aula. Cada um desenvolveu um CRUD completo (excluindo o método PATCH), bem como os Services, Repositories e Models, anotados com @Entity.

### Detalhamento das Contribuições:

- **Jackson Soares de Lima**  
  Desenvolveu o CRUD completo para **Diretor**:
  - `GET /Diretor`
  - `POST /Diretor`
  - `PUT /Diretor/{id}`
  - `DELETE /Diretor/{id}`
  Também criou o `DiretorService`, `DiretorRepository` e o model `Diretor` anotado com `@Entity`.

- **Lucas Emanuel Borges**  
  Desenvolveu o CRUD completo para **Ator**:
  - `GET /Ator`
  - `POST /Ator`
  - `PUT /Ator/{id}`
  - `DELETE /Ator/{id}`
  Também criou o `AtorService`, `AtorRepository` e o model `Ator` anotado com `@Entity`.

- **Giovanna Macedo Cox**  
  Desenvolveu o CRUD completo para **Genero**:
  - `GET /Genero`
  - `POST /Genero`
  - `PUT /Genero/{id}`
  - `DELETE /Genero/{id}`
  Também criou o `GeneroService`, `GeneroRepository` e o model `Genero` anotado com `@Entity`.

- **Maurelline Costa**  
  Desenvolveu o CRUD completo para **Produtor**:
  - `GET /Produtor`
  - `POST /Produtor`
  - `PUT /Produtor/{id}`
  - `DELETE /Produtor/{id}`
  Também criou o `ProdutorService`, `ProdutorRepository` e o model `Produtor` anotado com `@Entity`.
