package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public class arls extends arlr {
    final /* synthetic */ arlt a;

    /* JADX INFO: Access modifiers changed from: protected */
    public arls(arlt arltVar) {
        this.a = arltVar;
    }

    @Override // defpackage.arlr, defpackage.aqtr
    public void f(aqsd aqsdVar, aqtx aqtxVar) {
        arlt arltVar = this.a;
        if (arltVar.c != aqsd.SHUTDOWN) {
            arltVar.c = aqsdVar;
            arltVar.d = aqtxVar;
            arlv arlvVar = arltVar.e;
            if (!arlvVar.i) {
                arlvVar.g();
            }
        }
    }

    @Override // defpackage.arlr
    protected final aqtr g() {
        return this.a.e.h;
    }
}
