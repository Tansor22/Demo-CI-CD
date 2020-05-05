package ru.altstu.lyuty.spring_app_demo.core


import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.test.context.ActiveProfiles
import org.springframework.test.context.ContextConfiguration
import ru.altstu.lyuty.spring_app_demo.App
import spock.lang.Specification
import spock.lang.Unroll

@SpringBootTest
@ActiveProfiles("test")
@ContextConfiguration(classes = [App])
class BusinessLogicTest extends Specification {
    @Autowired
    BusinessLogic logic

    def "In test profile BusinessLogic returns question sentences"() {
        expect:
        logic.getModernPhrase().contains('?')
    }

    @Unroll
    def "BusinessLogic random picks #expectedSize elements from #src, while specified amount of elements was #times"() {
        expect:
        logic.random(src, times).size() == expectedSize
        where:
        src       | times | expectedSize
        ['1']     | 1     | 1
        [1, 2, 3] | 2     | 2
        []        | 2     | 0
    }
}
