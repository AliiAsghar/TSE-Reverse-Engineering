package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class bgb implements ckx {
    final /* synthetic */ bgd a;

    public bgb(bgd bgdVar) {
        this.a = bgdVar;
    }

    @Override // defpackage.ckx
    public final long a() {
        bgd bgdVar = this.a;
        long a = bgdVar.d.a();
        if (a == 16) {
            bgw bgwVar = (bgw) cwn.a(bgdVar, bgx.a);
            if (bgwVar != null) {
                long j = bgwVar.a;
                if (j != 16) {
                    return j;
                }
            }
            long j2 = ((cku) cwn.a(this.a, bfy.a)).i;
            boolean m = ((bfs) cwn.a(this.a, bft.a)).m();
            float a2 = ckw.a(j2);
            if (!m && a2 < 0.5d) {
                j2 = cku.d;
            }
            return j2;
        }
        return a;
    }
}
