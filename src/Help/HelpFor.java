package Help;

import java.io.IOException;

public class HelpFor {
    public static void main(String[] args) throws IOException {
        char select;
        for (;;) {
        do {
            System.out.println("Справка:");
            System.out.println("1. if");
            System.out.println("2. switch");
            System.out.println("3. for");
            System.out.println("4. while");
            System.out.println("5. do-while");
            System.out.println("6. break");
            System.out.println("7. continue");
            System.out.println("\nВыберите необходимый оператор из справки (1-7):");
            select = (char) System.in.read();
        } while ( select < '1'   | select > '7' & select != 'q');

        switch (select) {
            case '1' -> {
                System.out.println("Oпepaтop if:\n");
                System.out.println("if(ycлoвиe) оператор;");
                System.out.println("else оператор;");
            }
            case '2' -> {
                System.out.println("Oпepaтop switch:\n");
                System.out.println("switch(выpaжeниe) {");
                System.out.println(" case константа:");
                System.out.println(" последовательность операторов");
                System.out.println(" break;");
            }
            case '3' -> {
                System.out.println("Oпepaтop for:\n");
                System.out.print("for(инициaлизaция; условие; итерация)");
                System.out.println(" оператор;");
            }
            case '4' -> {
                System.out.println("Oпepaтop while:\n");
                System.out.println("while(ycлoвиe) оператор;");
            }
            case '5' -> {
                System.out.println("Oпepaтop do-while:\n");
                System.out.println("do {");
                System.out.println(" оператор;");
                System.out.println("} while (условие};");
            }
            case '6' -> {
                System.out.println("Oпepaтop break:\n");
                System.out.println("break; или break метка;");
            }
            case '7' -> {
                System.out.println("Oпepaтop continue:\n");
                System.out.println("continue; или continue метка;");
            }
        }
            if (select == 'q') break;
        }
    }
}
