package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ahup extends apag implements apbu {
    public static final ahup a;
    private static volatile apca c;
    public apbo b = apbo.a;

    static {
        ahup ahupVar = new ahup();
        a = ahupVar;
        apag.registerDefaultInstance(ahup.class, ahupVar);
    }

    private ahup() {
    }

    @Override // defpackage.apag
    protected final Object dynamicMethod(apaf apafVar, Object obj, Object obj2) {
        switch (apafVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0004\u0001\u0000\u0000\u0002\u0002\u0001\u0001\u0000\u0000\u00022", new Object[]{"b", ahuo.a});
            case NEW_MUTABLE_INSTANCE:
                return new ahup();
            case NEW_BUILDER:
                return new aozy(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                apca apcaVar = c;
                if (apcaVar == null) {
                    synchronized (ahup.class) {
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
