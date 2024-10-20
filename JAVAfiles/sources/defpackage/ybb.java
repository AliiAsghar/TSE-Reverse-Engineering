package defpackage;

import android.telephony.PhoneStateListener;
import android.telephony.ServiceState;
import java.util.concurrent.Executor;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class ybb extends PhoneStateListener {
    final /* synthetic */ Consumer a;
    final /* synthetic */ ybd b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ybb(ybd ybdVar, Executor executor, Consumer consumer) {
        super(executor);
        this.a = consumer;
        this.b = ybdVar;
    }

    @Override // android.telephony.PhoneStateListener
    public final void onServiceStateChanged(ServiceState serviceState) {
        akrc b = this.b.c.b("onServiceStateChanged");
        try {
            Consumer consumer = this.a;
            ybd ybdVar = this.b;
            consumer.accept(ybdVar.e.a(serviceState, ybdVar.f));
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
