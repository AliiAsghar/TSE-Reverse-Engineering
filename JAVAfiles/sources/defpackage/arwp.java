package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class arwp extends asfk {
    public final arvc b;

    public arwp(arpi arpiVar, arpe arpeVar) {
        super(arpiVar, arpeVar);
        this.b = new arvc(0, arvf.a);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.asfk, defpackage.arvg
    public final void hh(Object obj) {
        do {
            int i = this.b.b;
            if (i != 0) {
                if (i == 1) {
                    arpe arpeVar = this.e;
                    aseu.a(arhi.i(arpeVar), arro.n(obj, arpeVar));
                    return;
                }
                throw new IllegalStateException("Already resumed");
            }
        } while (!this.b.c(0, 2));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.asfk, defpackage.arxw
    public final void hl(Object obj) {
        hh(obj);
    }
}
