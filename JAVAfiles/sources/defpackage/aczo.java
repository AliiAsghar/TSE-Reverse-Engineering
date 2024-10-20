package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aczo extends aczc {
    private static volatile aczo b;
    private static final Object e = new Object();
    public final aday a;

    private aczo() {
        super("RbmInteropVodafonePlatform__");
        this.a = new aday(this);
    }

    public static aczo a() {
        if (b == null) {
            c();
        }
        return b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void c() {
        synchronized (e) {
            if (b == null) {
                b = new aczo();
                b.l();
            }
        }
    }

    @Override // defpackage.aczc
    protected final alog b() {
        aday adayVar = this.a;
        return alog.s(adayVar.a, adayVar.b);
    }
}
