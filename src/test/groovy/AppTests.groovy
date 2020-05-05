import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.test.context.ActiveProfiles
import org.springframework.test.context.ContextConfiguration
import org.springframework.test.web.servlet.MockMvc
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders
import org.springframework.test.web.servlet.result.MockMvcResultMatchers
import org.springframework.test.web.servlet.setup.MockMvcConfigurer
import ru.altstu.lyuty.spring_app_demo.App
import ru.altstu.lyuty.spring_app_demo.controllers.ModernPhraseGeneratorController
import spock.lang.Specification

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get

@SpringBootTest
@ActiveProfiles("test")
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
