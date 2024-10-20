package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public enum aosl {
    BRANCH(0),
    SINGLE(1),
    ANY(2),
    RANGE(3),
    MAP(4),
    TMAP(5);

    public static final aosl[] g = values();

    aosl(int i) {
        if (i == ordinal()) {
        } else {
            throw new AssertionError(a.bV(i, "bad opcode value: "));
        }
    }

    public static int a(aosj aosjVar, aspp asppVar, int i) {
        int c = (aosjVar.c() << 16) | aosjVar.c();
        if (!asppVar.i()) {
            return i;
        }
        int h2 = asppVar.h();
        int i2 = ((int) (1099368461105 >>> (h2 * 4))) & 15 & (c >>> (((int) (903298571996192 >>> (h2 * 5))) & 31));
        if (i2 == 0) {
            return 3;
        }
        return aosjVar.e(i2 - 1);
    }
}
