package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aczl extends aczc {
    private static volatile aczl b;
    private static final Object e = new Object();
    public final aczk a;

    private aczl() {
        super("MsrpSettings__");
        this.a = new aczk(this);
    }

    public static int a() {
        return ((Integer) c().a.b.a()).intValue();
    }

    public static aczl c() {
        if (b == null) {
            d();
        }
        return b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void d() {
        synchronized (e) {
            if (b == null) {
                b = new aczl();
                b.l();
            }
        }
    }

    public static boolean n() {
        return ((Boolean) c().a.a.a()).booleanValue();
    }

    public static boolean o() {
        return ((Boolean) c().a.j.a()).booleanValue();
    }

    public static boolean p() {
        return ((Boolean) c().a.g.a()).booleanValue();
    }

    public static boolean q() {
        return ((Boolean) c().a.f.a()).booleanValue();
    }

    @Override // defpackage.aczc
    protected final alog b() {
        aczk aczkVar = this.a;
        return alog.z(aczkVar.a, aczkVar.b, aczkVar.c, aczkVar.e, aczkVar.f, aczkVar.g, aczkVar.h, aczkVar.i, aczkVar.j);
    }
}
