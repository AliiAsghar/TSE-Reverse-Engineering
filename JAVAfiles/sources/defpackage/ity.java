package defpackage;

import android.content.Context;
import java.util.Collection;
import java.util.concurrent.Executor;
import java.util.function.BiConsumer;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ity extends mdy {
    private static final utz d = uuh.i(uuh.b, "disable_logging_selected_messages_event_logger", true);
    public final armf a;
    public final Context b;
    private final arwe e;
    private final arpi f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ity(armf armfVar, Executor executor, armf armfVar2, arwe arweVar, arpi arpiVar, Context context) {
        super(armfVar, new itw(0), executor);
        armfVar.getClass();
        executor.getClass();
        armfVar2.getClass();
        arweVar.getClass();
        arpiVar.getClass();
        context.getClass();
        this.a = armfVar2;
        this.e = arweVar;
        this.f = arpiVar;
        this.b = context;
    }

    @Override // defpackage.mdy
    public final BiConsumer a() {
        return new ijo(itx.a, 2);
    }

    public final void b(Collection collection, amgf amgfVar) {
        collection.getClass();
        amgfVar.getClass();
        if (!((Boolean) d.e()).booleanValue() && !collection.isEmpty()) {
            qjh.l(this.e, this.f, new gci(collection, this, amgfVar, (arpe) null, 5), 2);
        }
    }
}
