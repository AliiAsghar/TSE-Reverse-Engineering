package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aqho extends apag implements apbu {
    public static final aqho a;
    private static volatile apca d;
    public int b;
    public String c = "";

    static {
        aqho aqhoVar = new aqho();
        a = aqhoVar;
        apag.registerDefaultInstance(aqho.class, aqhoVar);
    }

    private aqho() {
    }

    @Override // defpackage.apag
    protected final Object dynamicMethod(apaf apafVar, Object obj, Object obj2) {
        switch (apafVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0000\u0002\u0000\u0000\u0002\u0003\u0002\u0000\u0000\u0000\u0002\f\u0003Ȉ", new Object[]{"b", "c"});
            case NEW_MUTABLE_INSTANCE:
                return new aqho();
            case NEW_BUILDER:
                return new aozy(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                apca apcaVar = d;
                if (apcaVar == null) {
                    synchronized (aqho.class) {
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
