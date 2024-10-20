package defpackage;

import android.telephony.TelephonyManager;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ybl implements yba {
    public static final alwo a = alwo.o("BugleConnectivity");
    public final Consumer b;
    public final int c;
    private final anen g;
    private final akbm h;
    private ybk i;
    private final TelephonyManager j;
    public final Object d = new Object();
    private int k = 1;
    public final AtomicReference e = new AtomicReference(yaz.UNKNOWN);
    public final AtomicReference f = new AtomicReference(yaz.UNKNOWN);

    public ybl(ykp ykpVar, anen anenVar, akbm akbmVar, Consumer consumer, int i) {
        this.j = ykpVar.a(i);
        this.g = anenVar;
        this.h = akbmVar;
        this.b = consumer;
        this.c = i;
    }

    private final void e() {
        this.j.registerTelephonyCallback(this.g, this.i);
        this.k = 3;
        ((alwl) a.m().h("com/google/android/apps/messaging/shared/util/connectivity/NetworkStateMonitorSSignalStrength", "registerTelephonyCallback", 138, "NetworkStateMonitorSSignalStrength.java")).r("NetworkStateMonitorSSignalStrength registered for subId %d.", this.c);
    }

    @Override // defpackage.yba
    public final yaz a() {
        return (yaz) this.e.get();
    }

    @Override // defpackage.yba
    public final void b() {
        synchronized (this.d) {
            int i = this.k;
            int i2 = i - 1;
            if (i != 0) {
                if (i2 != 0) {
                    if (i2 != 1) {
                        if (i2 != 2) {
                            if (i2 == 3) {
                                e();
                            }
                        } else {
                            ((alwl) a.m().h("com/google/android/apps/messaging/shared/util/connectivity/NetworkStateMonitorSSignalStrength", "startMonitoring", 88, "NetworkStateMonitorSSignalStrength.java")).r("NetworkStateMonitorSSignalStrength has already been registered for subId %d.", this.c);
                        }
                    } else {
                        ((alwl) a.m().h("com/google/android/apps/messaging/shared/util/connectivity/NetworkStateMonitorSSignalStrength", "startMonitoring", 83, "NetworkStateMonitorSSignalStrength.java")).r("NetworkStateMonitorSSignalStrength is being registered asynchronously for subId %d.", this.c);
                    }
                } else {
                    this.k = 2;
                    this.i = new ybk(new ybf(this, 3));
                    e();
                }
            } else {
                throw null;
            }
        }
    }

    @Override // defpackage.yba
    public final void c() {
        synchronized (this.d) {
            int i = this.k;
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
                        this.h.post(new ybh(this, 2));
                    }
                }
                ((alwl) a.m().h("com/google/android/apps/messaging/shared/util/connectivity/NetworkStateMonitorSSignalStrength", "stopMonitoring", 112, "NetworkStateMonitorSSignalStrength.java")).r("NetworkStateMonitorSSignalStrength isn't registered for subId %d.", this.c);
            } else {
                throw null;
            }
        }
    }

    public final void d() {
        this.j.unregisterTelephonyCallback(this.i);
        this.k = 4;
        this.e.set(yaz.UNKNOWN);
        ((alwl) a.m().h("com/google/android/apps/messaging/shared/util/connectivity/NetworkStateMonitorSSignalStrength", "unregisterTelephonyCallback", 148, "NetworkStateMonitorSSignalStrength.java")).r("NetworkStateMonitorSSignalStrength unregistered for subId %d.", this.c);
    }
}
