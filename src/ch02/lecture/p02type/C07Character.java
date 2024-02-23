package ch02.lecture.p02type;

public class C07Character {
    public static void main(String[] args) {

        char a = 99;
        char b = 120;
        char c = 65535;
        char d = 0x2705;

        System.out.println(d);

        int o = 0x1f607;
        char[] emoji1 = Character.toChars(o);

        String emojis = new String(emoji1);
        System.out.println("emojis =" + emojis);

        int j = 0x1f3a4;
        char[] emoji2 = Character.toChars(j);

        String emojis2 = new String(emoji2);
        System.out.println("emojis =" + emojis2);
    }
}
