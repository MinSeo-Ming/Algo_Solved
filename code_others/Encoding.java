public class Encoding {
    public static void main(String[] args) throws Exception{
        String in[] = {"   + -- + - +-   ",
        "   + --- + - +   ",
        "   + -- + - + -   ",
        "   + - + - + - +   "};
//        char[] enco = new char[4];
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 4; i++) {

            int temp =Integer.parseInt(in[i].replace(" ","").replace("+","1").replace("-","0"),2);
            sb.append ((char)(temp));
        }
        System.out.println(sb.toString());
    }
}
