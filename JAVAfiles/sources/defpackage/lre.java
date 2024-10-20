package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class lre {
    private static final alvi d = alvi.m("com/google/android/apps/messaging/popups/PopupsUiAdapterImpl");
    public final ascd a;
    public final ascv b;
    public final lrd c;

    public lre() {
        ascd a = ascy.a(null);
        this.a = a;
        this.b = a;
        this.c = new lrd(this);
    }

    private final void g(arqg arqgVar) {
        if (((aewt) this.a.c()) != null) {
            ((alvg) d.i().h("com/google/android/apps/messaging/popups/PopupsUiAdapterImpl", "checkAndSetUiData", 73, "PopupsUiAdapterImpl.kt")).q("Illegal popup state: Existing popup cannot be replaced with another popup. Dismiss the existing popup first.");
        } else {
            this.a.f(arqgVar.a());
        }
    }

    public final void a() {
        this.a.f(null);
    }

    public final /* synthetic */ void b(aemc aemcVar) {
        c(new lnn(aemcVar, 3));
    }

    public final void c(arqr arqrVar) {
        g(new kfq(arqrVar, this, 19, null));
    }

    public final /* synthetic */ void d(aeqg aeqgVar, boolean z) {
        e(z, new lnn(aeqgVar, 4));
    }

    public final void e(boolean z, arqr arqrVar) {
        g(new kbx(arqrVar, this, z, 2));
    }

    public final void f(arqr arqrVar) {
        g(new kfq(arqrVar, this, 20, null));
    }
}
