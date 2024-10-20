package defpackage;

import j$.time.Duration;
import java.util.UUID;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class lvx {
    public static final alvi a = alvi.m("com/google/android/apps/messaging/restore/impl/BasicRestoreWorkflowStepsEventLoggers");
    public final armf b;
    private final xnv c;
    private final arwe d;

    public lvx(armf armfVar, xnv xnvVar, arwe arweVar) {
        armfVar.getClass();
        xnvVar.getClass();
        arweVar.getClass();
        this.b = armfVar;
        this.c = xnvVar;
        this.d = arweVar;
    }

    public static /* synthetic */ void b(lvx lvxVar, amxr amxrVar, UUID uuid, int i, int i2, int i3, lwz lwzVar, Duration duration, int i4) {
        lwz lwzVar2;
        int i5;
        int i6;
        int i7;
        if ((i4 & 32) != 0) {
            lwzVar2 = lwz.UNDEFINED;
        } else {
            lwzVar2 = lwzVar;
        }
        int i8 = i4 & 8;
        int i9 = i4 & 4;
        if ((i4 & 16) != 0) {
            i5 = 0;
        } else {
            i5 = i3;
        }
        if (i8 != 0) {
            i6 = 0;
        } else {
            i6 = i2;
        }
        if (i9 != 0) {
            i7 = 0;
        } else {
            i7 = i;
        }
        lvxVar.a(amxrVar, uuid, i7, i6, i5, lwzVar2, duration, null);
    }

    public static /* synthetic */ void c(lvx lvxVar, amxr amxrVar, UUID uuid, Duration duration, amxp amxpVar, int i) {
        lwz lwzVar;
        amxp amxpVar2;
        if ((i & 64) != 0) {
            lwzVar = lwz.UNDEFINED;
        } else {
            lwzVar = null;
        }
        if ((i & 128) != 0) {
            amxpVar2 = null;
        } else {
            amxpVar2 = amxpVar;
        }
        amxrVar.getClass();
        uuid.getClass();
        duration.getClass();
        lwzVar.getClass();
        Duration minus = Duration.ofMillis(lvxVar.c.a()).minus(duration);
        minus.getClass();
        lvxVar.a(amxrVar, uuid, 0, 0, 0, lwzVar, minus, amxpVar2);
    }

    public static /* synthetic */ Duration d(lvx lvxVar, amxr amxrVar, UUID uuid, Integer num, int i) {
        lwz lwzVar;
        Integer num2;
        if ((i & 4) != 0) {
            lwzVar = lwz.UNDEFINED;
        } else {
            lwzVar = null;
        }
        if ((i & 8) != 0) {
            num2 = null;
        } else {
            num2 = num;
        }
        amxrVar.getClass();
        uuid.getClass();
        lwzVar.getClass();
        try {
            lve lveVar = (lve) lvxVar.b.b();
            qjh.l(lveVar.c, null, new lvd(lveVar, amxrVar, uuid, lwzVar, num2, (arpe) null, 0), 3);
        } catch (Exception e) {
            alvw i2 = a.i();
            i2.X(alwp.a, "BugleBackup");
            ((alvg) ((alvg) i2).g(e).h("com/google/android/apps/messaging/restore/impl/BasicRestoreWorkflowStepsEventLoggers", "logStartEvent$third_party_java_src_android_app_bugle_phone_java_com_google_android_apps_messaging_restore_impl_basic_restore_workflow_steps_logger_AUTO_DEPS_ORIGINAL", 37, "BasicRestoreWorkflowStepsEventLoggers.kt")).t("Failed to log start event for: %s", amxrVar);
        }
        Duration ofMillis = Duration.ofMillis(lvxVar.c.a());
        ofMillis.getClass();
        return ofMillis;
    }

    public static /* synthetic */ void e(lvx lvxVar, amxr amxrVar, int i, UUID uuid) {
        lwz lwzVar = lwz.UNDEFINED;
        amxrVar.getClass();
        lwzVar.getClass();
        qjh.l(lvxVar.d, null, new lvw(lvxVar, amxrVar, uuid, i, lwzVar, (arpe) null, 0), 3);
    }

    public final void a(amxr amxrVar, UUID uuid, int i, int i2, int i3, lwz lwzVar, Duration duration, amxp amxpVar) {
        amxrVar.getClass();
        uuid.getClass();
        lwzVar.getClass();
        qjh.l(this.d, null, new lvv(this, amxrVar, uuid, duration, i, i2, i3, lwzVar, amxpVar, null), 3);
    }
}
