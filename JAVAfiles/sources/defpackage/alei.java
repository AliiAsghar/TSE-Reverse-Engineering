package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class alei extends apag implements apbu {
    public static final alei a;
    private static volatile apca d;
    public int c;
    public apbo b = apbo.a;
    private apbo e = apbo.a;

    static {
        alei aleiVar = new alei();
        a = aleiVar;
        apag.registerDefaultInstance(alei.class, aleiVar);
    }

    private alei() {
    }

    @Override // defpackage.apag
    protected final Object dynamicMethod(apaf apafVar, Object obj, Object obj2) {
        switch (apafVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0000\u0003\u0000\u0000\u0002\u0005\u0003\u0002\u0000\u0000\u00022\u0003\u000b\u00052", new Object[]{"b", aleh.a, "c", "e", aleg.a});
            case NEW_MUTABLE_INSTANCE:
                return new alei();
            case NEW_BUILDER:
                return new aozy(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                apca apcaVar = d;
                if (apcaVar == null) {
                    synchronized (alei.class) {
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
