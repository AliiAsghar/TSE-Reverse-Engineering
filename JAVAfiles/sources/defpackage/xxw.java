package defpackage;

import j$.util.Collection;

/* compiled from: PG */
/* loaded from: classes3.dex */
public enum xxw {
    UNKNOWN,
    SCHEDULED_BY_BATCH_BACKUP,
    EXECUTING_VIA_BATCH_BACKUP,
    SUCCEED_VIA_BATCH_BACKUP,
    FAILED_VIA_BATCH_BACKUP,
    SCHEDULED_BY_INITIAL_BACKUP,
    EXECUTING_VIA_INITIAL_BACKUP,
    SUCCEED_VIA_INITIAL_BACKUP,
    FAILED_VIA_INITIAL_BACKUP,
    SCHEDULED_BY_INCREMENTAL_BACKUP,
    EXECUTING_VIA_INCREMENTAL_BACKUP,
    SUCCEED_VIA_INCREMENTAL_BACKUP,
    FAILED_VIA_INCREMENTAL_BACKUP,
    RESTORED_FROM_TELEPHONY,
    RESTORED_FROM_CMS,
    MERGED_FROM_CMS,
    CMS_RESTORE_FAILED,
    CMS_RESTORE_IN_PROGRESS,
    SKIPPED_VIA_BATCH_BACKUP,
    SKIPPED_VIA_INITIAL_BACKUP,
    SKIPPED_VIA_INCREMENTAL_BACKUP,
    EXCLUDED;

    public static final alpt A;
    private static final alpt B;
    public static final alpt w;
    public static final alpt x;
    public static final alpt y;
    public static final alpt z;

    static {
        xxw xxwVar = UNKNOWN;
        xxw xxwVar2 = SCHEDULED_BY_BATCH_BACKUP;
        xxw xxwVar3 = FAILED_VIA_BATCH_BACKUP;
        xxw xxwVar4 = SCHEDULED_BY_INITIAL_BACKUP;
        xxw xxwVar5 = FAILED_VIA_INITIAL_BACKUP;
        xxw xxwVar6 = SCHEDULED_BY_INCREMENTAL_BACKUP;
        xxw xxwVar7 = FAILED_VIA_INCREMENTAL_BACKUP;
        xxw xxwVar8 = RESTORED_FROM_TELEPHONY;
        xxw xxwVar9 = RESTORED_FROM_CMS;
        xxw xxwVar10 = MERGED_FROM_CMS;
        xxw xxwVar11 = CMS_RESTORE_FAILED;
        xxw xxwVar12 = CMS_RESTORE_IN_PROGRESS;
        xxw xxwVar13 = SKIPPED_VIA_BATCH_BACKUP;
        xxw xxwVar14 = SKIPPED_VIA_INITIAL_BACKUP;
        xxw xxwVar15 = SKIPPED_VIA_INCREMENTAL_BACKUP;
        xxw xxwVar16 = EXCLUDED;
        w = alpt.r(xxwVar, xxwVar8);
        x = alpt.t(xxwVar11, xxwVar12, xxwVar10, xxwVar9);
        alpt v = alpt.v(xxwVar, xxwVar2, xxwVar3, xxwVar4, xxwVar5, xxwVar6, xxwVar7, xxwVar8, xxwVar13, xxwVar15, xxwVar14, xxwVar16);
        y = v;
        z = alpt.v(xxwVar, xxwVar2, xxwVar3, xxwVar4, xxwVar5, xxwVar6, xxwVar7, xxwVar12, xxwVar8, xxwVar16);
        A = alpt.v(xxwVar, xxwVar2, xxwVar3, xxwVar4, xxwVar5, xxwVar6, xxwVar7, xxwVar12, xxwVar8);
        alpr alprVar = new alpr();
        alprVar.j(v);
        alprVar.c(xxwVar12);
        B = alprVar.g();
    }

    public static Integer[] a() {
        return (Integer[]) Collection.EL.stream(B).map(new xos(19)).sorted().toArray(new mlo(17));
    }
}
