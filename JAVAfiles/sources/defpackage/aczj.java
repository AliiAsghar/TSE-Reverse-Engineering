package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aczj extends aczc {
    private static volatile aczj b;
    private static final Object e = new Object();
    public final afxz a;

    private aczj() {
        super("JibeServiceLifecyclePercents__");
        this.a = new afxz(this);
    }

    public static aczj a() {
        if (b == null) {
            c();
        }
        return b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void c() {
        synchronized (e) {
            if (b == null) {
                b = new aczj();
                b.l();
            }
        }
    }

    @Override // defpackage.aczc
    protected final alog b() {
        afxz afxzVar = this.a;
        return alog.w(afxzVar.a, afxzVar.d, afxzVar.b, afxzVar.c, afxzVar.e, afxzVar.f);
    }
}
