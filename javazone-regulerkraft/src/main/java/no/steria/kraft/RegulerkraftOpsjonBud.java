package no.steria.kraft;

public class RegulerkraftOpsjonBud {

    private int tilbudtPrisPerMw;
    private int tilgjengeligEffektIMegaWatt;
    private int pris;

    public int getTilbudtPrisPerMw() {
        return tilbudtPrisPerMw;
    }

    public void setTilbudtPrisPerMw(int tilbudtPrisPerMw) {
        this.tilbudtPrisPerMw = tilbudtPrisPerMw;
    }

    public int getTilgjengeligEffektIMegaWatt() {
        return tilgjengeligEffektIMegaWatt;
    }

    public void setTilgjengeligEffekt(int megaWatt) {
        this.tilgjengeligEffektIMegaWatt = megaWatt;
    }

    public int getPris() {
        return pris;
    }

    public void setAkseptertPrisPerMegawatt(int akseptertPrisPerMegawatt) {
        this.pris = akseptertPrisPerMegawatt * tilgjengeligEffektIMegaWatt;
    }

    public static RegulerkraftOpsjonBud medVolumOgPris(int effektIMw, int prisPerMw) {
        RegulerkraftOpsjonBud bud = new RegulerkraftOpsjonBud();
        bud.setTilbudtPrisPerMw(prisPerMw);
        bud.setTilgjengeligEffekt(effektIMw);
        return bud;
    }

}
