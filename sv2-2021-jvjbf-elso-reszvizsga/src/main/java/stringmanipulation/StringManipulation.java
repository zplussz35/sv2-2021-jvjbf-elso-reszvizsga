package stringmanipulation;

public class StringManipulation {
    public String everyEvenCharacter(String s){
        StringBuilder sb = new StringBuilder();
        char[] chars = s.toCharArray();
        for (int i=0;i<chars.length;i+=2) {
            sb.append(chars[i]);
        }
        return sb.toString();
    }
}
