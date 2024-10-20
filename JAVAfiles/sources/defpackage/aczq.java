package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aczq extends aczc {
    public static volatile aczq a;
    private static final Object b = new Object();
    private final acit e;

    private aczq() {
        super("RbmSpecificRcsOverrides__");
        this.e = new acit(this);
    }

    public static void a() {
        synchronized (b) {
            if (a == null) {
                a = new aczq();
                a.l();
            }
        }
    }

    @Override // defpackage.aczc
    protected final alog b() {
        return alog.r(this.e.a);
    }
}
