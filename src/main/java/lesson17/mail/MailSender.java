package lesson17.mail;

public class MailSender {
    void sendEmail() {
        System.out.println("відправляємо:" + getText());
    }

    String getText() {
        return "email";
    }
}
class PictureSender extends MailSender {
    @Override
    String getText() {
      return "picture";
    }
}
