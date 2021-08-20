package homework.never_use_switch;

import com.github.javafaker.Faker;
import homework.lab3.utils.RandomUtil;
import lombok.SneakyThrows;

import java.time.Duration;

/**
 * @author Evgeny Borisov
 */
public class Main {

    private static Duration RandomUtil;

    @SneakyThrows
    public static void main(String[] args) {
        MailSender mailSender = new MailSender();
        Faker faker = new Faker();
        while (true) {
            MailInfo mailInfo = MailInfo.builder()
                    .context(faker.chuckNorris().fact())
                    .mailType(RandomUtil.between(1, 2))
                    .build();

            mailSender.send(mailInfo);
            Thread.sleep(2000);

        }
    }
}
