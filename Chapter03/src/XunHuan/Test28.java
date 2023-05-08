package XunHuan;
/*
关键字break和continue的使用
 */
public class Test28 {
    public static void main(String[] args) {
        for(int i = 1;i <= 10;i++){
            if(i % 4 == 0){
//break;//123
                continue;//123567910
//如下的语句不可能被执行，编译不通过
//System.out.println("今晚迪丽热巴要约我吃饭");
            }
            System.out.print(i);
        }
        System.out.println("####");
//嵌套循环中的使用
        for(int i = 1;i <= 4;i++){
            for(int j = 1;j <= 10;j++){
                if(j % 4 == 0){
//break; //结束的是包裹break关键字的最近的一层循环！
                    continue;//结束的是包裹break关键字的最近的一层循环的当次！
                }
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
