package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aocy extends apag implements apbu {
    public static final aocy a;
    private static volatile apca d;
    public int b;
    public aozb c = aozb.b;
    private int e;

    static {
        aocy aocyVar = new aocy();
        a = aocyVar;
        apag.registerDefaultInstance(aocy.class, aocyVar);
    }

    private aocy() {
    }

    @Override // defpackage.apag
    protected final Object dynamicMethod(apaf apafVar, Object obj, Object obj2) {
        switch (apafVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001᠌\u0000\u0002ည\u0001", new Object[]{"e", "b", anbb.g, "c"});
            case NEW_MUTABLE_INSTANCE:
                return new aocy();
            case NEW_BUILDER:
                return new aozy(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                apca apcaVar = d;
                if (apcaVar == null) {
                    synchronized (aocy.class) {
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
