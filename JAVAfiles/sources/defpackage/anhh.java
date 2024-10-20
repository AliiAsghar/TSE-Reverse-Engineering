package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class anhh extends apag implements apbu {
    public static final apap a = new qex(17);
    public static final anhh b;
    private static volatile apca d;
    public apao c = emptyIntList();

    static {
        anhh anhhVar = new anhh();
        b = anhhVar;
        apag.registerDefaultInstance(anhh.class, anhhVar);
    }

    private anhh() {
        emptyIntList();
        aozb aozbVar = aozb.b;
    }

    @Override // defpackage.apag
    protected final Object dynamicMethod(apaf apafVar, Object obj, Object obj2) {
        switch (apafVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(b, "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001,", new Object[]{"c"});
            case NEW_MUTABLE_INSTANCE:
                return new anhh();
            case NEW_BUILDER:
                return new aozy(b);
            case GET_DEFAULT_INSTANCE:
                return b;
            case GET_PARSER:
                apca apcaVar = d;
                if (apcaVar == null) {
                    synchronized (anhh.class) {
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
