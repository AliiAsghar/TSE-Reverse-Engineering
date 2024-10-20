package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class qy extends hj {
    final no a;

    public qy(no noVar) {
        this.a = noVar;
    }

    @Override // defpackage.hj, defpackage.hh
    public final void a(int i, int i2, Object obj) {
        this.a.v(i, i2, obj);
    }

    @Override // defpackage.hh
    public final void b(int i, int i2) {
        this.a.w(i, i2);
    }

    @Override // defpackage.hh
    public final void c(int i, int i2) {
        this.a.t(i, i2);
    }

    @Override // defpackage.hj, java.util.Comparator
    public final /* synthetic */ int compare(Object obj, Object obj2) {
        return ((rry) obj2).a((rry) obj);
    }

    @Override // defpackage.hh
    public final void d(int i, int i2) {
        this.a.x(i, i2);
    }

    @Override // defpackage.hj
    public final /* synthetic */ boolean e(Object obj, Object obj2) {
        rry rryVar = (rry) obj;
        rry rryVar2 = (rry) obj2;
        if (rryVar == rryVar2) {
            return true;
        }
        if (rryVar2 == null || rryVar.getClass() != rryVar2.getClass()) {
            return false;
        }
        return rryVar.a.equals(rryVar2.a);
    }

    @Override // defpackage.hj
    public final /* synthetic */ boolean f(Object obj, Object obj2) {
        return ((rry) obj).equals((rry) obj2);
    }
}
