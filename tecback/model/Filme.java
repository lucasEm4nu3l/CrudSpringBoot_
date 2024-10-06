package br.com.fujideia.iesp.tecback.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Filme {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String titulo;
    private int anoLancamento;

    @ManyToOne
    @JoinColumn(name = "diretor_id")
    private Diretor diretor;

    @ManyToMany
    @JoinTable(
            name = "filme_ator",
            joinColumns = @JoinColumn(name = "filme_id"),
            inverseJoinColumns = @JoinColumn(name = "ator_id")
    )
    private List<Ator> atores;

    @ManyToMany
    @JoinTable(
            name = "filme_genero",
            joinColumns = @JoinColumn(name = "filme_id"),
            inverseJoinColumns = @JoinColumn(name = "genero_id")
    )
    private List<Genero> generos;

    @ManyToMany
    @JoinTable(
            name = "filme_produtor",
            joinColumns = @JoinColumn(name = "filme_id"),
            inverseJoinColumns = @JoinColumn(name = "produtor_id")
    )
    private List<Produtor> produtor;
}
