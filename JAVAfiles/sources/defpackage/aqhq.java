package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aqhq extends apag implements apbu {
    public static final aqhq a;
    private static volatile apca f;
    public int b;
    public int c;
    public String d = "";
    public apef e;

    static {
        aqhq aqhqVar = new aqhq();
        a = aqhqVar;
        apag.registerDefaultInstance(aqhq.class, aqhqVar);
    }

    private aqhq() {
    }

    @Override // defpackage.apag
    protected final Object dynamicMethod(apaf apafVar, Object obj, Object obj2) {
        switch (apafVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0000\u0003\u0000\u0001\u0002\u0005\u0003\u0000\u0000\u0000\u0002\f\u0004Ȉ\u0005ဉ\u0001", new Object[]{"b", "c", "d", "e"});
            case NEW_MUTABLE_INSTANCE:
                return new aqhq();
            case NEW_BUILDER:
                return new aozy(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                apca apcaVar = f;
                if (apcaVar == null) {
                    synchronized (aqhq.class) {
                        apcaVar = f;
                        if (apcaVar == null) {
                            apcaVar = new aozz(a);
                            f = apcaVar;
                        }
                    }
                }
                return apcaVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
