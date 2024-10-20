package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class adnr implements adns {
    private final /* synthetic */ int a;

    public /* synthetic */ adnr(int i) {
        this.a = i;
    }

    @Override // defpackage.adns
    public final void a(aozy aozyVar) {
        if (this.a != 0) {
            alor alorVar = adnt.a;
            apjp apjpVar = apjp.FALSE;
            if (!aozyVar.b.isMutable()) {
                aozyVar.u();
            }
            apjr apjrVar = (apjr) aozyVar.b;
            apjr apjrVar2 = apjr.a;
            apjrVar.g = apjpVar.d;
            apjrVar.b |= 16;
            return;
        }
        alor alorVar2 = adnt.a;
        apjp apjpVar2 = apjp.TRUE;
        if (!aozyVar.b.isMutable()) {
            aozyVar.u();
        }
        apjr apjrVar3 = (apjr) aozyVar.b;
        apjr apjrVar4 = apjr.a;
        apjrVar3.o = apjpVar2.d;
        apjrVar3.b |= 2048;
    }
}
