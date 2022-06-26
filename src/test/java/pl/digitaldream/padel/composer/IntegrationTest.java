package pl.digitaldream.padel.composer;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import org.springframework.boot.test.context.SpringBootTest;
import pl.digitaldream.padel.composer.PadelComposerApp;
import pl.digitaldream.padel.composer.config.EmbeddedMongo;

/**
 * Base composite annotation for integration tests.
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@SpringBootTest(classes = PadelComposerApp.class)
@EmbeddedMongo
public @interface IntegrationTest {
}
