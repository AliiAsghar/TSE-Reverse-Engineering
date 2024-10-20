package defpackage;

import android.os.AsyncTask;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes.dex */
final class acqm extends AsyncTask {
    final /* synthetic */ acqn a;

    public acqm(acqn acqnVar) {
        this.a = acqnVar;
    }

    @Override // android.os.AsyncTask
    protected final /* bridge */ /* synthetic */ Object doInBackground(Object[] objArr) {
        acqn acqnVar = this.a;
        synchronized (acqnVar.a) {
            Iterator it = acqnVar.a.iterator();
            while (it.hasNext()) {
                ((Runnable) it.next()).run();
            }
        }
        return null;
    }
}
