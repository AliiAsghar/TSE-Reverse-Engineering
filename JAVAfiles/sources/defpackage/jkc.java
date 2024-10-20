package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jkc implements agff {
    final /* synthetic */ arsb a;
    final /* synthetic */ ascd b;
    final /* synthetic */ jkd c;

    public jkc(arsb arsbVar, ascd ascdVar, jkd jkdVar) {
        this.a = arsbVar;
        this.b = ascdVar;
        this.c = jkdVar;
    }

    @Override // defpackage.agff
    public final Object l(agfe agfeVar) {
        agfd agfdVar;
        agex agexVar;
        agew agewVar;
        if (d.F(agfeVar, agev.a)) {
            if (!d.F(agfeVar, this.a.a)) {
                ((alvg) jkd.a.d().h("com/google/android/apps/messaging/conversation2/bottomcontent/composerow/directsend/DirectSendInputsUiAdapter$createHugoStateCollector$1", "onStateChanged", 88, "DirectSendInputsUiAdapter.kt")).q("Compose Row input state is now closed");
            }
            this.b.f(agfg.a);
        } else {
            Object obj = null;
            if (agfeVar instanceof agew) {
                agew agewVar2 = (agew) agfeVar;
                aeny a = jkd.a(agewVar2.a);
                Object obj2 = this.a.a;
                if (obj2 instanceof agew) {
                    agewVar = (agew) obj2;
                } else {
                    agewVar = null;
                }
                if (agewVar != null) {
                    obj = jkd.a(agewVar.a);
                }
                if (!d.F(obj, a)) {
                    ((alvg) jkd.a.d().h("com/google/android/apps/messaging/conversation2/bottomcontent/composerow/directsend/DirectSendInputsUiAdapter$createHugoStateCollector$1", "onStateChanged", 100, "DirectSendInputsUiAdapter.kt")).t("Compose Row now showing input %s without keyboard", a);
                }
                this.b.f(agewVar2.a);
            } else if (agfeVar instanceof agex) {
                agex agexVar2 = (agex) agfeVar;
                aeny a2 = jkd.a(agexVar2.a);
                Object obj3 = this.a.a;
                if (obj3 instanceof agex) {
                    agexVar = (agex) obj3;
                } else {
                    agexVar = null;
                }
                if (agexVar != null) {
                    obj = jkd.a(agexVar.a);
                }
                if (!d.F(obj, a2)) {
                    ((alvg) jkd.a.d().h("com/google/android/apps/messaging/conversation2/bottomcontent/composerow/directsend/DirectSendInputsUiAdapter$createHugoStateCollector$1", "onStateChanged", 111, "DirectSendInputsUiAdapter.kt")).t("Compose Row now showing input %s over keyboard", a2);
                }
                this.b.f(agexVar2.a);
            } else if (agfeVar instanceof agfd) {
                Object obj4 = this.a.a;
                if (obj4 instanceof agfd) {
                    agfdVar = (agfd) obj4;
                } else {
                    agfdVar = null;
                }
                if (agfdVar != null) {
                    obj = agfdVar.a;
                }
                if (((agfd) agfeVar).a instanceof agby) {
                    if (obj == null || !(obj instanceof agby)) {
                        ((alvg) jkd.a.d().h("com/google/android/apps/messaging/conversation2/bottomcontent/composerow/directsend/DirectSendInputsUiAdapter$createHugoStateCollector$1", "onStateChanged", 122, "DirectSendInputsUiAdapter.kt")).q("Compose Row keyboard is closing");
                    }
                    this.b.f(agfg.a);
                } else {
                    if (obj == null || (obj instanceof agby)) {
                        ((alvg) jkd.a.d().h("com/google/android/apps/messaging/conversation2/bottomcontent/composerow/directsend/DirectSendInputsUiAdapter$createHugoStateCollector$1", "onStateChanged", 128, "DirectSendInputsUiAdapter.kt")).q("Compose Row now showing keyboard without input");
                    }
                    this.b.f(new agfj(aeke.bl(this.c.c.a)));
                }
            } else {
                throw new armm();
            }
        }
        return arnb.a;
    }
}
