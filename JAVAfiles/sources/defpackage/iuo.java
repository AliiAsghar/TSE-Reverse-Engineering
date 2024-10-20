package defpackage;

import java.util.concurrent.Executor;
import java.util.function.BiConsumer;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class iuo extends mdy {
    public final ifb a;

    public iuo(armf armfVar, itw itwVar, Executor executor, ifb ifbVar) {
        super(armfVar, itwVar, executor);
        this.a = ifbVar;
    }

    @Override // defpackage.mdy
    public final BiConsumer a() {
        return new ioe(5);
    }
}
