package com.company.lesson08;
/* циклы
for
    досрочный выход из цикла for 'break'
    пропуск одной итерации из цикла for 'continue'
    вложенный цикл for в цикл for
    вложенный цикл while в цикл for
while
    вложенный цикл while в цикл while
do/while
 */
public class Test {
    public static void main(String[] args) {
// цикл for
        for(int i = 0; i <= 10; i += 2) {
            System.out.println("For " + i);
        }
// досрочный выход из цикла for 'break'
        for(int i = 0; i <= 10; i += 1) {
            if(i == 7){
                break;
            }
            System.out.println("For break " + i);
        }
// пропуск одной итерации из цикла for 'continue'
        for(int i = 0; i <= 10; i += 1) {
            if (i == 7) {
                continue;
            }
            System.out.println("For continue " + i);
        }
// вложенный цикл for в цикл for
            for(int i = 0; i <= 3; i += 1) {
                for (int j = 0; j < 2; j++) {
                    System.out.println("for + вложенный цикл for " + j);
                }
                System.out.println("внешний цикл for " + i);
            }
// вложенный цикл while в цикл for
        for(int i = 0; i <= 3; i += 1) {
            int j = 0;
            while (j < 2) {
                System.out.println("вложенный цикл while " + j);
                j++;
            }
            System.out.println("внешний цикл for " + i);
        }
// цикл while
        int i = 0;
        while (i < 10){
            System.out.println("while " + i);
            i += 2;
        }
// вложенный цикл while в цикл while
        int t = 0;
        while (t < 3){
            System.out.println("внешний цикл while " + t);
            t++;

            int j = 0;
            while (j < 2) {
                System.out.println("while + вложенный цикл while " + j);
                j++;
            }
        }
// цикл do/while
        int j = 10;
        do{
            System.out.println("Do/While " + j);
            j++;
        }while (j < 10);
// продолжение выполнения команд программы вне циклов
        System.out.println("");
        System.out.println("End");
    }
}
