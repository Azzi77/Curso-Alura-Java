
public class Administrador extends Funcionario implements Autenticavel{

	private AutenticacaoUtil autenticador;

    public Administrador(){

        this.autenticador = new AutenticacaoUtil();
    }

    
    public void setSenha1(int senha){
        this.autenticador.setSenha(senha, senha);
    }

    
    public boolean autentica(int senha){
        return this.autenticador.autentica(senha);
    }


	public double getBonificacao() {
		
		return 0;
	}

	
	public void setSenha(int senha) {
		// TODO Auto-generated method stub
		
	}
}