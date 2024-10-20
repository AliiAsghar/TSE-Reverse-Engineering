package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aczh extends aczc {
    private static volatile aczh b;
    private static final Object e = new Object();
    public final acit a;

    private aczh() {
        super("Etouffee__");
        this.a = new acit(this);
    }

    public static aczh a() {
        if (b == null) {
            c();
        }
        return b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void c() {
        synchronized (e) {
            if (b == null) {
                b = new aczh();
                b.l();
            }
        }
    }

    @Override // defpackage.aczc
    protected final alog b() {
        return alog.r(this.a.a);
    }
}
