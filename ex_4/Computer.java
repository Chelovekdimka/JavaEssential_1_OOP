//Використовуючи IDEA, створіть проект із пакетом.
// Створити клас Computer, створити масив об'єктів Computers розміром 5.
// Далі руками створити 5 екземплярів цього класу та записати на комп'ютер (використовуючи loop).

package ex_4;

public class Computer {
    int index = 0;

    public Computer(int index) {
        this.index = index;
    }

    public static void main(String[] args) {
        Computer[] computers = new Computer[5];
        computers[0] = new Computer(0);
        computers[1] = new Computer(1);
        computers[2] = new Computer(2);
        computers[3] = new Computer(3);
        computers[4] = new Computer(4);
        for (int i = 0; i <= computers.length-1; i++) {
            System.out.println(computers[i].index + " ");
        }
    }
}
