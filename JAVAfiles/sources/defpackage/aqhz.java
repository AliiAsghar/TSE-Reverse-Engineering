package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aqhz extends apag implements apbu {
    public static final aqhz a;
    private static volatile apca c;
    public apao b = emptyIntList();

    static {
        aqhz aqhzVar = new aqhz();
        a = aqhzVar;
        apag.registerDefaultInstance(aqhz.class, aqhzVar);
    }

    private aqhz() {
    }

    @Override // defpackage.apag
    protected final Object dynamicMethod(apaf apafVar, Object obj, Object obj2) {
        switch (apafVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001'", new Object[]{"b"});
            case NEW_MUTABLE_INSTANCE:
                return new aqhz();
            case NEW_BUILDER:
                return new aozy((char[][][]) null);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                apca apcaVar = c;
                if (apcaVar == null) {
                    synchronized (aqhz.class) {
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
