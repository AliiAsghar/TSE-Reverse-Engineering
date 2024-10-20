package defpackage;

import java.util.concurrent.Executor;
import java.util.function.BiConsumer;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class yra extends mdy {
    public final hgj a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yra(armf armfVar, hgj hgjVar, Executor executor) {
        super(armfVar, new itw(13), executor);
        armfVar.getClass();
        hgjVar.getClass();
        executor.getClass();
        this.a = hgjVar;
    }

    @Override // defpackage.mdy
    public final BiConsumer a() {
        return new ijo(yqz.a, 7);
    }

    public final void b(rve rveVar, amxb amxbVar) {
        rveVar.getClass();
        n(new mun(rveVar, this, amxbVar, 3, null));
    }

    public final void c(rve rveVar) {
        rveVar.getClass();
        n(new udz(rveVar, this, 15));
    }
}
