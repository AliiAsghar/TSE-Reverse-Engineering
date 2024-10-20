package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aocx extends apag implements apbu {
    public static final aocx a;
    private static volatile apca f;
    public apao b = emptyIntList();
    public apao c = emptyIntList();
    public apao d = emptyIntList();
    public apao e = emptyIntList();

    static {
        aocx aocxVar = new aocx();
        a = aocxVar;
        apag.registerDefaultInstance(aocx.class, aocxVar);
    }

    private aocx() {
    }

    @Override // defpackage.apag
    protected final Object dynamicMethod(apaf apafVar, Object obj, Object obj2) {
        switch (apafVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0004\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0004\u0000\u0001'\u0002'\u0003'\u0004'", new Object[]{"b", "c", "d", "e"});
            case NEW_MUTABLE_INSTANCE:
                return new aocx();
            case NEW_BUILDER:
                return new aozy(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                apca apcaVar = f;
                if (apcaVar == null) {
                    synchronized (aocx.class) {
                        apcaVar = f;
                        if (apcaVar == null) {
                            apcaVar = new aozz(a);
                            f = apcaVar;
                        }
                    }
                }
                return apcaVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
