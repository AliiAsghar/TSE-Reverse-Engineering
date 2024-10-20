package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class wgg extends apag implements apbu {
    public static final wgg a;
    private static volatile apca f;
    public int b;
    public apct c;
    public apct d;
    public int e;

    static {
        wgg wggVar = new wgg();
        a = wggVar;
        apag.registerDefaultInstance(wgg.class, wggVar);
    }

    private wgg() {
    }

    @Override // defpackage.apag
    protected final Object dynamicMethod(apaf apafVar, Object obj, Object obj2) {
        switch (apafVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဌ\u0002\u0003ဉ\u0001", new Object[]{"b", "c", "e", "d"});
            case NEW_MUTABLE_INSTANCE:
                return new wgg();
            case NEW_BUILDER:
                return new aozy(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                apca apcaVar = f;
                if (apcaVar == null) {
                    synchronized (wgg.class) {
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
