package ru.mirea.pisarevdmitrii.project.repository;

import ru.mirea.pisarevdmitrii.project.core.db.DatabaseTable;
import ru.mirea.pisarevdmitrii.project.entity.Patient;

public class PatientRepository extends DatabaseTable<Patient> {
    public PatientRepository(String tableName) {
        super(tableName);
    }

    @Override
    public void initialization() {
        add(new Patient("Беляева", "Ульяна", "1234"));
        add(new Patient("Богатырева", "Анна", "1234"));
        add(new Patient("Бузмакова", "Дарья", "1234"));
        add(new Patient("Говорова", "Софья", "1234"));
        add(new Patient("Гегия", "Давит", "1234"));
        add(new Patient("Гусев", "Владислав", "1234"));
        add(new Patient("Зубов", "Николай", "1234"));
        add(new Patient("Иванова", "Таисия", "1234"));
        add(new Patient("Киреев", "Артем", "1234"));
        add(new Patient("Козлов", "Александр", "1234"));
        add(new Patient("Кудрявцев", "Валерий", "1234"));
        add(new Patient("Куппа", "Максим", "1234"));
        add(new Patient("Левицкий ", "Даниил", "1234"));
        add(new Patient("Липатников", "Кирилл", "1234"));
        add(new Patient("Мирошников ", "Ярослав", "1234"));
        add(new Patient("Мурунова", "Василиса", "1234"));
        add(new Patient("Нешкумай", "Александра", "1234"));
        add(new Patient("Овчаренко", "Анастасия", "1234"));
        add(new Patient("Овчаренко", "Мария", "1234"));
        add(new Patient("Писарев", "Дмитрий", "Вадимович"));
        add(new Patient("Побережнюк ", "Никита", "1234"));
        add(new Patient("Семенов", "Дмитрий", "1234"));
        add(new Patient("Слотин", "Александр", "1234"));
        add(new Patient("Тучина", "Наталья", "1234"));
        add(new Patient("Уваров", "Егор", "1234"));
        add(new Patient("Феклистова", "Кристина", "1234"));
        add(new Patient("Фролов", "Андрей", "1234"));
        add(new Patient("Хвостов", "Виталий", "1234"));
        add(new Patient("Шевелева", "Карина", "1234"));
        add(new Patient("Щепетильников", "Дмитрий", "1234"));
        add(new Patient("Яковлева", "Елизавета", "1234"));
        add(new Patient("Зозуля", "Дмитрий", "1234"));
    }
}
