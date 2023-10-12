package lesson17.mail;

public class Main {
    public static void main(String[] args) {
        MailSender mailSender = new MailSender();
        mailSender.sendEmail();

        mailSender = new PictureSender();
        mailSender.sendEmail();
    }
}
