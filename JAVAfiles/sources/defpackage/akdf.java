package defpackage;

import androidx.work.WorkerParameters;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.Iterator;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class akdf implements akcq {
    public final armf a;
    private final ahiy b;

    public akdf(armf armfVar, ahiy ahiyVar) {
        this.a = armfVar;
        this.b = ahiyVar;
    }

    @Override // defpackage.akcy
    public final ListenableFuture a(WorkerParameters workerParameters) {
        return ((akcq) this.a.b()).a(workerParameters);
    }

    @Override // defpackage.akcq, defpackage.akcy
    public final ListenableFuture b(WorkerParameters workerParameters) {
        akrh e = aktp.e("NoAccountWorkerFactory startWork()");
        try {
            ahiy ahiyVar = this.b;
            ncx ncxVar = new ncx(this, e, workerParameters, 20, (byte[]) null);
            Set set = (Set) ((apxx) ahiyVar.a).a;
            alpr i = alpt.i(set.size());
            Iterator it = set.iterator();
            while (it.hasNext()) {
                i.c(new akpg((akcr) it.next(), 1));
            }
            ListenableFuture c = ((alhm) ahiyVar.c).c(ncxVar, i.g());
            e.close();
            return c;
        } catch (Throwable th) {
            try {
                e.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }
}
