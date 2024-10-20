package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public enum ameg implements apak {
    BUGLE_ADVANCED_FEEDBACK_DATA_TYPE_UNKNOWN(0),
    BUGLE_ADVANCED_FEEDBACK_DATA_TYPE_MESSAGES_STATUS_HISTORY(1),
    BUGLE_ADVANCED_FEEDBACK_DATA_TYPE_PROBLEMATIC_MESSAGES_ADVANCED_INFO(2),
    BUGLE_ADVANCED_FEEDBACK_DATA_TYPE_SELF_PHONE_NUMBER(3),
    BUGLE_ADVANCED_FEEDBACK_DATA_TYPE_UNREDACTED_PHONE_NUMBERS(4),
    BUGLE_ADVANCED_FEEDBACK_DATA_TYPE_LOCATION(5);

    public final int g;

    ameg(int i) {
        this.g = i;
    }

    @Override // defpackage.apak
    public final int a() {
        return this.g;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.g);
    }
}
