package HomeWork1;

//      Создайте три класса Человек, Кот, Робот, которые не наследуются от одного класса.
//    Эти классы должны уметь бегать и прыгать (методы просто выводят информацию о действии в консоль).
//
//      Создайте два класса: беговая дорожка и стена,
//    при прохождении через которые, участники должны выполнять соответствующие действия (бежать или прыгать),
//    результат выполнения печатаем в консоль (успешно пробежал, не смог пробежать и т.д.).
//
//      Создайте два массива: с участниками и препятствиями, и заставьте всех участников пройти этот набор препятствий.
//
//    * У препятствий есть длина (для дорожки) или высота (для стены), а участников ограничения на бег и прыжки.
//    Если участник не смог пройти одно из препятствий, то дальше по списку он препятствий не идет.


public class MainClass {
    public static void main(String[] args) {
        RunRoad runRoad1 = new RunRoad(200);
        RunRoad runRoad2 = new RunRoad(500);

        Wall wall1 = new Wall(4);
        Wall wall2 = new Wall(6);

        Check [] obs = {runRoad1,wall1,runRoad2,wall2};

        Human human1 = new Human("Владимир", 6,700);
        Human human2 = new Human("Наталья", 5,500);

        Cat cat1 = new Cat("Барсик", 4, 300);
        Cat cat2 = new Cat("Мурка", 3, 500);

        Robot robot1 = new Robot("GLADOS", 6,1000);
        Robot robot2 = new Robot("MEGATHRONE", 10,2000);

        Runner [] runners = {human1,human2,cat1,cat2,robot1,robot2};

        for (Check ob : obs) {
            for (Runner runner : runners) {
                ob.doIT(runner);
            }
        }
    }
}
