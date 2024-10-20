package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class alut {
    public final char[][] a;
    public final int b;
    public final char c;

    protected alut() {
    }

    public static char[] a(char[] cArr, int i, int i2) {
        if (i2 >= 0) {
            char[] cArr2 = new char[i2];
            if (i > 0) {
                System.arraycopy(cArr, 0, cArr2, 0, i);
            }
            return cArr2;
        }
        throw new AssertionError("Cannot increase internal buffer any further");
    }

    public alut(alus alusVar) {
        this();
        char[][] cArr = alusVar.b;
        this.a = cArr;
        this.b = cArr.length;
        this.c = (char) 65535;
    }
}
