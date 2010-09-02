package no.steria.kraft;

import java.util.ArrayList;
import java.util.List;

public class ReservekraftOpsjonAuksjon {
    
    private List<ReservekraftOpsjonBud> alleBud = new ArrayList<ReservekraftOpsjonBud>();

    public void addBud(ReservekraftOpsjonBud bud) {
        alleBud.add(bud);
    }

    public void kjørMarked() {
        int akseptertPris;
        for (ReservekraftOpsjonBud bud : alleBud) {
            akseptertPris = bud.getTilbudtPrisPerMw();
            bud.setAkseptertPrisPerMegawatt(akseptertPris);
        }
    }

}
