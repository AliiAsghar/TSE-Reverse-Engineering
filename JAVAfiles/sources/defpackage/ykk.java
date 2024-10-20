package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ykk {
    public int a;
    public boolean b;
    public String c;
    public int d;
    public String e;
    public String f;
    public String g;
    public String h;
    public String i;
    public int j;
    public int k;
    public String l;
    public String m;
    public String n;
    public int o;
    public short p;

    public final void a() {
        this.p = (short) (this.p | 16);
    }

    public final void b() {
        this.b = true;
        this.p = (short) (this.p | 2);
    }

    public final void c(int i) {
        this.j = i;
        this.p = (short) (this.p | 64);
    }

    public final void d(int i) {
        this.k = i;
        this.p = (short) (this.p | 128);
    }

    public final void e(String str) {
        if (str != null) {
            this.m = str;
            return;
        }
        throw new NullPointerException("Null networkCountryIso");
    }

    public final void f() {
        this.p = (short) (this.p | 32);
    }

    public final void g(String str) {
        if (str != null) {
            this.l = str;
            return;
        }
        throw new NullPointerException("Null simCountryIso");
    }

    public final void h(int i) {
        this.d = i;
        this.p = (short) (this.p | 4);
    }
}
