package lesson_actybaev.lesson_2;

import java.util.ArrayList;
import java.util.List;

public class exp_1 {
    public static void main(String[] args) {
        Cat cat = new Cat();
        Dog dog = new Dog();
        Radio radio = new Radio();
        List<Speakable> speakablesList = new ArrayList<>();
        speakablesList.add(cat);
        speakablesList.add(dog);
        speakablesList.add(radio);
        voiceAll(speakablesList);
    }

    public static void voiceAll(List<Speakable> speakableList) {
        for (Speakable speakable : speakableList) {
            speakable.voice();
        }
    }
}
