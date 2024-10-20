package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class acda extends Handler {
    public acda() {
        Looper.getMainLooper();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void a(Message message) {
        super.dispatchMessage(message);
    }

    @Override // android.os.Handler
    public final void dispatchMessage(Message message) {
        a(message);
    }

    public acda(Looper looper) {
        super(looper);
        Looper.getMainLooper();
    }

    public acda(Looper looper, Handler.Callback callback) {
        super(looper, callback);
        Looper.getMainLooper();
    }
}
