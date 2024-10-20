package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ymb extends apag implements apbu {
    public static final apap a = new qex(9);
    public static final apap b = new qex(10);
    public static final ymb c;
    private static volatile apca h;
    public apax d = apag.emptyProtobufList();
    public apax e = apag.emptyProtobufList();
    public apao f = emptyIntList();
    public apao g = emptyIntList();

    static {
        ymb ymbVar = new ymb();
        c = ymbVar;
        apag.registerDefaultInstance(ymb.class, ymbVar);
    }

    private ymb() {
    }

    @Override // defpackage.apag
    protected final Object dynamicMethod(apaf apafVar, Object obj, Object obj2) {
        switch (apafVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(c, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0004\u0000\u0001Ț\u0002Ț\u0003,\u0004,", new Object[]{"d", "e", "f", "g"});
            case NEW_MUTABLE_INSTANCE:
                return new ymb();
            case NEW_BUILDER:
                return new aozy(c);
            case GET_DEFAULT_INSTANCE:
                return c;
            case GET_PARSER:
                apca apcaVar = h;
                if (apcaVar == null) {
                    synchronized (ymb.class) {
                        apcaVar = h;
                        if (apcaVar == null) {
                            apcaVar = new aozz(c);
                            h = apcaVar;
                        }
                    }
                }
                return apcaVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
