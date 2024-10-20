package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
abstract class aqvg extends aqru {
    @Override // defpackage.aqru
    public void c(String str, Throwable th) {
        g().c(str, th);
    }

    @Override // defpackage.aqru
    public void d() {
        g().d();
    }

    @Override // defpackage.aqru
    public void e(int i) {
        g().e(i);
    }

    protected abstract aqru g();

    @Override // defpackage.aqru
    public final boolean k() {
        return g().k();
    }

    public final String toString() {
        algv aj = albo.aj(this);
        aj.b("delegate", g());
        return aj.toString();
    }
}
