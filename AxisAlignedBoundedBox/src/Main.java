public class Main {
    public static void main(String[] args) {

        String s1 = "hola";
        long start = System.currentTimeMillis();

        for (int i = 0; i < 100000; i ++){
             s1 = s1 + "hola";
        }
        //System.out.println(s1);
        long end = System.currentTimeMillis();
        long string = end - start;
        System.out.println("El tiempo de ejecucion: " + string + " ms");
        //------------------------------------------------------------------
        long start1 = System.currentTimeMillis();
        StringBuffer  s2 = new StringBuffer("hola");
        for (int i = 0; i < 100000; i ++){
            s2.append("hola");
        }
        //System.out.println(s2);
        long end1 = System.currentTimeMillis();
        long stringBuffer = end1 - start1;
        System.out.println("El tiempo de ejecucion: " + stringBuffer + " ms");
    }
}
