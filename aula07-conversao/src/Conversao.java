public class Conversao {
    @SuppressWarnings("removal")
    public static void main(String[] args) throws Exception {
        String st, st2, st3, st4;
        float real1, real2;
        int int1, int2;

        //string para real
        st = "1.2";
        real1 = (float) (Float.valueOf(st));
        System.out.println("String para real: " + real1 + "\n");

        //real para string
        real2 = 1.3f;
        st2 = Float.toString(real2);
        System.out.println("Real para string: " + st2 + "\n");

        //ou
        st2 = String.valueOf(real2);
        //ou
        st2 = "" +real2;
        
        //string para Inteiro
        st3 = "15";
        int1 = Integer.parseInt(st3);
        System.out.println("String para Inteiro: " + int1 + "\n");

        //inteiro para string
        int2 = 25;
        st4 = Integer.toString(int2);
        System.out.println("inteiro para string: " + int2 + "\n");

    }
}
