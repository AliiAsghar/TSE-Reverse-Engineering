package defpackage;

import java.util.concurrent.Executor;
import java.util.function.BiConsumer;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class uzj extends mdy {
    public static final /* synthetic */ int a = 0;
    private static final uuf b = uuh.i(uuh.b, "disable_logging_mdd_lib", true);

    static {
        uuh.w("use_mdd_lib_event_logger").getClass();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uzj(armf armfVar, Executor executor) {
        super(armfVar, new itw(7), executor);
        armfVar.getClass();
        executor.getClass();
    }

    @Override // defpackage.mdy
    public final BiConsumer a() {
        return new ijo(uzi.a, 4);
    }

    public final void b(int i) {
        iim iimVar = new iim(i, 6);
        if (((Boolean) b.e()).booleanValue()) {
            return;
        }
        n(new uea(iimVar, 6));
    }
}
