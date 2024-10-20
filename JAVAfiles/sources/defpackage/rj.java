package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class rj implements enk, ra {
    final /* synthetic */ rm a;
    private final enh b;
    private final rg c;
    private ra d;

    public rj(rm rmVar, enh enhVar, rg rgVar) {
        enhVar.getClass();
        this.a = rmVar;
        this.b = enhVar;
        this.c = rgVar;
        enhVar.c(this);
    }

    @Override // defpackage.ra
    public final void a() {
        this.b.d(this);
        this.c.g(this);
        ra raVar = this.d;
        if (raVar != null) {
            raVar.a();
        }
        this.d = null;
    }

    @Override // defpackage.enk
    public final void dH(enm enmVar, enf enfVar) {
        if (enfVar == enf.ON_START) {
            this.d = this.a.a(this.c);
            return;
        }
        if (enfVar == enf.ON_STOP) {
            ra raVar = this.d;
            if (raVar != null) {
                raVar.a();
                return;
            }
            return;
        }
        if (enfVar == enf.ON_DESTROY) {
            a();
        }
    }
}
