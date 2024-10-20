package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aqfr extends apag implements apbu {
    public static final aqfr a;
    private static volatile apca e;
    public int b;
    public aozb c = aozb.b;
    public aozb d = aozb.b;

    static {
        aqfr aqfrVar = new aqfr();
        a = aqfrVar;
        apag.registerDefaultInstance(aqfr.class, aqfrVar);
    }

    private aqfr() {
    }

    @Override // defpackage.apag
    protected final Object dynamicMethod(apaf apafVar, Object obj, Object obj2) {
        switch (apafVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u0004\u0002\n\u0003\n", new Object[]{"b", "c", "d"});
            case NEW_MUTABLE_INSTANCE:
                return new aqfr();
            case NEW_BUILDER:
                return new aozy(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                apca apcaVar = e;
                if (apcaVar == null) {
                    synchronized (aqfr.class) {
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
