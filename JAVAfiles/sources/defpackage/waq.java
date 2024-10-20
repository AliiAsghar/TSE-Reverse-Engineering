package defpackage;

import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class waq extends vzw {
    static final algf a = new wac();
    static final Function b = new wap();

    @Override // defpackage.vzw
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
        wdn wdnVar = (wdn) aozyVar.b;
        wdn wdnVar2 = wdn.a;
        c.getClass();
        wdnVar.e = c;
        wdnVar.b |= 4;
    }

    @Override // defpackage.vzw
    public final void c(wxk wxkVar, aozy aozyVar) {
        Object apply;
        aozy createBuilder = wbs.b.createBuilder();
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
        wbs wbsVar = (wbs) createBuilder.b;
        wda wdaVar2 = (wda) createBuilder2.s();
        wdaVar2.getClass();
        wbsVar.d = wdaVar2;
        wbsVar.c |= 1;
        qei qeiVar = wxkVar.c;
        if (qeiVar == null) {
            qeiVar = qei.a;
        }
        wcz b2 = wam.b(qeiVar);
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        wbs wbsVar2 = (wbs) createBuilder.b;
        b2.getClass();
        wbsVar2.e = b2;
        wbsVar2.c |= 2;
        Function function = b;
        wxq wxqVar = wxkVar.f;
        if (wxqVar == null) {
            wxqVar = wxq.a;
        }
        apply = function.apply(wxqVar);
        wbu wbuVar = (wbu) apply;
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        wbs wbsVar3 = (wbs) createBuilder.b;
        wbuVar.getClass();
        wbsVar3.g = wbuVar;
        wbsVar3.c |= 8;
        if (!aozyVar.b.isMutable()) {
            aozyVar.u();
        }
        wdn wdnVar = (wdn) aozyVar.b;
        wbs wbsVar4 = (wbs) createBuilder.s();
        wdn wdnVar2 = wdn.a;
        wbsVar4.getClass();
        wdnVar.f = wbsVar4;
        wdnVar.b |= 8;
    }

    @Override // defpackage.vzw
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
        wdn wdnVar = (wdn) aozyVar.b;
        wdn wdnVar2 = wdn.a;
        aoyoVar2.getClass();
        wdnVar.c = aoyoVar2;
        wdnVar.b |= 1;
    }
}
