package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public class asfk extends arvg implements arpt {
    public final arpe e;

    public asfk(arpi arpiVar, arpe arpeVar) {
        super(arpiVar, true);
        this.e = arpeVar;
    }

    @Override // defpackage.arpt
    public final arpt dJ() {
        arpe arpeVar = this.e;
        if (arpeVar instanceof arpt) {
            return (arpt) arpeVar;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.arvg
    public void hh(Object obj) {
        arpe arpeVar = this.e;
        arpeVar.w(arro.n(obj, arpeVar));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.arxw
    public void hl(Object obj) {
        arpe arpeVar = this.e;
        aseu.a(arhi.i(arpeVar), arro.n(obj, arpeVar));
    }

    @Override // defpackage.arxw
    protected final boolean hn() {
        return true;
    }

    @Override // defpackage.arpt
    public final void dK() {
    }
}
