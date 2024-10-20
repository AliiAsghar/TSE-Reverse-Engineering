package defpackage;

import android.telephony.ServiceState;
import android.telephony.TelephonyCallback;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class ybi extends TelephonyCallback implements TelephonyCallback.ServiceStateListener {
    private final Consumer a;

    public ybi(Consumer consumer) {
        this.a = consumer;
    }

    public final void onServiceStateChanged(ServiceState serviceState) {
        this.a.accept(serviceState);
    }
}
