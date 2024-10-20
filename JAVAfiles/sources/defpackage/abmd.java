package defpackage;

import android.content.Context;
import android.os.Handler;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class abmd {
    public static final apuv a = new apuv("GoogleSignInCommon", new String[0]);

    public static void a(Context context) {
        abme.a(context).b();
        Iterator it = abrg.a().iterator();
        if (!it.hasNext()) {
            synchronized (abso.c) {
                abso absoVar = abso.d;
                if (absoVar != null) {
                    absoVar.k.incrementAndGet();
                    Handler handler = absoVar.o;
                    handler.sendMessageAtFrontOfQueue(handler.obtainMessage(10));
                }
            }
            return;
        }
        throw new UnsupportedOperationException();
    }
}
