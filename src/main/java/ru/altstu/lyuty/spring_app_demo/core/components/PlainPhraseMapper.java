package ru.altstu.lyuty.spring_app_demo.core.components;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("dev")
public class PlainPhraseMapper implements PhraseMapper{
    @Override
    public String toSentence(String target) {
        return toSentence(target, '.');
    }
}
