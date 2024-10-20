package defpackage;

import com.google.android.rcs.client.events.EventService;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class ika implements ajoa {
    final /* synthetic */ ikc a;

    public ika(ikc ikcVar) {
        this.a = ikcVar;
    }

    @Override // defpackage.ajoa
    public final void c(String str) {
        akrh e = aktp.e("RcsCapabilitiesDataSource.jibeServiceListener#handleServiceDisconnected");
        try {
            xyo e2 = this.a.b.e();
            e2.H("disconnected from event service");
            e2.z("serviceClassName", str);
            e2.q();
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
        akrh e = aktp.e("RcsCapabilitiesDataSource.jibeServiceListener#handleServiceConnectFailed");
        try {
            xyo e2 = this.a.b.e();
            e2.H("failed connection to event service");
            e2.z("serviceClassName", str);
            e2.z("reason", ajnzVar);
            e2.q();
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
        akrh e = aktp.e("RcsCapabilitiesDataSource.jibeServiceListener#handleServiceConnected");
        try {
            try {
                xyo a = this.a.b.a();
                a.H("handleServiceConnected");
                a.z("serviceClassName", str);
                a.q();
                synchronized (this.a.k) {
                    EventService eventService = this.a.l;
                    if (eventService != null && eventService.isConnected()) {
                        ikc ikcVar = this.a;
                        ikcVar.l.subscribe(3, ikcVar.d());
                    }
                }
                this.a.e();
            } catch (ajny e2) {
                this.a.b.r("failed to subscribe to rcs events", e2);
            }
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
}
