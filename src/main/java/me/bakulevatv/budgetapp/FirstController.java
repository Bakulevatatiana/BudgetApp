package me.bakulevatv.budgetapp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FirstController {
    @GetMapping
    public String applicationLaunched() {
        return "«Приложение запущено»";

    }

    @GetMapping ("/info")
    public String projectInformation() {
        return "Имя ученика: Бакулева Татьяна "+
                "\n Название  проекта:Сайт рецептов " +
                "\nДата создания проекта:16.02.2023 " +
                "\n Описание проекта :Описание рецептов с ингредиентами и способом приготовления.";
    }
}
