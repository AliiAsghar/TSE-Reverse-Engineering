package defpackage;

import j$.util.DesugarCollections;
import j$.util.Map;
import j$.util.Optional;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class weh implements algk {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ weh(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.algk
    public final Object apply(Object obj) {
        int i;
        switch (this.b) {
            case 0:
                qeg qegVar = (qeg) obj;
                qef qefVar = qef.OK;
                qef b = qef.b(qegVar.c);
                if (b == null) {
                    b = qef.UNKNOWN_STATUS;
                }
                Object obj2 = this.a;
                if (qefVar.equals(b)) {
                    xyo c = wej.a.c();
                    c.H("Response notification delivered to Incoming Chat API");
                    c.z("method", ((wej) obj2).b.i());
                    c.q();
                } else {
                    xyo b2 = wej.a.b();
                    b2.H("Failed to process response notification");
                    b2.z("method", ((wej) obj2).b.i());
                    b2.q();
                }
                return qegVar;
            case 1:
                qeg qegVar2 = (qeg) obj;
                qef qefVar2 = qef.OK;
                qef b3 = qef.b(qegVar2.c);
                if (b3 == null) {
                    b3 = qef.UNKNOWN_STATUS;
                }
                Object obj3 = this.a;
                if (qefVar2.equals(b3)) {
                    xyo a = wej.a.a();
                    a.H("Emitted GroupEvent processing succeeded");
                    a.z("method", ((wej) obj3).b.i());
                    a.q();
                } else {
                    xyo b4 = wej.a.b();
                    b4.H("Emitted GroupEvent processing failed");
                    b4.z("method", ((wej) obj3).b.i());
                    b4.q();
                }
                return qegVar2;
            case 2:
                aozy createBuilder = wxm.a.createBuilder();
                aozy createBuilder2 = wxo.a.createBuilder();
                if (!createBuilder2.b.isMutable()) {
                    createBuilder2.u();
                }
                wxo wxoVar = (wxo) createBuilder2.b;
                wxoVar.c = 2;
                wxoVar.b |= 1;
                if (!createBuilder.b.isMutable()) {
                    createBuilder.u();
                }
                Object obj4 = this.a;
                wxm wxmVar = (wxm) createBuilder.b;
                wxo wxoVar2 = (wxo) createBuilder2.s();
                wxoVar2.getClass();
                wxmVar.c = wxoVar2;
                wxmVar.b |= 1;
                aozb aozbVar = ((wxk) obj4).g;
                if (!createBuilder.b.isMutable()) {
                    createBuilder.u();
                }
                wxm wxmVar2 = (wxm) createBuilder.b;
                aozbVar.getClass();
                wxmVar2.b |= 2;
                wxmVar2.d = aozbVar;
                return (wxm) createBuilder.s();
            case 3:
                aqwb aqwbVar = (aqwb) obj;
                xyo e = wel.a.e();
                e.H("Call to Messaging service failed");
                wxk wxkVar = (wxk) this.a;
                e.g(rve.a(wxkVar.e));
                e.r(aqwbVar);
                wxn o = vzo.o(aqwbVar.a.getCode());
                aozy createBuilder3 = wxm.a.createBuilder();
                aozy createBuilder4 = wxo.a.createBuilder();
                switch (aqwbVar.a.getCode()) {
                    case OK:
                    case CANCELLED:
                    case UNKNOWN:
                    case INVALID_ARGUMENT:
                    case NOT_FOUND:
                    case ALREADY_EXISTS:
                    case PERMISSION_DENIED:
                    case RESOURCE_EXHAUSTED:
                    case FAILED_PRECONDITION:
                    case ABORTED:
                    case OUT_OF_RANGE:
                    case UNIMPLEMENTED:
                    case DATA_LOSS:
                    case UNAUTHENTICATED:
                        i = 5;
                        break;
                    case DEADLINE_EXCEEDED:
                    case INTERNAL:
                    case UNAVAILABLE:
                        i = 4;
                        break;
                    default:
                        throw new AssertionError();
                }
                if (!createBuilder4.b.isMutable()) {
                    createBuilder4.u();
                }
                apag apagVar = createBuilder4.b;
                wxo wxoVar3 = (wxo) apagVar;
                wxoVar3.c = i - 1;
                wxoVar3.b |= 1;
                if (!apagVar.isMutable()) {
                    createBuilder4.u();
                }
                wxo wxoVar4 = (wxo) createBuilder4.b;
                wxoVar4.d = o.h;
                wxoVar4.b |= 2;
                if (!createBuilder3.b.isMutable()) {
                    createBuilder3.u();
                }
                wxm wxmVar3 = (wxm) createBuilder3.b;
                wxo wxoVar5 = (wxo) createBuilder4.s();
                wxoVar5.getClass();
                wxmVar3.c = wxoVar5;
                wxmVar3.b |= 1;
                aozb aozbVar2 = wxkVar.g;
                if (!createBuilder3.b.isMutable()) {
                    createBuilder3.u();
                }
                wxm wxmVar4 = (wxm) createBuilder3.b;
                aozbVar2.getClass();
                wxmVar4.b |= 2;
                wxmVar4.d = aozbVar2;
                return (wxm) createBuilder3.s();
            case 4:
                return ((wpp) this.a).ac((aqfn) obj);
            case 5:
                return ((Optional) obj).map(new vxg(this.a, 14));
            case 6:
                wgc wgcVar = (wgc) ((Optional) obj).orElse(null);
                if (wgcVar == null) {
                    ((alvg) ((alvg) wgd.a.d()).h("com/google/android/apps/messaging/shared/rcsdata/PhoneNumberInputUIPresenter", "shouldPromptBottomsheetForAnySim", 259, "PhoneNumberInputUIPresenter.java")).q("shouldPromptBottomsheetForAnySim: phoneNumberInputRequest is empty");
                    return false;
                }
                String str = wgcVar.a;
                wfx wfxVar = wgcVar.b;
                if (!str.isEmpty() && wfxVar.equals(wfx.INPUT_BOTTOMSHEET)) {
                    Object obj5 = this.a;
                    ((alvg) ((alvg) wgd.a.d()).h("com/google/android/apps/messaging/shared/rcsdata/PhoneNumberInputUIPresenter", "shouldPromptBottomsheetForAnySim", 272, "PhoneNumberInputUIPresenter.java")).t("shouldPromptBottomsheetForAnySim: eligible to reprompt with bottomsheet for simId: %s", advq.SIM_ID.c(str));
                    ((wgd) obj5).l.set(Optional.of(str));
                    return true;
                }
                ((alvg) ((alvg) wgd.a.d()).h("com/google/android/apps/messaging/shared/rcsdata/PhoneNumberInputUIPresenter", "shouldPromptBottomsheetForAnySim", 266, "PhoneNumberInputUIPresenter.java")).D("shouldPromptBottomsheetForAnySim: simId empty or uiVariant not bottomsheet. requestedSimId: %s, uiVariant: %s:", advq.SIM_ID.c(str), wfxVar);
                return false;
            case 7:
                xze xzeVar = whj.a;
                aozy builder = ((whc) obj).toBuilder();
                if (!builder.b.isMutable()) {
                    builder.u();
                }
                Object obj6 = this.a;
                whc whcVar = (whc) builder.b;
                obj6.getClass();
                whcVar.q = (whm) obj6;
                whcVar.b |= 2;
                return (whc) builder.s();
            case 8:
                Object obj7 = this.a;
                xze xzeVar2 = whj.a;
                return uhy.b((wgl) Map.EL.getOrDefault(DesugarCollections.unmodifiableMap(((whc) obj).m), obj7, wgl.a));
            case 9:
                Object obj8 = this.a;
                xze xzeVar3 = whj.a;
                return Optional.ofNullable((wgi) DesugarCollections.unmodifiableMap(((whc) obj).h).get(aduy.h("phone_number_record_for_sim_", (String) obj8)));
            case 10:
                whc whcVar2 = (whc) obj;
                xze xzeVar4 = whj.a;
                aozy builder2 = whcVar2.toBuilder();
                if (!builder2.b.isMutable()) {
                    builder2.u();
                }
                Object obj9 = this.a;
                ((whc) builder2.b).p = whc.emptyProtobufList();
                alog j = whj.j(whcVar2.p, (wfq) obj9);
                if (!builder2.b.isMutable()) {
                    builder2.u();
                }
                whc whcVar3 = (whc) builder2.b;
                apax apaxVar = whcVar3.p;
                if (!apaxVar.c()) {
                    whcVar3.p = apag.mutableCopy(apaxVar);
                }
                aoyj.addAll(j, whcVar3.p);
                return (whc) builder2.s();
            case 11:
                return whj.j((List) obj, (wfq) this.a);
            case 12:
                whj.a.r("Failed to read RcsApplicationData", (whd) obj);
                ((mbl) ((whj) this.a).e.b()).c("Bugle.Rcs.Application.Data.Retrieval.Failure.Count");
                return whc.a;
            case 13:
                Object obj10 = this.a;
                xze xzeVar5 = whj.a;
                return (Boolean) Map.EL.getOrDefault(DesugarCollections.unmodifiableMap(((whc) obj).d), obj10, false);
            case 14:
                xze xzeVar6 = whj.a;
                aozy builder3 = ((whc) obj).toBuilder();
                if (!builder3.b.isMutable()) {
                    builder3.u();
                }
                Object obj11 = this.a;
                whc whcVar4 = (whc) builder3.b;
                obj11.getClass();
                whcVar4.c = (String) obj11;
                return (whc) builder3.s();
            case 15:
                xze xzeVar7 = whj.a;
                aozy builder4 = ((whc) obj).toBuilder();
                if (!builder4.b.isMutable()) {
                    builder4.u();
                }
                Object obj12 = this.a;
                whc whcVar5 = (whc) builder4.b;
                obj12.getClass();
                whcVar5.f = (whm) obj12;
                whcVar5.b |= 1;
                return (whc) builder4.s();
            case 16:
                xze xzeVar8 = whj.a;
                Object obj13 = this.a;
                wgr wgrVar = wgr.a;
                obj13.getClass();
                apbo apboVar = ((whc) obj).g;
                if (apboVar.containsKey(obj13)) {
                    wgrVar = (wgr) apboVar.get(obj13);
                }
                return alog.n(wgrVar.b);
            case 17:
                Object obj14 = this.a;
                xze xzeVar9 = whj.a;
                return uhy.b((wgk) Map.EL.getOrDefault(DesugarCollections.unmodifiableMap(((whc) obj).l), obj14, wgk.a));
            case 18:
                Object obj15 = this.a;
                xze xzeVar10 = whj.a;
                return uhy.b((wgi) Map.EL.getOrDefault(DesugarCollections.unmodifiableMap(((whc) obj).i), obj15, wgi.a));
            case 19:
                Object obj16 = this.a;
                xze xzeVar11 = whj.a;
                return uhy.b((wgi) Map.EL.getOrDefault(DesugarCollections.unmodifiableMap(((whc) obj).h), obj16, wgi.a));
            default:
                whc whcVar6 = (whc) obj;
                xze xzeVar12 = whj.a;
                aozy builder5 = whcVar6.toBuilder();
                whm whmVar = whcVar6.q;
                if (whmVar == null) {
                    whmVar = whm.a;
                }
                aozy builder6 = whmVar.toBuilder();
                if (!builder6.b.isMutable()) {
                    builder6.u();
                }
                Object obj17 = this.a;
                whm whmVar2 = (whm) builder6.b;
                obj17.getClass();
                whmVar2.g = (apct) obj17;
                whmVar2.b |= 2;
                whm whmVar3 = (whm) builder6.s();
                if (!builder5.b.isMutable()) {
                    builder5.u();
                }
                whc whcVar7 = (whc) builder5.b;
                whmVar3.getClass();
                whcVar7.q = whmVar3;
                whcVar7.b |= 2;
                return (whc) builder5.s();
        }
    }
}
