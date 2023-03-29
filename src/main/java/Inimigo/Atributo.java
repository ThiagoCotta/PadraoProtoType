package Inimigo;

public class Atributo implements Cloneable {
    private int forca;
    private int agilidade;
    private int mana;
    private int esquiva;
    private int vigor;

    public Atributo(int forca, int agilidade, int mana, int esquiva, int vigor) {
        super();
        this.forca = forca;
        this.agilidade = agilidade;
        this.mana = mana;
        this.esquiva = esquiva;
        this.vigor = vigor;
    }

    public int getForca() {
        return forca;
    }

    public void setForca(int forca) {
        this.forca = forca;
    }

    public int getAgilidade() {
        return agilidade;
    }

    public void setAgilidade(int agilidade) {
        this.agilidade = agilidade;
    }

    public int getMana() {
        return mana;
    }

    public void setMana(int mana) {
        this.mana = mana;
    }

    public int getEsquiva() {
        return esquiva;
    }

    public void setEsquiva(int esquiva) {
        this.esquiva = esquiva;
    }

    public int getVigor() {
        return vigor;
    }

    public void setVigor(int vigor) {
        this.vigor = vigor;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return "Atributo{" +
                "forca = '" + forca + '\'' +
                ", agilidade = " + agilidade +
                ", mana = " + mana +
                ", esquiva = " + esquiva +
                ", vigor = " + vigor +
                '}';
    }
}
