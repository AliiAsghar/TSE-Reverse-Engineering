package defpackage;

import java.net.InetSocketAddress;
import java.net.SocketAddress;
import java.util.Collection;
import java.util.Collections;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aqyt implements arao {
    private final ScheduledExecutorService a;
    private final Executor b;
    private final int c;
    private final aqyu d;
    private final arhu e;
    private final boolean f;

    public aqyt(aqyu aqyuVar, Executor executor, ScheduledExecutorService scheduledExecutorService, int i, arhu arhuVar) {
        boolean z;
        if (scheduledExecutorService == null) {
            z = true;
        } else {
            z = false;
        }
        this.f = z;
        this.a = z ? (ScheduledExecutorService) arhl.a(arcb.o) : scheduledExecutorService;
        this.c = i;
        this.d = aqyuVar;
        executor.getClass();
        this.b = executor;
        this.e = arhuVar;
    }

    @Override // defpackage.arao
    public final arau a(SocketAddress socketAddress, aran aranVar, aqrt aqrtVar) {
        String str = aranVar.a;
        String str2 = aranVar.c;
        aqrm aqrmVar = aranVar.b;
        Executor executor = this.b;
        int i = this.c;
        return new aqzb(this.d, (InetSocketAddress) socketAddress, str, str2, aqrmVar, executor, i, this.e);
    }

    @Override // defpackage.arao
    public final Collection b() {
        return Collections.singleton(InetSocketAddress.class);
    }

    @Override // defpackage.arao
    public final ScheduledExecutorService c() {
        return this.a;
    }

    @Override // defpackage.arao, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f) {
            arhl.d(arcb.o, this.a);
        }
    }
}
