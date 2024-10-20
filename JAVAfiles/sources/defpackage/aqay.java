package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public enum aqay implements apak {
    UNKNOWN_REJECTION_REASON(0),
    INVALID_INPUT(1),
    LANGUAGE_MISMATCH(2),
    EXCEPTION_THROWN(3),
    IS_SENSITIVE(4),
    NO_CONFIDENT_SUGGESTIONS_FROM_MODEL(5),
    FILTERED_BY_STOPLIST(6),
    REMOVED_BY_RERANKER(7),
    NOT_REJECTED(8),
    SMART_REPLY_LIB_NOT_AVAILABLE(9),
    UNRECOGNIZED(-1);

    private final int m;

    aqay(int i) {
        this.m = i;
    }

    public static aqay b(int i) {
        switch (i) {
            case 0:
                return UNKNOWN_REJECTION_REASON;
            case 1:
                return INVALID_INPUT;
            case 2:
                return LANGUAGE_MISMATCH;
            case 3:
                return EXCEPTION_THROWN;
            case 4:
                return IS_SENSITIVE;
            case 5:
                return NO_CONFIDENT_SUGGESTIONS_FROM_MODEL;
            case 6:
                return FILTERED_BY_STOPLIST;
            case 7:
                return REMOVED_BY_RERANKER;
            case 8:
                return NOT_REJECTED;
            case 9:
                return SMART_REPLY_LIB_NOT_AVAILABLE;
            default:
                return null;
        }
    }

    @Override // defpackage.apak
    public final int a() {
        if (this != UNRECOGNIZED) {
            return this.m;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(a());
    }
}
