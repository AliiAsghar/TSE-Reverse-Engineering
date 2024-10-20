package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public enum amlq implements apak {
    UNSPECIFIED_STAGE(0),
    RESTORE(1),
    RESTORE_BACKUP_KEY(2),
    RESTORE_ENCRYPTION_KEY(3),
    RESTORE_PARTICIPANT(4),
    RESTORE_CONVERSATION(5),
    RESTORE_MESSAGE(6),
    BLOCK_ON_INITIAL_BACKUP_PRECONDITIONS(8),
    BACKUP(7),
    OPTIMIZED_RESTORE(9),
    OPTIMIZED_RESTORE_BACKUP_KEY(10),
    OPTIMIZED_RESTORE_ENCRYPTION_KEY(11),
    OPTIMIZED_RESTORE_PARTICIPANT(12),
    OPTIMIZED_RESTORE_CONVERSATION(13),
    OPTIMIZED_RESTORE_MESSAGE(14),
    OPTIMIZED_BACKUP(17),
    MEDIA_BACKUP(15),
    MEDIA_RESTORE(16);

    private final int t;

    amlq(int i) {
        this.t = i;
    }

    @Override // defpackage.apak
    public final int a() {
        return this.t;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.t);
    }
}
