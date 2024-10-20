package defpackage;

import android.net.Uri;
import com.google.android.apps.messaging.backup.g1.GoogleOneRestoreService;
import com.google.android.libraries.subscriptions.restore.IG1Restore;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class idq extends IG1Restore.Stub {
    final /* synthetic */ GoogleOneRestoreService a;

    public idq(GoogleOneRestoreService googleOneRestoreService) {
        this.a = googleOneRestoreService;
    }

    @Override // com.google.android.libraries.subscriptions.restore.IG1Restore
    public final int requestRestore(Uri uri, Uri uri2, Uri uri3) {
        this.a.c.c("Bugle.Backup.G1.RestoreIntent.Counts");
        try {
            int requestRestore = this.a.b.requestRestore(uri, uri2, uri3);
            if (requestRestore == 0) {
                this.a.c.c("Bugle.Backup.G1.RestoreSuccess.Counts");
                ((wzp) this.a.d.b()).k(amvm.GOOGLE_ONE_RESTORE);
                return 0;
            }
            return requestRestore;
        } catch (Exception e) {
            if (!(e instanceof SecurityException)) {
                alvw h = GoogleOneRestoreService.a.h();
                h.X(alwp.a, "BugleBackup");
                ((alvg) ((alvg) ((alvg) h).g(e)).h("com/google/android/apps/messaging/backup/g1/GoogleOneRestoreService$IG1RestoreWrapper", "requestRestore", 54, "GoogleOneRestoreService.java")).t("Error in restoring G1 backup:%s", e);
                return 1;
            }
            throw e;
        }
    }
}
