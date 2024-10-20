package defpackage;

import android.os.SystemClock;
import java.net.InetSocketAddress;
import java.net.SocketAddress;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class agqw extends aqrx {
    public final Object a = new Object();
    public final ahpn b;
    public boolean c;
    public int d;
    public int e;

    public agqw(ahpn ahpnVar) {
        this.b = ahpnVar;
    }

    @Override // defpackage.aqrx
    public final void a() {
        synchronized (this.a) {
            if (!this.c) {
                ahpn ahpnVar = this.b;
                ahpnVar.b = SystemClock.elapsedRealtime() - ahpnVar.a;
            }
        }
    }

    @Override // defpackage.aqae
    public final void b(long j) {
        synchronized (this.a) {
            this.d += (int) j;
        }
    }

    @Override // defpackage.aqae
    public final void c(long j) {
        synchronized (this.a) {
            this.e += (int) j;
        }
    }

    @Override // defpackage.aqrx
    public final void d(aqrm aqrmVar) {
        synchronized (this.a) {
            ahpn ahpnVar = this.b;
            SocketAddress socketAddress = (SocketAddress) aqrmVar.a(aqsw.a);
            if (!(socketAddress instanceof InetSocketAddress)) {
                if (socketAddress instanceof aqzd) {
                    ahpnVar.v = 2;
                } else if (socketAddress instanceof aqwn) {
                    ahpnVar.v = 3;
                }
            }
        }
    }
}
