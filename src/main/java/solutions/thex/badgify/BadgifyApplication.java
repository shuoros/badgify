package solutions.thex.badgify;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;
import java.util.TimeZone;

/**
 * BadgifyApplication.
 *
 * @author Soroush Shemshadi
 * @version 1.2.0
 * @see https://github.com/TheXSolutions/badgify
 * @see https://badgify.thex.solurions
 * @since 1.0.0
 */
@SpringBootApplication
public class BadgifyApplication {

    public static void main(String[] args) {
        SpringApplication.run(BadgifyApplication.class, args);
    }

    /**
     * This function executes after the application is started.
     */
    @PostConstruct
    public void init() {
        // Setting Spring Boot SetTimeZone
        TimeZone.setDefault(TimeZone.getTimeZone("GMT"));
    }

}
