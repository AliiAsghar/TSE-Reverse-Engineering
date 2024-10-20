package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aodb extends apag implements apbu {
    public static final aodb a;
    private static volatile apca e;
    public int b;
    public aoda c;
    public aodd d;

    static {
        aodb aodbVar = new aodb();
        a = aodbVar;
        apag.registerDefaultInstance(aodb.class, aodbVar);
    }

    private aodb() {
    }

    @Override // defpackage.apag
    protected final Object dynamicMethod(apaf apafVar, Object obj, Object obj2) {
        switch (apafVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0004\u0002\u0000\u0001\u0001\u0003\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0003ဉ\u0002", new Object[]{"b", "c", "d"});
            case NEW_MUTABLE_INSTANCE:
                return new aodb();
            case NEW_BUILDER:
                return new aozy(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                apca apcaVar = e;
                if (apcaVar == null) {
                    synchronized (aodb.class) {
                        apcaVar = e;
                        if (apcaVar == null) {
                            apcaVar = new aozz(a);
                            e = apcaVar;
                        }
                    }
                }
                return apcaVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
