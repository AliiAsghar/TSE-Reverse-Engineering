package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class wan extends vzu {
    static final algf a = new waj();
    static final algf b = new wac();
    static final algf c = new vzp();

    @Override // defpackage.vzu
    public final void b(qgf qgfVar, aozy aozyVar) {
        qei qeiVar = qgfVar.d;
        if (qeiVar == null) {
            qeiVar = qei.a;
        }
        wbk c2 = wam.c(qeiVar, qgfVar.g);
        if (!aozyVar.b.isMutable()) {
            aozyVar.u();
        }
        wdr wdrVar = (wdr) aozyVar.b;
        wdr wdrVar2 = wdr.a;
        c2.getClass();
        wdrVar.e = c2;
        wdrVar.b |= 4;
    }

    @Override // defpackage.vzu
    public final void c(qgf qgfVar, aozy aozyVar) {
        aozy createBuilder = wca.b.createBuilder();
        aozy createBuilder2 = wda.a.createBuilder();
        String str = qgfVar.f;
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
        qei qeiVar = qgfVar.c;
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
        qej qejVar = qgfVar.i;
        if (qejVar == null) {
            qejVar = qej.a;
        }
        aozb aozbVar = qejVar.d;
        if (!createBuilder3.b.isMutable()) {
            createBuilder3.u();
        }
        wce wceVar = (wce) createBuilder3.b;
        aozbVar.getClass();
        wceVar.b |= 2;
        wceVar.d = aozbVar;
        algf algfVar = c;
        qej qejVar2 = qgfVar.i;
        if (qejVar2 == null) {
            qejVar2 = qej.a;
        }
        qel qelVar = qejVar2.c;
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
        if ((qgfVar.b & 4) != 0) {
            qei qeiVar2 = qgfVar.e;
            if (qeiVar2 == null) {
                qeiVar2 = qei.a;
            }
            wcz b3 = wam.b(qeiVar2);
            if (!createBuilder.b.isMutable()) {
                createBuilder.u();
            }
            wca wcaVar3 = (wca) createBuilder.b;
            b3.getClass();
            wcaVar3.f = b3;
            wcaVar3.c |= 4;
        }
        if ((qgfVar.b & 32) != 0) {
            apwq apwqVar = qgfVar.h;
            if (apwqVar == null) {
                apwqVar = apwq.a;
            }
            if (!createBuilder.b.isMutable()) {
                createBuilder.u();
            }
            wca wcaVar4 = (wca) createBuilder.b;
            apwqVar.getClass();
            wcaVar4.i = apwqVar;
            wcaVar4.c |= 16;
        }
        wca wcaVar5 = (wca) createBuilder.s();
        if (!aozyVar.b.isMutable()) {
            aozyVar.u();
        }
        wdr wdrVar = (wdr) aozyVar.b;
        wdr wdrVar2 = wdr.a;
        wcaVar5.getClass();
        wdrVar.f = wcaVar5;
        wdrVar.b |= 8;
    }

    @Override // defpackage.vzu
    public final void d(qgf qgfVar, aozy aozyVar) {
        aozy createBuilder = aoyo.a.createBuilder();
        aozb aozbVar = qgfVar.j;
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

    @Override // defpackage.vzu
    public final void e(aozy aozyVar) {
        wco wcoVar = wco.MESSAGING_METHOD_CHAT;
        if (!aozyVar.b.isMutable()) {
            aozyVar.u();
        }
        wdr wdrVar = (wdr) aozyVar.b;
        wdr wdrVar2 = wdr.a;
        wdrVar.h = wcoVar.d;
        wdrVar.b |= 32;
    }
}
