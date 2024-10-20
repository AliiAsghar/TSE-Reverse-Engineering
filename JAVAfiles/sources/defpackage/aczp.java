package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aczp extends aczc {
    private static volatile aczp a;
    private static final Object b = new Object();
    private final aday e;

    private aczp() {
        super("RbmRichCards__");
        this.e = new aday(this);
    }

    public static aczp a() {
        if (a == null) {
            c();
        }
        return a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void c() {
        synchronized (b) {
            if (a == null) {
                a = new aczp();
                a.l();
            }
        }
    }

    public static boolean d() {
        return ((Boolean) ((acza) a().e.a).a()).booleanValue();
    }

    public static boolean n() {
        return ((Boolean) ((acza) a().e.b).a()).booleanValue();
    }

    @Override // defpackage.aczc
    protected final alog b() {
        aday adayVar = this.e;
        return alog.s(adayVar.a, adayVar.b);
    }
}
