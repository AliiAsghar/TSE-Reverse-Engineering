package defpackage;

import android.content.Context;
import android.net.TrafficStats;
import androidx.work.WorkerParameters;
import com.google.android.ims.provisioning.config.Configuration;
import com.google.common.util.concurrent.ListenableFuture;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.SocketTimeoutException;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class wjp implements akcq {
    private static final alwo a = alwo.o("BugleRcsWorker");
    private final Context b;
    private final armf c;
    private final armf d;
    private final armf e;
    private final armf f;
    private final armf g;
    private final armf h;
    private final anen i;
    private final armf j;
    private final armf k;
    private final oqx l;
    private final armf m;
    private final armf n;
    private final armf o;

    public wjp(Context context, armf armfVar, armf armfVar2, armf armfVar3, armf armfVar4, armf armfVar5, armf armfVar6, anen anenVar, armf armfVar7, armf armfVar8, oqx oqxVar, armf armfVar9, armf armfVar10, armf armfVar11) {
        this.b = context;
        this.c = armfVar;
        this.d = armfVar2;
        this.e = armfVar3;
        this.f = armfVar4;
        this.g = armfVar5;
        this.h = armfVar6;
        this.i = anenVar;
        this.j = armfVar7;
        this.k = armfVar8;
        this.l = oqxVar;
        this.m = armfVar9;
        this.n = armfVar10;
        this.o = armfVar11;
    }

    private final Configuration d(String str) {
        Configuration f = ((adnk) this.c.b()).f(str);
        f.rcsState = -4;
        f.mValiditySecs = 0;
        f.mReconfigRequested = true;
        ((adnk) this.c.b()).u(str, f);
        return f;
    }

    private final void e(HttpURLConnection httpURLConnection) {
        ((adks) this.f.b()).a(httpURLConnection, null, "DisableRcsWorker");
    }

    private final void f(String str) {
        ((alwl) ((alwl) a.g()).h("com/google/android/apps/messaging/shared/rcsprovisioning/DisableRcsWorker", "clearConfig", 391, "DisableRcsWorker.java")).t("Clearing local RCS Configuration for simId: %s.", str);
        ((adnk) this.c.b()).u(str, new Configuration());
    }

    private static boolean g(amwt amwtVar) {
        if (amwtVar != amwt.DISABLED_VIA_FLAGS && amwtVar != amwt.DISABLED_BY_EMM) {
            return false;
        }
        return true;
    }

    private final gvf h(admx admxVar, amwt amwtVar, String str, boolean z) {
        gvf gsvVar;
        gsu gsuVar = new gsu();
        ((acnz) this.j.b()).f(this.b, admxVar, admxVar.b, new adiw(str));
        HttpURLConnection httpURLConnection = null;
        try {
            try {
                TrafficStats.setThreadStatsTag(8961);
                httpURLConnection = ((adae) this.h.b()).b(admxVar);
                alhp b = alhp.b(alfb.a);
                int responseCode = httpURLConnection.getResponseCode();
                long a2 = b.a(TimeUnit.MILLISECONDS);
                String str2 = admxVar.b;
                String str3 = admxVar.c;
                adiw adiwVar = new adiw(str);
                admy a3 = admz.a(3, str2, str3);
                aozy e = a3.e();
                if (!e.b.isMutable()) {
                    e.u();
                }
                apih apihVar = (apih) e.b;
                apih apihVar2 = apih.a;
                apihVar.b |= 1;
                apihVar.c = responseCode;
                int min = (int) Math.min(2147483647L, a2);
                if (!e.b.isMutable()) {
                    e.u();
                }
                apih apihVar3 = (apih) e.b;
                apihVar3.b |= 2;
                apihVar3.d = min;
                ((acnz) this.j.b()).g(this.b, a3.a(), adiwVar);
                if (responseCode == 200) {
                    gsvVar = new gsw();
                } else if (responseCode == 503) {
                    gsvVar = new gsv();
                } else {
                    gsvVar = new gsu();
                }
            } catch (SocketTimeoutException unused) {
                ((alwl) ((alwl) a.i()).h("com/google/android/apps/messaging/shared/rcsprovisioning/DisableRcsWorker", "sendDisableRequest", 310, "DisableRcsWorker.java")).q("Timed out while connecting to server");
                gsvVar = new gsv();
            } catch (IOException unused2) {
                ((alwl) ((alwl) a.i()).h("com/google/android/apps/messaging/shared/rcsprovisioning/DisableRcsWorker", "sendDisableRequest", 313, "DisableRcsWorker.java")).q("Get HTTP error while connecting with retry");
                gsvVar = new gsv();
            }
            if (httpURLConnection != null) {
                e(httpURLConnection);
            }
            if (!new gsv().equals(gsvVar) && g(amwtVar)) {
                f(str);
            }
            TrafficStats.clearThreadStatsTag();
            i(str, z, gsvVar);
            return gsvVar;
        } catch (Throwable th) {
            if (0 != 0) {
                e(null);
            }
            if (!new gsv().equals(gsuVar) && g(amwtVar)) {
                f(str);
            }
            TrafficStats.clearThreadStatsTag();
            i(str, z, gsuVar);
            throw th;
        }
    }

    private final void i(String str, boolean z, gvf gvfVar) {
        ((alwl) ((alwl) a.g()).h("com/google/android/apps/messaging/shared/rcsprovisioning/DisableRcsWorker", "scheduleReprovisioningIfNeeded", 330, "DisableRcsWorker.java")).H("scheduleReprovisioningIfNeeded with forceDisableThenReprovision = %s, result = %s", z, gvfVar);
        if (z && !new gsv().equals(gvfVar)) {
            ((whs) this.n.b()).i(new adiw(str), false);
            ((wjv) this.k.b()).f(new adiw(str), aphg.TRIGGER_PHENOTYPE_FLAG_UPDATE, amww.REPROVISIONING_CAMPAIGN);
        }
    }

    @Override // defpackage.akcy
    public final /* synthetic */ ListenableFuture a(WorkerParameters workerParameters) {
        return akec.c();
    }

    @Override // defpackage.akcq, defpackage.akcy
    public final ListenableFuture b(WorkerParameters workerParameters) {
        return aktp.ai(new vze(this, workerParameters, 7, null), this.i);
    }

    public final gvf c(boolean z, String str) {
        Configuration d;
        String str2;
        String e;
        int a2;
        alwo alwoVar = a;
        ((alwl) ((alwl) alwoVar.g()).h("com/google/android/apps/messaging/shared/rcsprovisioning/DisableRcsWorker", "disableRcsRequestWork", 132, "DisableRcsWorker.java")).E("disableRcsRequestWork for simId: %s, forceDisableThenReprovision: %s", str, z);
        Configuration f = ((adnk) this.c.b()).f(str);
        if (!z && (!f.k() || !f.p())) {
            ((alwl) ((alwl) alwoVar.i()).h("com/google/android/apps/messaging/shared/rcsprovisioning/DisableRcsWorker", "disableRcsRequestWork", 140, "DisableRcsWorker.java")).I("Wrong configuration, hasToken: %s, isValidAndUpdated: %s", f.k(), f.p());
            return new gsu();
        }
        if (z) {
            f = d(str);
        }
        amwt w = ((vrn) ((xyt) this.g.b()).a()).w(new adiw(str));
        ((alwl) ((alwl) alwoVar.g()).h("com/google/android/apps/messaging/shared/rcsprovisioning/DisableRcsWorker", "disableRcsRequestWork", 154, "DisableRcsWorker.java")).t("Current availability is %s", w);
        if (!z ? !(w == amwt.DISABLED_FROM_PREFERENCES || ((aczv.R() && g(w)) || (!((pmn) this.o.b()).a() && aczv.P() && w == amwt.DISABLED_NOT_DEFAULT_SMS_APP))) : !(!((ansy) ((num) this.l).a.b()).e("bugle.enable_reprovision_campaign_in_amber") ? aczv.Q() : !(!aczv.Q() && !((vau) this.m.b()).c(str).Q))) {
            if (g(w)) {
                f(str);
            }
            ((alwl) ((alwl) alwoVar.i()).h("com/google/android/apps/messaging/shared/rcsprovisioning/DisableRcsWorker", "disableRcsRequestWork", 222, "DisableRcsWorker.java")).q("Cannot send disable request due to availability mismatch");
            i(str, z, new gsu());
            return new gsu();
        }
        if (!z) {
            try {
                try {
                    d = d(str);
                } catch (MalformedURLException unused) {
                    str2 = "DisableRcsWorker.java";
                    ((alwl) ((alwl) a.i()).h("com/google/android/apps/messaging/shared/rcsprovisioning/DisableRcsWorker", "disableRcsRequestWork", 211, str2)).q("malformed URL has occurred");
                    i(str, z, new gsu());
                    return new gsu();
                }
            } catch (RuntimeException e2) {
                e2.printStackTrace();
                i(str, z, new gsu());
                return new gsu();
            }
        } else {
            d = f;
        }
        if (z) {
            e = ((adnk) this.c.b()).d(str).d;
        } else if (aczv.x() && aczv.W()) {
            e = ((adnv) this.d.b()).f(str);
        } else {
            e = ((adnv) this.d.b()).e();
        }
        String str3 = e;
        if (aczv.x() && aczv.W()) {
            a2 = ((adnv) this.d.b()).b(str);
        } else {
            a2 = ((adnv) this.d.b()).a();
        }
        int i = a2;
        String str4 = d.mToken.mValue;
        admw e3 = admx.e(3);
        if (!((pmn) this.o.b()).a() && aczv.P() && w == amwt.DISABLED_NOT_DEFAULT_SMS_APP) {
            e3.c("default_sms_app", Integer.toString(2));
        }
        str2 = "DisableRcsWorker.java";
        try {
            ((adlx) this.e.b()).d(this.b, str3, d, "", str4, i, null, str, e3);
            return h(e3.a(), w, str, z);
        } catch (MalformedURLException unused2) {
            ((alwl) ((alwl) a.i()).h("com/google/android/apps/messaging/shared/rcsprovisioning/DisableRcsWorker", "disableRcsRequestWork", 211, str2)).q("malformed URL has occurred");
            i(str, z, new gsu());
            return new gsu();
        }
    }
}
