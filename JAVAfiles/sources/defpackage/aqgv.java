package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aqgv extends apag implements apbu {
    public static final aqgv a;
    private static volatile apca c;
    public aqgw b;
    private int d;

    static {
        aqgv aqgvVar = new aqgv();
        a = aqgvVar;
        apag.registerDefaultInstance(aqgv.class, aqgvVar);
    }

    private aqgv() {
    }

    @Override // defpackage.apag
    protected final Object dynamicMethod(apaf apafVar, Object obj, Object obj2) {
        switch (apafVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0000\u0001\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0000\u0002ဉ\u0001", new Object[]{"d", "b"});
            case NEW_MUTABLE_INSTANCE:
                return new aqgv();
            case NEW_BUILDER:
                return new aozy(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                apca apcaVar = c;
                if (apcaVar == null) {
                    synchronized (aqgv.class) {
                        apcaVar = c;
                        if (apcaVar == null) {
                            apcaVar = new aozz(a);
                            c = apcaVar;
                        }
                    }
                }
                return apcaVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
