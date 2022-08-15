
package yavirac.ticket.feature.motivo;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;

import lombok.Data;

@Data
@Table("motivo_sugerencia")
public class MotivoSugerencia {

    @Id
    private long id;

    @Column("motivo_id")
    private Long motivoId;

    @Column("sugerencia_id")
    private Long sugerenciaId;
}
