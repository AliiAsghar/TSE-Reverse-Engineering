package defpackage;

import android.content.Context;
import android.content.IntentFilter;
import com.google.android.ims.rcsservice.businessinfo.BasePaymentResult;
import j$.util.Map;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ybg {
    public static final alwo a = alwo.o("BugleConnectivity");
    public final anen b;
    public final armf c;
    public final armf d;
    public final Context e;
    public final IntentFilter f;
    public final Map g = new tm();
    public final Map h = new tm();
    public final Object i = new Object();
    public final yaw j;

    public ybg(Context context, anen anenVar, anen anenVar2, armf armfVar, armf armfVar2) {
        this.e = context;
        this.b = anenVar2;
        this.c = armfVar;
        this.d = armfVar2;
        IntentFilter intentFilter = new IntentFilter();
        this.f = intentFilter;
        intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
        this.j = new yaw(anenVar, this);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final yaz a(int i) {
        synchronized (this.i) {
            Map map = this.g;
            Integer valueOf = Integer.valueOf(i);
            yba ybaVar = (yba) map.get(valueOf);
            if (ybaVar == null) {
                if (i < ((yjy) this.d.b()).f()) {
                    ((alwl) ((alwl) a.i()).h("com/google/android/apps/messaging/shared/util/connectivity/NetworkStateMonitorManager", "getNetworkState", BasePaymentResult.ERROR_REQUEST_TIMEOUT, "NetworkStateMonitorManager.java")).r("getNetworkState: NetworkStateMonitor can't be registered for invalid subId %d.", i);
                    return yaz.UNKNOWN;
                }
                ybaVar = (yba) Map.EL.computeIfAbsent(this.g, valueOf, new xol(this, 16));
                ybaVar.b();
            }
            ((alwl) a.m().h("com/google/android/apps/messaging/shared/util/connectivity/NetworkStateMonitorManager", "getNetworkState", 208, "NetworkStateMonitorManager.java")).w("getNetworkState for subId %d: %s.", i, ybaVar.a());
            return ybaVar.a();
        }
    }

    public final void b(yao yaoVar, int i) {
        Integer valueOf = Integer.valueOf(i);
        Map.EL.putIfAbsent(this.h, valueOf, new ArrayList());
        List list = (List) this.h.get(valueOf);
        if (list != null && !list.contains(yaoVar)) {
            list.add(yaoVar);
        }
    }

    public final void c(int i) {
        ((yba) Map.EL.computeIfAbsent(this.g, Integer.valueOf(i), new xol(this, 15))).b();
    }

    public final boolean d() {
        synchronized (this.i) {
            java.util.Map map = this.h;
            if (!map.isEmpty()) {
                aluq listIterator = alpt.o(map.keySet()).listIterator();
                while (listIterator.hasNext()) {
                    if (!e(((Integer) listIterator.next()).intValue())) {
                        return false;
                    }
                }
            }
            return true;
        }
    }

    public final boolean e(int i) {
        List list = (List) this.h.get(Integer.valueOf(i));
        if (list != null && !list.isEmpty()) {
            return false;
        }
        return true;
    }
}
