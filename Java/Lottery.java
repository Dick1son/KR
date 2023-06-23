package Java;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.io.FileWriter;
import java.io.BufferedReader;
import java.io.FileReader;

public class Lottery {
    private List<Toy> listToys = new ArrayList<>();
    private int toyCount;

    public List<Toy> getToys() {
        return listToys;
    }

    public int getToyCount() {
        return toyCount;
    }

  
    public List<Toy> addToy(Toy name) {
        listToys.add(name);
        toyCount++;
        return listToys;
    }

    
    private List<Toy> deleteToy(Toy name) {
        listToys.remove(name);
        toyCount--;
        return listToys;
    }

   
    private void saveInFile() {
        try (FileWriter writer = new FileWriter("E:/GeekBrains/KR/Java/winList.txt", true)) {
            String text = listToys.get(0).getToy_name();
            writer.write(text + "\n");
            writer.close();
        } catch (Exception ex) {
            System.out.println("Ошибка записи файла");
        }
    }

 
    public void readFile() {
        try {
            FileReader fr = new FileReader("E:/GeekBrains/KR/Java/winList.txt");
            BufferedReader reader = new BufferedReader(fr);
            String line = reader.readLine();
            while (line != null) {
                System.out.println(line);
                line = reader.readLine();
            }

        } catch (Exception ex) {
            System.out.println("Ошибка чтения файла");
        }
    }

    
    public void lottery() {
        while(toyCount > 0){
            Scanner scan = new Scanner(System.in);
            int chance = 50;
            System.out.println("\nШанс на выигрыш по умолчанию 50%");
            System.out.println("Если хотите изменить шанс на победу, нажмите 1");
            System.out.println("Если хотите оставить шанс на победу по умолчанию, нажмите 2");
            System.out.println("Если хотите закончить игру, нажмите 3");
            System.out.print("Ввод: ");
            String changeСhance = scan.next();

            if (changeСhance.equals("3")){
                break;
            } 

            if (changeСhance.equals("1")) {
                System.out.println("\nВведите число от 1 до 100, это процентное соотношение на победу!");
                chance = scan.nextInt();
            }
            if (chance >= 0 && chance <= 100) {
                Random rnd = new Random();
                int num = rnd.nextInt(100);
                if (num > chance) {
                    System.out.println("\nВы проиграли, попробуйте cнова");
                } else if (num < chance) {
                    System.out.println("\nПоздравляю, вы выйграли!!!");
                    saveInFile();
                    deleteToy(listToys.get(0));
                }
            } else {
                System.out.println("Вы ввели не верное значение! попробуйте снова..");
            }
        }
    }
}