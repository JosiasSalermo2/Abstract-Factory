import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertInstanceOf;
import static org.junit.jupiter.api.Assertions.assertNotNull;



public class FabricasTest {

    @Test
    void deveCriarPlantaoSocioeducativoNaFabricaNoturna(){
        FabricaRotina fabrica = new FabricaRotinaNoturna();
        TarefaProfissional tarefa = fabrica.criarTarefaProfissional();

        assertNotNull(tarefa, "A tarefa profissional não deve ser nula");
        assertInstanceOf(PlantaoSocioeducativo.class, tarefa,
                "A tarefa deve ser uma instância de PlantaoSocioeducativo");
    }

    @Test
    void deveCriarCuidadoNoturnoFilhosNaFabricaNoturna(){
        FabricaRotina fabrica = new FabricaRotinaNoturna();
        TarefaFamiliar tarefa = fabrica.criarTarefaFamiliar();

        assertNotNull(tarefa, "A tarefa familiar não deve ser nula");
        assertInstanceOf(CuidadoNoturnoFilhos.class, tarefa,
                "A tarefa deve ser uma instancia de CuidadoNoturnoFilhos");
    }

    @Test
    void deveCriarEstudoSistemasInformacaoNaFabricaDiurna(){
        FabricaRotina fabrica = new FabricaRotinaDiurna();
        TarefaProfissional tarefa = fabrica.criarTarefaProfissional();

        assertNotNull(tarefa, "A tarefa profissional não deve ser nula");
        assertInstanceOf(EstudoSistemasInformacao.class, tarefa,
                "A tarefa deve ser uma instância de EstudoSistemasInformacao");
    }

    @Test
    void deveCriarCuidadoDiurnoFamiliaFabricaDiurna(){
        FabricaRotina fabrica = new FabricaRotinaDiurna();
        TarefaFamiliar tarefa = fabrica.criarTarefaFamiliar();

        assertNotNull(tarefa, "A tarefa familiar não deve ser nula");
        assertInstanceOf(CuidadoDiurnoFamilia.class, tarefa,
                "A tarefa deve ser uma instância de CuidadoDiurnoFamilia");
    }
}
