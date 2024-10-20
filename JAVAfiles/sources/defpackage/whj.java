package defpackage;

import j$.util.Collection;
import j$.util.Comparator;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class whj {
    public static final xze a = xze.g("Bugle", "RcsApplicationDataService");
    public static final akfc b = new akgc("phone_number_input_ui_events_data_source_key");
    public static final akfc c = new akgc("google_tos_ui_events_data_source_key");
    public final wul d;
    public final armf e;
    public final ansy f;
    public final ansy g;
    private final armf h;
    private final armf i;
    private final anen j;
    private final ansy k;

    public whj(wul wulVar, armf armfVar, ansy ansyVar, ansy ansyVar2, ansy ansyVar3, armf armfVar2, armf armfVar3, anen anenVar) {
        this.d = wulVar;
        this.e = armfVar;
        this.k = ansyVar;
        this.f = ansyVar2;
        this.g = ansyVar3;
        this.h = armfVar2;
        this.i = armfVar3;
        this.j = anenVar;
    }

    public static alog j(List list, wfq wfqVar) {
        boolean test;
        boolean test2;
        ArrayList arrayList = new ArrayList(list);
        vmc vmcVar = new vmc(20);
        wfq wfqVar2 = (wfq) Collection.EL.stream(arrayList).max(Comparator.CC.comparing(new wga(5), new lvh(15))).orElse(wfq.a);
        test = vmcVar.test(wfqVar);
        if (test) {
            test2 = vmcVar.test(wfqVar2);
            if (test2) {
                a.l("Back to back requests from ProvisioningEngine, updating most recent GoogleTosUiEvent");
                arrayList.remove(wfqVar2);
                aozy builder = wfqVar2.toBuilder();
                apct apctVar = wfqVar.f;
                if (apctVar == null) {
                    apctVar = apct.a;
                }
                if (!builder.b.isMutable()) {
                    builder.u();
                }
                wfq wfqVar3 = (wfq) builder.b;
                apctVar.getClass();
                wfqVar3.f = apctVar;
                wfqVar3.b |= 8;
                arrayList.add((wfq) builder.s());
                return alog.n(arrayList);
            }
        }
        arrayList.add(wfqVar);
        return alog.n(arrayList);
    }

    public static wgr n(aozy aozyVar, wfy wfyVar) {
        boolean test;
        boolean test2;
        wjl wjlVar = new wjl(1);
        wfy wfyVar2 = (wfy) Collection.EL.stream(DesugarCollections.unmodifiableList(((wgr) aozyVar.b).b)).max(Comparator.CC.comparing(new wga(6), new lvh(15))).orElse(wfy.a);
        test = wjlVar.test(wfyVar);
        if (test) {
            test2 = wjlVar.test(wfyVar2);
            if (test2) {
                a.l("Back to back requests from ProvisioningEngine, updating most recent PhoneNumberInputUIEvent");
                int indexOf = DesugarCollections.unmodifiableList(((wgr) aozyVar.b).b).indexOf(wfyVar2);
                if (!aozyVar.b.isMutable()) {
                    aozyVar.u();
                }
                wgr wgrVar = (wgr) aozyVar.b;
                wgrVar.a();
                wgrVar.b.remove(indexOf);
                aozy builder = wfyVar2.toBuilder();
                apct apctVar = wfyVar.e;
                if (apctVar == null) {
                    apctVar = apct.a;
                }
                if (!builder.b.isMutable()) {
                    builder.u();
                }
                wfy wfyVar3 = (wfy) builder.b;
                apctVar.getClass();
                wfyVar3.e = apctVar;
                wfyVar3.b |= 4;
                aozyVar.ac((wfy) builder.s());
                return (wgr) aozyVar.s();
            }
        }
        aozyVar.ac(wfyVar);
        return (wgr) aozyVar.s();
    }

    public final who a(String str) {
        Map unmodifiableMap = DesugarCollections.unmodifiableMap(new apaw(((whc) this.d.l()).s, whc.u));
        if (!unmodifiableMap.containsKey(str)) {
            int d = ((zxy) this.h.b()).x(-1).d("buglesub_rcs_provision_info_state", -1);
            armf armfVar = this.i;
            who whoVar = who.RCS_SUCCESS_NOTIFICATION_STATE_UNSPECIFIED;
            if (((wwn) armfVar.b()).a().f.equals(str)) {
                if (d == 2) {
                    whoVar = who.RCS_SUCCESS_NOTIFICATION_STATE_SUCCESS_AWAITING_NOTIFY;
                } else if (d == 4) {
                    whoVar = who.RCS_SUCCESS_NOTIFICATION_STATE_NOTIFIED;
                }
            }
            k(str, whoVar);
            return whoVar;
        }
        return (who) unmodifiableMap.get(str);
    }

    public final akul b(String str, wfy wfyVar) {
        akul j = this.d.j(new whh(str, wfyVar, 3));
        arbj arbjVar = new arbj();
        arbjVar.n(j);
        arbjVar.c = new whg(wfyVar, 5);
        arbjVar.o(b);
        return akul.g(this.k.i(arbjVar.m())).h(new whf(12), andi.a);
    }

    public final akul c() {
        return e().h(new whe(4), andi.a);
    }

    public final akul d() {
        return e().h(new whf(1), this.j);
    }

    public final akul e() {
        return this.d.h().e(whd.class, new weh(this, 12), this.j);
    }

    public final akul f(String str, wgi wgiVar) {
        akul j = this.d.j(new whh(str, wgiVar, 1));
        arbj arbjVar = new arbj();
        arbjVar.n(j);
        arbjVar.o("phone_number_record_data_source_key");
        return akul.g(this.f.i(arbjVar.m())).h(new whf(2), andi.a);
    }

    public final akul g(String str, wgk wgkVar) {
        return this.d.j(new vqv(str, wgkVar, 18)).h(new whe(0), andi.a);
    }

    public final akul h(String str, int i) {
        return this.d.j(new ikg(str, i, 14)).h(new whf(8), andi.a);
    }

    @Deprecated
    public final akul i(String str, String str2) {
        try {
            return this.d.j(new whh(str, (whl) uhy.a(str2, whl.a), 4)).h(new whf(13), andi.a);
        } catch (apba unused) {
            return aktp.af(new IllegalArgumentException("Not a valid RcsProvisioningCarrierTosConfiguration string."));
        }
    }

    public final void k(String str, who whoVar) {
        this.d.m(new vqv(str, whoVar, 20));
    }

    public final void l(String str, String str2) {
        this.d.m(new vqv(str, str2, 17, null));
    }

    public final akul m(String str, int i) {
        return this.d.j(new ikg(str, i, 12)).h(new whf(6), andi.a);
    }
}
