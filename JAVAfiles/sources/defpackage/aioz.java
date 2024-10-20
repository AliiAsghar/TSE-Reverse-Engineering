package defpackage;

import android.os.PowerManager;
import java.io.BufferedInputStream;
import java.net.SocketTimeoutException;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aioz extends Thread {
    final /* synthetic */ aipa a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aioz(aipa aipaVar) {
        super("ClientSocketConnection");
        this.a = aipaVar;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        PowerManager.WakeLock wakeLock;
        advr.d(this.a.b, "TCP socket reader started", new Object[0]);
        try {
            aohs aohsVar = this.a.g;
            aohsVar.getClass();
            BufferedInputStream bufferedInputStream = new BufferedInputStream(aohsVar.E());
            while (this.a.f.get() == 1) {
                if (bufferedInputStream.available() >= 0) {
                    try {
                        ainh a = aiof.a(bufferedInputStream);
                        this.a.d = agkx.W().longValue();
                        aipa aipaVar = this.a;
                        advr.d(aipaVar.b, ">>>>>>>>>> SIP message[%s] received (%d bytes) [Call-ID: %s]", ahmc.ab(a.l), Integer.valueOf(a.a().length()), a.h());
                        try {
                            asqc asqcVar = aipaVar.h;
                            advr.d(((aikl) asqcVar.a).a, "shouldAcquireWakelock for context id: %s", a.u(1));
                            if ((!((aikl) asqcVar.a).i(a) || !((aikl) asqcVar.a).h(a)) && !a.r() && aipaVar.e != null && adaa.o() > 0 && (wakeLock = aipaVar.e) != null) {
                                wakeLock.acquire(adaa.o());
                            }
                            aipaVar.h.v(a);
                        } catch (Exception e) {
                            aipaVar.s(5);
                            advr.j(e, aipaVar.b, "Error while notifying message: %s", e.getMessage());
                        }
                    } catch (SocketTimeoutException unused) {
                        advr.d(this.a.b, "Socket read timeout due to inactivity.", new Object[0]);
                    }
                }
            }
        } catch (Exception e2) {
            if (!this.a.f.compareAndSet(1, 2)) {
                return;
            }
            int i = 7;
            if (!(e2 instanceof ailb) && !(e2 instanceof advm)) {
                i = 6;
            }
            this.a.s(i);
            advr.j(e2, this.a.b, "Error while receiving message: %s", e2.getMessage());
            this.a.q(apje.SOCKET_FAILURE_READ_ERROR);
            this.a.r();
            aipa aipaVar2 = this.a;
            aios aiosVar = aipaVar2.c;
            if (aiosVar != null) {
                aiosVar.a(aipaVar2.d(), e2);
            } else {
                advr.r(aipaVar2.b, "SipTransportErrorListener is null", new Object[0]);
            }
        }
        advr.d(this.a.b, "TCP socket reader terminated", new Object[0]);
    }
}
