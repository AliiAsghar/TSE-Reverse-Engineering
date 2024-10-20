package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class adnp implements adns {
    public final /* synthetic */ int a;
    private final /* synthetic */ int b;

    public /* synthetic */ adnp(int i, int i2) {
        this.b = i2;
        this.a = i;
    }

    @Override // defpackage.adns
    public final void a(aozy aozyVar) {
        int i = this.b;
        if (i != 0) {
            if (i != 1) {
                alor alorVar = adnt.a;
                if (!aozyVar.b.isMutable()) {
                    aozyVar.u();
                }
                int i2 = this.a;
                apjr apjrVar = (apjr) aozyVar.b;
                apjr apjrVar2 = apjr.a;
                apjrVar.y = i2 - 1;
                apjrVar.b |= 2097152;
                return;
            }
            alor alorVar2 = adnt.a;
            if (!aozyVar.b.isMutable()) {
                aozyVar.u();
            }
            int i3 = this.a;
            apjr apjrVar3 = (apjr) aozyVar.b;
            apjr apjrVar4 = apjr.a;
            apjrVar3.b |= 65536;
            apjrVar3.t = i3;
            return;
        }
        alor alorVar3 = adnt.a;
        if (!aozyVar.b.isMutable()) {
            aozyVar.u();
        }
        int i4 = this.a;
        apjr apjrVar5 = (apjr) aozyVar.b;
        apjr apjrVar6 = apjr.a;
        apjrVar5.b |= 32768;
        apjrVar5.s = i4;
    }
}
