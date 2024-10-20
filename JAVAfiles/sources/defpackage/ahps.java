package defpackage;

import android.content.Context;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.regex.Matcher;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ahps extends ahpq implements ahlj, ahmw {
    public final Context a;
    public final apwt b;
    public final apwt d;
    public final armf e;
    public final ahow h;
    private final ahmu i;
    private final aneo j;
    public final Object c = new Object();
    public ArrayList f = new ArrayList(0);
    public final AtomicInteger g = new AtomicInteger();

    public ahps(ahmv ahmvVar, Context context, ahlm ahlmVar, aneo aneoVar, apwt apwtVar, apwt apwtVar2, armf armfVar, Executor executor, ahow ahowVar) {
        this.h = ahowVar;
        this.i = ahmvVar.a(executor, apwtVar, armfVar);
        this.a = context;
        this.j = aneoVar;
        this.b = apwtVar;
        this.d = apwtVar2;
        this.e = armfVar;
        ahlmVar.a(this);
    }

    @Override // defpackage.ahpq
    public final void a(ahpn ahpnVar) {
        String str;
        String str2;
        int i;
        if (ahpnVar.b <= 0 && ahpnVar.c <= 0 && ahpnVar.d <= 0 && ahpnVar.e <= 0 && ahpnVar.q <= 0 && (i = ahpnVar.w) != 3 && i != 4 && ahpnVar.s <= 0) {
            ((alvg) ((alvg) ahkh.a.i()).h("com/google/android/libraries/performance/primes/metrics/network/NetworkMetricServiceImpl", "recordAsFuture", 98, "NetworkMetricServiceImpl.java")).q("skip logging NetworkEvent due to empty bandwidth/latency data");
            ListenableFuture listenableFuture = aneh.a;
            return;
        }
        ahmu ahmuVar = this.i;
        String str3 = ahpnVar.g;
        if (str3 != null && ahpnVar.h) {
            str = str3 + "/" + ahpnVar.f;
        } else {
            str = ahpnVar.f;
        }
        String str4 = ahpnVar.k;
        if (albo.ah(str)) {
            str = "";
        } else {
            Matcher matcher = ahpo.a.matcher(str);
            if (matcher.find()) {
                str = matcher.group(1);
            } else {
                Matcher matcher2 = ahpo.c.matcher(str);
                if (matcher2.find()) {
                    str = matcher2.group(1);
                } else {
                    Matcher matcher3 = ahpo.b.matcher(str);
                    if (matcher3.find() && str4 != null && !str4.startsWith("application/")) {
                        str = matcher3.group(1);
                    }
                }
            }
        }
        int i2 = ahpnVar.u;
        if (i2 == 0) {
            str2 = null;
        } else {
            switch (i2) {
                case 1:
                    str2 = "NONE";
                    break;
                case 2:
                    str2 = "MOBILE";
                    break;
                case 3:
                    str2 = "WIFI";
                    break;
                case 4:
                    str2 = "MOBILE_MMS";
                    break;
                case 5:
                    str2 = "MOBILE_SUPL";
                    break;
                case 6:
                    str2 = "MOBILE_DUN";
                    break;
                case 7:
                    str2 = "MOBILE_HIPRI";
                    break;
                case 8:
                    str2 = "WIMAX";
                    break;
                case 9:
                    str2 = "BLUETOOTH";
                    break;
                case 10:
                    str2 = "DUMMY";
                    break;
                case 11:
                    str2 = "ETHERNET";
                    break;
                case 12:
                    str2 = "MOBILE_FOTA";
                    break;
                case 13:
                    str2 = "MOBILE_IMS";
                    break;
                case 14:
                    str2 = "MOBILE_CBS";
                    break;
                case 15:
                    str2 = "WIFI_P2P";
                    break;
                case 16:
                    str2 = "MOBILE_IA";
                    break;
                case 17:
                    str2 = "MOBILE_EMERGENCY";
                    break;
                case 18:
                    str2 = "PROXY";
                    break;
                default:
                    str2 = "VPN";
                    break;
            }
        }
        algs algsVar = new algs(":");
        long a = ahmuVar.a(new algp(algsVar, algsVar).f(str, ahpnVar.k, str2, ahpnVar.i));
        if (a == -1) {
            ListenableFuture listenableFuture2 = aneh.a;
        } else {
            this.g.incrementAndGet();
            albo.bN(new aidw(this, ahpnVar, a, 1), this.j);
        }
    }

    public final ListenableFuture b(asjt asjtVar) {
        ashu ashuVar;
        try {
            ashuVar = (ashu) ((ahpp) ((ahpm) this.b.b()).c.d(new ahpp() { // from class: ahpr
                @Override // defpackage.ahpp
                public final algw a() {
                    return alfd.a;
                }
            })).a().e();
        } catch (Exception e) {
            ((alvg) ((alvg) ((alvg) ahkh.a.i()).g(e)).h("com/google/android/libraries/performance/primes/metrics/network/NetworkMetricServiceImpl", "recordMetric", (char) 191, "NetworkMetricServiceImpl.java")).q("Exception while getting network metric extension!");
            ashuVar = null;
        }
        ahmu ahmuVar = this.i;
        ahmq a = ahmr.a();
        a.e(asjtVar);
        a.b = ashuVar;
        return ahmuVar.b(a.a());
    }

    public final ListenableFuture c() {
        if (this.g.get() > 0) {
            return albo.bK(new aarj(this, 11), 1L, TimeUnit.SECONDS, this.j);
        }
        synchronized (this.c) {
            if (this.f.isEmpty()) {
                return aneh.a;
            }
            ArrayList arrayList = this.f;
            this.f = new ArrayList(0);
            return albo.bN(new xpx(this, arrayList, 13), this.j);
        }
    }

    @Override // defpackage.ahlj
    public final void i(ahka ahkaVar) {
        c();
    }

    @Override // defpackage.ahmw
    public final /* synthetic */ void as() {
    }

    @Override // defpackage.ahlj
    public final /* synthetic */ void j(ahka ahkaVar) {
    }
}
