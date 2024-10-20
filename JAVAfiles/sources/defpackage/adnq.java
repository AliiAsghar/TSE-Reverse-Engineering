package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class adnq implements adns {
    public final /* synthetic */ boolean a;
    private final /* synthetic */ int b;

    public /* synthetic */ adnq(boolean z, int i) {
        this.b = i;
        this.a = z;
    }

    @Override // defpackage.adns
    public final void a(aozy aozyVar) {
        apjp apjpVar;
        apjp apjpVar2;
        if (this.b != 0) {
            alor alorVar = adnt.a;
            if (this.a) {
                apjpVar2 = apjp.TRUE;
            } else {
                apjpVar2 = apjp.FALSE;
            }
            if (!aozyVar.b.isMutable()) {
                aozyVar.u();
            }
            apjr apjrVar = (apjr) aozyVar.b;
            apjr apjrVar2 = apjr.a;
            apjrVar.i = apjpVar2.d;
            apjrVar.b |= 64;
            return;
        }
        alor alorVar2 = adnt.a;
        if (this.a) {
            apjpVar = apjp.TRUE;
        } else {
            apjpVar = apjp.FALSE;
        }
        if (!aozyVar.b.isMutable()) {
            aozyVar.u();
        }
        apjr apjrVar3 = (apjr) aozyVar.b;
        apjr apjrVar4 = apjr.a;
        apjrVar3.l = apjpVar.d;
        apjrVar3.b |= 512;
    }
}
