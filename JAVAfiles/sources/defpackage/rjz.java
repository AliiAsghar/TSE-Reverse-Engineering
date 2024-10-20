package defpackage;

import j$.time.Duration;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class rjz {
    public static final alvi a = alvi.m("com/google/android/apps/messaging/shared/datamodel/backup/analytics/BackupEventLogger");
    public final arwe b;
    private final armf c;

    public rjz(armf armfVar, arwe arweVar) {
        armfVar.getClass();
        arweVar.getClass();
        this.c = armfVar;
        this.b = arweVar;
    }

    public static final int b(int i, Duration duration) {
        if (duration.toMillis() == 0) {
            return 0;
        }
        double millis = (i / duration.toMillis()) * 1000.0d;
        if (millis < 0.0d) {
            return Integer.MAX_VALUE;
        }
        return (int) millis;
    }

    public final void a(amfq amfqVar) {
        mar a2 = ((mbb) this.c.b()).a();
        a2.e(amrs.BACKUP_WORKFLOW_EVENT);
        a2.b(amfqVar, mbt.LOG_SPEC_BACKUP_WORKFLOW_EVENTS);
    }
}
