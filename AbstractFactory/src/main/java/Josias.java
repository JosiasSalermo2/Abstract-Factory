public class Josias {

    private TarefaProfissional  tarefaProfissional;
    private TarefaFamiliar  tarefaFamiliar;

    public Josias(FabricaRotina fabrica){
        this.tarefaProfissional = fabrica.criarTarefaProfissional();
        this.tarefaFamiliar =  fabrica.criarTarefaFamiliar();
    }

    public String executarTarefaProfissional(){
        return this.tarefaProfissional.executar();
    }

    public String executarTarefaFamiliar(){
        return this.tarefaFamiliar.executar();
    }
}
