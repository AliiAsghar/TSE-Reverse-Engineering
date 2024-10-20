package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public abstract class agnx {
    public agpw a;
    protected final ajyt b;

    public agnx(String str, String str2) {
        ajyt ajytVar = new ajyt();
        ajytVar.o(false);
        ajytVar.d = agni.a;
        this.b = ajytVar;
        this.a = null;
        ajytVar.e = str;
        ajytVar.c = str2;
    }

    public abstract aday a();

    public final int d() {
        return a().V();
    }

    public final void e() {
        this.b.o(true);
    }

    public final void f(String str) {
        this.b.d = new agni(str);
    }
}
