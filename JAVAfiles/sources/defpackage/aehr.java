package defpackage;

import android.content.Context;
import androidx.work.WorkerParameters;
import com.google.android.libraries.communications.mobileconfiguration.sync.CleanupWorker;
import com.google.android.libraries.communications.mobileconfiguration.sync.SyncWorker;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aehr extends gto {
    private final aehq a;

    public aehr(aehq aehqVar) {
        this.a = aehqVar;
    }

    @Override // defpackage.gto
    public final gsx a(Context context, String str, WorkerParameters workerParameters) {
        if (str.equals(SyncWorker.class.getName())) {
            return new SyncWorker(context, workerParameters);
        }
        if (str.equals(CleanupWorker.class.getName())) {
            return new CleanupWorker(context, workerParameters, this.a);
        }
        return null;
    }
}
