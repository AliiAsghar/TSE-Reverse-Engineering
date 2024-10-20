package defpackage;

import android.telephony.PhoneStateListener;
import android.telephony.ServiceState;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ybc extends PhoneStateListener {
    final /* synthetic */ Consumer a;
    public final /* synthetic */ ybd b;

    public ybc(ybd ybdVar, Consumer consumer) {
        this.a = consumer;
        this.b = ybdVar;
    }

    @Override // android.telephony.PhoneStateListener
    public final void onServiceStateChanged(ServiceState serviceState) {
        akrc b = this.b.c.b("onServiceStateChanged");
        try {
            qiu.h(aktp.ah(new vri((Object) this, (Object) this.a, (Object) serviceState, 17, (byte[]) null), this.b.b));
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
