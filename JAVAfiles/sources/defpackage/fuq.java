package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fuq {
    private final String a;
    private final int b;
    private final int c;
    private int d;
    private String e;

    public fuq(int i, int i2) {
        this(Integer.MIN_VALUE, i, i2);
    }

    private final void d() {
        if (this.d != Integer.MIN_VALUE) {
        } else {
            throw new IllegalStateException("generateNewId() must be called before retrieving ids.");
        }
    }

    public final int a() {
        d();
        return this.d;
    }

    public final String b() {
        d();
        return this.e;
    }

    public final void c() {
        int i;
        int i2 = this.d;
        if (i2 == Integer.MIN_VALUE) {
            i = this.b;
        } else {
            i = i2 + this.c;
        }
        this.d = i;
        this.e = this.a + i;
    }

    public fuq(int i, int i2, int i3) {
        this.a = i != Integer.MIN_VALUE ? a.cq(i, "/") : "";
        this.b = i2;
        this.c = i3;
        this.d = Integer.MIN_VALUE;
        this.e = "";
    }
}
