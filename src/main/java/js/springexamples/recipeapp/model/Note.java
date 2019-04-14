package js.springexamples.recipeapp.model;

import lombok.*;

import javax.persistence.*;

@Data
@EqualsAndHashCode(exclude = {"recipe"})
@Entity
public class Note {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne
    private Recipe recipe;

    // @Lob (large object) - allows us to store more than 255 characters(default val for Hibernate)
    @Lob
    private String noteText;

}
