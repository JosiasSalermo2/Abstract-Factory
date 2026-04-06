public class FabricaRotinaNoturna implements FabricaRotina {

    @Override
    public TarefaProfissional criarTarefaProfissional() {
        return new PlantaoSocioeducativo();
    }

    @Override
    public TarefaFamiliar criarTarefaFamiliar() {
        return new CuidadoNoturnoFilhos();
    }
}
