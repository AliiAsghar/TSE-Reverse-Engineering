package defpackage;

import j$.util.function.Function$CC;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class vzz implements Function {
    private final xnv a;
    private final vyv b;

    public vzz() {
        throw null;
    }

    @Override // java.util.function.Function
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final qgg apply(wdp wdpVar) {
        wcq wcqVar;
        wdg wdgVar;
        aozy createBuilder = qgg.a.createBuilder();
        wcq wcqVar2 = wdpVar.e;
        if (wcqVar2 == null) {
            wcqVar2 = wcq.a;
        }
        qeg d = wam.d(wcqVar2);
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        qgg qggVar = (qgg) createBuilder.b;
        d.getClass();
        qggVar.c = d;
        qggVar.b |= 1;
        if ((wdpVar.b & 1) != 0) {
            aoyo aoyoVar = wdpVar.c;
            if (aoyoVar == null) {
                aoyoVar = aoyo.a;
            }
            aozb aozbVar = aoyoVar.b;
            if (!createBuilder.b.isMutable()) {
                createBuilder.u();
            }
            qgg qggVar2 = (qgg) createBuilder.b;
            aozbVar.getClass();
            qggVar2.b |= 2;
            qggVar2.d = aozbVar;
        }
        apct j = aotl.j(this.a.f());
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        apag apagVar = createBuilder.b;
        qgg qggVar3 = (qgg) apagVar;
        j.getClass();
        qggVar3.e = j;
        qggVar3.b |= 4;
        if ((wdpVar.b & 32) != 0) {
            boolean z = wdpVar.h;
            if (!apagVar.isMutable()) {
                createBuilder.u();
            }
            qgg qggVar4 = (qgg) createBuilder.b;
            qggVar4.b |= 8;
            qggVar4.f = z;
        }
        wcq wcqVar3 = wdpVar.e;
        if (wcqVar3 == null) {
            wcqVar = wcq.a;
        } else {
            wcqVar = wcqVar3;
        }
        wbr b = wbr.b(wcqVar.c);
        if (b == null) {
            b = wbr.ERROR_CODE_UNKNOWN;
        }
        if (b != wbr.ERROR_CODE_OK) {
            if (wcqVar3 == null) {
                wcqVar3 = wcq.a;
            }
            aozy createBuilder2 = qga.a.createBuilder();
            wdg wdgVar2 = wcqVar3.e;
            if (wdgVar2 == null) {
                wdgVar2 = wdg.a;
            }
            int Y = a.Y(wdgVar2.c);
            boolean z2 = false;
            if (Y != 0 && Y == 3) {
                z2 = true;
            }
            if (!createBuilder2.b.isMutable()) {
                createBuilder2.u();
            }
            qga qgaVar = (qga) createBuilder2.b;
            qgaVar.b = 1 | qgaVar.b;
            qgaVar.c = z2;
            wdg wdgVar3 = wcqVar3.e;
            if (wdgVar3 == null) {
                wdgVar = wdg.a;
            } else {
                wdgVar = wdgVar3;
            }
            if ((wdgVar.b & 2) != 0) {
                if (wdgVar3 == null) {
                    wdgVar3 = wdg.a;
                }
                aozn aoznVar = wdgVar3.d;
                if (aoznVar == null) {
                    aoznVar = aozn.a;
                }
                if (!createBuilder2.b.isMutable()) {
                    createBuilder2.u();
                }
                qga qgaVar2 = (qga) createBuilder2.b;
                aoznVar.getClass();
                qgaVar2.d = aoznVar;
                qgaVar2.b |= 2;
            }
            qga qgaVar3 = (qga) createBuilder2.s();
            if (!createBuilder.b.isMutable()) {
                createBuilder.u();
            }
            qgg qggVar5 = (qgg) createBuilder.b;
            qgaVar3.getClass();
            qggVar5.g = qgaVar3;
            qggVar5.b |= 16;
        }
        amgu d2 = this.b.d();
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        qgg qggVar6 = (qgg) createBuilder.b;
        d2.getClass();
        qggVar6.h = d2;
        qggVar6.b |= 32;
        return (qgg) createBuilder.s();
    }

    @Override // java.util.function.Function
    /* renamed from: andThen */
    public final /* synthetic */ Function mo416andThen(Function function) {
        return Function$CC.$default$andThen(this, function);
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function$CC.$default$compose(this, function);
    }

    public vzz(xnv xnvVar, vyv vyvVar) {
        this.b = vyvVar;
        this.a = xnvVar;
    }
}
