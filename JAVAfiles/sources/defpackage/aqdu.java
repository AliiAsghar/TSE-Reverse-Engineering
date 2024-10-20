package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aqdu extends apag<aqdu, aozy> implements apbu {
    public static final aqdu a;
    private static volatile apca d;
    public aqgc b;
    public long c;
    private int e;

    static {
        aqdu aqduVar = new aqdu();
        a = aqduVar;
        apag.registerDefaultInstance(aqdu.class, aqduVar);
    }

    private aqdu() {
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
                return newMessageInfo(a, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002\u0002", new Object[]{"e", "b", "c"});
            case NEW_MUTABLE_INSTANCE:
                return new aqdu();
            case NEW_BUILDER:
                return new aozy(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                apca apcaVar = d;
                if (apcaVar == null) {
                    synchronized (aqdu.class) {
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
