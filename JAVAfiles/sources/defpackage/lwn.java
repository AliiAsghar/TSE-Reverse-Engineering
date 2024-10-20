package defpackage;

import java.util.UUID;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class lwn implements lul {
    private static final alvi a = alvi.m("com/google/android/apps/messaging/restore/listeners/ScheduleIncrementalReverseSyncListener");
    private final vyv b;

    public lwn(vyv vyvVar) {
        vyvVar.getClass();
        this.b = vyvVar;
    }

    @Override // defpackage.lul
    public final akrh a() {
        return aktp.e("ScheduleIncrementalReverseSyncListener::onRestoreCompleted");
    }

    @Override // defpackage.lul
    public final void b(luk lukVar) {
        alvi alviVar = a;
        alvw g = alviVar.g();
        g.X(alwp.a, "BugleBackup");
        alvg alvgVar = (alvg) g.h("com/google/android/apps/messaging/restore/listeners/ScheduleIncrementalReverseSyncListener", "onRestoreCompleted", 40, "ScheduleIncrementalReverseSyncListener.kt");
        UUID uuid = lukVar.a;
        alvgVar.t("Restore completed - scheduling incremental reverse sync [%s]", uuid);
        this.b.R(uuid);
        alvw g2 = alviVar.g();
        g2.X(alwp.a, "BugleBackup");
        ((alvg) g2.h("com/google/android/apps/messaging/restore/listeners/ScheduleIncrementalReverseSyncListener", "onRestoreCompleted", 42, "ScheduleIncrementalReverseSyncListener.kt")).t("Scheduled incremental reverse sync [%s]", uuid);
    }
}
