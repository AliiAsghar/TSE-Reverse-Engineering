package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class asgx extends apag implements apbu {
    public static final asgx a;
    private static volatile apca j;
    public int b;
    public atok c;
    public asgv d;
    public int e;
    public int f;
    public int g;
    public apct h;
    public asgw i;

    static {
        asgx asgxVar = new asgx();
        a = asgxVar;
        apag.registerDefaultInstance(asgx.class, asgxVar);
    }

    private asgx() {
    }

    @Override // defpackage.apag
    protected final Object dynamicMethod(apaf apafVar, Object obj, Object obj2) {
        switch (apafVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0004\u0007\u0000\u0001\u0001\u000b\u0007\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003\f\u0004\f\u0007ဉ\u0002\nဉ\u0005\u000b\f", new Object[]{"b", "c", "d", "e", "f", "h", "i", "g"});
            case NEW_MUTABLE_INSTANCE:
                return new asgx();
            case NEW_BUILDER:
                return new aozy(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                apca apcaVar = j;
                if (apcaVar == null) {
                    synchronized (asgx.class) {
                        apcaVar = j;
                        if (apcaVar == null) {
                            apcaVar = new aozz(a);
                            j = apcaVar;
                        }
                    }
                }
                return apcaVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
