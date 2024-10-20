package defpackage;

import java.util.concurrent.Executor;
import java.util.function.BiConsumer;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class yqm extends mdy {
    public static final /* synthetic */ int a = 0;
    private static final utz b = uuh.i(uuh.b, "disable_logging_hades_sdk_event_logger", false);

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yqm(armf armfVar, Executor executor) {
        super(armfVar, new itw(12), executor);
        armfVar.getClass();
        executor.getClass();
    }

    @Override // defpackage.mdy
    public final BiConsumer a() {
        return new ijo(yql.a, 6);
    }

    public final void b(int i) {
        if (((Boolean) b.e()).booleanValue()) {
            return;
        }
        n(new mcv(i, 2));
    }
}
