package task3;

import java.util.ArrayList;

public class Dictionary {
    Translator translator = new Translator();
    Dictionary() {
        translator.addPair("i", "я");translator.addPair("you", "ты");translator.addPair("we", "мы");
        translator.addPair("it", "оно");translator.addPair("he", "он");translator.addPair("she", "она");
        translator.addPair("eat", "кушать");translator.addPair("sleep", "спать");translator.addPair("go", "идти");
        translator.addPair("drink", "пить");translator.addPair("study", "учиться");translator.addPair("read", "читать");
        translator.addPair("write", "писать");translator.addPair("today", "сегодня");translator.addPair("yesterday", "вчера");
        translator.addPair("tomorrow", "завтра");translator.addPair("will", "буду");translator.addPair("do", "делать");
        translator.addPair("dog", "собака");translator.addPair("cat", "кот");translator.addPair("plant", "растение");
        translator.addPair("feed", "кормить");translator.addPair("pat", "гладить");translator.addPair("walk", "гулять");
        translator.addPair("meet", "встречаться");translator.addPair("with", "с");translator.addPair("friends", "друзья");
        translator.addPair("my", "мой");translator.addPair("mother", "мама");translator.addPair("father", "папа");
        translator.addPair("sister", "сестра");translator.addPair("brother", "брат");translator.addPair("have", "иметь");
        translator.addPair("love", "люблю");translator.addPair("hate", "ненавжу");translator.addPair("spagetti", "спагетти");
        translator.addPair("pizza", "пицца");translator.addPair("soup", "суп");translator.addPair("exit", "выход");

    }

    void getTranslation(String[] words){
        System.out.println(translator.getTranslation(words).toString());
    }

}

