package defpackage;

import java.net.InetSocketAddress;
import java.net.SocketAddress;
import java.util.Collection;
import java.util.Collections;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.logging.Logger;
import javax.net.ssl.SSLSocketFactory;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class arix implements arao {
    final Executor a;
    final ScheduledExecutorService b;
    final SSLSocketFactory c;
    final arjw d;
    final int e;
    final int f;
    final int g;
    final atoi h;
    private final arep i;
    private final arep j;
    private final boolean k;
    private final aqzm l;
    private final long m;
    private boolean n;

    public arix(arep arepVar, arep arepVar2, SSLSocketFactory sSLSocketFactory, arjw arjwVar, int i, boolean z, long j, long j2, int i2, int i3, atoi atoiVar) {
        this.i = arepVar;
        this.a = (Executor) arepVar.a();
        this.j = arepVar2;
        this.b = (ScheduledExecutorService) arepVar2.a();
        this.c = sSLSocketFactory;
        this.d = arjwVar;
        this.e = i;
        this.k = z;
        this.l = new aqzm(j);
        this.m = j2;
        this.f = i2;
        this.g = i3;
        atoiVar.getClass();
        this.h = atoiVar;
    }

    @Override // defpackage.arao
    public final arau a(SocketAddress socketAddress, aran aranVar, aqrt aqrtVar) {
        if (!this.n) {
            aqzm aqzmVar = this.l;
            aqzl aqzlVar = new aqzl(aqzmVar, aqzmVar.c.get());
            arer arerVar = new arer(aqzlVar, 14);
            String str = aranVar.a;
            String str2 = aranVar.c;
            aqrm aqrmVar = aranVar.b;
            aqsy aqsyVar = aranVar.d;
            alhr alhrVar = arcb.p;
            Logger logger = arkr.a;
            arjh arjhVar = new arjh(this, (InetSocketAddress) socketAddress, str, str2, aqrmVar, alhrVar, aqsyVar, arerVar);
            if (this.k) {
                long j = aqzlVar.a;
                long j2 = this.m;
                arjhVar.x = true;
                arjhVar.y = j;
                arjhVar.z = j2;
            }
            return arjhVar;
        }
        throw new IllegalStateException("The transport factory is closed.");
    }

    @Override // defpackage.arao
    public final Collection b() {
        return Collections.singleton(InetSocketAddress.class);
    }

    @Override // defpackage.arao
    public final ScheduledExecutorService c() {
        return this.b;
    }

    @Override // defpackage.arao, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.n) {
            return;
        }
        this.n = true;
        this.i.b(this.a);
        this.j.b(this.b);
    }
}
