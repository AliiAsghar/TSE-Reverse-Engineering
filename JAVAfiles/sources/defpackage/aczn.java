package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aczn extends aczc {
    private static volatile aczn b;
    private static final Object e = new Object();
    public final aday a;

    protected aczn() {
        super("Rbm__");
        this.a = new aday(this);
    }

    public static aczn a() {
        if (b == null) {
            c();
        }
        return b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void c() {
        synchronized (e) {
            if (b == null) {
                b = new aczn();
                b.l();
            }
        }
    }

    public static boolean d() {
        return ((Boolean) ((acza) a().a.a).a()).booleanValue();
    }

    @Override // defpackage.aczc
    protected final alog b() {
        aday adayVar = this.a;
        return alog.s(adayVar.a, adayVar.b);
    }
}
