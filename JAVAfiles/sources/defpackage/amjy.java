package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public enum amjy implements apak {
    UNKNOWN_REASON(0),
    FAILED_SUB_HAS_NO_RCS(1),
    FAILED_MESSAGE_TOO_LONG(2),
    FAILED_ATTACHMENT_COUNT_EXCEEDED(3),
    FAILED_SUBJECT_TOO_LONG(4),
    FAILED_QUERY_RCS_MAX_SIZE(5),
    FAILED_DOES_NOT_SUPPORT_FT_OVER_HTTP(6),
    FAILED_DOES_NOT_SUPPORT_VIDEO_CALL(7);

    public final int i;

    amjy(int i) {
        this.i = i;
    }

    public static amjy b(int i) {
        switch (i) {
            case 0:
                return UNKNOWN_REASON;
            case 1:
                return FAILED_SUB_HAS_NO_RCS;
            case 2:
                return FAILED_MESSAGE_TOO_LONG;
            case 3:
                return FAILED_ATTACHMENT_COUNT_EXCEEDED;
            case 4:
                return FAILED_SUBJECT_TOO_LONG;
            case 5:
                return FAILED_QUERY_RCS_MAX_SIZE;
            case 6:
                return FAILED_DOES_NOT_SUPPORT_FT_OVER_HTTP;
            case 7:
                return FAILED_DOES_NOT_SUPPORT_VIDEO_CALL;
            default:
                return null;
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
