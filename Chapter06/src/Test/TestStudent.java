package Test;
/*
注意：冒泡排序法有内循环和外循环
 */
import MianXiangDuiXiang.Student;

import java.util.Scanner;

public class TestStudent {
    public static void main(String[] args) {
        //方式一：手动输入学生的相关内容
        //声明一个全局的数组，如果我声明在for 循环的里面的话那么在for 循环的外面是不能调用的。
        //声明对象数组student，并且初始化数组的长度为20在这里new是对数组初始化的关键字，不是初始化对象的关键字。
        //数组元素是一个对象，意思就是这个数组里面放置了20个对象，那么我们在使用的时候就需要对每一个对象进行初始化。
/*
        Student[] student = new Student[20];
        for (int i = 0; i < 20; i++) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("请输入第"+(i+1)+"个学生的姓名：");
            //初始化第一个对象
            student[i] = new Student();
            student[i].name = scanner.nextLine();
            System.out.print("请输入第"+(i+1)+"个学生的学号：");
            student[i].number = scanner.nextInt();
            System.out.print("请输入第"+(i+1)+"个学生的年级：");
            student[i].state = scanner.nextInt();
            System.out.print("请输入第"+(i+1)+"个学生的成绩：");
            student[i].score = scanner.nextInt();
            System.out.println("第"+(i+1)+"个学生的信息为：");
            System.out.println("姓名："+student[i].name);
            System.out.println("学号："+student[i].number);
            System.out.println("年级："+student[i].state);
            System.out.println("成绩："+student[i].score);
        }
*/
        //由于第一种方法需要我们输入较多的数字和姓名，下面我们使用随机数
        Student[] students = new Student[20];

            for (int i = 0; i < 20; i++) {
                students[i] = new Student();
                students[i].number = i + 1;
                students[i].state = (int) (Math.random() * 10) + 1;
                students[i].score = (int) (Math.random() * 100) + 1;
                System.out.println("number = " + students[i].number + '\t' + "state = " + students[i].state + '\t' + "score = " + students[i].score);
            }
            for (int j = 0; j < 20; j++) {
                if (students[j].state == 3) {
                System.out.println("三年级的学生" + students[j].number + "的成绩为：" + students[j].score);
            }
            }
            Student[] students1 = new Student[1];
            students1[0] = new Student();
        for (int m = 0; m <students.length-1 ; m++) {
            for (int k = 0; k < 19; k++) {
                if (students[k].score > students[k+1].score){
                    students1[0] = students[k+1];
                    students[k+1] = students[k];
                    students[k] = students1[0];
                }
            }
        }

       for (int n = 0; n < 20; n++) {
           System.out.println("number = " + students[n].number + '\t' + "state = " + students[n].state + '\t' + "score = " + students[n].score);
        }
    }
}