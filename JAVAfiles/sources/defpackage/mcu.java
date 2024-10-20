package defpackage;

import java.util.concurrent.Executor;
import java.util.function.BiConsumer;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class mcu extends mdy {
    public mcu(armf armfVar, itw itwVar, Executor executor) {
        super(armfVar, itwVar, executor);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static final amuf d(int i, long j, int i2, amue amueVar) {
        aozy createBuilder = amuf.a.createBuilder();
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        apag apagVar = createBuilder.b;
        amuf amufVar = (amuf) apagVar;
        amufVar.c = i - 1;
        amufVar.b |= 1;
        int i3 = (int) j;
        if (!apagVar.isMutable()) {
            createBuilder.u();
        }
        apag apagVar2 = createBuilder.b;
        amuf amufVar2 = (amuf) apagVar2;
        amufVar2.b |= 2;
        amufVar2.d = (i3 / 10) * 10;
        if (!apagVar2.isMutable()) {
            createBuilder.u();
        }
        apag apagVar3 = createBuilder.b;
        amuf amufVar3 = (amuf) apagVar3;
        amufVar3.e = 1;
        amufVar3.b |= 4;
        int J = lgb.J(i2);
        if (!apagVar3.isMutable()) {
            createBuilder.u();
        }
        apag apagVar4 = createBuilder.b;
        amuf amufVar4 = (amuf) apagVar4;
        amufVar4.f = J - 1;
        amufVar4.b |= 8;
        if (!apagVar4.isMutable()) {
            createBuilder.u();
        }
        amuf amufVar5 = (amuf) createBuilder.b;
        amufVar5.g = amueVar.d;
        amufVar5.b |= 16;
        return (amuf) createBuilder.s();
    }

    @Override // defpackage.mdy
    public final BiConsumer a() {
        return new ioe(16);
    }

    public final void b(long j, int i, amue amueVar) {
        n(new mcs(j, i, amueVar, 0));
    }

    public final void c(long j, int i, amue amueVar) {
        n(new mcs(j, i, amueVar, 1));
    }
}
