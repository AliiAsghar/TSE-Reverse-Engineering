package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class apvn implements apvm {
    private final aput a;

    public apvn(aput aputVar) {
        this.a = aputVar;
    }

    @Override // defpackage.apvm
    public final apvh a(String str, apus apusVar, apvl apvlVar) {
        return new apvf(str, "PUT", null, apusVar, null, this.a, apvlVar, true);
    }

    @Override // defpackage.apvm
    public final apvh b(String str, apuu apuuVar, apus apusVar, String str2, apvl apvlVar) {
        boolean z = true;
        if (!albo.ar("POST", "put") && !albo.ar("POST", "post")) {
            z = false;
        }
        d.s(z);
        if (apusVar.e() != -1 && apusVar.e() < apvlVar.b) {
            return new apvc(str, apuuVar, apusVar, str2, this.a, apvlVar);
        }
        return new apvf(str, "POST", apuuVar, apusVar, str2, this.a, apvlVar, false);
    }
}
