package br.com.mariojp.solid.dip;

public class AlternativeClient implements MailSender{

	@Override
	public void send(String to, String subject, String body) {
		  if(to == null || !to.contains("@")) throw new IllegalArgumentException("email inválido");
		
	}
	
}
