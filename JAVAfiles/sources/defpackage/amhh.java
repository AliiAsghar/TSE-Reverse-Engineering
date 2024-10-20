package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public enum amhh implements apak {
    UNKNOWN_P2P_SUGGESTION_EVENT_TYPE(0),
    P2P_SUGGESTION_SENT_MESSAGE(1),
    P2P_SUGGESTION_REQUEST(2),
    P2P_SUGGESTION_CLICK(3),
    P2P_SUGGESTION_LONG_PRESS(6),
    P2P_SUGGESTION_RECEIVED_MESSAGE(4),
    P2P_SUGGESTION_FEEDBACK_BUTTON_CLICK(5),
    P2P_SUGGESTION_CALENDAR_EVENT_SAVED(8);

    public final int i;

    amhh(int i) {
        this.i = i;
    }

    public static amhh b(int i) {
        switch (i) {
            case 0:
                return UNKNOWN_P2P_SUGGESTION_EVENT_TYPE;
            case 1:
                return P2P_SUGGESTION_SENT_MESSAGE;
            case 2:
                return P2P_SUGGESTION_REQUEST;
            case 3:
                return P2P_SUGGESTION_CLICK;
            case 4:
                return P2P_SUGGESTION_RECEIVED_MESSAGE;
            case 5:
                return P2P_SUGGESTION_FEEDBACK_BUTTON_CLICK;
            case 6:
                return P2P_SUGGESTION_LONG_PRESS;
            case 7:
            default:
                return null;
            case 8:
                return P2P_SUGGESTION_CALENDAR_EVENT_SAVED;
        }
    }

    @Override // defpackage.apak
    public final int a() {
        return this.i;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.i);
    }
}
