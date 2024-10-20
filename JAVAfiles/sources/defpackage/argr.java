package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class argr extends araw {
    final /* synthetic */ arhp a;
    final /* synthetic */ argt b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public argr(argt argtVar, arhp arhpVar) {
        super(argtVar.a);
        this.a = arhpVar;
        this.b = argtVar;
    }

    @Override // defpackage.araw
    public final void a() {
        try {
            int i = armc.a;
            this.b.c().d(this.a);
        } catch (Throwable th) {
            this.b.f(th);
            throw th;
        }
    }
}
