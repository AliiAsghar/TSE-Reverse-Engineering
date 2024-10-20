package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class adab extends aczc {
    private static volatile adab a;
    private static final Object b = new Object();
    private final adqg e;

    private adab() {
        super("SmsSharing__");
        this.e = new adqg(this);
    }

    public static adab a() {
        if (a == null) {
            c();
        }
        return a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void c() {
        synchronized (b) {
            if (a == null) {
                a = new adab();
                a.l();
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, acyz] */
    public static boolean d() {
        return ((Boolean) a().e.a.a()).booleanValue();
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, acyz] */
    public static boolean n() {
        return ((Boolean) a().e.d.a()).booleanValue();
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, acyz] */
    public static boolean o() {
        return ((Boolean) a().e.c.a()).booleanValue();
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, acyz] */
    public static boolean p() {
        return ((Boolean) a().e.b.a()).booleanValue();
    }

    @Override // defpackage.aczc
    protected final alog b() {
        adqg adqgVar = this.e;
        return alog.u(adqgVar.a, adqgVar.d, adqgVar.c, adqgVar.b);
    }
}
