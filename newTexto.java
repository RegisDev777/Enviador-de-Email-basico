package ServiçosDeEnvioDeEmail;

public class newTexto {
     
	private String texto;
	
	public newTexto(String texto) {
	  this.texto = texto;
	}
	
    public String DadosDoTexto() {
	    	String dadosTexto = " Texto: "  + getTexto();                 
	       return dadosTexto;       
	    }
	
	public String getTexto() {
		return texto;
	}
	
}
