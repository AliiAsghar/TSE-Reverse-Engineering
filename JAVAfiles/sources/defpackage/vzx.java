package defpackage;

import j$.util.function.Function$CC;
import java.util.function.Function;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes3.dex */
public class vzx implements Function {
    @Override // java.util.function.Function
    /* renamed from: andThen */
    public final /* synthetic */ Function mo416andThen(Function function) {
        return Function$CC.$default$andThen(this, function);
    }

    @Override // java.util.function.Function
    public final /* bridge */ /* synthetic */ Object apply(Object obj) {
        wxp wxpVar;
        wxq wxqVar = (wxq) obj;
        aozy createBuilder = wbu.a.createBuilder();
        if ((wxqVar.b & 1) != 0) {
            algf algfVar = wap.b;
            qel qelVar = wxqVar.e;
            if (qelVar == null) {
                qelVar = qel.a;
            }
            wbi wbiVar = (wbi) algfVar.fu(qelVar);
            if (!createBuilder.b.isMutable()) {
                createBuilder.u();
            }
            wbu wbuVar = (wbu) createBuilder.b;
            wbiVar.getClass();
            wbuVar.c = wbiVar;
            wbuVar.b |= 1;
        }
        if (wxqVar.c == 3) {
            algf algfVar2 = wap.a;
            if (wxqVar.c == 3) {
                wxpVar = (wxp) wxqVar.d;
            } else {
                wxpVar = wxp.a;
            }
            wbt wbtVar = (wbt) algfVar2.fu(wxpVar);
            if (!createBuilder.b.isMutable()) {
                createBuilder.u();
            }
            wbu wbuVar2 = (wbu) createBuilder.b;
            wbtVar.getClass();
            wbuVar2.d = wbtVar;
            wbuVar2.b |= 2;
        }
        return (wbu) createBuilder.s();
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function$CC.$default$compose(this, function);
    }
}
