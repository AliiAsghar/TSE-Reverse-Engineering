package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class wrn extends apag implements apbu {
    public static final wrn a;
    private static volatile apca g;
    public int b;
    public int c = 0;
    public Object d;
    public wrd e;
    public apct f;

    static {
        wrn wrnVar = new wrn();
        a = wrnVar;
        apag.registerDefaultInstance(wrn.class, wrnVar);
    }

    private wrn() {
    }

    @Override // defpackage.apag
    protected final Object dynamicMethod(apaf apafVar, Object obj, Object obj2) {
        switch (apafVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0000\u0003\u0001\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002<\u0000\u0003ဉ\u0001", new Object[]{"d", "c", "b", "e", wre.class, "f"});
            case NEW_MUTABLE_INSTANCE:
                return new wrn();
            case NEW_BUILDER:
                return new aozy(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                apca apcaVar = g;
                if (apcaVar == null) {
                    synchronized (wrn.class) {
                        apcaVar = g;
                        if (apcaVar == null) {
                            apcaVar = new aozz(a);
                            g = apcaVar;
                        }
                    }
                }
                return apcaVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
