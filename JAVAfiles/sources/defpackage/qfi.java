package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class qfi extends apag implements apbu {
    public static final qfi a;
    private static volatile apca g;
    public int b;
    public int c;
    public qfm d;
    public qei e;
    public String f = "";

    static {
        qfi qfiVar = new qfi();
        a = qfiVar;
        apag.registerDefaultInstance(qfi.class, qfiVar);
    }

    private qfi() {
    }

    @Override // defpackage.apag
    protected final Object dynamicMethod(apaf apafVar, Object obj, Object obj2) {
        switch (apafVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001᠌\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဈ\u0003", new Object[]{"b", "c", hzn.r, "d", "e", "f"});
            case NEW_MUTABLE_INSTANCE:
                return new qfi();
            case NEW_BUILDER:
                return new aozy(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                apca apcaVar = g;
                if (apcaVar == null) {
                    synchronized (qfi.class) {
                        apcaVar = g;
                        if (apcaVar == null) {
                            apcaVar = new aozz(a);
                            g = apcaVar;
                        }
                    }
                }
                return apcaVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
