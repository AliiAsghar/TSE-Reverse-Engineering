package defpackage;

import android.os.Handler;
import android.os.Message;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class ajlw implements Handler.Callback {
    final /* synthetic */ ajly a;

    public ajlw(ajly ajlyVar) {
        this.a = ajlyVar;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        if (message.what != 0) {
            return false;
        }
        ajly ajlyVar = this.a;
        ajlx ajlxVar = (ajlx) message.obj;
        synchronized (ajlyVar.a) {
            if (ajlyVar.c == ajlxVar || ajlyVar.d == ajlxVar) {
                ajlyVar.d(ajlxVar, 2);
            }
        }
        return true;
    }
}
