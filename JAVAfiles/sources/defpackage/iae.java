package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class iae extends apag implements apbu {
    public static final iae a;
    private static volatile apca e;
    public int b;
    public boolean c;
    public int d;

    static {
        iae iaeVar = new iae();
        a = iaeVar;
        apag.registerDefaultInstance(iae.class, iaeVar);
    }

    private iae() {
        aozb aozbVar = aozb.b;
    }

    @Override // defpackage.apag
    protected final Object dynamicMethod(apaf apafVar, Object obj, Object obj2) {
        switch (apafVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0004\u0002\u0000\u0001\u0001\u0003\u0002\u0000\u0000\u0000\u0001ဇ\u0000\u0003᠌\u0001", new Object[]{"b", "c", "d", hzn.c});
            case NEW_MUTABLE_INSTANCE:
                return new iae();
            case NEW_BUILDER:
                return new aozy(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                apca apcaVar = e;
                if (apcaVar == null) {
                    synchronized (iae.class) {
                        apcaVar = e;
                        if (apcaVar == null) {
                            apcaVar = new aozz(a);
                            e = apcaVar;
                        }
                    }
                }
                return apcaVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
