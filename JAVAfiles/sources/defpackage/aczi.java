package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aczi extends aczc {
    private static volatile aczi b;
    private static final Object e = new Object();
    public final acit a;

    private aczi() {
        super("InstanceIdInProvisioning__");
        this.a = new acit(this);
    }

    public static aczi a() {
        if (b == null) {
            c();
        }
        return b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void c() {
        synchronized (e) {
            if (b == null) {
                b = new aczi();
                b.l();
            }
        }
    }

    @Override // defpackage.aczc
    protected final alog b() {
        return alog.r(this.a.a);
    }
}
