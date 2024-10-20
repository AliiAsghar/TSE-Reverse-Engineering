package defpackage;

/* compiled from: PG */
@Deprecated
/* loaded from: classes3.dex */
public final class xze {
    private static final alvi a = alvi.m("com/google/android/apps/messaging/shared/util/common/Logger");
    private final String b;
    private final xyx c;

    private xze(String str, xyx xyxVar) {
        this.b = str;
        this.c = xyxVar;
    }

    @Deprecated
    public static xze f(String str, Class cls) {
        return new xze(str, new xzd(cls, 0));
    }

    @Deprecated
    public static xze g(String str, String str2) {
        return new xze(str, new xzd(str2, 2));
    }

    private final xyo t(int i) {
        xyo xyoVar = (xyo) xyo.a.get();
        if (xyoVar == null) {
            xyoVar = new xyo();
            xyo.a.set(xyoVar);
        } else {
            xyoVar.q();
        }
        xyoVar.s(i, this.b, this.c);
        return xyoVar;
    }

    @Deprecated
    public final xyo a() {
        return t(3);
    }

    @Deprecated
    public final xyo b() {
        return t(6);
    }

    @Deprecated
    public final xyo c() {
        return t(4);
    }

    @Deprecated
    public final xyo d() {
        return t(2);
    }

    @Deprecated
    public final xyo e() {
        return t(5);
    }

    public final alvg h() {
        alvg alvgVar = (alvg) a.g();
        alvgVar.X(alwp.a, this.b);
        return alvgVar;
    }

    public final alvg i() {
        alvg alvgVar = (alvg) a.h();
        alvgVar.X(alwp.a, this.b);
        return alvgVar;
    }

    public final alvg j() {
        alvg alvgVar = (alvg) a.i();
        alvgVar.X(alwp.a, this.b);
        return alvgVar;
    }

    @Deprecated
    public final void k(String str) {
        xzb.c("BugleBattery", str);
    }

    @Deprecated
    public final void l(String str) {
        xyo a2 = a();
        a2.H(str);
        a2.q();
    }

    @Deprecated
    public final void m(String str) {
        xyo b = b();
        b.H(str);
        b.q();
    }

    @Deprecated
    public final void n(String str, Throwable th) {
        xyo b = b();
        b.H(str);
        b.r(th);
    }

    @Deprecated
    public final void o(String str) {
        xyo c = c();
        c.H(str);
        c.q();
    }

    @Deprecated
    public final void p(String str) {
        xyo d = d();
        d.H(str);
        d.q();
    }

    @Deprecated
    public final void q(String str) {
        xyo e = e();
        e.H(str);
        e.q();
    }

    @Deprecated
    public final void r(String str, Throwable th) {
        xyo e = e();
        e.H(str);
        e.r(th);
    }

    @Deprecated
    public final boolean s(int i) {
        return xzb.q(this.b, i);
    }
}
