package defpackage;

import j$.util.Collection;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class adha implements Runnable {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ adha(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.b) {
            case 0:
                Collection.EL.stream(((adhw) this.a).L).forEach(new aavc(7));
                return;
            case 1:
                ((adhv) ((ahjj) this.a).a).b.q(21);
                return;
            case 2:
                Collection.EL.stream(((adhw) this.a).L).forEach(new aavc(6));
                return;
            case 3:
                Collection.EL.stream(((adhw) this.a).L).forEach(new aavc(8));
                return;
            case 4:
                ((acyj) this.a).q(14);
                return;
            case 5:
                Collection.EL.stream(((adhw) this.a).K).forEach(new aavc(9));
                return;
            case 6:
                Collection.EL.stream(((adhw) this.a).L).forEach(new aavc(5));
                return;
            case 7:
                adhf adhfVar = (adhf) this.a;
                adhw adhwVar = adhfVar.b;
                if (!adhwVar.l && adhwVar.u == null) {
                    advr.r(adhfVar.b.m, "ImsNetworkInterface is not selected.", new Object[0]);
                    adhw adhwVar2 = adhfVar.b;
                    adhwVar2.w(adhwVar2.U);
                    return;
                }
                adhfVar.b.q(10);
                return;
            case 8:
                adhg adhgVar = (adhg) this.a;
                if (!acok.DISABLED.equals(adhgVar.b.B) && !acok.CANCELED.equals(adhgVar.b.B) && !acok.SHUTDOWN.equals(adhgVar.b.B) && !acok.NO_RETRY_NO_DEREGISTER_FOR_TEST.equals(adhgVar.b.B)) {
                    if (acok.SIM_REMOVED.equals(adhgVar.b.B)) {
                        adhw adhwVar3 = adhgVar.b;
                        adhwVar3.w(adhwVar3.af);
                        return;
                    } else {
                        adhw adhwVar4 = adhgVar.b;
                        adhwVar4.w(adhwVar4.ag);
                        return;
                    }
                }
                adhw adhwVar5 = adhgVar.b;
                advr.d(adhwVar5.m, "Stopping registration. reason=%s", adhwVar5.B);
                adhw adhwVar6 = adhgVar.b;
                adhwVar6.w(adhwVar6.S);
                return;
            case 9:
                Object obj = this.a;
                try {
                    ((adhh) obj).b.L();
                    return;
                } catch (adfj | aild e) {
                    adhh adhhVar = (adhh) obj;
                    advr.j(e, adhhVar.b.m, "Can't sent deREGISTER.", new Object[0]);
                    adhw adhwVar7 = adhhVar.b;
                    adhwVar7.w(adhwVar7.ad);
                    return;
                }
            case 10:
                adhj adhjVar = (adhj) this.a;
                adhw adhwVar8 = adhjVar.b;
                if (adhwVar8.G != null) {
                    adhwVar8.w(adhwVar8.U);
                    return;
                }
                advr.h(adhwVar8.m, "IMS configuration is not available. Stopping.", new Object[0]);
                adhw adhwVar9 = adhjVar.b;
                adhwVar9.w(adhwVar9.S);
                return;
            case 11:
                ((adhm) this.a).b.M.onForbidden(true);
                return;
            default:
                ((adhm) this.a).b.M.onForbidden(false);
                return;
        }
    }
}
