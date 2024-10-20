package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class addx extends adqp {
    final /* synthetic */ addy a;
    private final String b;
    private final adrc c;

    public addx(addy addyVar, String str, adrc adrcVar) {
        this.a = addyVar;
        this.b = str;
        this.c = adrcVar;
    }

    private final void p() {
        synchronized (this.a.a) {
            if (((adrc) ((addw) this.a.c).get(this.b)) == this.c) {
                advr.c("removing session: %s", advq.PHONE_NUMBER.c(this.b));
                ((addw) this.a.c).remove(this.b);
            }
            this.c.aP(this);
        }
    }

    @Override // defpackage.adqp, defpackage.adpb
    public final void d() {
        p();
    }

    @Override // defpackage.adqp, defpackage.adpb
    public final void e() {
        p();
    }

    @Override // defpackage.adqp, defpackage.adpb
    public final void f(adug adugVar) {
        p();
    }

    @Override // defpackage.adqp, defpackage.adpb
    public final void g(int i, String str) {
        p();
    }

    @Override // defpackage.adqp, defpackage.adpb
    public final void j() {
        p();
    }

    @Override // defpackage.adqp, defpackage.adpb
    public final void k(adug adugVar) {
        p();
    }

    @Override // defpackage.adqp, defpackage.adpb
    public final void l() {
        p();
    }
}
