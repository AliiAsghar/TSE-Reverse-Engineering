package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public enum amvl implements apak {
    UNKNOWN(0),
    CANT_SYNC_WITH_TELEPHONY(1),
    SYNC_ALREADY_IN_PROGRESS(2),
    BUGLE_NOT_DEFAULT_SMS_APP(3),
    BATCH_IS_ORPHAN(4),
    BATCH_IS_DIRTY(5),
    CURSOR_SCAN_FAILED(6),
    MISSING_PERMISSIONS(7),
    FAILED_TO_UPDATE_FIRST_FULL_SYNC_TIMESTAMP(8),
    PARTIAL_SYNC_QUEUED(9),
    FULL_SYNC_DELAYED(10),
    FULL_SYNC_DO_NOT_START(11),
    WEAR_UTIL_IS_PRESENT(12),
    NOT_SMS_CAPABLE(13),
    SMS_NOT_ALLOWED_FOR_USER(14),
    SYNC_DISABLED(15),
    REDESIGN_DISABLED_DURING_EXECUTION(16),
    REDESIGN_ENABLED_DURING_EXECUTION(17),
    NON_SMS_CAPABLE_WEAR_DEVICE(18),
    DUPLICATE_TELEPHONY_MESSAGE_TIMESTAMP_FOUND(19),
    OLDER_MESSAGES_OUT_OF_SYNC_AFTER_RETRY(20),
    RECENT_MESSAGES_OUT_OF_SYNC_AFTER_RETRY(21),
    STALLED(22);

    public final int x;

    amvl(int i) {
        this.x = i;
    }

    @Override // defpackage.apak
    public final int a() {
        return this.x;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.x);
    }
}
