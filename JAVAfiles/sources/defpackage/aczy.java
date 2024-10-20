package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aczy extends aczc {
    private static volatile aczy b;
    private static final Object e = new Object();
    public final afxz a;

    protected aczy() {
        super("SimStateTrackerSettings__");
        this.a = new afxz(this);
    }

    public static aczy a() {
        if (b == null) {
            c();
        }
        if (b != null) {
            return b;
        }
        throw new IllegalStateException("SimStateTrackerSettings flags are not initialized!");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void c() {
        synchronized (e) {
            if (b == null) {
                b = new aczy();
                b.l();
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, acyz] */
    public static boolean d() {
        return ((Boolean) a().a.d.a()).booleanValue();
    }

    @Override // defpackage.aczc
    protected final alog b() {
        afxz afxzVar = this.a;
        return alog.w(afxzVar.f, afxzVar.e, afxzVar.c, afxzVar.d, afxzVar.a, afxzVar.b);
    }
}
