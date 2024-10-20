package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aczg extends aczc {
    private static volatile aczg b;
    private static final Object e = new Object();
    public final adea a;

    private aczg() {
        super("DiagnosticSettings__");
        this.a = new adea(this);
    }

    public static aczg a() {
        if (b == null) {
            c();
        }
        return b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void c() {
        synchronized (e) {
            if (b == null) {
                b = new aczg();
                b.l();
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, acyz] */
    public static boolean d() {
        return ((Boolean) a().a.a.a()).booleanValue();
    }

    @Override // defpackage.aczc
    protected final alog b() {
        adea adeaVar = this.a;
        return alog.v(adeaVar.c, adeaVar.e, adeaVar.b, adeaVar.a, adeaVar.d);
    }
}
