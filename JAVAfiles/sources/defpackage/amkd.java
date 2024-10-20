package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public enum amkd implements apak {
    UNKNOWN(0),
    FIRST_CONVERSATION_OPEN(1),
    PERIODIC_REFRESH(2),
    NOT_INTENDED_RECIPIENT_RECEIPT(3),
    STALE_CONVERSATION_OPEN(4),
    RECEIVED_FIRST_ENCRYPTED_MESSAGE(5),
    RECEIVED_PLAINTEXT_DELIVERY_RECEIPT(6),
    RECEIVED_UNENCRYPTED_MESSAGE_IN_ENCRYPTED_CONVERSATION(7),
    DETAILS_PAGE_OPEN(8),
    CONTACT_PICKER_SELECT_CONTACT(9),
    DITTO_CONTACT_PICKER_SELECT_CONTACT(10),
    DITTO_SYNC(11);

    public final int m;

    amkd(int i) {
        this.m = i;
    }

    public static amkd b(int i) {
        switch (i) {
            case 0:
                return UNKNOWN;
            case 1:
                return FIRST_CONVERSATION_OPEN;
            case 2:
                return PERIODIC_REFRESH;
            case 3:
                return NOT_INTENDED_RECIPIENT_RECEIPT;
            case 4:
                return STALE_CONVERSATION_OPEN;
            case 5:
                return RECEIVED_FIRST_ENCRYPTED_MESSAGE;
            case 6:
                return RECEIVED_PLAINTEXT_DELIVERY_RECEIPT;
            case 7:
                return RECEIVED_UNENCRYPTED_MESSAGE_IN_ENCRYPTED_CONVERSATION;
            case 8:
                return DETAILS_PAGE_OPEN;
            case 9:
                return CONTACT_PICKER_SELECT_CONTACT;
            case 10:
                return DITTO_CONTACT_PICKER_SELECT_CONTACT;
            case 11:
                return DITTO_SYNC;
            default:
                return null;
        }
    }

    @Override // defpackage.apak
    public final int a() {
        return this.m;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.m);
    }
}
