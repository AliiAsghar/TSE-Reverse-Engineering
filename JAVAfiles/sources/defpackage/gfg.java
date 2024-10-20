package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class gfg extends Handler {
    final /* synthetic */ gfl a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gfg(gfl gflVar, Looper looper) {
        super(looper);
        this.a = gflVar;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        if (message.what != 1) {
            return;
        }
        this.a.fS();
    }
}
