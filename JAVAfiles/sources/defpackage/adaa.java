package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class adaa extends aczc {
    private static volatile adaa b;
    private static final Object e = new Object();
    public final aczz a;

    private adaa() {
        super("SipSettings__");
        this.a = new aczz(this);
    }

    public static long a() {
        return ((Long) p().a.J.a()).longValue();
    }

    public static long c() {
        return ((Long) p().a.I.a()).longValue();
    }

    public static long d() {
        return ((Long) p().a.G.a()).longValue();
    }

    public static long n() {
        return ((Long) p().a.F.a()).longValue();
    }

    public static long o() {
        return ((Long) p().a.t.a()).longValue();
    }

    public static adaa p() {
        if (b == null) {
            s();
        }
        return b;
    }

    public static String q() {
        return (String) p().a.M.a();
    }

    public static String r() {
        return (String) p().a.w.a();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void s() {
        synchronized (e) {
            if (b == null) {
                b = new adaa();
                b.l();
            }
        }
    }

    public static boolean t() {
        return ((Boolean) p().a.O.a()).booleanValue();
    }

    public static boolean u() {
        return ((Boolean) p().a.j.a()).booleanValue();
    }

    public static boolean v() {
        return ((Boolean) p().a.n.a()).booleanValue();
    }

    public static boolean w() {
        return ((Boolean) p().a.L.a()).booleanValue();
    }

    public static boolean x() {
        return ((Boolean) p().a.l.a()).booleanValue();
    }

    @Override // defpackage.aczc
    protected final alog b() {
        aczz aczzVar = this.a;
        return alog.C(aczzVar.a, aczzVar.b, aczzVar.c, aczzVar.d, aczzVar.e, aczzVar.f, aczzVar.g, aczzVar.h, aczzVar.i, aczzVar.j, aczzVar.k, aczzVar.l, aczzVar.m, aczzVar.n, aczzVar.o, aczzVar.p, aczzVar.q, aczzVar.r, aczzVar.s, aczzVar.t, aczzVar.u, aczzVar.v, aczzVar.w, aczzVar.x, aczzVar.y, aczzVar.z, aczzVar.A, aczzVar.B, aczzVar.C, aczzVar.D, aczzVar.E, aczzVar.F, aczzVar.G, aczzVar.H, aczzVar.I, aczzVar.J, aczzVar.K, aczzVar.L, aczzVar.M, aczzVar.N, aczzVar.O);
    }
}
