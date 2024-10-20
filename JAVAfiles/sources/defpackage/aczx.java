package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aczx extends aczc {
    public static volatile aczx a;
    private static final Object e = new Object();
    public final aczw b;

    private aczx() {
        super("RcsSettings__");
        this.b = new aczw(this);
    }

    public static aczx a() {
        if (a == null) {
            d();
        }
        return a;
    }

    public static String c() {
        return (String) a().b.c.a();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void d() {
        synchronized (e) {
            if (a == null) {
                a = new aczx();
                a.l();
            }
        }
    }

    public static boolean n() {
        return ((Boolean) a().b.f.a()).booleanValue();
    }

    public static boolean o() {
        return ((Boolean) a().b.s.a()).booleanValue();
    }

    public static boolean p() {
        return ((Boolean) a().b.q.a()).booleanValue();
    }

    public static boolean q() {
        return ((Boolean) a().b.a.a()).booleanValue();
    }

    public static boolean r() {
        return ((Boolean) a().b.x.a()).booleanValue();
    }

    public static boolean s() {
        return ((Boolean) a().b.l.a()).booleanValue();
    }

    public static boolean t() {
        return ((Boolean) a().b.o.a()).booleanValue();
    }

    public static boolean u() {
        return ((Boolean) a().b.n.a()).booleanValue();
    }

    public static boolean v() {
        return ((Boolean) a().b.g.a()).booleanValue();
    }

    public static boolean w() {
        return ((Boolean) a().b.b.a()).booleanValue();
    }

    public static boolean x() {
        return ((Boolean) a().b.r.a()).booleanValue();
    }

    public static boolean y() {
        return ((Boolean) a().b.i.a()).booleanValue();
    }

    public static boolean z() {
        return ((Boolean) a().b.m.a()).booleanValue();
    }

    @Override // defpackage.aczc
    protected final alog b() {
        aczw aczwVar = this.b;
        return alog.C(aczwVar.a, aczwVar.b, aczwVar.c, aczwVar.d, aczwVar.e, aczwVar.h, aczwVar.i, aczwVar.j, aczwVar.k, aczwVar.l, aczwVar.m, aczwVar.n, aczwVar.o, aczwVar.p, aczwVar.q, aczwVar.r, aczwVar.s, aczwVar.t, aczwVar.u, aczwVar.v, aczwVar.w, aczwVar.x, aczwVar.y);
    }
}
