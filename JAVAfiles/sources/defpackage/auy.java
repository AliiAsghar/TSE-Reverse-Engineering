package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class auy {
    public final avc a;
    public final byk b;
    public boolean c;
    public Object d;
    public final ash e;
    private final byj f;

    public auy(int i, float f, avc avcVar) {
        this.a = avcVar;
        this.b = new bys(i);
        this.f = new byr(f);
        this.e = new ash(i, 30, 100);
    }

    public final float a() {
        return this.f.b();
    }

    public final void b(int i) {
        this.b.d(i);
    }

    public final void c(float f) {
        this.f.d(f);
    }

    public final void d(int i, float f) {
        b(i);
        this.e.c(i);
        c(f);
    }
}
