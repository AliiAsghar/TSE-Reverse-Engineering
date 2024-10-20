package defpackage;

import java.util.concurrent.Executor;
import java.util.function.BiConsumer;

/* compiled from: PG */
@Deprecated
/* loaded from: classes3.dex */
public final class mcm extends mdy {
    public static final alvi a = alvi.m("com/google/android/apps/messaging/shared/analytics/compose/ComposeNavigationEventLogger");

    public mcm(armf armfVar, itw itwVar, Executor executor) {
        super(armfVar, itwVar, executor);
    }

    @Override // defpackage.mdy
    public final BiConsumer a() {
        throw new UnsupportedOperationException("ComposeNavigationEventLogger is not supported");
    }

    public final void b(amqh amqhVar, amqi amqiVar, amqd amqdVar) {
        alvg alvgVar = (alvg) a.i();
        alvgVar.Z(alwk.MEDIUM);
        ((alvg) alvgVar.h("com/google/android/apps/messaging/shared/analytics/compose/ComposeNavigationEventLogger", "deprecatedLogScreenClosed", 121, "ComposeNavigationEventLogger.java")).J("ComposeNavigationEventLogger.deprecatedLogScreenClosed 1 %s, %s, %s", amqhVar, amqiVar, Integer.valueOf(amqdVar.h));
    }

    public final void c(amqj amqjVar, amqd amqdVar) {
        alvg alvgVar = (alvg) a.i();
        alvgVar.Z(alwk.MEDIUM);
        ((alvg) alvgVar.h("com/google/android/apps/messaging/shared/analytics/compose/ComposeNavigationEventLogger", "deprecatedLogScreenClosed", 143, "ComposeNavigationEventLogger.java")).B("ComposeNavigationEventLogger.deprecatedLogScreenClosed 3 %s, %s", amqjVar, amqdVar.h);
    }

    public final void d(amqh amqhVar, amqi amqiVar, amqf amqfVar, amqe amqeVar) {
        alvg alvgVar = (alvg) a.i();
        alvgVar.Z(alwk.MEDIUM);
        ((alvg) alvgVar.h("com/google/android/apps/messaging/shared/analytics/compose/ComposeNavigationEventLogger", "deprecatedLogScreenOpened", 59, "ComposeNavigationEventLogger.java")).K("ComposeNavigationEventLogger.deprecatedLogScreenOpened 1 %s, %s, %s, %s", amqhVar, amqiVar, amqfVar, Integer.valueOf(amqeVar.r));
    }
}
