package defpackage;

import com.google.android.apps.messaging.backup.BugleBackupAgent;
import java.nio.charset.Charset;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ick implements yjx {
    final /* synthetic */ Charset a;
    final /* synthetic */ alok b;
    final /* synthetic */ BugleBackupAgent c;

    public ick(BugleBackupAgent bugleBackupAgent, Charset charset, alok alokVar) {
        this.a = charset;
        this.b = alokVar;
        this.c = bugleBackupAgent;
    }

    @Override // defpackage.yjx
    public final boolean a(int i) {
        String y = this.c.c.h(i).y();
        if (y == null) {
            alvw i2 = BugleBackupAgent.a.i();
            i2.X(alwp.a, "BugleBackup");
            ((alvg) ((alvg) i2).h("com/google/android/apps/messaging/backup/BugleBackupAgent$1", "callForSubscription", 755, "BugleBackupAgent.java")).r("SIM ICCID for active subscription ID %d is null. Skipping.", i);
            return true;
        }
        int i3 = ambp.a;
        String ambjVar = ambn.a.c(y, this.a).toString();
        alvw d = BugleBackupAgent.a.d();
        d.X(alwp.a, "BugleBackup");
        ((alvg) ((alvg) d).h("com/google/android/apps/messaging/backup/BugleBackupAgent$1", "callForSubscription", 765, "BugleBackupAgent.java")).J("SIM ICCID for active subscription ID %d is \"%s\" (SHA-256: %s).", Integer.valueOf(i), y, yyb.bh(ambjVar));
        this.b.h(this.c.h.x(i).a(), "bugleuniqsub_".concat(ambjVar));
        return true;
    }
}
