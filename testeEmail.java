package ServiçosDeEnvioDeEmail;

public class testeEmail {
  

	public static void main(String[] args) {
       	  
    	 try{
    		 email Email = new email("regisbale289@gmail.com","TESTE");
    		 Email.setTexto("olassfdfsdfds sd");
    		 System.out.println(Email.DadosDoEmail());
    	 } catch(EmailNotSentException  ex) {
    	     System.out.println(ex.getMessage());
    	 }
		
    	 
      }
} 
