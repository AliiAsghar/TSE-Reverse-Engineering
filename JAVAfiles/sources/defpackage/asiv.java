package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class asiv extends apag implements apbu {
    public static final asiv a;
    private static volatile apca d;
    public int b;
    public aozn c;

    static {
        asiv asivVar = new asiv();
        a = asivVar;
        apag.registerDefaultInstance(asiv.class, asivVar);
    }

    private asiv() {
    }

    @Override // defpackage.apag
    protected final Object dynamicMethod(apaf apafVar, Object obj, Object obj2) {
        switch (apafVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\u0001\u0000\u0001\u0003\u0003\u0001\u0000\u0000\u0000\u0003ဉ\u0000", new Object[]{"b", "c"});
            case NEW_MUTABLE_INSTANCE:
                return new asiv();
            case NEW_BUILDER:
                return new aozy(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                apca apcaVar = d;
                if (apcaVar == null) {
                    synchronized (asiv.class) {
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
