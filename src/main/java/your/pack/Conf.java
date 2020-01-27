package your.pack;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;
import org.springframework.validation.annotation.Validated;

@Component // Based on https://www.baeldung.com/configuration-properties-in-spring-boot. However, contrary to that page, we DO need @Component even with Spring Boot 2.2!
@ConfigurationProperties(prefix = "validateconfig")
@Validated
public class Conf {
    String value;
    public /*@NotEmpty*/ String getValue() { return value; }
    public /*@NotEmpty*/ void setValue(String given) { value = given; }

    public String another;
    public /*@NotEmpty*/ String getAnother() { return another; }
    public /*@NotEmpty*/ void setAnother(String given) { another = given; }
}