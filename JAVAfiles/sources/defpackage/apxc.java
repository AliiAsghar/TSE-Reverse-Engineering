package defpackage;

import android.app.Activity;
import android.content.Context;
import defpackage.apwz;
import defpackage.apxd;
import defpackage.apxi;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class apxc implements eov {
    final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public apxc(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    @Override // defpackage.eov
    public final /* synthetic */ eor a(Class cls) {
        int i = this.b;
        if (i != 0) {
            if (i != 1) {
                return dyx.f();
            }
            return dyx.f();
        }
        return dyx.f();
    }

    @Override // defpackage.eov
    public final eor b(Class cls, epd epdVar) {
        eor eorVar;
        int i = this.b;
        if (i != 0) {
            if (i != 1) {
                cg cgVar = (cg) this.a;
                if (cgVar.R() instanceof Activity) {
                    ((apxi.a) aovp.m((kqk) ((apxb) ((apxr) cgVar.fe()).aR()).b.aS(), apxi.a.class)).b();
                    return new apxj(new kqn(null));
                }
                throw new IllegalStateException("FragmentRetainedComponent cannot be instantiated without a host");
            }
            apxa apxaVar = new apxa();
            eog a = eol.a(epdVar);
            ksc kscVar = (ksc) this.a;
            kscVar.b = a;
            kscVar.c = apxaVar;
            apzj.f(kscVar.b, eog.class);
            apzj.f(kscVar.c, apwu.class);
            kqu kquVar = new kqu(kscVar.a, kscVar.b, kscVar.c);
            armf armfVar = (armf) ((apwz.a) aovp.m(kquVar, apwz.a.class)).b().get(cls);
            arqr arqrVar = (arqr) epdVar.a(apwz.a);
            Object obj = ((apwz.a) aovp.m(kquVar, apwz.a.class)).a().get(cls);
            if (obj == null) {
                if (arqrVar == null) {
                    if (armfVar != null) {
                        eorVar = (eor) armfVar.b();
                    } else {
                        throw new IllegalStateException("Expected the @HiltViewModel-annotated class " + cls.getName() + " to be available in the multi-binding of @HiltViewModelMap but none was found.");
                    }
                } else {
                    throw new IllegalStateException("Found creation callback but class " + cls.getName() + " does not have an assisted factory specified in @HiltViewModel.");
                }
            } else if (armfVar == null) {
                if (arqrVar != null) {
                    eorVar = (eor) arqrVar.a(obj);
                } else {
                    throw new IllegalStateException("Found @HiltViewModel-annotated class " + cls.getName() + " using @AssistedInject but no creation callback was provided in CreationExtras.");
                }
            } else {
                throw new AssertionError("Found the @HiltViewModel-annotated class " + cls.getName() + " in both the multi-bindings of @HiltViewModelMap and @HiltViewModelAssistedMap.");
            }
            eorVar.k(new ljt(apxaVar, 4));
            return eorVar;
        }
        apxk apxkVar = new apxk(epdVar);
        ngu SD = ((apxd.a) aovp.l((Context) this.a, apxd.a.class)).SD();
        SD.b = apxkVar;
        return new apxe(SD.c(), apxkVar);
    }

    @Override // defpackage.eov
    public final /* synthetic */ eor c(artf artfVar, epd epdVar) {
        int i = this.b;
        if (i != 0) {
            if (i != 1) {
                return dyx.e(this, artfVar, epdVar);
            }
            return dyx.e(this, artfVar, epdVar);
        }
        return dyx.e(this, artfVar, epdVar);
    }
}
