package defpackage;

import j$.util.DesugarCollections;
import j$.util.Objects;
import java.util.HashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class adqk extends adou {
    public final Map g;
    public aday h;
    private final armf i;
    private aikp j;

    public adqk(adew adewVar, adqg adqgVar, armf armfVar, adwe adweVar) {
        super(adewVar, adqgVar, adweVar);
        this.g = DesugarCollections.synchronizedMap(new HashMap());
        this.i = armfVar;
    }

    @Override // defpackage.adou
    protected final void f() {
        if (this.a.b().mConfirmationServiceIdentity == null) {
            advr.q("No confirmation service identity configured!", new Object[0]);
            k(acok.DISABLED);
            return;
        }
        try {
            advp advpVar = adwf.a;
            this.j = ahji.k(this.a.b().mConfirmationServiceIdentity);
        } catch (ailb e) {
            advr.i(e, "Error while parsing identity: %s", e.getMessage());
            this.j = null;
        }
    }

    public final void p(aion aionVar) {
        try {
            ((aikc) this.i).a.r(this.e.n(aionVar));
        } catch (aild e) {
            advr.i(e, "Can't send 200 OK for MESSAGE: %s", e.getMessage());
            throw new adql("Error while sending response: ".concat(String.valueOf(e.getMessage())), e);
        }
    }

    public final void q(aion aionVar) {
        try {
            ((aikc) this.i).a.r(this.e.o(aionVar, 400, 2));
        } catch (aild e) {
            advr.i(e, "Can't send 200 OK for MESSAGE: %s", e.getMessage());
        }
    }

    public final boolean r(aion aionVar) {
        aikp aikpVar = this.j;
        if (aikpVar == null) {
            return true;
        }
        String j = aionVar.j("P-Asserted-Identity");
        if (j == null) {
            return false;
        }
        try {
            advp advpVar = adwf.a;
            aikp aikpVar2 = (aikp) ahji.h(j).b;
            if (Objects.equals(aikpVar2.e(), aikpVar.e())) {
                if (Objects.equals(aikpVar2.b(), aikpVar.b())) {
                    return true;
                }
            }
        } catch (ailb unused) {
        }
        return false;
    }

    @Override // defpackage.adou
    public final void m() {
    }

    @Override // defpackage.adou
    public final void n() {
    }
}
