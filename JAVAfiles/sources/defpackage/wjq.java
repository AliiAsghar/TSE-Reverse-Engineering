package defpackage;

import android.content.Context;
import android.net.TrafficStats;
import android.os.Process;
import androidx.work.WorkerParameters;
import com.google.android.ims.provisioning.config.Configuration;
import com.google.common.util.concurrent.ListenableFuture;
import j$.util.Optional;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class wjq implements akcq {
    private static final xze a = xze.g("Bugle", "NotifyRcsUnavailableWorker");
    private static final alvi b = alvi.m("com/google/android/apps/messaging/shared/rcsprovisioning/NotifyRcsUnavailableWorker");
    private final Context c;
    private final armf d;
    private final armf e;
    private final armf f;
    private final armf g;
    private final armf h;
    private final armf i;
    private final anen j;
    private final armf k;
    private final armf l;
    private final armf m;
    private final armf n;

    public wjq(Context context, armf armfVar, armf armfVar2, armf armfVar3, armf armfVar4, armf armfVar5, armf armfVar6, anen anenVar, armf armfVar7, armf armfVar8, armf armfVar9, armf armfVar10) {
        this.c = context;
        this.d = armfVar;
        this.e = armfVar2;
        this.f = armfVar3;
        this.g = armfVar4;
        this.h = armfVar5;
        this.i = armfVar6;
        this.j = anenVar;
        this.k = armfVar7;
        this.l = armfVar8;
        this.m = armfVar9;
        this.n = armfVar10;
    }

    @Override // defpackage.akcy
    public final /* synthetic */ ListenableFuture a(WorkerParameters workerParameters) {
        return akec.c();
    }

    @Override // defpackage.akcq, defpackage.akcy
    public final ListenableFuture b(WorkerParameters workerParameters) {
        String d = workerParameters.b.d("sim_id");
        d.getClass();
        return aktp.ai(new vze(this, d, 8), this.j);
    }

    public final gvf c(String str) {
        amwt x;
        String f;
        boolean l;
        boolean z;
        boolean z2;
        int a2;
        amwt x2;
        admx a3;
        adiw adiwVar;
        gvf gsuVar;
        adks adksVar;
        Context context;
        HttpURLConnection httpURLConnection;
        boolean z3 = false;
        if (((acxn) this.l.b()).a()) {
            x = ((vrn) ((xyt) this.i.b()).a()).w(new adiw(str));
            f = (String) ((wwn) this.k.b()).h(wwm.a).map(new wga(11)).orElse(null);
            int intValue = ((Integer) ((wwn) this.k.b()).j(new adiw(str)).map(new wga(12)).orElse(-1)).intValue();
            if (intValue != -1 && ((wwn) this.k.b()).s(intValue)) {
                l = true;
            } else {
                l = false;
            }
        } else {
            x = ((vrn) ((xyt) this.i.b()).a()).x();
            f = ((adtl) this.e.b()).f();
            l = ((adtl) this.e.b()).l(this.c);
        }
        boolean equals = str.equals(f);
        if (equals && l) {
            z = true;
        } else {
            z = false;
        }
        if (x == amwt.AVAILABLE) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z && z2) {
            z3 = true;
        }
        if (!equals) {
            ((alvg) ((alvg) b.i()).h("com/google/android/apps/messaging/shared/rcsprovisioning/NotifyRcsUnavailableWorker", "shouldSendNotifyRcsUnavailableRequest", 224, "NotifyRcsUnavailableWorker.java")).q("NotifyRcsUnavailableWorker: SIM to mark unavailable is not the same as current default sim");
        }
        if (!l) {
            ((alvg) ((alvg) b.i()).h("com/google/android/apps/messaging/shared/rcsprovisioning/NotifyRcsUnavailableWorker", "shouldSendNotifyRcsUnavailableRequest", 229, "NotifyRcsUnavailableWorker.java")).q("NotifyRcsUnavailableWorker: SIM to mark unavailable is not loaded");
        }
        if (!z2) {
            ((alvg) ((alvg) b.i()).h("com/google/android/apps/messaging/shared/rcsprovisioning/NotifyRcsUnavailableWorker", "shouldSendNotifyRcsUnavailableRequest", 233, "NotifyRcsUnavailableWorker.java")).q("NotifyRcsUnavailableWorker: SIM to mark unavailable is not available");
        }
        if (!z3) {
            Configuration f2 = ((adnk) this.d.b()).f(str);
            if (!f2.k()) {
                a.q("skipping request because there is no config token");
                return new gsu();
            }
            wgl d = ((adnk) this.d.b()).d(str);
            String str2 = d.d;
            String str3 = f2.mToken.mValue;
            if (((oiu) this.m.b()).a()) {
                a2 = ((vau) this.n.b()).c(str).k;
            } else {
                a2 = ((adnv) this.f.b()).a();
            }
            int i = a2;
            String str4 = d.e;
            int i2 = f2.rcsState;
            f2.rcsState = -99;
            armf armfVar = this.m;
            admw e = admx.e(4);
            if (((oiu) armfVar.b()).a()) {
                x2 = ((vrn) ((xyt) this.i.b()).a()).w(new adiw(str));
            } else {
                x2 = ((vrn) ((xyt) this.i.b()).a()).x();
            }
            a.o("Current availability is ".concat(String.valueOf(String.valueOf(x2))));
            if (aczv.P() && x2 == amwt.DISABLED_NOT_DEFAULT_SMS_APP) {
                e.c("default_sms_app", Integer.toString(2));
            }
            try {
                adlx adlxVar = (adlx) this.g.b();
                ((aday) adlxVar.b).f(str2, f2, null, str3, i, adlxVar.a(this.c, str4, str), Optional.of(e));
                a3 = e.a();
                adiwVar = new adiw(str);
            } catch (MalformedURLException unused) {
            }
            try {
                try {
                    try {
                        adksVar = (adks) this.h.b();
                        context = this.c;
                        adksVar.c.f(context, a3, a3.b, adiwVar);
                        TrafficStats.setThreadStatsTag(Process.myPid());
                        try {
                            httpURLConnection = adksVar.d.b(a3);
                        } catch (Throwable th) {
                            th = th;
                            httpURLConnection = null;
                        }
                    } catch (adkj e2) {
                        a.r("Unexpected HTTP response", e2);
                        if (e2.a == 503) {
                            gsuVar = new gsv();
                        } else {
                            gsuVar = new gsu();
                        }
                    }
                } catch (IOException e3) {
                    a.n("IOException while connecting to server", e3);
                    gsuVar = new gsv();
                }
                try {
                    alhp b2 = alhp.b(alfb.a);
                    int responseCode = httpURLConnection.getResponseCode();
                    long a4 = b2.a(TimeUnit.MILLISECONDS);
                    admy a5 = admz.a(4, a3.b, a3.c);
                    aozy e4 = a5.e();
                    if (!e4.b.isMutable()) {
                        e4.u();
                    }
                    apih apihVar = (apih) e4.b;
                    apih apihVar2 = apih.a;
                    apihVar.b |= 1;
                    apihVar.c = responseCode;
                    int min = (int) Math.min(2147483647L, a4);
                    if (!e4.b.isMutable()) {
                        e4.u();
                    }
                    apih apihVar3 = (apih) e4.b;
                    apihVar3.b |= 2;
                    apihVar3.d = min;
                    adksVar.c.g(context, a5.a(), adiwVar);
                    if (responseCode == 200) {
                        if (httpURLConnection != null) {
                            adksVar.a(httpURLConnection, null, "PROVISIONING_ENGINE_NOTIFY_RCS_UNAVAILABLE_WORKER");
                        }
                        TrafficStats.clearThreadStatsTag();
                        gsuVar = new gsw();
                        f2.rcsState = i2;
                        f2.mReconfigRequested = true;
                        ((adnk) this.d.b()).u(str, f2);
                        return gsuVar;
                    }
                    throw new adkj(responseCode);
                } catch (Throwable th2) {
                    th = th2;
                    if (httpURLConnection != null) {
                        adksVar.a(httpURLConnection, null, "PROVISIONING_ENGINE_NOTIFY_RCS_UNAVAILABLE_WORKER");
                    }
                    TrafficStats.clearThreadStatsTag();
                    throw th;
                }
            } catch (MalformedURLException unused2) {
                a.q("skipping request due to MalformedURLException");
                return new gsu();
            }
        }
        a.o("skipping request because conditions are not met");
        return new gsw();
    }
}
