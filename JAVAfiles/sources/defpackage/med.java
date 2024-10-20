package defpackage;

import java.util.concurrent.Executor;
import java.util.function.BiConsumer;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class med extends mdy {
    public med(armf armfVar, itw itwVar, Executor executor) {
        super(armfVar, itwVar, executor);
    }

    public static int b(int i) {
        if (i <= 0) {
            return 2;
        }
        if (i == 1) {
            return 3;
        }
        return 4;
    }

    @Override // defpackage.mdy
    public final BiConsumer a() {
        return new meb(0);
    }
}
