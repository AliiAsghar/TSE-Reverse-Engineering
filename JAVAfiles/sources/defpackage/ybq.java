package defpackage;

import android.telephony.PhoneStateListener;
import android.telephony.TelephonyManager;
import android.util.ArrayMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ybq {
    public static final alwo a = alwo.o("BugleConnectivity");
    public final anen b;
    public final akbm c;
    public final aksr d;
    public final Object e = new Object();
    public final Map f = new ArrayMap();
    public final Map g = new ArrayMap();
    private final TelephonyManager h;

    public ybq(TelephonyManager telephonyManager, anen anenVar, akbm akbmVar, aksr aksrVar) {
        this.h = telephonyManager;
        this.b = anenVar;
        this.c = akbmVar;
        this.d = aksrVar;
    }

    public final void a() {
        PhoneStateListener phoneStateListener = (PhoneStateListener) this.f.get(1);
        phoneStateListener.getClass();
        this.h.listen(phoneStateListener, 1);
        this.g.put(1, ybp.REGISTERED);
        ((alwl) a.m().h("com/google/android/apps/messaging/shared/util/connectivity/PhoneStateListenerManager", "registerPhoneStateListener", 254, "PhoneStateListenerManager.java")).r("Listener registered for event: %d", 1);
    }
}
