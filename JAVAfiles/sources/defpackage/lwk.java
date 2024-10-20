package defpackage;

import java.io.File;
import java.util.UUID;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class lwk implements lva {
    private static final alvi a = alvi.m("com/google/android/apps/messaging/restore/impl/StubbedRestoreWorkflowSteps");

    @Override // defpackage.lva
    public final int a() {
        return Integer.MIN_VALUE;
    }

    @Override // defpackage.lva
    public final Object b(UUID uuid, lwr lwrVar, arpe arpeVar) {
        alvw g = a.g();
        g.X(alwp.a, "BugleBackup");
        ((alvg) g.h("com/google/android/apps/messaging/restore/impl/StubbedRestoreWorkflowSteps", "completeRestore", 64, "StubbedRestoreWorkflowSteps.kt")).t("completeRestore called [%s]", uuid);
        return arnb.a;
    }

    @Override // defpackage.lva
    public final Object c(UUID uuid, arpe arpeVar) {
        alvw g = a.g();
        g.X(alwp.a, "BugleBackup");
        ((alvg) g.h("com/google/android/apps/messaging/restore/impl/StubbedRestoreWorkflowSteps", "doAttachmentRestore", 72, "StubbedRestoreWorkflowSteps.kt")).t("doAttachmentRestore called [%s]", uuid);
        return arnb.a;
    }

    @Override // defpackage.lva
    public final Object d(UUID uuid, arpe arpeVar) {
        alvw g = a.g();
        g.X(alwp.a, "BugleBackup");
        ((alvg) g.h("com/google/android/apps/messaging/restore/impl/StubbedRestoreWorkflowSteps", "doBugleDbRestore", 68, "StubbedRestoreWorkflowSteps.kt")).t("doBugleDbRestore called [%s]", uuid);
        return arnb.a;
    }

    @Override // defpackage.lva
    public final Object e(UUID uuid, lwr lwrVar, arpe arpeVar) {
        alvw g = a.g();
        g.X(alwp.a, "BugleBackup");
        ((alvg) g.h("com/google/android/apps/messaging/restore/impl/StubbedRestoreWorkflowSteps", "doCompleteRestore", 76, "StubbedRestoreWorkflowSteps.kt")).t("doCompleteRestore called [%s]", uuid);
        return arnb.a;
    }

    @Override // defpackage.lva
    public final Object f(UUID uuid, lwz lwzVar, arpe arpeVar) {
        alvw g = a.g();
        g.X(alwp.a, "BugleBackup");
        ((alvg) g.h("com/google/android/apps/messaging/restore/impl/StubbedRestoreWorkflowSteps", "initializeRestore", 35, "StubbedRestoreWorkflowSteps.kt")).D("initializeRestore called for feature [%s] [%s]", lwzVar, uuid);
        return arnb.a;
    }

    @Override // defpackage.lva
    public final Object g(UUID uuid, File file, icg icgVar, arpe arpeVar) {
        alvw g = a.g();
        g.X(alwp.a, "BugleBackup");
        ((alvg) g.h("com/google/android/apps/messaging/restore/impl/StubbedRestoreWorkflowSteps", "requestAttachmentRestore", 55, "StubbedRestoreWorkflowSteps.kt")).J("restoreAttachment called with metadata [%s]\n%s\n%s", uuid, file, icgVar);
        return arnb.a;
    }

    @Override // defpackage.lva
    public final Object h(UUID uuid, File file, icl iclVar, arpe arpeVar) {
        alvw g = a.g();
        g.X(alwp.a, "BugleBackup");
        ((alvg) g.h("com/google/android/apps/messaging/restore/impl/StubbedRestoreWorkflowSteps", "requestBugleDbRestore", 45, "StubbedRestoreWorkflowSteps.kt")).J("restoreBugleDb called with metadata [%s]\n%s\n%s", uuid, file, iclVar);
        return arnb.a;
    }
}
