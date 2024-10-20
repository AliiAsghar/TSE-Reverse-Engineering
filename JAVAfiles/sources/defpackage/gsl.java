package defpackage;

import android.content.Context;
import android.util.Log;
import androidx.work.WorkerParameters;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gsl extends gto {
    public final List a = new CopyOnWriteArrayList();

    @Override // defpackage.gto
    public final gsx a(Context context, String str, WorkerParameters workerParameters) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            try {
                gsx a = ((gto) it.next()).a(context, str, workerParameters);
                if (a != null) {
                    return a;
                }
            } catch (Throwable th) {
                gsy.a();
                Log.e(gsm.a, "Unable to instantiate a ListenableWorker (" + str + ')', th);
                throw th;
            }
        }
        return null;
    }
}
