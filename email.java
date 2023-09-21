package ServiçosDeEnvioDeEmail;



public class email  {
       
	     private String destinario;
	     private String assunto;
	     private String texto;
	
    public email(String destinario, String assunto) {    
	   this.assunto = assunto;
	   this.destinario = destinario;
	   
	   if (assunto.isEmpty() && destinario.isEmpty() ) {
		   throw new  EmailNotSentException(" E-mail nao enviado... ADICIONE Assunto/Destinario");
		   
	   } else if (assunto == "") {
		   throw new  EmailNotSentException(" E-mail nao enviado...  ADICIONE: Assunto!!");
	   } else if (destinario == "" ) {
		   throw new  EmailNotSentException(" E-mail nao enviado...  ADICIONE: Destinario!!");
	   } 
	   
	}
    
    
    
    
     
     
   
    
    //getter e setters
    
    

    public String getDestinario() {
		return destinario;
	}
 
    public String getAssunto() {
		return assunto;
	}
     
    public void setTexto(String texto) {
	 this.texto = texto;
     }
    public String getTexto() {
		return texto;
	}
   
    public String DadosDoEmail() {
    	String dadosEmail = " Enviando E-mail para: " + getDestinario() + "\n"
                          + " Assunto: " + getAssunto() + "\n"
                          + " Texto: "  + getTexto()
                          + "\n"
    	                  + " E-mail enviado com sucesso...";
    	
    	                  
       return dadosEmail;       
    }
   
    
}
