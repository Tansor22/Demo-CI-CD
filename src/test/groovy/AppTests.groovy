import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.test.context.ActiveProfiles
import org.springframework.test.context.ContextConfiguration
import ru.altstu.lyuty.spring_app_demo.App
import ru.altstu.lyuty.spring_app_demo.controllers.ModernPhraseGeneratorController
import spock.lang.Specification

@SpringBootTest
@ActiveProfiles("test")
@ContextConfiguration(classes = [App])
class AppTests extends Specification {
    @Autowired
    ModernPhraseGeneratorController controller


    def "contextLoads"() {
        expect:
        controller != null
    }

    def "Controller greets"() {
        expect:
        controller.greet() == "Hello from ${controller.class.simpleName}!"
    }
}
