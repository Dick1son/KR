package Java;

public class Main {
        public static void main(String[] args) {

        Toy bear = new Toy(1, "Плюшевый медведь");
        Toy car = new Toy(2, "Машинка");
        Toy cubes = new Toy(3, "Кубик Рубика");
        Toy lego = new Toy(4, "Лего");
        Toy balloons = new Toy(5, "Воздушные шарики");
        Toy ball = new Toy(6, "Баскетбольный мяч");
        Toy sword = new Toy(7, "Меч");


        Lottery lottery = new Lottery();
        lottery.addToy(bear);
        lottery.addToy(car);
        lottery.addToy(cubes);
        lottery.addToy(lego);
        lottery.addToy(balloons);
        lottery.addToy(ball);
        lottery.addToy(sword);
        
        lottery.lottery();
        lottery.readFile();

        lottery.getToys();
    }
}