package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aoti extends apag implements apbu {
    public static final aoti a;
    private static volatile apca d;
    public aozb b = aozb.b;
    public aozb c = aozb.b;

    static {
        aoti aotiVar = new aoti();
        a = aotiVar;
        apag.registerDefaultInstance(aoti.class, aotiVar);
    }

    private aoti() {
    }

    @Override // defpackage.apag
    protected final Object dynamicMethod(apaf apafVar, Object obj, Object obj2) {
        switch (apafVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\n\u0002\n", new Object[]{"b", "c"});
            case NEW_MUTABLE_INSTANCE:
                return new aoti();
            case NEW_BUILDER:
                return new aozy(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                apca apcaVar = d;
                if (apcaVar == null) {
                    synchronized (aoti.class) {
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
