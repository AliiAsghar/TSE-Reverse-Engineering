package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aprp extends apag implements apbu {
    public static final aprp a;
    private static volatile apca d;
    public apao b = emptyIntList();
    public apqi c;
    private int e;

    static {
        aprp aprpVar = new aprp();
        a = aprpVar;
        apag.registerDefaultInstance(aprp.class, aprpVar);
    }

    private aprp() {
    }

    @Override // defpackage.apag
    protected final Object dynamicMethod(apaf apafVar, Object obj, Object obj2) {
        switch (apafVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001'\u0002ဉ\u0000", new Object[]{"e", "b", "c"});
            case NEW_MUTABLE_INSTANCE:
                return new aprp();
            case NEW_BUILDER:
                return new aozy(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                apca apcaVar = d;
                if (apcaVar == null) {
                    synchronized (aprp.class) {
                        apcaVar = d;
                        if (apcaVar == null) {
                            apcaVar = new aozz(a);
                            d = apcaVar;
                        }
                    }
                }
                return apcaVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
