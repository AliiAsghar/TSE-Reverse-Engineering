package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public enum lwu {
    DATABASE_RESTORE(2),
    RESTORE_ATTACHMENT(3),
    NOTIFY_LISTENERS(4),
    FINALIZE_RESTORE(5),
    REFRESH_CONVERSATIONS(7),
    MESSAGESRESTOREWORKTYPE_NOT_SET(0);

    public final int g;

    lwu(int i) {
        this.g = i;
    }

    public static lwu a(int i) {
        if (i != 0) {
            if (i != 7) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            if (i != 5) {
                                return null;
                            }
                            return FINALIZE_RESTORE;
                        }
                        return NOTIFY_LISTENERS;
                    }
                    return RESTORE_ATTACHMENT;
                }
                return DATABASE_RESTORE;
            }
            return REFRESH_CONVERSATIONS;
        }
        return MESSAGESRESTOREWORKTYPE_NOT_SET;
    }
}
