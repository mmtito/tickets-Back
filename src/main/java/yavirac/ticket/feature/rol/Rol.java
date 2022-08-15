package yavirac.ticket.feature.rol;

import java.sql.Timestamp;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.MappedCollection;
import org.springframework.data.relational.core.mapping.Table;

import lombok.Data;

@Data

@Table("rol")
public class Rol {
    
    @Id
    @Column("rol_id")
    private long rolId;
    private String nombre;
    private Boolean admin;
    private Timestamp created;
    private Timestamp updated;
    private Boolean enabled;

    
    
}
