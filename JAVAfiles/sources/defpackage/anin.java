package defpackage;

import j$.util.function.Function$CC;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes4.dex */
class anin implements Function {
    @Override // java.util.function.Function
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final atok apply(anix anixVar) {
        aozy createBuilder = atok.a.createBuilder();
        String str = anixVar.a;
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        ((atok) createBuilder.b).b = anixVar.a;
        return (atok) createBuilder.s();
    }

    @Override // java.util.function.Function
    /* renamed from: andThen */
    public final /* synthetic */ Function mo416andThen(Function function) {
        return Function$CC.$default$andThen(this, function);
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function$CC.$default$compose(this, function);
    }
}
