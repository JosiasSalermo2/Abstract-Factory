import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ProdutosTest {

    @Test
    void deveExecutarPlantaoSocioeducativoCorretamente(){
        TarefaProfissional tarefa = new PlantaoSocioeducativo();
        String resultado = tarefa.executar();

        assertNotNull(resultado, "O resultado não deve ser nulo");
        assertTrue(resultado.contains("plantão noturno"),
                "Deve mencionar plantão noturno");
        assertTrue(resultado.contains("Centro Socioeducativo"),
                "Deve mencionar Centro Socioeducativo");
        assertTrue(resultado.contains("menores infratores"),
                "Deve mencionar menores infratores");
    }

    @Test
    void deveExecutarEstudoSistemasInformacaoCorretamente(){
        TarefaProfissional tarefa = new EstudoSistemasInformacao();
        String resultado = tarefa.executar();

        assertNotNull(resultado, "O resultado não deve ser nulo");
        assertTrue(resultado.contains("Estudando LP V"),
                "Deve mencionar Estudando LP V");
        assertTrue(resultado.contains("padrões de projeto"),
                "Deve mencionar padrões de projeto");
        assertTrue(resultado.contains("SOLID"),
                "Deve mencionar SOLID");
    }

    @Test
    void deveExecutarCuidadoNoturnoFilhosCorretamente(){
        TarefaFamiliar tarefa = new CuidadoNoturnoFilhos();
        String resultado = tarefa.executar();

        assertNotNull(resultado, "O resultado não deve ser nulo");
        assertTrue(resultado.contains("Cuidado noturno"),
                "Deve mencionar cuidado noturno");
        assertTrue(resultado.contains("Samuel"),
                "Deve mencionar Samuel");
        assertTrue(resultado.contains("Eliza"),
                "Deve mencionar Eliza");
    }

    @Test
    void deveExecutarCuidadoDiurnoFamiliaCorretamente(){
        TarefaFamiliar tarefa = new CuidadoDiurnoFamilia();
        String resultado = tarefa.executar();

        assertNotNull(resultado, "O resultado não deve ser nulo");
        assertTrue(resultado.contains("Cuidado diurno"),
                "Deve mencionar cuidado diurno");
        assertTrue(resultado.contains("Judy"),
                "Deve mencionar Judy");
        assertTrue(resultado.contains("Eliza"),
                "Deve mencionar Eliza");
        assertTrue(resultado.contains("Samuel"),
                "Deve mencionar Samuel");
    }
}
