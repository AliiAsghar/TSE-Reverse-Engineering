package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class asht extends apag implements apbu {
    public static final asht a;
    private static volatile apca i;
    public int b;
    public int e;
    public int h;
    public String c = "";
    public String d = "";
    public String f = "";
    public String g = "";

    static {
        asht ashtVar = new asht();
        a = ashtVar;
        apag.registerDefaultInstance(asht.class, ashtVar);
    }

    private asht() {
    }

    @Override // defpackage.apag
    protected final Object dynamicMethod(apaf apafVar, Object obj, Object obj2) {
        switch (apafVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0004\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003᠌\u0002\u0004ဈ\u0003\u0005ဈ\u0004\u0006᠌\u0005", new Object[]{"b", "c", "d", "e", apwb.q, "f", "g", "h", amwm.f});
            case NEW_MUTABLE_INSTANCE:
                return new asht();
            case NEW_BUILDER:
                return new aozy(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                apca apcaVar = i;
                if (apcaVar == null) {
                    synchronized (asht.class) {
                        apcaVar = i;
                        if (apcaVar == null) {
                            apcaVar = new aozz(a);
                            i = apcaVar;
                        }
                    }
                }
                return apcaVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
