package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public enum vkf implements apak {
    NAT_UNKNOWN(0),
    NAT_TEST(1),
    NAT_DIRECTOR(2),
    NAT_MARK_AS_READ(3),
    NAT_COPY_OTP(4),
    NAT_QUICK_REPLY(5),
    NAT_REMINDER(6),
    NAT_DOWNLOAD_MMS(7),
    NAT_NON_TEXT_SMART_ACTION(8),
    NAT_TEXT_CLASSIFIER_ACTION(9),
    NAT_WEARABLE_CALL(10),
    NAT_WEARABLE_OPEN_CONVERSATION(11),
    NAT_WEARABLE_QUICK_REPLY(12),
    NAT_ASK_PARENT_FOR_APPROVAL(13);

    public final int o;

    vkf(int i) {
        this.o = i;
    }

    public static vkf b(int i) {
        switch (i) {
            case 0:
                return NAT_UNKNOWN;
            case 1:
                return NAT_TEST;
            case 2:
                return NAT_DIRECTOR;
            case 3:
                return NAT_MARK_AS_READ;
            case 4:
                return NAT_COPY_OTP;
            case 5:
                return NAT_QUICK_REPLY;
            case 6:
                return NAT_REMINDER;
            case 7:
                return NAT_DOWNLOAD_MMS;
            case 8:
                return NAT_NON_TEXT_SMART_ACTION;
            case 9:
                return NAT_TEXT_CLASSIFIER_ACTION;
            case 10:
                return NAT_WEARABLE_CALL;
            case 11:
                return NAT_WEARABLE_OPEN_CONVERSATION;
            case 12:
                return NAT_WEARABLE_QUICK_REPLY;
            case 13:
                return NAT_ASK_PARENT_FOR_APPROVAL;
            default:
                return null;
        }
    }

    @Override // defpackage.apak
    public final int a() {
        return this.o;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.o);
    }
}
