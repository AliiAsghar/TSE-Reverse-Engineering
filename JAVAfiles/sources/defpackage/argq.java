package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class argq extends araw {
    final /* synthetic */ argt a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public argq(argt argtVar) {
        super(argtVar.a);
        this.a = argtVar;
    }

    @Override // defpackage.araw
    public final void a() {
        try {
            int i = armc.a;
            this.a.c().b();
        } catch (Throwable th) {
            this.a.f(th);
            throw th;
        }
    }
}
