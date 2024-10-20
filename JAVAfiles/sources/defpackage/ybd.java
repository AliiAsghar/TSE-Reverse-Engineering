package defpackage;

import android.telephony.PhoneStateListener;
import android.telephony.TelephonyManager;
import com.google.android.ims.rcsservice.businessinfo.BasePaymentResult;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ybd implements yba {
    public static final alwo a = alwo.o("BugleConnectivity");
    public final anen b;
    public final aksr c;
    public final Consumer d;
    public final ybm e;
    public final int f;
    public PhoneStateListener h;
    private final akbm k;
    private final TelephonyManager l;
    public final Object g = new Object();
    private int m = 1;
    public final AtomicReference i = new AtomicReference(yaz.UNKNOWN);
    public final AtomicReference j = new AtomicReference(yaz.UNKNOWN);

    public ybd(ykp ykpVar, anen anenVar, akbm akbmVar, aksr aksrVar, ybm ybmVar, Consumer consumer, int i) {
        this.l = ykpVar.a(i);
        this.b = anenVar;
        this.k = akbmVar;
        this.c = aksrVar;
        this.e = ybmVar;
        this.d = consumer;
        this.f = i;
    }

    @Override // defpackage.yba
    public final yaz a() {
        return (yaz) this.i.get();
    }

    @Override // defpackage.yba
    public final void b() {
        synchronized (this.g) {
            int i = this.m;
            int i2 = i - 1;
            if (i != 0) {
                if (i2 != 0) {
                    if (i2 != 1) {
                        if (i2 != 2) {
                            if (i2 == 3) {
                                d();
                            }
                        } else {
                            ((alwl) a.m().h("com/google/android/apps/messaging/shared/util/connectivity/NetworkStateMonitorLThroughRServiceState", "startMonitoring", 107, "NetworkStateMonitorLThroughRServiceState.java")).r("NetworkStateMonitorLThroughRServiceState has already been registered for subId %d.", this.f);
                        }
                    } else {
                        ((alwl) a.m().h("com/google/android/apps/messaging/shared/util/connectivity/NetworkStateMonitorLThroughRServiceState", "startMonitoring", 101, "NetworkStateMonitorLThroughRServiceState.java")).r("NetworkStateMonitorLThroughRServiceState is being registered asynchronously for subId %d.", this.f);
                    }
                } else {
                    this.m = 2;
                    int i3 = 20;
                    if (yhx.c) {
                        this.h = new ybb(this, this.b, new xpw(this, i3));
                        d();
                    } else {
                        this.k.post(new wuo(this, i3));
                    }
                }
            } else {
                throw null;
            }
        }
    }

    @Override // defpackage.yba
    public final void c() {
        synchronized (this.g) {
            int i = this.m;
            int i2 = i - 1;
            if (i != 0) {
                if (i2 != 0) {
                    if (i2 != 1) {
                        if (i2 != 2) {
                            if (i2 != 3) {
                            }
                        } else {
                            e();
                        }
                    } else {
                        this.k.post(new wuo(this, 19));
                    }
                }
                ((alwl) a.m().h("com/google/android/apps/messaging/shared/util/connectivity/NetworkStateMonitorLThroughRServiceState", "stopMonitoring", 172, "NetworkStateMonitorLThroughRServiceState.java")).r("NetworkStateMonitorLThroughRServiceState isn't registered for subId %d.", this.f);
            } else {
                throw null;
            }
        }
    }

    public final void d() {
        this.l.listen(this.h, 1);
        this.m = 3;
        ((alwl) a.m().h("com/google/android/apps/messaging/shared/util/connectivity/NetworkStateMonitorLThroughRServiceState", "registerPhoneStateListener", 194, "NetworkStateMonitorLThroughRServiceState.java")).r("NetworkStateMonitorLThroughRServiceState registered for subId %d.", this.f);
    }

    public final void e() {
        this.l.listen(this.h, 0);
        this.m = 4;
        this.i.set(yaz.UNKNOWN);
        ((alwl) a.m().h("com/google/android/apps/messaging/shared/util/connectivity/NetworkStateMonitorLThroughRServiceState", "unregisterPhoneStateListener", BasePaymentResult.ERROR_BOT_DOMAIN_NOT_WHITELISTED, "NetworkStateMonitorLThroughRServiceState.java")).r("NetworkStateMonitorLThroughRServiceState unregistered for subId %d.", this.f);
    }
}
