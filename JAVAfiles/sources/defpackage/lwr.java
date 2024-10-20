package defpackage;

import com.android.vcard.VCardConstants;

/* compiled from: PG */
/* loaded from: classes2.dex */
public enum lwr implements apak {
    UNKNOWN(0),
    CREATED(1),
    DATABASE_RESTORING(2),
    ATTACHMENTS_RESTORING(3),
    WAITING_ON_APP_UPDATE(4),
    WAITING_ON_APP_UPDATE_INITIAL_PROMPT_SHOWN(5),
    WAITING_FOR_APP_UPDATE_READY_FOR_REPROMPT(6),
    DATABASE_RESTORE_COMPLETE(7),
    STALLED(8),
    COMPLETE_SUCCESS(100),
    COMPLETE_FAILED(101),
    INCOMPLETE(102),
    CLEARED(103),
    COMPLETE_FAILED_APP_UPDATE(104),
    AUTOMATICALLY_CLOSED_EXPIRED(105);

    public final int p;

    lwr(int i) {
        this.p = i;
    }

    public static lwr b(int i) {
        switch (i) {
            case 0:
                return UNKNOWN;
            case 1:
                return CREATED;
            case 2:
                return DATABASE_RESTORING;
            case 3:
                return ATTACHMENTS_RESTORING;
            case 4:
                return WAITING_ON_APP_UPDATE;
            case 5:
                return WAITING_ON_APP_UPDATE_INITIAL_PROMPT_SHOWN;
            case 6:
                return WAITING_FOR_APP_UPDATE_READY_FOR_REPROMPT;
            case 7:
                return DATABASE_RESTORE_COMPLETE;
            case 8:
                return STALLED;
            default:
                switch (i) {
                    case VCardConstants.DEFAULT_PREF /* 100 */:
                        return COMPLETE_SUCCESS;
                    case 101:
                        return COMPLETE_FAILED;
                    case 102:
                        return INCOMPLETE;
                    case 103:
                        return CLEARED;
                    case 104:
                        return COMPLETE_FAILED_APP_UPDATE;
                    case 105:
                        return AUTOMATICALLY_CLOSED_EXPIRED;
                    default:
                        return null;
                }
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
