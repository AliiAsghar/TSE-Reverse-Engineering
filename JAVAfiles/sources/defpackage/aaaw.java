package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aaaw extends apag implements apbu {
    public static final aaaw a;
    private static volatile apca c;
    public apbo b = apbo.a;

    static {
        aaaw aaawVar = new aaaw();
        a = aaawVar;
        apag.registerDefaultInstance(aaaw.class, aaawVar);
    }

    private aaaw() {
    }

    @Override // defpackage.apag
    protected final Object dynamicMethod(apaf apafVar, Object obj, Object obj2) {
        switch (apafVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012", new Object[]{"b", aaav.a});
            case NEW_MUTABLE_INSTANCE:
                return new aaaw();
            case NEW_BUILDER:
                return new aozy(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                apca apcaVar = c;
                if (apcaVar == null) {
                    synchronized (aaaw.class) {
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
