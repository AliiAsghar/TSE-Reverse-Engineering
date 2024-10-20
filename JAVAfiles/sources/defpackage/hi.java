package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hi extends hj {
    final hj a;
    public final ha b;

    public hi(hj hjVar) {
        this.a = hjVar;
        this.b = new ha(hjVar);
    }

    @Override // defpackage.hj, defpackage.hh
    public final void a(int i, int i2, Object obj) {
        this.b.a(i, i2, obj);
    }

    @Override // defpackage.hh
    public final void b(int i, int i2) {
        this.b.b(i, i2);
    }

    @Override // defpackage.hh
    public final void c(int i, int i2) {
        this.b.c(i, i2);
    }

    @Override // defpackage.hj, java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return this.a.compare(obj, obj2);
    }

    @Override // defpackage.hh
    public final void d(int i, int i2) {
        this.b.d(i, i2);
    }

    @Override // defpackage.hj
    public final boolean e(Object obj, Object obj2) {
        return this.a.e(obj, obj2);
    }

    @Override // defpackage.hj
    public final boolean f(Object obj, Object obj2) {
        return this.a.f(obj, obj2);
    }

    @Override // defpackage.hj
    public final void g(Object obj, Object obj2) {
        this.a.g(obj, obj2);
    }
}
