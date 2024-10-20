package defpackage;

import java.net.SocketAddress;
import java.util.Collection;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aqzv implements arao {
    public final Executor a;
    private final arao b;

    public aqzv(arao araoVar, Executor executor) {
        this.b = araoVar;
        executor.getClass();
        this.a = executor;
    }

    @Override // defpackage.arao
    public final arau a(SocketAddress socketAddress, aran aranVar, aqrt aqrtVar) {
        return new aqzu(this, this.b.a(socketAddress, aranVar, aqrtVar), aranVar.a);
    }

    @Override // defpackage.arao
    public final Collection b() {
        return this.b.b();
    }

    @Override // defpackage.arao
    public final ScheduledExecutorService c() {
        return this.b.c();
    }

    @Override // defpackage.arao, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.b.close();
    }
}
