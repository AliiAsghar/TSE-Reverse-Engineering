package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aspl {
    public final int a;
    public final int b;
    public final Object c;

    public aspl() {
        this.c = new aspl[256];
        this.a = 0;
        this.b = 0;
    }

    public aspl(int i, int i2) {
        this.c = null;
        this.a = i;
        int i3 = i2 & 7;
        this.b = i3 == 0 ? 8 : i3;
    }

    public aspl(int i, int i2, String str) {
        this.a = i;
        this.b = i2;
        this.c = str;
    }

    public aspl(int i, String str, int i2) {
        this.a = i;
        this.c = str;
        this.b = i2;
    }
}
