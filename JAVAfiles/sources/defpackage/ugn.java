package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ugn extends apag implements apbu {
    public static final ugn a;
    private static volatile apca d;
    public int b;
    public apax c = apag.emptyProtobufList();

    static {
        ugn ugnVar = new ugn();
        a = ugnVar;
        apag.registerDefaultInstance(ugn.class, ugnVar);
    }

    private ugn() {
    }

    @Override // defpackage.apag
    protected final Object dynamicMethod(apaf apafVar, Object obj, Object obj2) {
        switch (apafVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0000\u0002\u0000\u0000\u0001\u0004\u0002\u0000\u0001\u0000\u0001\u0004\u0004Ț", new Object[]{"b", "c"});
            case NEW_MUTABLE_INSTANCE:
                return new ugn();
            case NEW_BUILDER:
                return new aozy(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                apca apcaVar = d;
                if (apcaVar == null) {
                    synchronized (ugn.class) {
                        apcaVar = d;
                        if (apcaVar == null) {
                            apcaVar = new aozz(a);
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
