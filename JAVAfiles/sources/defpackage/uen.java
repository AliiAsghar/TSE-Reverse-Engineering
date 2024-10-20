package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class uen extends apag implements apbu {
    public static final uen a;
    private static volatile apca b;

    static {
        uen uenVar = new uen();
        a = uenVar;
        apag.registerDefaultInstance(uen.class, uenVar);
    }

    private uen() {
        emptyProtobufList();
    }

    @Override // defpackage.apag
    protected final Object dynamicMethod(apaf apafVar, Object obj, Object obj2) {
        switch (apafVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\u0000", null);
            case NEW_MUTABLE_INSTANCE:
                return new uen();
            case NEW_BUILDER:
                return new aozy(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                apca apcaVar = b;
                if (apcaVar == null) {
                    synchronized (uen.class) {
                        apcaVar = b;
                        if (apcaVar == null) {
                            apcaVar = new aozz(a);
                            b = apcaVar;
                        }
                    }
                }
                return apcaVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
