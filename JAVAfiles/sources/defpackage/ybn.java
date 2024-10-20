package defpackage;

import android.telephony.PhoneStateListener;
import android.telephony.ServiceState;
import android.telephony.SignalStrength;
import java.util.concurrent.Executor;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class ybn extends PhoneStateListener {
    final /* synthetic */ Consumer a;
    final /* synthetic */ ybq b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ybn(ybq ybqVar, Executor executor, Consumer consumer) {
        super(executor);
        this.a = consumer;
        this.b = ybqVar;
    }

    @Override // android.telephony.PhoneStateListener
    public final void onServiceStateChanged(ServiceState serviceState) {
        akrc b = this.b.d.b("onServiceStateChanged");
        try {
            this.a.accept(serviceState);
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
            this.a.accept(signalStrength);
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
