package defpackage;

import j$.util.function.Function$CC;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes3.dex */
abstract class vzu implements Function {
    @Override // java.util.function.Function
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final wdr apply(qgf qgfVar) {
        aozy createBuilder = wdr.a.createBuilder();
        d(qgfVar, createBuilder);
        if ((qgfVar.b & 512) != 0) {
            algf algfVar = wan.b;
            qgr qgrVar = qgfVar.l;
            if (qgrVar == null) {
                qgrVar = qgr.a;
            }
            wdu wduVar = (wdu) algfVar.fu(qgrVar);
            if (!createBuilder.b.isMutable()) {
                createBuilder.u();
            }
            wdr wdrVar = (wdr) createBuilder.b;
            wduVar.getClass();
            wdrVar.d = wduVar;
            wdrVar.b |= 2;
        }
        b(qgfVar, createBuilder);
        c(qgfVar, createBuilder);
        if ((qgfVar.b & 256) != 0) {
            algf algfVar2 = wan.a;
            qft qftVar = qgfVar.k;
            if (qftVar == null) {
                qftVar = qft.a;
            }
            wcd wcdVar = (wcd) algfVar2.fu(qftVar);
            if (!createBuilder.b.isMutable()) {
                createBuilder.u();
            }
            wdr wdrVar2 = (wdr) createBuilder.b;
            wcdVar.getClass();
            wdrVar2.g = wcdVar;
            wdrVar2.b |= 16;
        }
        e(createBuilder);
        return (wdr) createBuilder.s();
    }

    @Override // java.util.function.Function
    /* renamed from: andThen */
    public final /* synthetic */ Function mo416andThen(Function function) {
        return Function$CC.$default$andThen(this, function);
    }

    public abstract void b(qgf qgfVar, aozy aozyVar);

    public abstract void c(qgf qgfVar, aozy aozyVar);

    public final /* synthetic */ Function compose(Function function) {
        return Function$CC.$default$compose(this, function);
    }

    public abstract void d(qgf qgfVar, aozy aozyVar);

    public abstract void e(aozy aozyVar);
}
