import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class JosiasTest {

    @Test
    void deveExecutarTarefaProfissionalNoturna(){
        FabricaRotina fabrica = new FabricaRotinaNoturna();
        Josias josias = new Josias(fabrica);

        String resultado = josias.executarTarefaProfissional();

        assertNotNull(resultado, "A tarefa profissional não deve ser nula");
        assertTrue(resultado.contains("plantão noturno no Centro Socioeducativo"),
                "A tarefa deve descrever o plantão no Centro Socioeducativo");
        assertTrue(resultado.contains("menores infratores"),
                "A tarefa deve mencionar menores infratores");
    }

    @Test
    void deveExecutarTarefaProfissionalDiurna(){
        FabricaRotina fabrica = new FabricaRotinaDiurna();
        Josias josias = new Josias(fabrica);

        String resultado = josias.executarTarefaProfissional();

        assertNotNull(resultado, "A tarefa profissional não deve ser nula");
        assertTrue(resultado.contains("Estudando LP V"),
                "A tarefa deve descrever o estudo de SI");
        assertTrue(resultado.contains("padrões de projeto"),
                "A tarefa deve mencionar padrões de projeto");
    }

    @Test
    void deveExecutarTarefaFamiliarNoturna(){
        FabricaRotina fabrica = new FabricaRotinaNoturna();
        Josias josias = new Josias(fabrica);

        String resultado = josias.executarTarefaFamiliar();

        assertNotNull(resultado, "A tarefa familiar não deve ser nula");
        assertTrue(resultado.contains("Cuidado noturno com os filhos"),
                "A tarefa deve descrever o cuidado noturno");
        assertTrue(resultado.contains("Samuel"),
                "A tarefa deve mencionar alimentar o Samuel");
    }

    @Test
    void deveExecutarTarefaFamiliarDiurna(){
        FabricaRotina fabrica = new FabricaRotinaDiurna();
        Josias josias = new Josias(fabrica);

        String resultado = josias.executarTarefaFamiliar();

        assertNotNull(resultado, "A tarefa familiar não deve ser nula");
        assertTrue(resultado.contains("Cuidado diurno com a família"),
                "A tarefa deve descrever o cuidado diurno");
        assertTrue(resultado.contains("brincar com Eliza"),
                "A tarefa deve mencionar brincar com Eliza");
        assertTrue(resultado.contains("Judy"),
                "A tarefa deve mencionar Judy");
    }
}
