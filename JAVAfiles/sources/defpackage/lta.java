package defpackage;

import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class lta {
    public static final advp a = new advp(advr.a);
    public final armf b;
    public final armf c;
    public final vyv d;
    private final xyt e;
    private final adwu f;
    private final acxm g;

    public lta(armf armfVar, vyv vyvVar, xyt xytVar, adwu adwuVar, armf armfVar2, acxm acxmVar) {
        this.b = armfVar;
        this.d = vyvVar;
        this.e = xytVar;
        this.f = adwuVar;
        this.c = armfVar2;
        this.g = acxmVar;
    }

    public final akul a(int i, aphg aphgVar) {
        this.d.n();
        if (((ansy) ((acvu) this.g).a.b()).e("cslib.suppress_removing_existent_row_id_exception")) {
            try {
                ((lqn) this.b.b()).d();
            } catch (unn e) {
                advr.q("setupVendorIms precondition failed: RemovingNonExistentRowIdException thrown when trying to cancel all pending tasks. Error: %s", e.getMessage());
            }
        } else {
            ((lqn) this.b.b()).d();
        }
        if (new adjl(((vrn) this.e.a()).x()).d()) {
            advr.q("setupVendorIms precondition failed: RCS is disabled.", new Object[0]);
        } else {
            adwl a2 = this.f.a(i);
            if (!adwl.SINGLE_REG.equals(a2)) {
                advr.q("setupVendorIms precondition failed: Expected SipConnectionType: %s. Active version: %s", adwl.SINGLE_REG.name(), a2.name());
            } else {
                return b(i, aphh.OPERATION_TYPE_SETUP_VENDOR_IMS, aphgVar);
            }
        }
        advr.q("setupVendorIms precondition failed, the task will not be scheduled.", new Object[0]);
        return aktp.ag(upm.d());
    }

    /* JADX WARN: Type inference failed for: r9v7, types: [armf, java.lang.Object] */
    public final akul b(int i, aphh aphhVar, aphg aphgVar) {
        advr.k("[SR]: Scheduling %s task. Trigger: %s", aphhVar.name(), aphgVar.name());
        lqn lqnVar = (lqn) this.b.b();
        aozy createBuilder = lsu.a.createBuilder();
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        apag apagVar = createBuilder.b;
        lsu lsuVar = (lsu) apagVar;
        lsuVar.b = 1 | lsuVar.b;
        lsuVar.c = i;
        if (!apagVar.isMutable()) {
            createBuilder.u();
        }
        apag apagVar2 = createBuilder.b;
        lsu lsuVar2 = (lsu) apagVar2;
        lsuVar2.d = aphhVar.d;
        lsuVar2.b |= 2;
        if (!apagVar2.isMutable()) {
            createBuilder.u();
        }
        lsu lsuVar3 = (lsu) createBuilder.b;
        lsuVar3.e = aphgVar.l;
        lsuVar3.b |= 4;
        return ((uof) lqnVar.a.b()).b(upk.a("vendor_ims_call", (lsu) createBuilder.s())).i(new jab(5), (Executor) this.c.b());
    }
}
