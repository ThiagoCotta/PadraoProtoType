import Inimigo.Atributo;
import Inimigo.Orc;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class OrcTest {
    @Test
    void testClone() throws CloneNotSupportedException {
        Orc orc = new Orc(166, "Orc primordial", new Atributo(16, 4, 1, 5, 10), 30);

        Orc orcClone = orc.clone();
        orcClone.setId(353);
        orcClone.setNome("Orc Clone");
        orcClone.getAtributo().setForca(12);
        orcClone.setChanceDeNascer(50);

        assertEquals("Orc{id = 166, nome ='Orc primordial_166', atributos = Atributo{forca = '16', agilidade = 4, mana = 1, esquiva = 5, vigor = 10}, chance de nascer = '30'}", orc.toString());
        assertEquals("Orc{id = 353, nome ='Orc Clone', atributos = Atributo{forca = '12', agilidade = 4, mana = 1, esquiva = 5, vigor = 10}, chance de nascer = '50'}", orcClone.toString());
    }
}
