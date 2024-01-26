package JGanson.Assignment1.Controller;

import JGanson.Assignment1.Entity.BrickBuild;
import JGanson.Assignment1.Service.BrickBuildService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/assignment1/brickBuilds")
public class Controller {

    @Autowired
    private BrickBuildService brickBuildService;

    @PostMapping("/create")
    public BrickBuild createBrickBuild(@RequestBody BrickBuild brickBuild) {
        return brickBuildService.saveBrickBuild(brickBuild);
    }

    @GetMapping("/all")
    public List<BrickBuild> getAllBrickBuilds() {
        return brickBuildService.getAllBrickBuilds();
    }

    @GetMapping("id/{buildId}")
    public BrickBuild getBrickBuildById(@PathVariable int buildId) {
        return brickBuildService.findById(buildId);
    }

    @PutMapping("update/{buildId}")
    public BrickBuild updateBrickBuild(@PathVariable int buildId, @RequestBody BrickBuild updatedBrickBuild) {
        return brickBuildService.updateBrickBuild(updatedBrickBuild,buildId);
    }

    @DeleteMapping("delete/{buildId}")
    public String deleteBrickBuild(@PathVariable int buildId) {
        return brickBuildService.deleteBrickBuild(buildId);
    }

}
