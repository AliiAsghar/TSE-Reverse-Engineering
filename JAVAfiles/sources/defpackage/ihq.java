package defpackage;

import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ihq implements Function {
    public static final /* synthetic */ int a = 0;

    public static int a(xxw xxwVar) {
        xxw xxwVar2 = xxw.UNKNOWN;
        switch (xxwVar) {
            case UNKNOWN:
                return 1;
            case SCHEDULED_BY_BATCH_BACKUP:
                return 2;
            case EXECUTING_VIA_BATCH_BACKUP:
                return 3;
            case SUCCEED_VIA_BATCH_BACKUP:
                return 4;
            case FAILED_VIA_BATCH_BACKUP:
                return 5;
            case SCHEDULED_BY_INITIAL_BACKUP:
                return 6;
            case EXECUTING_VIA_INITIAL_BACKUP:
                return 7;
            case SUCCEED_VIA_INITIAL_BACKUP:
                return 8;
            case FAILED_VIA_INITIAL_BACKUP:
                return 9;
            case SCHEDULED_BY_INCREMENTAL_BACKUP:
                return 10;
            case EXECUTING_VIA_INCREMENTAL_BACKUP:
                return 11;
            case SUCCEED_VIA_INCREMENTAL_BACKUP:
                return 12;
            case FAILED_VIA_INCREMENTAL_BACKUP:
                return 13;
            case RESTORED_FROM_TELEPHONY:
                return 14;
            case RESTORED_FROM_CMS:
                return 15;
            case MERGED_FROM_CMS:
                return 16;
            case CMS_RESTORE_FAILED:
                return 17;
            case CMS_RESTORE_IN_PROGRESS:
                return 18;
            case SKIPPED_VIA_BATCH_BACKUP:
                return 19;
            case SKIPPED_VIA_INITIAL_BACKUP:
                return 20;
            case SKIPPED_VIA_INCREMENTAL_BACKUP:
                return 21;
            case EXCLUDED:
                return 22;
            default:
                throw new IllegalArgumentException("unknown enum value: ".concat(String.valueOf(String.valueOf(xxwVar))));
        }
    }

    @Override // java.util.function.Function
    /* renamed from: andThen */
    public final /* synthetic */ Function mo416andThen(Function function) {
        throw null;
    }

    @Override // java.util.function.Function
    public final /* synthetic */ Object apply(Object obj) {
        throw null;
    }

    public final /* synthetic */ Function compose(Function function) {
        throw null;
    }
}
