package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class amst extends apag implements apbu {
    public static final apap a = new qex(16);
    public static final amst b;
    private static volatile apca n;
    public int c;
    public long d;
    public int e;
    public int f;
    public int g;
    public int h;
    public apao i = emptyIntList();
    public int j;
    public int k;
    public amsr l;
    public int m;

    static {
        amst amstVar = new amst();
        b = amstVar;
        apag.registerDefaultInstance(amst.class, amstVar);
    }

    private amst() {
    }

    @Override // defpackage.apag
    protected final Object dynamicMethod(apaf apafVar, Object obj, Object obj2) {
        switch (apafVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(b, "\u0001\n\u0000\u0001\u0001\n\n\u0000\u0001\u0000\u0001ဂ\u0000\u0002᠌\u0001\u0003᠌\u0003\u0004᠌\u0004\u0005ࠞ\u0006᠌\u0005\u0007᠌\u0006\bဉ\u0007\t᠌\b\n᠌\u0002", new Object[]{"c", "d", "e", amsa.k, "g", amsa.m, "h", amsa.j, "i", amsa.l, "j", amsa.o, "k", amsa.i, "l", "m", amsa.h, "f", amsa.n});
            case NEW_MUTABLE_INSTANCE:
                return new amst();
            case NEW_BUILDER:
                return new aozy(b);
            case GET_DEFAULT_INSTANCE:
                return b;
            case GET_PARSER:
                apca apcaVar = n;
                if (apcaVar == null) {
                    synchronized (amst.class) {
                        apcaVar = n;
                        if (apcaVar == null) {
                            apcaVar = new aozz(b);
                            n = apcaVar;
                        }
                    }
                }
                return apcaVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
