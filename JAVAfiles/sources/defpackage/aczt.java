package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aczt extends aczc {
    private static volatile aczt b;
    private static final Object e = new Object();
    public final addy a;

    private aczt() {
        super("RcsGroupManagementFlags__");
        this.a = new addy(this);
    }

    public static aczt a() {
        if (b == null) {
            c();
        }
        return b;
    }

    public static void c() {
        synchronized (e) {
            if (b == null) {
                b = new aczt();
                b.l();
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, acyz] */
    public static boolean d() {
        return ((Boolean) a().a.b.a()).booleanValue();
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, acyz] */
    public static boolean n() {
        return ((Boolean) a().a.c.a()).booleanValue();
    }

    @Override // defpackage.aczc
    protected final alog b() {
        addy addyVar = this.a;
        return alog.t(addyVar.b, addyVar.a, addyVar.c);
    }
}
