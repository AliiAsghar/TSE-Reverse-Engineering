package defpackage;

import java.util.concurrent.Executor;
import java.util.function.BiConsumer;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class mcx extends mdy {
    public mcx(armf armfVar, itw itwVar, Executor executor) {
        super(armfVar, itwVar, executor);
    }

    public static amug c(int i, int i2) {
        aozy createBuilder = amug.a.createBuilder();
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        apag apagVar = createBuilder.b;
        amug amugVar = (amug) apagVar;
        amugVar.c = i - 1;
        amugVar.b |= 1;
        if (!apagVar.isMutable()) {
            createBuilder.u();
        }
        apag apagVar2 = createBuilder.b;
        amug amugVar2 = (amug) apagVar2;
        amugVar2.d = 1;
        amugVar2.b |= 2;
        int J = lgb.J(i2);
        if (!apagVar2.isMutable()) {
            createBuilder.u();
        }
        amug amugVar3 = (amug) createBuilder.b;
        amugVar3.e = J - 1;
        amugVar3.b |= 4;
        return (amug) createBuilder.s();
    }

    @Override // defpackage.mdy
    public final BiConsumer a() {
        return new ioe(17);
    }

    public final void b(int i) {
        n(new mcv(i, 0));
    }
}
