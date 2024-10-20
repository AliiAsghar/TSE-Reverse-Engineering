package defpackage;

import android.telephony.TelephonyManager;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ybj implements yba {
    public static final alwo a = alwo.o("BugleConnectivity");
    public final Consumer b;
    public final ybm c;
    public final int d;
    private final anen h;
    private final akbm i;
    private ybi j;
    private final TelephonyManager k;
    public final Object e = new Object();
    private int l = 1;
    public final AtomicReference f = new AtomicReference(yaz.UNKNOWN);
    public final AtomicReference g = new AtomicReference(yaz.UNKNOWN);

    public ybj(ykp ykpVar, anen anenVar, akbm akbmVar, ybm ybmVar, Consumer consumer, int i) {
        this.k = ykpVar.a(i);
        this.h = anenVar;
        this.i = akbmVar;
        this.c = ybmVar;
        this.b = consumer;
        this.d = i;
    }

    private final void e() {
        this.k.registerTelephonyCallback(this.h, this.j);
        this.l = 3;
        ((alwl) a.m().h("com/google/android/apps/messaging/shared/util/connectivity/NetworkStateMonitorSPlusServiceState", "registerTelephonyCallback", 143, "NetworkStateMonitorSPlusServiceState.java")).r("NetworkStateMonitorSPlusServiceState registered for subId %d.", this.d);
    }

    @Override // defpackage.yba
    public final yaz a() {
        return (yaz) this.f.get();
    }

    @Override // defpackage.yba
    public final void b() {
        synchronized (this.e) {
            int i = this.l;
            int i2 = i - 1;
            if (i != 0) {
                if (i2 != 0) {
                    if (i2 != 1) {
                        if (i2 != 2) {
                            if (i2 == 3) {
                                e();
                            }
                        } else {
                            ((alwl) a.m().h("com/google/android/apps/messaging/shared/util/connectivity/NetworkStateMonitorSPlusServiceState", "startMonitoring", 93, "NetworkStateMonitorSPlusServiceState.java")).r("NetworkStateMonitorSPlusServiceState has already been registered for subId %d.", this.d);
                        }
                    } else {
                        ((alwl) a.m().h("com/google/android/apps/messaging/shared/util/connectivity/NetworkStateMonitorSPlusServiceState", "startMonitoring", 87, "NetworkStateMonitorSPlusServiceState.java")).r("NetworkStateMonitorSPlusServiceState is being registered asynchronously for subId %d.", this.d);
                    }
                } else {
                    this.l = 2;
                    this.j = new ybi(new ybf(this, 2));
                    e();
                }
            } else {
                throw null;
            }
        }
    }

    @Override // defpackage.yba
    public final void c() {
        synchronized (this.e) {
            int i = this.l;
            int i2 = i - 1;
            if (i != 0) {
                if (i2 != 0) {
                    if (i2 != 1) {
                        if (i2 != 2) {
                            if (i2 != 3) {
                            }
                        } else {
                            d();
                        }
                    } else {
                        this.i.post(new ybh(this, 0));
                    }
                }
                ((alwl) a.m().h("com/google/android/apps/messaging/shared/util/connectivity/NetworkStateMonitorSPlusServiceState", "stopMonitoring", 116, "NetworkStateMonitorSPlusServiceState.java")).r("NetworkStateMonitorSPlusServiceState isn't registered for subId %d.", this.d);
            } else {
                throw null;
            }
        }
    }

    public final void d() {
        this.k.unregisterTelephonyCallback(this.j);
        this.l = 4;
        this.f.set(yaz.UNKNOWN);
        ((alwl) a.m().h("com/google/android/apps/messaging/shared/util/connectivity/NetworkStateMonitorSPlusServiceState", "unregisterTelephonyCallback", 153, "NetworkStateMonitorSPlusServiceState.java")).r("NetworkStateMonitorSPlusServiceState unregistered for subId %d.", this.d);
    }
}
