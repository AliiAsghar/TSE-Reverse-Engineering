package defpackage;

import android.os.Handler;
import android.os.Message;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hxm implements Handler.Callback {
    private final /* synthetic */ int a;

    public hxm(int i) {
        this.a = i;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        if (this.a != 0) {
            if (message.what != 1) {
                return false;
            }
            ((hpt) message.obj).e();
            return true;
        }
        if (message.what != 1) {
            return false;
        }
        hxn hxnVar = (hxn) message.obj;
        hxnVar.a.j(hxnVar);
        return true;
    }
}
