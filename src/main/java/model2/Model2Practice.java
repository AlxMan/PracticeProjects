package model2;

import java.util.Scanner;

public class Model2Practice {
    /**
     * 1.定义一个长度为[16][16]的整型二维数组并输入或指定所有位置的元素值，分别实现二维数组中所有行和所有列中所有元素的累加和并打印。
     * 再分别实现二维数组中左上角到右下角和右上角到左下角所有元素的累加和并打印
     */
    //1.创建int类型的变量标记X、Y轴坐标 创建arr二维数组
//    private int sumRows;
//    private int sumLeft;
//    private int sumRight;
//    private int x;
//    private int y;
//    private int[][] arr;
//    //2、无参方式初始化二维数组
//    public Model2Practice() {
//        this.sumRows = 0;
//        this.sumLeft = 0;
//        this.sumRight = 0;
//        this.x = 0;
//        this.y = 0;
//        arr = new int[16][16];
//    }
//    //有参方式初始化二维数组，把X轴Y轴坐标传入数组中
//    public Model2Practice(int rows, int cols) {
//        this.sumRows = 0;
//        this.sumLeft = 0;
//        this.sumRight = 0;
//        this.x = 0;
//        this.y = 0;
//        arr = new int[rows][cols];
//    }
//
//    public int[][] getArr() {
//        return arr;
//    }
//
//    public void setArr(int[][] arr) {
//        this.arr = arr;
//    }
//
//    //3、嵌套for循环把二层数组打印出来
//    public void addValue(){
//        for (int i=0;i<arr.length;i++){
//            for (int j=0;j<arr[i].length;j++){
//                arr[i][j] = j;
//                System.out.print(arr[i][j] + " ");
//            }
//            System.out.println();
//        }
//    }
//
//    //4、求和
//    public void addShow(){
//        //for循环把外层数组的长度取出来，放在I中
//        for (int i=0;i<arr.length;i++){
//            //当i达到总长度的时候，累加器还原到0的状态
//            if(x == i){
//                sumRows = 0;
//            }
//            //for循环把内层数组的长度取出来，放在J中
//            for (int j=0;j<arr[i].length;j++){
//                //存储每一个的总和，累加器等于当前i行j总长度的累加，j长度为16那么sumRows就等于0-15总和（就是当前i行的总和）
//                sumRows += arr[i][j];
//                if(j == arr[i].length-1) {
//                    System.out.println("第" + i + "行的值为：" + sumRows);
//                    x += 1;
//                }
//
//                //存储每列第一个元素的总和，每次循环当J为0时存储在Y中，累加并打印当前循环Y的累加数值
//                if(0 == j){
//                    y += arr[i][j];
//                    System.out.println("Y = " + y);
//                }
//                //存储左上角到右下角的总和，每行I与J的值相当把该元素存储在累加器中并打印（第一行0，0/第二行1，1如此类推）
//                if(i == j) {
//                    sumLeft += arr[i][j];
//                }
//                //存储右上角到左下角的总和，当J的值等于每次循环每次循环最大长度1的时候的累加（第一次循环时16-1-0）
//                if(j == arr[i].length-1-i){
//                    sumRight += arr[i][j];
//                }
//            }
//        }
//        System.out.println("左上角到右下角的总和是："+sumLeft);
//        System.out.println("右上角到左下角的总和是："+sumRight);
//    }
//
//    public static void main(String[] args) {
//        Model2Practice Model2Practice = new Model2Practice(16,16);
//        Model2Practice.addValue();
//        Model2Practice.addShow();
//    }


    /**
     * 2. 编程实现控制台版并支持两人对战的五子棋游戏。
     *
     * （1）绘制棋盘 - 写一个成员方法实现
     *
     * （2）提示黑方和白方分别下棋并重新绘制棋盘 - 写一个成员方法实现。
     *
     * （3）每当一方下棋后判断是否获胜 - 写一个成员方法实现。
     *
     * （4）提示： 采用二维数组来模拟并描述棋盘，棋盘如下：
     */
    // 创建二维数组
        private String[][] board;
        private char white;
        private char black;
        private int rows;   //  行
        private int cols;   //  列

        Model2Practice() {
        }

        //2、初始化二维数组
        Model2Practice(int rows, int cols, char white, char black) {
            setBoard(rows, cols);
            setWhite(white);
            setBlack(black);
            setRows(rows);
            setCols(cols);
        }

        public void setRows(int rows) {
            this.rows = rows;
        }

        public void setCols(int cols) {
            this.cols = cols;
        }

        public int getRows() {
            return rows;
        }

        public int getCols() {
            return cols;
        }

        public void setBoard(int rows, int cols) {
            board = new String[rows][cols];
        }

        public void setWhite(char white) {
            this.white = white;
        }

        public void setBlack(char black) {
            this.black = black;
        }

        public String[][] getBoard(int rows, int cols) {
            return board;
        }

        public char getWhite() {
            return white;
        }

