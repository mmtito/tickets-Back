package yavirac.ticket.feature.modulo;

import java.sql.Timestamp;
import java.util.HashSet;
import java.util.Set;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.MappedCollection;
import org.springframework.data.relational.core.mapping.Table;

import lombok.Data;

@Data
@Table("modulos")
public class Modulo {

    @Id
    @Column("id")
    private long id;
    private String nombre;
    private Timestamp created;
    @Column ("update")
    private Timestamp updated;
    private boolean enabled;
    private boolean archived;
    private Long rolId;
    

    @MappedCollection(idColumn = "modulo_id")
    private Set<ModuloMotivo> motivos = new HashSet<>();

}
