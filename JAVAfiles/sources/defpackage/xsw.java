package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class xsw implements apvm {
    private final apvm a;
    private final xyt b;

    public xsw(xyt xytVar, apvm apvmVar) {
        this.b = xytVar;
        this.a = apvmVar;
    }

    private final void c() {
        if (!((yaq) this.b.a()).o()) {
        } else {
            throw new xon("Transfer via satellite");
        }
    }

    @Override // defpackage.apvm
    public final apvh a(String str, apus apusVar, apvl apvlVar) {
        c();
        return this.a.a(str, apusVar, apvlVar);
    }

    @Override // defpackage.apvm
    public final apvh b(String str, apuu apuuVar, apus apusVar, String str2, apvl apvlVar) {
        c();
        return this.a.b(str, apuuVar, apusVar, str2, apvlVar);
    }
}
