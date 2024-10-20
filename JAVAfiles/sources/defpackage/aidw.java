package defpackage;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final /* synthetic */ class aidw implements ancr {
    public final /* synthetic */ long a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    private final /* synthetic */ int d;

    public /* synthetic */ aidw(ahps ahpsVar, ahpn ahpnVar, long j, int i) {
        this.d = i;
        this.c = ahpsVar;
        this.b = ahpnVar;
        this.a = j;
    }

    /* JADX WARN: Type inference failed for: r7v1, types: [java.util.List, java.lang.Object] */
    @Override // defpackage.ancr
    public final ListenableFuture a() {
        ArrayList arrayList;
        ListenableFuture b;
        NetworkInfo activeNetworkInfo;
        boolean z = false;
        int i = 1;
        if (this.d != 0) {
            Object obj = this.c;
            long j = this.a;
            try {
                int aD = a.aD(((asja) ((ahps) obj).e.b()).d);
                Object obj2 = this.b;
                if (aD != 0 && aD == 5) {
                    ((ahpn) obj2).t = algw.i(Long.valueOf(j));
                }
                Context context = ((ahps) obj).a;
                ((ahpn) obj2).l = ((ahps) obj).h.a();
                int i2 = -1;
                try {
                    ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
                    if (connectivityManager != null && (activeNetworkInfo = connectivityManager.getActiveNetworkInfo()) != null) {
                        i2 = activeNetworkInfo.getType();
                    }
                } catch (SecurityException e) {
                    ((alvg) ((alvg) ((alvg) ahkh.a.i()).g(e)).h("com/google/android/libraries/performance/primes/metrics/network/NetworkCapture", "getNetworkType", '$', "NetworkCapture.java")).q("Failed to get network type, Please add: android.permission.ACCESS_NETWORK_STATE to AndroidManifest.xml");
                }
                int ar = arsd.ar(i2);
                if (ar != 0) {
                    i = ar;
                }
                ((ahpn) obj2).u = i;
                int i3 = ((ahpm) ((ahps) obj).b.b()).a;
                synchronized (((ahps) obj).c) {
                    ((ahps) obj).f.ensureCapacity(i3);
                    ((ahps) obj).f.add(obj2);
                    if (((ahps) obj).f.size() >= i3) {
                        arrayList = ((ahps) obj).f;
                        ((ahps) obj).f = new ArrayList(0);
                    } else {
                        arrayList = null;
                    }
                }
                if (arrayList == null) {
                    b = aneh.a;
                } else {
                    b = ((ahps) obj).b(((ahpo) ((ahps) obj).d.b()).c(arrayList));
                }
                return b;
            } finally {
                ((ahps) obj).g.decrementAndGet();
            }
        }
        aidx aidxVar = (aidx) this.b;
        long epochMilli = aidxVar.d.f().toEpochMilli();
        alej alejVar = alej.OCCURRENCE;
        aavc aavcVar = new aavc(19);
        aieo aieoVar = aidxVar.c;
        if (!aieoVar.d) {
            return aieoVar.h.a(aieoVar.k.f());
        }
        ((alvg) ((alvg) aieo.a.g()).h("com/google/android/libraries/privatetelemetry/mobalt/workers/writer/LogWriter", "logNumeric", 117, "LogWriter.java")).t("Mobalt: start logging %s metric", alejVar);
        if (alejVar == alej.OCCURRENCE || alejVar == alej.INTEGER) {
            z = true;
        }
        ?? r7 = this.c;
        long j2 = this.a;
        albo.N(z, "logNumeric must be called with OCCURRENCE or INTEGER metric types, not %s", alejVar);
        return aieoVar.h.b(aieoVar.k.f()).h(new xsk(aieoVar, j2, (List) r7, alejVar, aavcVar, 2), aieoVar.e).e(IllegalArgumentException.class, new agui(aieoVar, 14), aieoVar.e).i(new woq(aieoVar, (Object) r7, epochMilli, 3), aieoVar.e);
    }

    public /* synthetic */ aidw(aidx aidxVar, long j, List list, int i) {
        this.d = i;
        this.b = aidxVar;
        this.a = j;
        this.c = list;
    }
}
