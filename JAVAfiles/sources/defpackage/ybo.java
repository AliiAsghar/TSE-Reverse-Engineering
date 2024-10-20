package defpackage;

import android.telephony.PhoneStateListener;
import android.telephony.ServiceState;
import android.telephony.SignalStrength;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class ybo extends PhoneStateListener {
    public static final /* synthetic */ int c = 0;
    final /* synthetic */ Consumer a;
    final /* synthetic */ ybq b;

    public ybo(ybq ybqVar, Consumer consumer) {
        this.a = consumer;
        this.b = ybqVar;
    }

    @Override // android.telephony.PhoneStateListener
    public final void onServiceStateChanged(ServiceState serviceState) {
        akrc b = this.b.d.b("onServiceStateChanged");
        try {
            qjb.a(new yar(this.a, serviceState, 5), this.b.b);
            b.close();
        } catch (Throwable th) {
            try {
                b.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // android.telephony.PhoneStateListener
    public final void onSignalStrengthsChanged(SignalStrength signalStrength) {
        akrc b = this.b.d.b("onSignalStrengthsChanged");
        try {
            qjb.a(new yar(this.a, signalStrength, 4), this.b.b);
            b.close();
        } catch (Throwable th) {
            try {
                b.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }
}
