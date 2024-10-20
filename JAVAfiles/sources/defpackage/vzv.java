package defpackage;

import j$.util.function.Function$CC;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes3.dex */
abstract class vzv implements Function {
    @Override // java.util.function.Function
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final wxm apply(wdl wdlVar) {
        Object apply;
        aozy createBuilder = wxm.a.createBuilder();
        if ((wdlVar.b & 4) != 0) {
            Function function = wao.b;
            wcq wcqVar = wdlVar.e;
            if (wcqVar == null) {
                wcqVar = wcq.a;
            }
            apply = function.apply(wcqVar);
            wxo wxoVar = (wxo) apply;
            if (!createBuilder.b.isMutable()) {
                createBuilder.u();
            }
            wxm wxmVar = (wxm) createBuilder.b;
            wxoVar.getClass();
            wxmVar.c = wxoVar;
            wxmVar.b |= 1;
        }
        c(wdlVar, createBuilder);
        d(createBuilder);
        b(wdlVar, createBuilder);
        return (wxm) createBuilder.s();
    }

    @Override // java.util.function.Function
    /* renamed from: andThen */
    public final /* synthetic */ Function mo416andThen(Function function) {
        return Function$CC.$default$andThen(this, function);
    }

    public abstract void b(wdl wdlVar, aozy aozyVar);

    public abstract void c(wdl wdlVar, aozy aozyVar);

    public final /* synthetic */ Function compose(Function function) {
        return Function$CC.$default$compose(this, function);
    }

    public abstract void d(aozy aozyVar);
}
