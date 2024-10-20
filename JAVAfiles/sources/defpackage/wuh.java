package defpackage;

import com.google.android.rcs.client.events.EventService;
import j$.time.Duration;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class wuh implements ajoa, vrl {
    public static final long a = TimeUnit.HOURS.toMillis(1);
    public final apwt b;
    private final apwt c;
    private final wui d;
    private final apwt e;
    private akul f;
    private int g = 0;
    private final alhr h = albo.D(new ubz(16));
    private final aneo i;

    public wuh(apwt apwtVar, wui wuiVar, apwt apwtVar2, apwt apwtVar3, aneo aneoVar) {
        this.c = apwtVar;
        this.d = wuiVar;
        this.e = apwtVar2;
        this.b = apwtVar3;
        this.i = aneoVar;
    }

    private final long d(amdr amdrVar) {
        Duration ofMillis = Duration.ofMillis(amdrVar.a(this.g));
        akul akulVar = this.f;
        if (akulVar == null || akulVar.isDone() || this.f.isCancelled()) {
            this.g++;
            this.f = akul.g(this.i.schedule(new wuo(this, 1), ofMillis.toMillis(), TimeUnit.MILLISECONDS));
        }
        return ofMillis.toMillis();
    }

    @Override // defpackage.vrl
    public final void am(vrm vrmVar) {
        if (vrmVar.a != amwt.AVAILABLE) {
            return;
        }
        this.d.l();
    }

    @Override // defpackage.ajoa
    public final void c(String str) {
        akrh e = aktp.e("RcsServiceListener::ServiceDisconnected");
        try {
            xzb.g("BugleRcs", str + " RCS service disconnected [Will reconnect in " + d((amdr) this.h.get()) + "ms]");
            e.close();
        } catch (Throwable th) {
            try {
                e.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.ajoa
    public final void fG(String str, ajnz ajnzVar) {
        akrh e = aktp.e("RcsServiceListener#handleServiceConnectFailed");
        try {
            long d = d((amdr) this.h.get());
            xzb.g("BugleRcs", str + " RCS service failed to connect: " + String.valueOf(ajnzVar) + " [Will retry in " + d + "ms]");
            e.close();
        } catch (Throwable th) {
            try {
                e.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.ajoa
    public final void fH(String str) {
        akrh e = aktp.e("RcsServiceListener#handleServiceConnected");
        try {
            xzb.j("BugleRcs", hht.h(str, " RCS service connected"));
            this.g = 0;
            if (this.d.b().isConnected() && this.d.d().isConnected() && this.d.c().isConnected() && this.d.e().isConnected()) {
                try {
                    e = aktp.e("subscribe");
                } catch (ajny e2) {
                    xzb.p("BugleRcs", e2, "exception subscribing to RCS events");
                }
                try {
                    EventService b = this.d.b();
                    wod wodVar = (wod) this.c.b();
                    if (!b.isSubscribed(wodVar)) {
                        xzb.j("BugleRcs", "subscribing to global rcs listener");
                        b.subscribe(3, wodVar);
                        b.subscribe(5, wodVar);
                        b.subscribe(2, wodVar);
                    }
                    e.close();
                    xzb.l("BugleRcs", "kicking off RCS sending/receiving");
                    ((wfe) this.e.b()).n();
                } catch (Throwable th) {
                    throw th;
                }
            }
            e.close();
        } finally {
            try {
                e.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
        }
    }
}
