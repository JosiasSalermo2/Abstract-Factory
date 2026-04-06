public class FabricaRotinaDiurna implements FabricaRotina{

    @Override
    public TarefaProfissional criarTarefaProfissional(){
        return new EstudoSistemasInformacao();
    }

    @Override
    public TarefaFamiliar criarTarefaFamiliar(){
        return new CuidadoDiurnoFamilia();
    }
}
