package defpackage;

import java.util.concurrent.Executor;
import java.util.function.BiConsumer;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class mck extends mdy {
    public mck(armf armfVar, itw itwVar, Executor executor) {
        super(armfVar, itwVar, executor);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static final amuc e(int i, int i2, long j) {
        aozy createBuilder = amuc.a.createBuilder();
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        apag apagVar = createBuilder.b;
        amuc amucVar = (amuc) apagVar;
        amucVar.c = i - 1;
        amucVar.b |= 1;
        if (!apagVar.isMutable()) {
            createBuilder.u();
        }
        apag apagVar2 = createBuilder.b;
        amuc amucVar2 = (amuc) apagVar2;
        amucVar2.d = i2 - 1;
        amucVar2.b |= 2;
        int i3 = (int) j;
        if (!apagVar2.isMutable()) {
            createBuilder.u();
        }
        amuc amucVar3 = (amuc) createBuilder.b;
        amucVar3.b |= 4;
        amucVar3.e = (i3 / 10) * 10;
        return (amuc) createBuilder.s();
    }

    @Override // defpackage.mdy
    public final BiConsumer a() {
        return new ioe(10);
    }

    public final void b(int i, long j) {
        n(new mcj(i, j, 2));
    }

    public final void c(int i, long j) {
        n(new mcj(i, j, 1));
    }

    public final void d(int i, long j) {
        n(new mcj(i, j, 0));
    }
}
