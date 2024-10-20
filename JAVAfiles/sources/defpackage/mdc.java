package defpackage;

import j$.time.Duration;
import java.util.concurrent.Executor;
import java.util.function.BiConsumer;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class mdc extends mdy {
    public static final alvi a = alvi.m("com/google/android/apps/messaging/shared/analytics/compose/navigation/ComposeNavigationEventLogger");
    public final uvi b;
    private final arwe d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mdc(arwe arweVar, uvi uviVar, armf armfVar, itw itwVar, Executor executor) {
        super(armfVar, itwVar, executor);
        arweVar.getClass();
        uviVar.getClass();
        armfVar.getClass();
        executor.getClass();
        this.d = arweVar;
        this.b = uviVar;
    }

    @Override // defpackage.mdy
    public final BiConsumer a() {
        return new ioe(19);
    }

    public final Integer b(Duration duration) {
        long millis = duration.toMillis();
        if (millis <= 0) {
            return null;
        }
        if (millis > 2147483647L) {
            qjh.l(this.d, null, new qvt(this, millis, (arpe) null, 1), 3);
            return null;
        }
        return Integer.valueOf((int) millis);
    }

    public final void c(amqh amqhVar, amqi amqiVar, amqd amqdVar, Integer num, Duration duration) {
        amqhVar.getClass();
        amqiVar.getClass();
        amqdVar.getClass();
        qjh.l(this.d, null, new lne(this, amqhVar, amqdVar, num, duration, amqiVar, (arpe) null, 2), 3);
    }

    public final void d(amqh amqhVar, amqi amqiVar, amqe amqeVar, amqf amqfVar, Integer num, Duration duration) {
        amqhVar.getClass();
        amqiVar.getClass();
        amqeVar.getClass();
        amqfVar.getClass();
        qjh.l(this.d, null, new mdb(this, amqhVar, amqeVar, num, duration, amqfVar, amqiVar, (arpe) null, 0), 3);
    }
}
