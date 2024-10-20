package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public enum amra implements apak {
    UNKNOWN_TRIGGER(0),
    PERIODIC_JOB_BASED_ON_TELEPHONY(1),
    RECEIVE_SMS_MESSAGE_HELPER(2),
    PROCESS_DOWNLOADED_MMS_ACTION_THREAD_DATA_RECIPIENTS(3),
    PROCESS_DOWNLOADED_MMS_ACTION_TELEPHONY_MANAGER_ADDRESSES(4),
    PROCESS_DOWNLOADED_MMS_ACTION_MESSAGE_RECIPIENTS(11),
    RECEIVE_MMS_MESSAGE_USE_SENDER_RAW(5),
    RECEIVE_MMS_MESSAGE_USE_SENDER_NORMALIZED(6),
    RECEIVE_MMS_MESSAGE_USE_THREAD_DATA_RECIPIENTS(7),
    RECEIVE_RCS_MESSAGE_ONE_ON_ONE(8),
    RECEIVE_RCS_MESSAGE_ONE_ON_ONE_LEGACY(9),
    RECEIVE_RCS_MESSAGE_ONE_ON_ONE_ALTOGETHER(10),
    GET_OR_CREATE_THREAD_ID_FOR_CONVERSATION(12);

    public final int n;

    amra(int i) {
        this.n = i;
    }

    @Override // defpackage.apak
    public final int a() {
        return this.n;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.n);
    }
}
