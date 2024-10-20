package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aczf extends aczc {
    private static volatile aczf b;
    private static final Object e = new Object();
    public final acze a;

    private aczf() {
        super("CslibSettings__");
        this.a = new acze(this);
    }

    public static boolean A() {
        return ((Boolean) o().a.P.a()).booleanValue();
    }

    public static boolean B() {
        return ((Boolean) o().a.aK.a()).booleanValue();
    }

    public static boolean C() {
        return ((Boolean) o().a.f.a()).booleanValue();
    }

    public static boolean D() {
        return ((Boolean) o().a.g.a()).booleanValue();
    }

    public static boolean E() {
        return ((Boolean) o().a.Z.a()).booleanValue();
    }

    public static boolean F() {
        return ((Boolean) o().a.at.a()).booleanValue();
    }

    public static boolean G() {
        return ((Boolean) o().a.J.a()).booleanValue();
    }

    public static boolean H() {
        if (((Boolean) o().a.l.a()).booleanValue() && !o().M()) {
            return true;
        }
        return false;
    }

    public static boolean I() {
        if (((Boolean) o().a.n.a()).booleanValue() && !o().M()) {
            return true;
        }
        return false;
    }

    public static boolean J() {
        if (((Boolean) o().a.o.a()).booleanValue() && !o().M()) {
            return true;
        }
        return false;
    }

    public static boolean K() {
        return ((Boolean) o().a.aC.a()).booleanValue();
    }

    public static boolean L() {
        return ((Boolean) o().a.aL.a()).booleanValue();
    }

    public static boolean N() {
        return ((Boolean) o().a.aB.a()).booleanValue();
    }

    public static boolean O() {
        return ((Boolean) o().a.as.a()).booleanValue();
    }

    public static boolean P() {
        return ((Boolean) o().a.c.a()).booleanValue();
    }

    public static boolean Q() {
        return ((Boolean) o().a.ae.a()).booleanValue();
    }

    public static boolean R() {
        return ((Boolean) o().a.aA.a()).booleanValue();
    }

    public static boolean S() {
        return ((Boolean) o().a.ad.a()).booleanValue();
    }

    public static boolean T() {
        return ((Boolean) o().a.K.a()).booleanValue();
    }

    public static int a() {
        return ((Integer) o().a.an.a()).intValue();
    }

    public static int c() {
        return ((Integer) o().a.ao.a()).intValue();
    }

    public static int d() {
        return ((Integer) o().a.aj.a()).intValue();
    }

    public static long n() {
        return ((Long) o().a.x.a()).longValue();
    }

    public static aczf o() {
        if (b == null) {
            u();
        }
        return b;
    }

    public static Double p() {
        return (Double) o().a.W.a();
    }

    public static String q() {
        return (String) o().a.G.a();
    }

    public static String r() {
        return (String) o().a.D.a();
    }

    public static String s() {
        return (String) o().a.F.a();
    }

    public static String t() {
        return (String) o().a.E.a();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void u() {
        synchronized (e) {
            if (b == null) {
                b = new aczf();
                b.l();
            }
        }
    }

    public static boolean v() {
        return ((Boolean) o().a.V.a()).booleanValue();
    }

    public static boolean w() {
        return ((Boolean) o().a.s.a()).booleanValue();
    }

    public static boolean x() {
        if (((Boolean) o().a.A.a()).booleanValue() && !o().M()) {
            return true;
        }
        return false;
    }

    public static boolean y() {
        return ((Boolean) o().a.e.a()).booleanValue();
    }

    @Deprecated
    public static boolean z() {
        return ((Boolean) o().a.ai.a()).booleanValue();
    }

    public final boolean M() {
        return ((Boolean) this.a.aI.a()).booleanValue();
    }

    @Override // defpackage.aczc
    protected final alog b() {
        acze aczeVar = this.a;
        acza aczaVar = aczeVar.k;
        acza aczaVar2 = aczeVar.j;
        acza aczaVar3 = aczeVar.i;
        acza aczaVar4 = aczeVar.h;
        acza aczaVar5 = aczeVar.g;
        acza aczaVar6 = aczeVar.f;
        acza aczaVar7 = aczeVar.e;
        acza aczaVar8 = aczeVar.d;
        acza aczaVar9 = aczeVar.c;
        acza aczaVar10 = aczeVar.b;
        return alog.C(aczeVar.av, aczeVar.a, aczaVar10, aczaVar9, aczaVar8, aczaVar7, aczaVar6, aczaVar5, aczaVar4, aczaVar3, aczaVar2, aczaVar, aczeVar.l, aczeVar.ab, aczeVar.m, aczeVar.n, aczeVar.o, aczeVar.p, aczeVar.q, aczeVar.r, aczeVar.s, aczeVar.t, aczeVar.u, aczeVar.v, aczeVar.w, aczeVar.x, aczeVar.y, aczeVar.A, aczeVar.B, aczeVar.z, aczeVar.C, aczeVar.D, aczeVar.E, aczeVar.F, aczeVar.G, aczeVar.H, aczeVar.I, aczeVar.J, aczeVar.K, aczeVar.L, aczeVar.M, aczeVar.N, aczeVar.O, aczeVar.P, aczeVar.Q, aczeVar.R, aczeVar.aa, aczeVar.S, aczeVar.T, aczeVar.U, aczeVar.V, aczeVar.W, aczeVar.X, aczeVar.Y, aczeVar.Z, aczeVar.ac, aczeVar.ad, aczeVar.ae, aczeVar.af, aczeVar.ag, aczeVar.ah, aczeVar.ai, aczeVar.aj, aczeVar.ak, aczeVar.al, aczeVar.am, aczeVar.an, aczeVar.ao, aczeVar.ap, aczeVar.aq, aczeVar.ar, aczeVar.at, aczeVar.au, aczeVar.aw, aczeVar.ax, aczeVar.ay, aczeVar.az, aczeVar.aB, aczeVar.aC, aczeVar.aD, aczeVar.aE, aczeVar.aF, aczeVar.aI, aczeVar.aG, aczeVar.aH, aczeVar.aJ, aczeVar.aK, aczeVar.aL);
    }
}
