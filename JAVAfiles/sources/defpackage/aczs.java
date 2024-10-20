package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aczs extends aczc {
    private static volatile aczs b;
    private static final Object e = new Object();
    public final adqg a;

    protected aczs() {
        super("RcsFileTransfer__");
        this.a = new adqg(this);
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, acyz] */
    public static int a() {
        return ((Integer) c().a.a.a()).intValue();
    }

    public static aczs c() {
        if (b == null) {
            d();
        }
        return b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void d() {
        synchronized (e) {
            if (b == null) {
                b = new aczs();
                b.l();
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, acyz] */
    public static boolean n() {
        return ((Boolean) c().a.d.a()).booleanValue();
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, acyz] */
    public static boolean o() {
        return ((Boolean) c().a.c.a()).booleanValue();
    }

    @Override // defpackage.aczc
    protected final alog b() {
        adqg adqgVar = this.a;
        return alog.u(adqgVar.a, adqgVar.b, adqgVar.d, adqgVar.c);
    }
}
