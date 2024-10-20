package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class atmz extends Thread {
    private final atlz a;
    private final Object b;
    private final atna c;
    private final atla d;

    public atmz(atna atnaVar, atlz atlzVar, Object obj, atla atlaVar) {
        this.c = atnaVar;
        this.a = atlzVar;
        this.b = obj;
        this.d = atlaVar;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        try {
            this.d.c(this.c.a(this.a));
        } catch (Exception e) {
            this.d.a(this.b, e);
        }
    }
}
