package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aoua extends apag implements apbu {
    public static final aoua a;
    private static volatile apca d;
    public apax b = emptyProtobufList();
    public apao c = emptyIntList();

    static {
        aoua aouaVar = new aoua();
        a = aouaVar;
        apag.registerDefaultInstance(aoua.class, aouaVar);
    }

    private aoua() {
    }

    @Override // defpackage.apag
    protected final Object dynamicMethod(apaf apafVar, Object obj, Object obj2) {
        switch (apafVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0002\u0000\u0001\u001b\u0002+", new Object[]{"b", aotw.class, "c"});
            case NEW_MUTABLE_INSTANCE:
                return new aoua();
            case NEW_BUILDER:
                return new aozy(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                apca apcaVar = d;
                if (apcaVar == null) {
                    synchronized (aoua.class) {
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
