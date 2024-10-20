package defpackage;

import android.os.Looper;
import android.os.Message;
import android.util.Log;
import android.util.Pair;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class absd extends acda {
    public absd() {
        super(Looper.getMainLooper());
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        int i = message.what;
        if (i != 1) {
            if (i != 2) {
                Log.wtf("BasePendingResult", "Don't know how to handle message: " + message.what, new Exception());
                return;
            }
            ((BasePendingResult) message.obj).h(Status.d);
            return;
        }
        Pair pair = (Pair) message.obj;
        abrm abrmVar = (abrm) pair.second;
        try {
            throw null;
        } catch (RuntimeException e) {
            BasePendingResult.i(abrmVar);
            throw e;
        }
    }

    public absd(Looper looper) {
        super(looper);
    }
}
