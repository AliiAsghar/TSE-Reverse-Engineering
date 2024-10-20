package defpackage;

/* compiled from: PG */
@Deprecated
/* loaded from: classes4.dex */
public final class aqac extends apag implements apbu {
    public static final aqac a;
    private static volatile apca f;
    public int b;
    public int c;
    public int d;
    public int e;

    static {
        aqac aqacVar = new aqac();
        a = aqacVar;
        apag.registerDefaultInstance(aqac.class, aqacVar);
    }

    private aqac() {
        apag.emptyProtobufList();
    }

    @Override // defpackage.apag
    protected final Object dynamicMethod(apaf apafVar, Object obj, Object obj2) {
        switch (apafVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0000\u0004\u0000\u0000\u0003\u0007\u0004\u0000\u0000\u0000\u0003\f\u0005\u0004\u0006\f\u0007\f", new Object[]{"b", "c", "d", "e"});
            case NEW_MUTABLE_INSTANCE:
                return new aqac();
            case NEW_BUILDER:
                return new aozy(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                apca apcaVar = f;
                if (apcaVar == null) {
                    synchronized (aqac.class) {
                        apcaVar = f;
                        if (apcaVar == null) {
                            apcaVar = new aozz(a);
                            f = apcaVar;
                        }
                    }
                }
                return apcaVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
