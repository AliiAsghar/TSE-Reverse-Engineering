package com.google.android.apps.messaging.shared.net.tachyonrefresh;

import android.content.Context;
import android.text.TextUtils;
import androidx.work.WorkerParameters;
import com.google.common.util.concurrent.ListenableFuture;
import defpackage.akec;
import defpackage.akrc;
import defpackage.aksr;
import defpackage.aktp;
import defpackage.akul;
import defpackage.andi;
import defpackage.gsi;
import defpackage.gsu;
import defpackage.gsw;
import defpackage.gsx;
import defpackage.utz;
import defpackage.uuh;
import defpackage.uva;
import defpackage.vbs;
import defpackage.vej;
import defpackage.vhn;
import defpackage.vht;
import defpackage.vip;
import defpackage.xyo;
import defpackage.xze;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class TachyonRefreshWorker extends gsx {
    public static final xze e = xze.g("BugleNetwork", "TachyonRefreshWorker");
    public static final utz f = uuh.f(uuh.b, "refresh_initial_delay_seconds", 10);
    private final Context g;

    /* compiled from: PG */
    /* loaded from: classes3.dex */
    public interface a {
        Optional Ja();

        aksr a();
    }

    public TachyonRefreshWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        this.g = context;
    }

    @Override // defpackage.gsx
    public final ListenableFuture b() {
        akul ag;
        a aVar = (a) akec.w(this.g, a.class);
        if (aVar.Ja().isEmpty()) {
            e.l("Skip refresh due to absent TachyonRefreshWorkerHelper");
            return aktp.ag(new gsw());
        }
        gsi f2 = f();
        String d = f2.d("tachyon_refresh_app");
        String d2 = f2.d("tachyon_refresh_id");
        if (!TextUtils.isEmpty(d) && !TextUtils.isEmpty(d2)) {
            akrc b = aVar.a().b("TachyonRefreshWorker.startWork");
            try {
                Object obj = aVar.Ja().get();
                int e2 = e();
                xyo c = vhn.a.c();
                c.H("TachyonRefreshWorkerHelper started");
                c.z("app", d);
                c.x("runAttemptCount", e2);
                c.q();
                if (e2 > ((Integer) vhn.b.e()).intValue()) {
                    vhn.a.o("Failed due to exceeeding max run attempt count");
                    ag = aktp.ag(new gsu());
                } else if (TextUtils.equals(d, "RCS")) {
                    if (!vht.d()) {
                        vhn.a.l("Skip refresh work. Phone registration is not enabled.");
                        ag = aktp.ag(new gsw());
                    } else {
                        vhn.a.o("Handling phone number TachyonRefresh retry");
                        ag = ((vbs) ((vhn) obj).c.b()).c(d2).i(new uva(14), ((vhn) obj).d).h(new vej(20), andi.a).e(Throwable.class, new vip(1), ((vhn) obj).d);
                    }
                } else {
                    xyo c2 = vhn.a.c();
                    c2.H("Skip refresh work. Unrecognized app name");
                    c2.z("app", d);
                    c2.q();
                    ag = aktp.ag(new gsw());
                }
                b.close();
                return ag;
            } catch (Throwable th) {
                try {
                    b.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        e.l("Skip refresh due to empty parameter");
        return aktp.ag(new gsu());
    }
}
