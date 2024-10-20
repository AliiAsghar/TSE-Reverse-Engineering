package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class mbg extends apag implements apbu {
    public static final mbg a;
    private static volatile apca d;
    public int b = 0;
    public Object c;

    static {
        mbg mbgVar = new mbg();
        a = mbgVar;
        apag.registerDefaultInstance(mbg.class, mbgVar);
    }

    private mbg() {
    }

    @Override // defpackage.apag
    protected final Object dynamicMethod(apaf apafVar, Object obj, Object obj2) {
        switch (apafVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\u0002\u0001\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u083f\u0000\u0002\u083f\u0000", new Object[]{"c", "b", amff.k, amqk.s});
            case NEW_MUTABLE_INSTANCE:
                return new mbg();
            case NEW_BUILDER:
                return new aozy(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                apca apcaVar = d;
                if (apcaVar == null) {
                    synchronized (mbg.class) {
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
