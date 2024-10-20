package defpackage;

import j$.util.Collection;
import j$.util.Optional;
import j$.util.function.Function$CC;
import j$.util.stream.Stream;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class vzt implements Function {
    private final vbu a;
    private final wad b;
    private final wfh c;

    public vzt() {
        throw null;
    }

    @Override // java.util.function.Function
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final qfo apply(wcv wcvVar) {
        wbk wbkVar;
        wca wcaVar;
        aozy createBuilder = qfo.b.createBuilder();
        wbk wbkVar2 = wcvVar.d;
        if (wbkVar2 == null) {
            wbkVar2 = wbk.a;
        }
        wca wcaVar2 = wcvVar.e;
        if (wcaVar2 == null) {
            wcaVar2 = wca.b;
        }
        wcz wczVar = wcaVar2.e;
        if (wczVar == null) {
            wczVar = wcz.a;
        }
        qei b = this.c.b(wbkVar2, wczVar);
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        qfo qfoVar = (qfo) createBuilder.b;
        b.getClass();
        qfoVar.d = b;
        qfoVar.c |= 1;
        wfh wfhVar = this.c;
        wbk wbkVar3 = wcvVar.d;
        if (wbkVar3 == null) {
            wbkVar = wbk.a;
        } else {
            wbkVar = wbkVar3;
        }
        if (wbkVar3 == null) {
            wbkVar3 = wbk.a;
        }
        wcz wczVar2 = wbkVar3.d;
        if (wczVar2 == null) {
            wczVar2 = wcz.a;
        }
        qei b2 = wfhVar.b(wbkVar, wczVar2);
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        qfo qfoVar2 = (qfo) createBuilder.b;
        b2.getClass();
        qfoVar2.e = b2;
        qfoVar2.c |= 4;
        Optional e = this.a.e();
        createBuilder.getClass();
        int i = 9;
        e.ifPresentOrElse(new vwq(createBuilder, i), new eyg(14));
        wca wcaVar3 = wcvVar.e;
        if (wcaVar3 == null) {
            wcaVar3 = wca.b;
        }
        wda wdaVar = wcaVar3.d;
        if (wdaVar == null) {
            wdaVar = wda.a;
        }
        String str = wdaVar.c;
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        qfo qfoVar3 = (qfo) createBuilder.b;
        str.getClass();
        qfoVar3.c |= 32;
        qfoVar3.g = str;
        wbk wbkVar4 = wcvVar.d;
        if (wbkVar4 == null) {
            wbkVar4 = wbk.a;
        }
        wcy wcyVar = wbkVar4.e;
        if (wcyVar == null) {
            wcyVar = wcy.a;
        }
        String str2 = wcyVar.c;
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        qfo qfoVar4 = (qfo) createBuilder.b;
        str2.getClass();
        qfoVar4.c |= 64;
        qfoVar4.h = str2;
        wca wcaVar4 = wcvVar.e;
        if (wcaVar4 == null) {
            wcaVar = wca.b;
        } else {
            wcaVar = wcaVar4;
        }
        if ((wcaVar.c & 16) != 0) {
            if (wcaVar4 == null) {
                wcaVar4 = wca.b;
            }
            apwq apwqVar = wcaVar4.i;
            if (apwqVar == null) {
                apwqVar = apwq.a;
            }
            if (!createBuilder.b.isMutable()) {
                createBuilder.u();
            }
            qfo qfoVar5 = (qfo) createBuilder.b;
            apwqVar.getClass();
            qfoVar5.i = apwqVar;
            qfoVar5.c |= 128;
        }
        wca wcaVar5 = wcvVar.e;
        if (wcaVar5 == null) {
            wcaVar5 = wca.b;
        }
        for (wce wceVar : wcaVar5.g) {
            aozy createBuilder2 = qej.a.createBuilder();
            aozy createBuilder3 = qel.a.createBuilder();
            wbi wbiVar = wceVar.c;
            if (wbiVar == null) {
                wbiVar = wbi.a;
            }
            String str3 = wbiVar.c;
            if (!createBuilder3.b.isMutable()) {
                createBuilder3.u();
            }
            apag apagVar = createBuilder3.b;
            qel qelVar = (qel) apagVar;
            str3.getClass();
            qelVar.b |= 1;
            qelVar.c = str3;
            wbi wbiVar2 = wceVar.c;
            if (wbiVar2 == null) {
                wbiVar2 = wbi.a;
            }
            String str4 = wbiVar2.d;
            if (!apagVar.isMutable()) {
                createBuilder3.u();
            }
            qel qelVar2 = (qel) createBuilder3.b;
            str4.getClass();
            qelVar2.b |= 2;
            qelVar2.d = str4;
            qel qelVar3 = (qel) createBuilder3.s();
            if (!createBuilder2.b.isMutable()) {
                createBuilder2.u();
            }
            apag apagVar2 = createBuilder2.b;
            qej qejVar = (qej) apagVar2;
            qelVar3.getClass();
            qejVar.c = qelVar3;
            qejVar.b |= 1;
            aozb aozbVar = wceVar.d;
            if (!apagVar2.isMutable()) {
                createBuilder2.u();
            }
            qej qejVar2 = (qej) createBuilder2.b;
            aozbVar.getClass();
            qejVar2.b |= 2;
            qejVar2.d = aozbVar;
            createBuilder.J((qej) createBuilder2.s());
        }
        wca wcaVar6 = wcvVar.e;
        if (wcaVar6 == null) {
            wcaVar6 = wca.b;
        }
        apct apctVar = wcaVar6.h;
        if (apctVar == null) {
            apctVar = apct.a;
        }
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        qfo qfoVar6 = (qfo) createBuilder.b;
        apctVar.getClass();
        qfoVar6.k = apctVar;
        qfoVar6.c |= 256;
        amgl amglVar = (amgl) amgu.a.createBuilder();
        amxo amxoVar = amxo.RCS_SMAPI;
        if (!amglVar.b.isMutable()) {
            amglVar.u();
        }
        amgu amguVar = (amgu) amglVar.b;
        amguVar.aa = amxoVar.h;
        amguVar.c |= 2097152;
        amgu amguVar2 = (amgu) amglVar.s();
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        qfo qfoVar7 = (qfo) createBuilder.b;
        amguVar2.getClass();
        qfoVar7.l = amguVar2;
        qfoVar7.c |= 512;
        if ((wcvVar.b & 1) != 0) {
            aozy createBuilder4 = qgr.a.createBuilder();
            wdu wduVar = wcvVar.c;
            if (wduVar == null) {
                wduVar = wdu.a;
            }
            String str5 = wduVar.c;
            if (!createBuilder4.b.isMutable()) {
                createBuilder4.u();
            }
            qgr qgrVar = (qgr) createBuilder4.b;
            str5.getClass();
            qgrVar.b |= 1;
            qgrVar.c = str5;
            qgr qgrVar2 = (qgr) createBuilder4.s();
            if (!createBuilder.b.isMutable()) {
                createBuilder.u();
            }
            qfo qfoVar8 = (qfo) createBuilder.b;
            qgrVar2.getClass();
            qfoVar8.m = qgrVar2;
            qfoVar8.c |= 1024;
        }
        wca wcaVar7 = wcvVar.e;
        if (wcaVar7 == null) {
            wcaVar7 = wca.b;
        }
        Stream map = Collection.EL.stream(new apaq(wcaVar7.k, wca.a)).map(new vxg(this.b, i));
        int i2 = alog.d;
        createBuilder.I((Iterable) map.collect(alls.a));
        return (qfo) createBuilder.s();
    }

    @Override // java.util.function.Function
    /* renamed from: andThen */
    public final /* synthetic */ Function mo416andThen(Function function) {
        return Function$CC.$default$andThen(this, function);
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function$CC.$default$compose(this, function);
    }

    public vzt(wfh wfhVar, wad wadVar, vbu vbuVar) {
        this.c = wfhVar;
        this.b = wadVar;
        this.a = vbuVar;
    }
}
