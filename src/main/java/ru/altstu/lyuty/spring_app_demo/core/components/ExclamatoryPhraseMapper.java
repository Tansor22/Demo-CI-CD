package ru.altstu.lyuty.spring_app_demo.core.components;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("prod")
public class ExclamatoryPhraseMapper implements PhraseMapper{
    @Override
    public String toSentence(String target) {
        return toSentence(target, '!');
    }
}
