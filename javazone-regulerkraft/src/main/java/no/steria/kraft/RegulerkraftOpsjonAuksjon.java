package no.steria.kraft;

import java.util.ArrayList;
import java.util.List;

public class RegulerkraftOpsjonAuksjon {
    
    private List<RegulerkraftOpsjonBud> alleBud = new ArrayList<RegulerkraftOpsjonBud>();

    public void addBud(RegulerkraftOpsjonBud bud) {
        alleBud.add(bud);
    }

    public void kjørMarked() {
        int akseptertPris;
        for (RegulerkraftOpsjonBud bud : alleBud) {
            akseptertPris = bud.getTilbudtPrisPerMw();
            bud.setAkseptertPrisPerMegawatt(akseptertPris);
        }
    }

}
