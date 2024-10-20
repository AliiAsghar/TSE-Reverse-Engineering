package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class was extends wab {
    static final algf a = new wac();
    static final algf b = new vzp();

    @Override // defpackage.wab
    public final void b(wxk wxkVar, aozy aozyVar) {
        qei qeiVar = wxkVar.d;
        if (qeiVar == null) {
            qeiVar = qei.a;
        }
        String q = qjh.q(qeiVar);
        qei qeiVar2 = wxkVar.d;
        if (qeiVar2 == null) {
            qeiVar2 = qei.a;
        }
        wbk c = wam.c(qeiVar2, q);
        if (!aozyVar.b.isMutable()) {
            aozyVar.u();
        }
        wdr wdrVar = (wdr) aozyVar.b;
        wdr wdrVar2 = wdr.a;
        c.getClass();
        wdrVar.e = c;
        wdrVar.b |= 4;
    }

    @Override // defpackage.wab
    public final void c(wxk wxkVar, aozy aozyVar) {
        aozb aozbVar;
        aozy createBuilder = wca.b.createBuilder();
        aozy createBuilder2 = wda.a.createBuilder();
        String str = wxkVar.e;
        if (!createBuilder2.b.isMutable()) {
            createBuilder2.u();
        }
        wda wdaVar = (wda) createBuilder2.b;
        str.getClass();
        wdaVar.b |= 1;
        wdaVar.c = str;
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        wca wcaVar = (wca) createBuilder.b;
        wda wdaVar2 = (wda) createBuilder2.s();
        wdaVar2.getClass();
        wcaVar.d = wdaVar2;
        wcaVar.c |= 1;
        qei qeiVar = wxkVar.c;
        if (qeiVar == null) {
            qeiVar = qei.a;
        }
        wcz b2 = wam.b(qeiVar);
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        wca wcaVar2 = (wca) createBuilder.b;
        b2.getClass();
        wcaVar2.e = b2;
        wcaVar2.c |= 2;
        aozy createBuilder3 = wce.a.createBuilder();
        wxq wxqVar = wxkVar.f;
        if (wxqVar == null) {
            wxqVar = wxq.a;
        }
        if (wxqVar.c == 2) {
            aozbVar = (aozb) wxqVar.d;
        } else {
            aozbVar = aozb.b;
        }
        if (!createBuilder3.b.isMutable()) {
            createBuilder3.u();
        }
        wce wceVar = (wce) createBuilder3.b;
        aozbVar.getClass();
        wceVar.b = 2 | wceVar.b;
        wceVar.d = aozbVar;
        algf algfVar = b;
        wxq wxqVar2 = wxkVar.f;
        if (wxqVar2 == null) {
            wxqVar2 = wxq.a;
        }
        qel qelVar = wxqVar2.e;
        if (qelVar == null) {
            qelVar = qel.a;
        }
        wbi wbiVar = (wbi) algfVar.fu(qelVar);
        if (!createBuilder3.b.isMutable()) {
            createBuilder3.u();
        }
        wce wceVar2 = (wce) createBuilder3.b;
        wbiVar.getClass();
        wceVar2.c = wbiVar;
        wceVar2.b |= 1;
        createBuilder.bl(createBuilder3);
        wca wcaVar3 = (wca) createBuilder.s();
        if (!aozyVar.b.isMutable()) {
            aozyVar.u();
        }
        wdr wdrVar = (wdr) aozyVar.b;
        wdr wdrVar2 = wdr.a;
        wcaVar3.getClass();
        wdrVar.f = wcaVar3;
        wdrVar.b |= 8;
    }

    @Override // defpackage.wab
    public final void d(wxk wxkVar, aozy aozyVar) {
        aozy createBuilder = aoyo.a.createBuilder();
        aozb aozbVar = wxkVar.g;
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        aoyo aoyoVar = (aoyo) createBuilder.b;
        aozbVar.getClass();
        aoyoVar.b = aozbVar;
        aoyo aoyoVar2 = (aoyo) createBuilder.s();
        if (!aozyVar.b.isMutable()) {
            aozyVar.u();
        }
        wdr wdrVar = (wdr) aozyVar.b;
        wdr wdrVar2 = wdr.a;
        aoyoVar2.getClass();
        wdrVar.c = aoyoVar2;
        wdrVar.b |= 1;
    }

    @Override // defpackage.wab
    public final void e(aozy aozyVar) {
        wco wcoVar = wco.MESSAGING_METHOD_SLM;
        if (!aozyVar.b.isMutable()) {
            aozyVar.u();
        }
        wdr wdrVar = (wdr) aozyVar.b;
        wdr wdrVar2 = wdr.a;
        wdrVar.h = wcoVar.d;
        wdrVar.b |= 32;
    }
}