        public char getBlack() {
            return black;
        }
        // 3、打印棋盘
        public void getBoard() {
            for (int i = 0; i < board.length; i++) {
                for (int j = 0; j < board[0].length; j++) {
            //打印Y轴第一列，转为为整形十六进制打印
                    if (i == 0) {
                        board[i][j] = String.format("%x", j - 1);
                    //打印X轴第一列，转换为整型十六进制打印
                    } else if (j == 0) {
                        board[i][j] = String.format("%x", i - 1);
                    } else {
                        //剩下全部打印+号
                        board[i][j] = "+";
                    }
                }
            }
            board[0][0] = " ";
        }
        //打印棋子
        public void showBoard() {
            for (String[] str : board) {
                for (int j = 0; j < board[0].length; j++) {
                    if ("白".equals(str[j])) {
                        System.out.print(white + " ");
                    } else if ("黑".equals(str[j])) {
                        System.out.print(black + " ");
                    } else {
                        System.out.print(str[j] + " ");

                    }
                }
                System.out.println();
            }
        }
        //接受到游戏入口传来的参数判断获胜条件
        private Boolean isWin(int x, int y, String chess, int rows, int cols) {
            int countCol = -1;
            int countRow = -1;
            int countDiagonalLeft = -1;
            int countDiagonalRight = -1;
            int a;
            int b;
            a = x;
            b = y;
            //无线循环，判断获胜条件
            while (true) {
            //从右到左判断5个棋子是否连在一起，如果其中有一个棋子断开就执行break，b=0的时候也执行break
                if (chess.equals(board[a][b])) {
                    countRow++;
                    if (b == 0) {
                        break;
                    }
                    b--;
                } else {
                    break;
                }
            }
            a = x;
            b = y;
            while (true) {
                //左到右判断5个棋子是否连在一起，如果其中一个棋子断开就执行break，b达到数组最末尾的时候也执行break
                if (chess.equals(board[a][b])) {
                    countRow++;
                    if (b == (cols - 1)) {
                        break;
                    }
                    b++;
                } else {
                    break;
                }
            }

            a = x;
            b = y;
            while (true) {
                //判断纵列是否连城5只棋子，判断条件与上述一样
                if (chess.equals(board[a][b])) {
                    countCol++;
                    if (a == 0) {
                        break;
                    }
                    a--;
                } else {
                    break;
                }
            }
            a = x;
            b = y;
            while (true) {
//判断纵列是否5只棋子连城5只，判断条件与上述一样
                if (chess.equals(board[a][b])) {
                    countCol++;
                    if (a == (rows - 1)) {
                        break;
                    }
                    a++;
                } else {
                    break;
                }
            }
            a = x;
            b = y;
            while (true) {
//判断左到右斜角线5只棋子是否连成5只，判断条件与上述一样
                if (chess.equals(board[a][b])) {
                    countDiagonalLeft++;
                    if (a == 0 || b == 0) {
                        break;
                    }
                    a--;
                    b--;
                } else {
                    break;
                }
            }
            a = x;
            b = y;
            while (true) {
//判断右到左5只棋子连成5只，判断条件上述一样
                if (chess.equals(board[a][b])) {
                    countDiagonalLeft++;
                    if (a == (rows - 1) || b == (cols - 1)) {
                        break;
                    }
                    a++;
                    b++;
                } else {
                    break;
                }
            }
            a = x;
            b = y;
            while (true) {
//判断右上到左下5只棋子是否连在一起，判断条件上述一样
                if (chess.equals(board[a][b])) {
                    countDiagonalRight++;
                    if (a == 0 || b == (cols - 1)) {
                        break;
                    }
                    a--;
                    b++;
                } else {
                    break;
                }
            }
            a = x;
            b = y;
            while (true) {
//判断左下到右上5只棋子是否连在一起，判断条件与上述一样
                if (chess.equals(board[a][b])) {
                    countDiagonalRight++;
                    if (a == (rows - 1) || b == 0) {
                        break;
                    }
                    a++;
                    b--;
                } else {
                    break;
                }
            }

            System.out.println("countRow:" + countRow);
            System.out.println("countCol:" + countCol);
            System.out.println("countDiagonalLeft:" + countDiagonalLeft);
            System.out.println("countDiagonalRight:" + countDiagonalRight);

            return (countRow >= 5 || countCol >= 5 || countDiagonalLeft >= 5 || countDiagonalRight >= 5);
        }
        // 4、编写游戏入口
        //注意：该方法会一直重复执行，直到黑棋或者白棋一方在siWin（）方法中获胜为止。
        public void startGame() {
            //创建扫描器，获取X轴Y轴
            Scanner sc = new Scanner(System.in);
            boolean flag = true;
            int x;
            int y;
            String chess;
            //编写无线循环切换白棋与黑棋下棋顺序
            while (true) {
                if (flag) {
                    System.out.println("请白方落子。");
                    chess = "白";
                } else {
                    System.out.println("请黑方落子。");
                    chess = "黑";
                }
                x = sc.nextInt() + 1;
                y = sc.nextInt() + 1;
                //编写规则，不允许棋子超出棋盘范围或者坐标重复
                if (x < 0 || y < 0 || x > 16 || y > 16) {
                    System.out.println("落子超出棋盘范围，请重新落子。");
                    continue;
                }
                if ("+".equals(board[x][y])) {
                    board[x][y] = chess;
                } else {
                    System.out.println("当前坐标不可落子，请重新落子。");
                    continue;
                }
                showBoard();
                flag = !flag;
                //把获取到的横纵坐标，数组传入到iswin方法中
                boolean isWin = isWin(x, y, chess, getRows(), getCols());
                if (isWin) {
                    System.out.printf("恭喜%s方获胜！", chess);
                    break;
                }
            }
            //游戏获胜后释放内存空间
            sc.close();
        }

    public static void main(String[] args) {
        // 自定义棋子
        char white = 0x25cb;
        char black = 0x25cf;
        Model2Practice code = new Model2Practice(17, 17, white, black);
        // 绘制棋盘
        code.getBoard();
        // 显示棋盘
        code.showBoard();
        // 开始游戏
        code.startGame();
    }

}
