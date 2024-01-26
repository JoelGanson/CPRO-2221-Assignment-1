package JGanson.Assignment1.Respository;

import JGanson.Assignment1.Entity.BrickBuild;
import org.springframework.stereotype.Repository;
import java.util.ArrayList;
import java.util.List;

@Repository
public class BrickBuildRepository {
    private final List<BrickBuild> list = new ArrayList<BrickBuild>();

    /**
     * finds every brick building set
     * @return Every build in a list
     */
    public List<BrickBuild> getAllBuilds() {
        return list;
    }

    /**
     * Finds the building set matching the id provided
     * @param id The id to search for
     * @return A single building set build, or null
     */
    public BrickBuild findById(int id) {
        for (BrickBuild b: list) {
            if(b.getId() == id) {
                return b;
            }
        }
        return null;
    }

    /**
     * Saves a new brick building set to the repository
     * @param brickBuild Java Object BrickBuild to save
     * @return The object being saved
     */
    public BrickBuild save(BrickBuild brickBuild) {
        BrickBuild b = new BrickBuild();
        b.setId(brickBuild.getId());
        b.setName(brickBuild.getName());
        b.setBrand(brickBuild.getBrand());
        b.setSetNumber(brickBuild.getSetNumber());
        b.setIsBuilt(brickBuild.getIsBuilt());
        b.setInstructionBookWithSet(brickBuild.getInstructionBookWithSet());
        list.add(b);
        return b;
    }

    /**
     * Deletes a brick building set from the repository
     * @param id The id of the building set to delete
     * @return Null or a String declaring success
     */
    public String delete(int id) {
        for (BrickBuild b: list) {
            if(b.getId() == id) {
                // Normally this would cause a ConcurrentModificationException, but we return and exit the loop before the
                // error can be called.
                list.remove(b);
                return "Successfully deleted building set with id " + id + "!";
            }
        }
        return null;
    }

    /**
     * Updates an existing brick building set in the repository
     * @param brickBuild A new BrickBuild object with the data to update to
     * @param id the id of the set to update
     * @return the updated values of the brick building set
     */
    public BrickBuild update(BrickBuild brickBuild, int id) {
        for (BrickBuild b: list) {
            if(b.getId() == id) {
                // Each of these if statements ensures we only update data we want to update
                if (brickBuild.getName() != null) {
                    b.setName(brickBuild.getName());
                }
                if (brickBuild.getBrand() != null) {
                    b.setBrand(brickBuild.getBrand());
                }
                if (brickBuild.getSetNumber() != null) {
                  b.setSetNumber(brickBuild.getSetNumber());
                }
                if (brickBuild.getIsBuilt() != null) {
                    b.setIsBuilt(brickBuild.getIsBuilt());
                }
                if (brickBuild.getInstructionBookWithSet() != null) {
                    b.setInstructionBookWithSet(brickBuild.getInstructionBookWithSet());
                }
                return b;
            }
        }
        return null;
    }
}
