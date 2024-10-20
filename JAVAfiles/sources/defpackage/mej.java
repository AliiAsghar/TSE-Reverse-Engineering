package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public enum mej implements apak {
    EVENT_TYPE_UNKNOWN(0),
    BOOT_COMPLETE(1),
    PACKAGE_REPLACED(2),
    LOCALE_CHANGED(3),
    CONNECTIVITY_CHANGED(4),
    PHONE_STATE_CHANGED(5),
    TRIM_MEMORY(6),
    EXCEPTION(7),
    NO_CONNECTIVITY(8),
    RCS_EVENT(9),
    CONVERSATION_CREATED_EVENT(10),
    CONVERSATION_DELETED_EVENT(11),
    CONVERSATION_ARCHIVED_EVENT(12),
    RCS_ACTION(13),
    CONVERSATION_UNARCHIVED_EVENT(14);

    public final int p;

    mej(int i) {
        this.p = i;
    }

    public static mej b(int i) {
        switch (i) {
            case 0:
                return EVENT_TYPE_UNKNOWN;
            case 1:
                return BOOT_COMPLETE;
            case 2:
                return PACKAGE_REPLACED;
            case 3:
                return LOCALE_CHANGED;
            case 4:
                return CONNECTIVITY_CHANGED;
            case 5:
                return PHONE_STATE_CHANGED;
            case 6:
                return TRIM_MEMORY;
            case 7:
                return EXCEPTION;
            case 8:
                return NO_CONNECTIVITY;
            case 9:
                return RCS_EVENT;
            case 10:
                return CONVERSATION_CREATED_EVENT;
            case 11:
                return CONVERSATION_DELETED_EVENT;
            case 12:
                return CONVERSATION_ARCHIVED_EVENT;
            case 13:
                return RCS_ACTION;
            case 14:
                return CONVERSATION_UNARCHIVED_EVENT;
            default:
                return null;
        }
    }

    @Override // defpackage.apak
    public final int a() {
        return this.p;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.p);
    }
}
