package ru.mirea.pisarevdmitrii.project.repository;

import ru.mirea.pisarevdmitrii.project.core.db.DatabaseTable;
import ru.mirea.pisarevdmitrii.project.entity.Patient;

public class PatientRepository extends DatabaseTable<Patient> {
    public PatientRepository(String tableName) {
        super(tableName);
        initialization();
    }

    @Override
    public void initialization() {
        add(new Patient("Беляева", "Ульяна"));
        add(new Patient("Богатырева", "Анна"));
        add(new Patient("Бузмакова", "Дарья"));
        add(new Patient("Говорова", "Софья"));
        add(new Patient("Гегия", "Давит"));
        add(new Patient("Гусев", "Владислав"));
        add(new Patient("Зубов", "Николай"));
        add(new Patient("Иванова", "Таисия"));
        add(new Patient("Киреев", "Артем"));
        add(new Patient("Козлов", "Александр"));
        add(new Patient("Кудрявцев", "Валерий"));
        add(new Patient("Куппа", "Максим"));
        add(new Patient("Левицкий ", "Даниил"));
        add(new Patient("Липатников", "Кирилл"));
        add(new Patient("Мирошников ", "Ярослав"));
        add(new Patient("Мурунова", "Василиса"));
        add(new Patient("Нешкумай", "Александра"));
        add(new Patient("Овчаренко", "Анастасия"));
        add(new Patient("Овчаренко", "Мария"));
        add(new Patient("Писарев", "Дмитрий", "Вадимович"));
        add(new Patient("Побережнюк ", "Никита"));
        add(new Patient("Семенов", "Дмитрий"));
        add(new Patient("Слотин", "Александр"));
        add(new Patient("Тучина", "Наталья"));
        add(new Patient("Уваров", "Егор"));
        add(new Patient("Феклистова", "Кристина"));
        add(new Patient("Фролов", "Андрей"));
        add(new Patient("Хвостов", "Виталий"));
        add(new Patient("Шевелева", "Карина"));
        add(new Patient("Щепетильников", "Дмитрий"));
        add(new Patient("Яковлева", "Елизавета"));
        add(new Patient("Зозуля", "Дмитрий"));
    }
}
