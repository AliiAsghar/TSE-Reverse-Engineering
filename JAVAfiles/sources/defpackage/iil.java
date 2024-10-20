package defpackage;

import java.util.concurrent.Executor;
import java.util.function.BiConsumer;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class iil extends mdy {
    public static final alhr a;
    private static final utz b = uuh.i(uuh.b, "disable_logging_add_edit_contact_event", false);

    static {
        alhr w = uuh.w("use_contact_event_logger");
        w.getClass();
        a = w;
    }

    public iil(armf armfVar, iij iijVar, Executor executor) {
        super(armfVar, iijVar, executor);
    }

    @Override // defpackage.mdy
    public final BiConsumer a() {
        return new ijo(iik.a, 1);
    }

    public final void b(arqr arqrVar) {
        if (((Boolean) b.e()).booleanValue()) {
            return;
        }
        n(new ijm(arqrVar, 1));
    }
}
