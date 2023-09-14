package classproblems;

public class StringCharactersCount {
    public static void main(String[] args) {
        String word = "aabbbccdee";
        char [] chars =word.toCharArray();
        int acount = 0,bcount = 0,ccount = 0,dcount = 0,ecount = 0;
        for (int i = 0; i < chars.length; i++) {
            char inp = chars[i];

            switch (inp){
                case 'a':
                    acount++;
                    break;
                case 'b':
                    bcount++;
                    break;
                case 'c':
                    ccount++;
                    break;
                case 'd':
                    dcount++;
                    break;
                case 'e':
                    ecount++;
                default:
            }
        }
        System.out.println("a"+acount+"b"+bcount+"c"+ccount+"d"+dcount+"e"+ecount);
    }
}
