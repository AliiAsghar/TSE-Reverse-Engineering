package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class abgu extends apag implements apbu {
    public static final abgu a;
    private static volatile apca f;
    public aozb b = aozb.b;
    public String c = "";
    public abhf d;
    public apct e;
    private int g;

    static {
        abgu abguVar = new abgu();
        a = abguVar;
        apag.registerDefaultInstance(abgu.class, abguVar);
    }

    private abgu() {
    }

    @Override // defpackage.apag
    protected final Object dynamicMethod(apaf apafVar, Object obj, Object obj2) {
        switch (apafVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0004\u0004\u0000\u0001\u0002\u0005\u0004\u0000\u0000\u0000\u0002ည\u0001\u0003ለ\u0002\u0004ဉ\u0003\u0005ဉ\u0004", new Object[]{"g", "b", "c", "d", "e"});
            case NEW_MUTABLE_INSTANCE:
                return new abgu();
            case NEW_BUILDER:
                return new aozy(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                apca apcaVar = f;
                if (apcaVar == null) {
                    synchronized (abgu.class) {
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
