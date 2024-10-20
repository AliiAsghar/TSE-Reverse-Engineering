package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aqfu extends apag implements apbu {
    public static final aqfu a;
    private static volatile apca d;
    public int b;
    public aozb c = aozb.b;

    static {
        aqfu aqfuVar = new aqfu();
        a = aqfuVar;
        apag.registerDefaultInstance(aqfu.class, aqfuVar);
    }

    private aqfu() {
    }

    @Override // defpackage.apag
    protected final Object dynamicMethod(apaf apafVar, Object obj, Object obj2) {
        switch (apafVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\f\u0002\n", new Object[]{"b", "c"});
            case NEW_MUTABLE_INSTANCE:
                return new aqfu();
            case NEW_BUILDER:
                return new aozy(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                apca apcaVar = d;
                if (apcaVar == null) {
                    synchronized (aqfu.class) {
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
