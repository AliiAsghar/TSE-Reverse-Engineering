package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class xku extends apag implements apbu {
    public static final xku a;
    private static volatile apca k;
    public int b;
    public xlb c;
    public apct d;
    public apct e;
    public apct f;
    public int g;
    public int h;
    public apct i;
    public boolean j;

    static {
        xku xkuVar = new xku();
        a = xkuVar;
        apag.registerDefaultInstance(xku.class, xkuVar);
    }

    private xku() {
    }

    @Override // defpackage.apag
    protected final Object dynamicMethod(apaf apafVar, Object obj, Object obj2) {
        switch (apafVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0000\b\u0000\u0001\u0001\b\b\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဉ\u0003\u0005\u0004\u0006\u0004\u0007ဉ\u0004\b\u0007", new Object[]{"b", "c", "d", "e", "f", "g", "h", "i", "j"});
            case NEW_MUTABLE_INSTANCE:
                return new xku();
            case NEW_BUILDER:
                return new aozy(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                apca apcaVar = k;
                if (apcaVar == null) {
                    synchronized (xku.class) {
                        apcaVar = k;
                        if (apcaVar == null) {
                            apcaVar = new aozz(a);
                            k = apcaVar;
                        }
                    }
                }
                return apcaVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
