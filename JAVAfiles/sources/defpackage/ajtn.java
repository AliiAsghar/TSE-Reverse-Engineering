package defpackage;

import j$.time.Instant;
import j$.util.Collection;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ajtn extends ajss {
    static final algf a = new ajtm();
    static final algf b = new ajts();
    public static final algf c = new ajtf();

    @Override // defpackage.ajss
    public final void c(wbs wbsVar, ajqe ajqeVar) {
        if (!new apaq(wbsVar.i, wbs.a).isEmpty()) {
            ajqeVar.f = Optional.of((alpt) Collection.EL.stream(new apaq(wbsVar.i, wbs.a)).map(new agoq(c, 14)).collect(alls.b));
        }
    }

    @Override // defpackage.ajss
    public final void d(wbs wbsVar, ajqe ajqeVar) {
        wda wdaVar = wbsVar.d;
        if (wdaVar == null) {
            wdaVar = wda.a;
        }
        String str = wdaVar.c;
        if (str != null) {
            ajqeVar.a = str;
            return;
        }
        throw new NullPointerException("Null id");
    }

    @Override // defpackage.ajss
    public final void e(wbs wbsVar, ajqe ajqeVar) {
        if ((wbsVar.c & 16) != 0) {
            apct apctVar = wbsVar.h;
            if (apctVar == null) {
                apctVar = apct.a;
            }
            ajqeVar.e = Optional.of(aotl.l(apctVar));
        }
    }

    @Override // defpackage.ajss
    public final void f(ajqg ajqgVar, aozy aozyVar) {
        ajqgVar.f.ifPresent(new ajpx(aozyVar, 12));
    }

    @Override // defpackage.ajss
    public final void g(ajqg ajqgVar, aozy aozyVar) {
        aozy createBuilder = wda.a.createBuilder();
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        String str = ajqgVar.a;
        wda wdaVar = (wda) createBuilder.b;
        str.getClass();
        wdaVar.b |= 1;
        wdaVar.c = str;
        if (!aozyVar.b.isMutable()) {
            aozyVar.u();
        }
        wbs wbsVar = (wbs) aozyVar.b;
        wda wdaVar2 = (wda) createBuilder.s();
        apap apapVar = wbs.a;
        wdaVar2.getClass();
        wbsVar.d = wdaVar2;
        wbsVar.c |= 1;
    }

    @Override // defpackage.ajss
    public final void h(ajqg ajqgVar, aozy aozyVar) {
        apct j = aotl.j((Instant) ajqgVar.e.get());
        if (!aozyVar.b.isMutable()) {
            aozyVar.u();
        }
        wbs wbsVar = (wbs) aozyVar.b;
        apap apapVar = wbs.a;
        j.getClass();
        wbsVar.h = j;
        wbsVar.c |= 16;
    }
}
