package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aczr extends aczc {
    private static volatile aczr b;
    private static final Object e = new Object();
    public final adea a;

    private aczr() {
        super("RcsCpmFlags__");
        this.a = new adea(this);
    }

    public static aczr a() {
        if (b == null) {
            c();
        }
        return b;
    }

    public static void c() {
        synchronized (e) {
            if (b == null) {
                b = new aczr();
                b.l();
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, acyz] */
    public static boolean d() {
        return ((Boolean) a().a.a.a()).booleanValue();
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, acyz] */
    public static boolean n() {
        return ((Boolean) a().a.e.a()).booleanValue();
    }

    @Override // defpackage.aczc
    protected final alog b() {
        adea adeaVar = this.a;
        return alog.v(adeaVar.a, adeaVar.c, adeaVar.b, adeaVar.e, adeaVar.d);
    }
}
