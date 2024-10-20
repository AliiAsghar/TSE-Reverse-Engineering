package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class mkr extends apag implements apbu {
    public static final mkr a;
    private static volatile apca d;
    public apax b = apag.emptyProtobufList();
    public boolean c;

    static {
        mkr mkrVar = new mkr();
        a = mkrVar;
        apag.registerDefaultInstance(mkr.class, mkrVar);
    }

    private mkr() {
    }

    @Override // defpackage.apag
    protected final Object dynamicMethod(apaf apafVar, Object obj, Object obj2) {
        switch (apafVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001Ț\u0002\u0007", new Object[]{"b", "c"});
            case NEW_MUTABLE_INSTANCE:
                return new mkr();
            case NEW_BUILDER:
                return new aozy(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                apca apcaVar = d;
                if (apcaVar == null) {
                    synchronized (mkr.class) {
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
