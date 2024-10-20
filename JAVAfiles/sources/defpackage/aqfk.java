package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aqfk extends apag implements apbu {
    public static final apap a = new aqcx(2);
    public static final aqfk b;
    private static volatile apca d;
    public apao c = emptyIntList();

    static {
        aqfk aqfkVar = new aqfk();
        b = aqfkVar;
        apag.registerDefaultInstance(aqfk.class, aqfkVar);
    }

    private aqfk() {
    }

    @Override // defpackage.apag
    protected final Object dynamicMethod(apaf apafVar, Object obj, Object obj2) {
        switch (apafVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001,", new Object[]{"c"});
            case NEW_MUTABLE_INSTANCE:
                return new aqfk();
            case NEW_BUILDER:
                return new aozy((short[]) null);
            case GET_DEFAULT_INSTANCE:
                return b;
            case GET_PARSER:
                apca apcaVar = d;
                if (apcaVar == null) {
                    synchronized (aqfk.class) {
                        apcaVar = d;
                        if (apcaVar == null) {
                            apcaVar = new aozz(b);
                            d = apcaVar;
                        }
                    }
                }
                return apcaVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
