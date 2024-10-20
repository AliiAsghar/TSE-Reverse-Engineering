package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class vkw {
    public static final utz a = uuh.e(uuh.b, "notification_silent_interval_seconds", 1);
    private final xnv b;
    private long c;

    public vkw(xnv xnvVar) {
        this.b = xnvVar;
    }

    public final synchronized void a() {
        this.c = this.b.a();
    }

    public final synchronized boolean b() {
        if (this.b.a() - this.c > ((Integer) a.e()).intValue() * 1000) {
            return true;
        }
        return false;
    }
}
