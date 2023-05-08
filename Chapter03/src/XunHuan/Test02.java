package XunHuan;
/*
for (①初始化部分; ②循环条件部分; ④迭代部分)｛
③循环体部分;
｝
执行过程：①-②-③-④-②-③-④-②-③-④-.....-②
 */
public class Test02 {
    public static void main(String[] args) {
                int num = 1;
                for(System.out.print("a");num < 3;System.out.print("c"),num++){
                    System.out.print("b");
            }
        }
    }
