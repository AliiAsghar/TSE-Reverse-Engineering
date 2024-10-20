package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aczm extends aczc {
    private static volatile aczm a;
    private static final Object b = new Object();
    private final acit e;

    private aczm() {
        super("MultiSimSettings__");
        this.e = new acit(this);
    }

    public static aczm a() {
        if (a == null) {
            c();
        }
        return a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void c() {
        synchronized (b) {
            if (a == null) {
                a = new aczm();
                a.l();
            }
        }
    }

    @Override // defpackage.aczc
    protected final alog b() {
        return alog.r(this.e.a);
    }
}
