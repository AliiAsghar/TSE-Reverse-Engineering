package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public enum qig implements apak {
    INITIAL_SYNC_STATUS_NOT_SET(0),
    RESTORE(1),
    BACKUP(2),
    RESTORE_KEYS(3),
    FAILED(4),
    INITIAL_BACKUP_NEEDS_RETRY(5),
    RESTORE_MESSAGES_COMPLETE(6),
    STARTED(7),
    COMPLETE(100);

    private final int k;

    qig(int i) {
        this.k = i;
    }

    public static qig b(int i) {
        if (i != 100) {
            switch (i) {
                case 0:
                    return INITIAL_SYNC_STATUS_NOT_SET;
                case 1:
                    return RESTORE;
                case 2:
                    return BACKUP;
                case 3:
                    return RESTORE_KEYS;
                case 4:
                    return FAILED;
                case 5:
                    return INITIAL_BACKUP_NEEDS_RETRY;
                case 6:
                    return RESTORE_MESSAGES_COMPLETE;
                case 7:
                    return STARTED;
                default:
                    return null;
            }
        }
        return COMPLETE;
    }

    @Override // defpackage.apak
    public final int a() {
        return this.k;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.k);
    }
}
