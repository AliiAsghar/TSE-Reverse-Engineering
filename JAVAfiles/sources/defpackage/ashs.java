package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ashs extends apag implements apbu {
    public static final ashs a;
    private static volatile apca h;
    public int b;
    public int e;
    public String c = "";
    public String d = "";
    public String f = "";
    public String g = "";

    static {
        ashs ashsVar = new ashs();
        a = ashsVar;
        apag.registerDefaultInstance(ashs.class, ashsVar);
    }

    private ashs() {
    }

    @Override // defpackage.apag
    protected final Object dynamicMethod(apaf apafVar, Object obj, Object obj2) {
        switch (apafVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0004\u0005\u0000\u0001\u0003\u0007\u0005\u0000\u0000\u0000\u0003ဈ\u0002\u0004ဈ\u0003\u0005᠌\u0004\u0006ဈ\u0005\u0007ဈ\u0006", new Object[]{"b", "c", "d", "e", apwb.q, "f", "g"});
            case NEW_MUTABLE_INSTANCE:
                return new ashs();
            case NEW_BUILDER:
                return new aozy(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                apca apcaVar = h;
                if (apcaVar == null) {
                    synchronized (ashs.class) {
                        apcaVar = h;
                        if (apcaVar == null) {
                            apcaVar = new aozz(a);
                            h = apcaVar;
                        }
                    }
                }
                return apcaVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
