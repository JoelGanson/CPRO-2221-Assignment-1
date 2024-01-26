package JGanson.Assignment1.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


/**
 * A brick building set entity.
 * Could be a set of Lego, a set of MegaBlocks, or some other off brand
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class BrickBuild {
    private int id;
    private String name;
    private String brand;
    private String setNumber;
    private Boolean instructionBookWithSet;
    private Boolean isBuilt;
}
