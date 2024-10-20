package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aqci extends apag implements apbu {
    public static final aqci a;
    private static volatile apca d;
    public String b = "";
    public String c = "";

    static {
        aqci aqciVar = new aqci();
        a = aqciVar;
        apag.registerDefaultInstance(aqci.class, aqciVar);
    }

    private aqci() {
    }

    @Override // defpackage.apag
    protected final Object dynamicMethod(apaf apafVar, Object obj, Object obj2) {
        switch (apafVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0000\u0002\u0000\u0000\u0001\u0004\u0002\u0000\u0000\u0000\u0001Ȉ\u0004Ȉ", new Object[]{"b", "c"});
            case NEW_MUTABLE_INSTANCE:
                return new aqci();
            case NEW_BUILDER:
                return new aozy(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                apca apcaVar = d;
                if (apcaVar == null) {
                    synchronized (aqci.class) {
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
