package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class anhc extends apag implements apbu {
    public static final anhc a;
    private static volatile apca c;
    public apax b = emptyProtobufList();

    static {
        anhc anhcVar = new anhc();
        a = anhcVar;
        apag.registerDefaultInstance(anhc.class, anhcVar);
    }

    private anhc() {
    }

    @Override // defpackage.apag
    protected final Object dynamicMethod(apaf apafVar, Object obj, Object obj2) {
        switch (apafVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0004\u0001\u0000\u0000\u0002\u0002\u0001\u0000\u0001\u0000\u0002\u001b", new Object[]{"b", anhb.class});
            case NEW_MUTABLE_INSTANCE:
                return new anhc();
            case NEW_BUILDER:
                return new aozy(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                apca apcaVar = c;
                if (apcaVar == null) {
                    synchronized (anhc.class) {
                        apcaVar = c;
                        if (apcaVar == null) {
                            apcaVar = new aozz(a);
                            c = apcaVar;
                        }
                    }
                }
                return apcaVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
