package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class abfd extends rg {
    final /* synthetic */ abfe a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public abfd(abfe abfeVar) {
        super(true);
        this.a = abfeVar;
    }

    @Override // defpackage.rg
    public final void b() {
        alvw m = abfe.a.m();
        m.X(ydl.M, "WelcomeFlowActivityWithoutConfigChangesPeer");
        m.q("#onBackButtonPressed()");
        abfe abfeVar = this.a;
        ((zfj) abfeVar.i.b()).b(abfeVar.b().M(abfeVar.a().b), 3);
        if (abfeVar.a().b <= 0) {
            abfeVar.c(4);
        } else {
            abfeVar.a().e(abfeVar.a().b - 1);
        }
    }
}
