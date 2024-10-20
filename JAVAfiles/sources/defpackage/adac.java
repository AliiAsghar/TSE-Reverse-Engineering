package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class adac extends aczc {
    private static volatile adac b;
    private static final Object e = new Object();
    public final adqg a;

    private adac() {
        super("SocketSettings__");
        this.a = new adqg(this);
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, acyz] */
    public static long a() {
        return ((Long) c().a.c.a()).longValue();
    }

    public static adac c() {
        if (b == null) {
            d();
        }
        return b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void d() {
        synchronized (e) {
            if (b == null) {
                b = new adac();
                b.l();
            }
        }
    }

    @Override // defpackage.aczc
    protected final alog b() {
        adqg adqgVar = this.a;
        return alog.u(adqgVar.c, adqgVar.b, adqgVar.a, adqgVar.d);
    }
}
