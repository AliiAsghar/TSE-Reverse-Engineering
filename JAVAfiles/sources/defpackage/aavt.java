package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aavt extends Handler {
    final /* synthetic */ aavu a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aavt(aavu aavuVar, Looper looper) {
        super(looper);
        this.a = aavuVar;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        if (message.what != 0) {
            return;
        }
        aavu aavuVar = this.a;
        xzb.l("Bugle", "Cancel autofocus.");
        ((aava) aavuVar.e).d(new aavc(1));
        aavuVar.d.removeMessages(0);
    }
}
