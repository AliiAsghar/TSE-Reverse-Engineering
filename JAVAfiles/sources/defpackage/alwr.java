package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public enum alwr {
    STRING('s', alwt.GENERAL, "-#", true),
    BOOLEAN('b', alwt.BOOLEAN, "-", true),
    CHAR('c', alwt.CHARACTER, "-", true),
    DECIMAL('d', alwt.INTEGRAL, "-0+ ,(", false),
    OCTAL('o', alwt.INTEGRAL, "-#0(", false),
    HEX('x', alwt.INTEGRAL, "-#0(", true),
    FLOAT('f', alwt.FLOAT, "-#0+ ,(", false),
    EXPONENT('e', alwt.FLOAT, "-#0+ (", true),
    GENERAL('g', alwt.FLOAT, "-0+ ,(", true),
    EXPONENT_HEX('a', alwt.FLOAT, "-#0+ ", true);

    public static final alwr[] k = new alwr[26];
    public final char l;
    public final alwt m;
    public final int n;
    public final String o;

    static {
        for (alwr alwrVar : values()) {
            k[a(alwrVar.l)] = alwrVar;
        }
    }

    alwr(char c, alwt alwtVar, String str, boolean z) {
        int i;
        this.l = c;
        this.m = alwtVar;
        alws alwsVar = alws.a;
        if (true != z) {
            i = 0;
        } else {
            i = 128;
        }
        for (int i2 = 0; i2 < str.length(); i2++) {
            int a = alws.a(str.charAt(i2));
            if (a >= 0) {
                i |= 1 << a;
            } else {
                throw new IllegalArgumentException("invalid flags: ".concat(str));
            }
        }
        this.n = i;
        this.o = "%" + c;
    }

    public static int a(char c) {
        return (c | ' ') - 97;
    }
}
