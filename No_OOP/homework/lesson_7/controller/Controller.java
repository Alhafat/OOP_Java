package No_OOP.homework.lesson_7.controller;

import No_OOP.homework.lesson_7.models.Models;
import No_OOP.homework.lesson_7.view.View;

public class Controller {
    View view;
    Models model;

    public Controller() {
        this.view = new View();
        this.model = new Models();
    }

    public Models addToys(int id, String name, int count, int frequency) {
        return view.addToys(id, name, count, frequency);
    }

}
