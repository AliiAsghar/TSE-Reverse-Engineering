package defpackage;

import java.util.concurrent.Executor;
import java.util.function.BiConsumer;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ynf extends mdy {
    private static final utz b = uuh.i(uuh.b, "disable_logging_spam_folder_event_logger", false);
    public static final utz a = uuh.f(uuh.b, "spam_folder_log_max_conversation_count", 1000);

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ynf(armf armfVar, Executor executor) {
        super(armfVar, new itw(11), executor);
        armfVar.getClass();
        executor.getClass();
    }

    @Override // defpackage.mdy
    public final BiConsumer a() {
        return new ijo(ynd.a, 5);
    }

    public final void b(arqr arqrVar) {
        if (((Boolean) b.e()).booleanValue()) {
            return;
        }
        n(new wxx(arqrVar, 15));
    }
}
