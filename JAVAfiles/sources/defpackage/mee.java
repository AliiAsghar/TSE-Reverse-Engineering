package defpackage;

import java.util.concurrent.Executor;
import java.util.function.BiConsumer;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class mee extends mdy {
    public mee(armf armfVar, itw itwVar, Executor executor) {
        super(armfVar, itwVar, executor);
    }

    @Override // defpackage.mdy
    public final BiConsumer a() {
        return new meb(2);
    }

    public final void b(amsg amsgVar, amsb amsbVar) {
        n(new mau(amsgVar, amsbVar, 5));
    }
}
