package JGanson.Assignment1.Service;

import JGanson.Assignment1.Entity.BrickBuild;
import JGanson.Assignment1.Respository.BrickBuildRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BrickBuildService {

    //I am not sure what @Autowired does. Did we talk about this in class?
    @Autowired
    private BrickBuildRepository brickBuildRepository;

    /**
     * Passes the brickBuild to save from the Controller layer to the Repository layer,
     * then the saved brickBuild back.
     * @param brickBuild
     * @return
     */
    public BrickBuild saveBrickBuild(BrickBuild brickBuild) {
        return brickBuildRepository.save(brickBuild);
    }

    /**
     * Passes the id to look up from the Controller layer,
     * then the brick build matching this id back.
     * @param id
     * @return
     */
    public BrickBuild findById(int id) {
        return brickBuildRepository.findById(id);
    }

    /**
     * Passes a list of all brick building sets from the repository layer to the controller layer
     * @return
     */
    public List<BrickBuild> getAllBrickBuilds() {
        return brickBuildRepository.getAllBuilds();
    }

    /**
     * Passes an id of a brick building set to delete to the repository layer,
     * and passes back a success message
     * @param id
     * @return
     */
    public String deleteBrickBuild(int id) {
        return brickBuildRepository.delete(id);
    }

    /**
     * Passes attributes to update and an id of the brick building set to update from the Controller layer to the Repository layer
     * @param brickBuild
     * @param id
     * @return
     */
    public BrickBuild updateBrickBuild(BrickBuild brickBuild, int id) {
        return  brickBuildRepository.update(brickBuild,id);
    }
}
