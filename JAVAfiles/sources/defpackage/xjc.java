package defpackage;

import java.util.UUID;
import java.util.concurrent.Executor;
import java.util.function.BiConsumer;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class xjc extends mdy {
    public static final utz a = uuh.i(uuh.b, "forward_sync_log_message_counts_to_clearcut", true);
    private final BiConsumer b;

    public xjc(armf armfVar, itw itwVar, Executor executor, BiConsumer biConsumer) {
        super(armfVar, itwVar, executor);
        this.b = biConsumer;
    }

    @Override // defpackage.mdy
    public final BiConsumer a() {
        return this.b;
    }

    public final void b(UUID uuid, alog alogVar, apbt apbtVar) {
        o(new wxx(apbtVar, 5), new uzn(uuid, alogVar, 13));
    }

    public final void c(alog alogVar, apbt apbtVar) {
        o(new wxx(apbtVar, 4), new xgt(alogVar, 13));
    }
}
