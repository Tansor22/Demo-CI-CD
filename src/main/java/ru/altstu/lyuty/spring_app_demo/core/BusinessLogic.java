package ru.altstu.lyuty.spring_app_demo.core;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import ru.altstu.lyuty.spring_app_demo.core.components.PhraseMapper;

import java.util.Collections;
import java.util.List;

@Service
public class BusinessLogic {
    @Value(value = "#{'${source.modern.nouns}'.split(',')}")
    private List<String> nouns;
    @Value(value = "#{'${source.modern.adjectives}'.split(',')}")
    private List<String> adjectives;
    @Value(value = "#{'${source.modern.adverbs}'.split(',')}")
    private List<String> adverbs;
    @Value(value = "#{'${source.modern.verbs}'.split(',')}")
    private List<String> verbs;

    private final PhraseMapper mapper;

    public BusinessLogic(PhraseMapper mapper) {
        this.mapper = mapper;
    }

    public  <T> List<T> random(List<T> src, int times) {
        src.sort((T o1, T o2) -> (int) Math.floor(0.5 - Math.random()));
        return src.subList(0, Math.min(times, src.size()));
    }

    public <T> T random(List<T> src) {
        return random(src, 1).get(0);
    }

    public String getModernPhrase() {
        List<String> terms = random(nouns, 2);
        String phrase = String.join(" ", random(adjectives), terms.get(0),
                random(adverbs), random(verbs), terms.get(1));
        return mapper.toSentence(phrase);
    }
}
