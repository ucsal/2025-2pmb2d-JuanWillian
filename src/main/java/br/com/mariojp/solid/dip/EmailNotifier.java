package br.com.mariojp.solid.dip;

public class EmailNotifier {
	private final MailSender mailSender;

	public EmailNotifier() {
		if ("true".equalsIgnoreCase(System.getProperty("DRY_RUN"))) {
			// Estado inicial: ainda assim usa SMTP real (bug proposital)
			this.mailSender = new AlternativeClient();
		} else {
			this.mailSender = new SmtpClient();
		}
	}

	public void welcome(User user) {
		mailSender.send(user.email(), "Bem-vindo", "Olá " + user.name());
	}
}
