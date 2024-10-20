package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class asgd extends arwb {
    public static final asgd a = new asgd();

    private asgd() {
    }

    @Override // defpackage.arwb
    public final void a(arpi arpiVar, Runnable runnable) {
        asfy.a.c(runnable, false);
    }

    @Override // defpackage.arwb
    public final void h(arpi arpiVar, Runnable runnable) {
        asfy.a.c(runnable, true);
    }

    @Override // defpackage.arwb
    public final String toString() {
        return "Dispatchers.IO";
    }
}
