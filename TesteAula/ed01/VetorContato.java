package ed01;

public class VetorContato {
    private Contato [] contatos;

    //constante usado para valores estaticos, substituir valores magicos (numero solto)
    // sattic final indica que é constante

    private static final int NUM_CONTATOS = 50;
    private int topo;

    public VetorContato(){
        contatos = new Contato[NUM_CONTATOS];
        topo = 0;

    }

    public void adicionaContato (Contato contato){
        //TODO: validar se o topo < numcontatos
        contatos[topo] = contato;
        topo ++;
    }
    //TODO: nao expor o aray de contatos
    public Contato[] getContatos() {
        return contatos;
    }
}
