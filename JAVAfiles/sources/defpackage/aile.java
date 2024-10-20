package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public class aile {
    public String f;
    public int g = 0;
    public int h;

    public static boolean u(char c) {
        if (!Character.isUpperCase(c) && !Character.isLowerCase(c)) {
            return false;
        }
        return true;
    }

    public static boolean v(char c) {
        if (c <= 127) {
            if ((c < 'a' || c > 'z') && ((c < 'A' || c > 'Z') && (c > '9' || c < '0'))) {
                return false;
            }
            return true;
        }
        if (!Character.isLowerCase(c) && !Character.isUpperCase(c) && !Character.isDigit(c)) {
            return false;
        }
        return true;
    }

    public static boolean w(char c) {
        char upperCase;
        if (Character.isDigit(c) || (upperCase = Character.toUpperCase(c)) == 'A' || upperCase == 'B' || upperCase == 'C' || upperCase == 'D' || upperCase == 'E' || upperCase == 'F') {
            return true;
        }
        return false;
    }

    public final char p() {
        if (this.g < this.f.length()) {
            String str = this.f;
            int i = this.g;
            this.g = i + 1;
            return str.charAt(i);
        }
        throw new ailb(String.valueOf(this.f).concat(" getNextChar: End of buffer"));
    }

    public final char q(int i) {
        if (this.g + i < this.f.length()) {
            return this.f.charAt(this.g + i);
        }
        return (char) 0;
    }

    public final String r(char c) {
        StringBuilder sb = new StringBuilder();
        while (true) {
            char q = q(0);
            if (q == c) {
                return sb.toString();
            }
            if (q != 0) {
                sb.append(this.f.charAt(this.g));
                s(1);
            } else {
                throw new ailb("EOL reached");
            }
        }
    }

    public final void s(int i) {
        this.g += i;
    }

    public final boolean t() {
        if (this.g < this.f.length()) {
            return true;
        }
        return false;
    }
}
