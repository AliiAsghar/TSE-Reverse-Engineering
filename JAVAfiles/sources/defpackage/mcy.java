package defpackage;

import java.util.concurrent.Executor;
import java.util.function.BiConsumer;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class mcy extends mdy {
    public final arwe a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mcy(arwe arweVar, armf armfVar, itw itwVar, Executor executor) {
        super(armfVar, itwVar, executor);
        arweVar.getClass();
        armfVar.getClass();
        executor.getClass();
        this.a = arweVar;
    }

    @Override // defpackage.mdy
    public final BiConsumer a() {
        return new ioe(18);
    }
}
