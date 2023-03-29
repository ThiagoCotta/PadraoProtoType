package Inimigo;

public class Orc  implements Cloneable {
    private int id;
    private String nome;
    private Atributo atributo;
    private int chanceDeNascer;

    public Orc(int id, String nome, Atributo atributo, int chanceDeNascer) {
        this.id = id;
        this.nome = nome + "_" + String.valueOf(id);
        this.atributo = atributo;
        this.chanceDeNascer = chanceDeNascer;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Atributo getAtributo() {
        return atributo;
    }

    public void setAtributo(Atributo atributo) {
        this.atributo = atributo;
    }

    public int getChanceDeNascer() {
        return chanceDeNascer;
    }

    public void setChanceDeNascer(int chanceDeNascer) {
        this.chanceDeNascer = chanceDeNascer;
    }

    @Override
    public Orc clone() throws CloneNotSupportedException {
        Orc orcClone = (Orc) super.clone();
        orcClone.atributo = (Atributo) orcClone.atributo.clone();
        return orcClone;
    }

    @Override
    public String toString() {
        return "Orc{" +
                "id = " + id +
                ", nome ='" + nome + '\'' +
                ", atributos = " + atributo +
                ", chance de nascer = '" + chanceDeNascer + '\'' +
                '}';
    }
}
