package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class adqz implements adot {
    final /* synthetic */ adrc a;
    private final String b;

    public adqz(adrc adrcVar, String str) {
        this.a = adrcVar;
        this.b = str;
    }

    @Override // defpackage.adot
    public final void a(ador adorVar) {
        advr.d(adrc.C, "Reference accepted", new Object[0]);
    }

    @Override // defpackage.adot
    public final void b(ador adorVar, ados adosVar) {
        advr.d(adrc.C, "Reference delivery failed", new Object[0]);
        this.a.aL(this.b, new adqx(adosVar.a, adosVar.getMessage()));
    }

    @Override // defpackage.adot
    public final void d(ador adorVar, int i, String str) {
        advr.d(adrc.C, "Reference delivery failed", new Object[0]);
        this.a.aL(this.b, new adqx(i, str));
    }

    @Override // defpackage.adot
    public final void e() {
        advr.d(adrc.C, "ConferenceInvitationListener.referenceNotify", new Object[0]);
    }

    @Override // defpackage.adot
    public final void f() {
        advr.d(adrc.C, "ConferenceInvitationListener.referenceTerminated", new Object[0]);
    }
}
