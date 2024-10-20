package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class amqk implements apam {
    private final /* synthetic */ int v;
    static final apam u = new amqk(20);
    static final apam t = new amqk(19);
    public static final apam s = new amqk(18);
    static final apam r = new amqk(17);
    static final apam q = new amqk(16);
    static final apam p = new amqk(15);
    static final apam o = new amqk(14);
    static final apam n = new amqk(13);
    static final apam m = new amqk(12);
    static final apam l = new amqk(11);
    static final apam k = new amqk(10);
    static final apam j = new amqk(9);
    static final apam i = new amqk(8);
    static final apam h = new amqk(7);
    static final apam g = new amqk(6);
    static final apam f = new amqk(5);
    static final apam e = new amqk(4);
    static final apam d = new amqk(3);
    static final apam c = new amqk(2);
    static final apam b = new amqk(1);
    static final apam a = new amqk(0);

    private amqk(int i2) {
        this.v = i2;
    }

    @Override // defpackage.apam
    public final boolean a(int i2) {
        amra amraVar;
        switch (this.v) {
            case 0:
                if (a.W(i2) == 0) {
                    return false;
                }
                return true;
            case 1:
                return a.bg(i2);
            case 2:
                return a.bk(i2);
            case 3:
                return a.bj(i2);
            case 4:
                return a.aY(i2);
            case 5:
                return a.bf(i2);
            case 6:
                return a.bj(i2);
            case 7:
                return a.bf(i2);
            case 8:
                return a.aW(i2);
            case 9:
                return a.aW(i2);
            case 10:
                switch (i2) {
                    case 0:
                        amraVar = amra.UNKNOWN_TRIGGER;
                        break;
                    case 1:
                        amraVar = amra.PERIODIC_JOB_BASED_ON_TELEPHONY;
                        break;
                    case 2:
                        amraVar = amra.RECEIVE_SMS_MESSAGE_HELPER;
                        break;
                    case 3:
                        amraVar = amra.PROCESS_DOWNLOADED_MMS_ACTION_THREAD_DATA_RECIPIENTS;
                        break;
                    case 4:
                        amraVar = amra.PROCESS_DOWNLOADED_MMS_ACTION_TELEPHONY_MANAGER_ADDRESSES;
                        break;
                    case 5:
                        amraVar = amra.RECEIVE_MMS_MESSAGE_USE_SENDER_RAW;
                        break;
                    case 6:
                        amraVar = amra.RECEIVE_MMS_MESSAGE_USE_SENDER_NORMALIZED;
                        break;
                    case 7:
                        amraVar = amra.RECEIVE_MMS_MESSAGE_USE_THREAD_DATA_RECIPIENTS;
                        break;
                    case 8:
                        amraVar = amra.RECEIVE_RCS_MESSAGE_ONE_ON_ONE;
                        break;
                    case 9:
                        amraVar = amra.RECEIVE_RCS_MESSAGE_ONE_ON_ONE_LEGACY;
                        break;
                    case 10:
                        amraVar = amra.RECEIVE_RCS_MESSAGE_ONE_ON_ONE_ALTOGETHER;
                        break;
                    case 11:
                        amraVar = amra.PROCESS_DOWNLOADED_MMS_ACTION_MESSAGE_RECIPIENTS;
                        break;
                    case 12:
                        amraVar = amra.GET_OR_CREATE_THREAD_ID_FOR_CONVERSATION;
                        break;
                    default:
                        amraVar = null;
                        break;
                }
                if (amraVar == null) {
                    return false;
                }
                return true;
            case 11:
                return a.aY(i2);
            case 12:
                return a.bb(i2);
            case 13:
                return a.aY(i2);
            case 14:
                return a.aW(i2);
            case 15:
                if (a.aR(i2) == 0) {
                    return false;
                }
                return true;
            case 16:
                if (i2 != 0 && i2 != 1 && i2 != 2 && i2 != 3 && i2 != 4 && i2 != 5) {
                    return false;
                }
                return true;
            case 17:
                if (amrn.b(i2) == null) {
                    return false;
                }
                return true;
            case 18:
                if (amrs.b(i2) == null) {
                    return false;
                }
                return true;
            case 19:
                return a.aY(i2);
            default:
                return a.bb(i2);
        }
    }
}
