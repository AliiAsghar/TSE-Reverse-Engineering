package defpackage;

import j$.util.function.Function$CC;
import java.util.function.Function;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes3.dex */
public abstract class wab implements Function {
    @Override // java.util.function.Function
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final wdr apply(wxk wxkVar) {
        aozy createBuilder = wdr.a.createBuilder();
        d(wxkVar, createBuilder);
        if ((wxkVar.b & 32) != 0) {
            algf algfVar = was.a;
            qgr qgrVar = wxkVar.h;
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
        b(wxkVar, createBuilder);
        c(wxkVar, createBuilder);
        e(createBuilder);
        if ((wxkVar.b & 64) != 0) {
            long j = wxkVar.i;
            if (!createBuilder.b.isMutable()) {
                createBuilder.u();
            }
            wdr wdrVar2 = (wdr) createBuilder.b;
            wdrVar2.b |= 64;
            wdrVar2.i = j;
        }
        return (wdr) createBuilder.s();
    }

    @Override // java.util.function.Function
    /* renamed from: andThen */
    public final /* synthetic */ Function mo416andThen(Function function) {
        return Function$CC.$default$andThen(this, function);
    }

    public abstract void b(wxk wxkVar, aozy aozyVar);

    public abstract void c(wxk wxkVar, aozy aozyVar);

    public final /* synthetic */ Function compose(Function function) {
        return Function$CC.$default$compose(this, function);
    }

    public abstract void d(wxk wxkVar, aozy aozyVar);

    public abstract void e(aozy aozyVar);
}
