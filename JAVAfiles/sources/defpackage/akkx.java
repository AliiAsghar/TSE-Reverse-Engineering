package defpackage;

import defpackage.akky;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class akkx implements eov {
    final /* synthetic */ akky a;
    final /* synthetic */ ksa b;

    public akkx(akky akkyVar, ksa ksaVar) {
        this.b = ksaVar;
        this.a = akkyVar;
    }

    @Override // defpackage.eov
    public final /* synthetic */ eor a(Class cls) {
        return dyx.f();
    }

    @Override // defpackage.eov
    public final eor b(Class cls, epd epdVar) {
        boolean z;
        eoz eozVar = (eoz) epdVar.a(eol.b);
        boolean z2 = eozVar instanceof cg;
        akky akkyVar = this.a;
        if (z2) {
            cg cgVar = akkyVar.a;
            if (eozVar == cgVar) {
                z = true;
            } else {
                z = false;
            }
            albo.Z(z, "Cannot use AccountViewModelFactory on a different fragment than the fragment the factory is from. Found: %s, Factory fragment: %s", eozVar, cgVar);
        } else {
            cg cgVar2 = akkyVar.a;
            if (cgVar2.Q == null || eozVar != cgVar2.O()) {
                throw new IllegalStateException("AccountViewModels can only use account fragments and account-based Navigation back stack entries as the owner. Found the owner: ".concat(String.valueOf(String.valueOf(eozVar))));
            }
        }
        eog a = eol.a(epdVar);
        apxa apxaVar = new apxa();
        ksa ksaVar = this.b;
        ksaVar.b = a;
        ksaVar.c = apxaVar;
        apzj.f(ksaVar.b, eog.class);
        apzj.f(ksaVar.c, apwu.class);
        armf armfVar = (armf) ((akky.a) aovp.m(new kqt(ksaVar.a, ksaVar.d, ksaVar.e, ksaVar.b, ksaVar.c), akky.a.class)).b().get(cls.getName());
        if (armfVar != null) {
            eor eorVar = (eor) armfVar.b();
            eorVar.k(new ljt(apxaVar, 3));
            return eorVar;
        }
        throw new IllegalStateException("Expected the @AccountViewModel-annotated class '" + cls.getName() + "' to be available in the multi-binding of @AccountViewModelMap but none was found.");
    }

    @Override // defpackage.eov
    public final /* synthetic */ eor c(artf artfVar, epd epdVar) {
        return dyx.e(this, artfVar, epdVar);
    }
}
