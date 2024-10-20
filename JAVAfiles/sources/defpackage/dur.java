package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dur {
    public final String a;
    public final int b;
    public int c;
    public float d;

    public dur(dur durVar) {
        this.c = Integer.MIN_VALUE;
        this.d = Float.NaN;
        this.a = durVar.a;
        this.b = durVar.b;
        this.c = durVar.c;
        this.d = durVar.d;
    }

    public final String toString() {
        String str = this.a + ':';
        if (this.b != 901) {
            return str.concat("#".concat(String.valueOf("00000000".concat(String.valueOf(Integer.toHexString(this.c))).substring(r1.length() - 8))));
        }
        return str + this.d;
    }

    public dur(String str, float f) {
        this.c = Integer.MIN_VALUE;
        this.a = str;
        this.b = 901;
        this.d = f;
    }

    public dur(String str, int i) {
        this.d = Float.NaN;
        this.a = str;
        this.b = 902;
        this.c = i;
    }
}
