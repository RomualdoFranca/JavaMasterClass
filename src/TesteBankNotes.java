public class TesteBankNotes {
    public static void main(String[] args) {

        System.out.println(changeMoney(37));
    }
    public static int changeMoney(int money) {
        int count = 0;
        for (int i = money; money > 0; money-= 1) {
//            count = money;
//            System.out.println(count);
            switch (money) {
                case 20: case 10: case 5: case 2:
                    i = i % money;
                    switch (money) {
                        case 10: case 5: case 2:
                            int cedulas = i / money;
                            System.out.println("cedulas = " + cedulas);
                    }
//                    int resto = money % i;
//                    System.out.printf("input %d / divisor %d = cedula %d e resto %d\n", money, i, cedulas, resto);
//                    System.out.println(money % i + " é resto da divisão por  " + i);
//                    System.out.println("case " + money);
//                    System.out.println("input " + i);
//                    System.out.println("divisor (i) = " + (i - money));
//                    System.out.println("resto = " + resto);
//                    System.out.println("resto do dinheiro " + restoDoDinheiro);
                    System.out.println("");
                    break;
            }

//                switch (i) {
//                    // para que ocorra todas as divisoes sucessivas, o numero inserido deve ser o mmc do todos os 'case' do switch
//                    case 20: case 10: case 5: case 2:
//                        System.out.println(money / i + " cédulas de " + i);
//                        break;
//                }
//            switch (i) {
//                // calcula o resto da divisao
//                case 20: case 10: case 5: case 2:
//                    int resto = money % i;
//                    int cedulas = (money - resto) / i;
//                    System.out.printf("%d / %d = %d e resto %d\n", money, i, cedulas, resto);
////                    System.out.println(money % i + " é resto da divisão por  " + i);
//                    break;
//            }

//            switch (i) {
//                // calcula o  quaciente e o resto da divisao
//                case 20: case 10: case 5: case 2:
//                    int resto = money % i;
//                    int cedulas = (money - resto) / i;
//                    System.out.printf("%d / %d = %d e resto %d\n", money, i, cedulas, resto);
////                    System.out.println(money % i + " é resto da divisão por  " + i);
//                    break;
//            }
        }
        return -1;
    }

}
