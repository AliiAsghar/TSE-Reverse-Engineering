package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class xig extends apag implements apbu {
    public static final xig a;
    private static volatile apca k;
    public int b;
    public apct c;
    public apct d;
    public apct e;
    public int f;
    public int g;
    public int h;
    public aozb i = aozb.b;
    public aozb j = aozb.b;

    static {
        xig xigVar = new xig();
        a = xigVar;
        apag.registerDefaultInstance(xig.class, xigVar);
    }

    private xig() {
    }

    @Override // defpackage.apag
    protected final Object dynamicMethod(apaf apafVar, Object obj, Object obj2) {
        switch (apafVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0000\b\u0000\u0001\u0001\b\b\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004\u0004\u0005\u0004\u0006\u0004\u0007\n\b\n", new Object[]{"b", "c", "d", "e", "f", "g", "h", "i", "j"});
            case NEW_MUTABLE_INSTANCE:
                return new xig();
            case NEW_BUILDER:
                return new aozy(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                apca apcaVar = k;
                if (apcaVar == null) {
                    synchronized (xig.class) {
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
