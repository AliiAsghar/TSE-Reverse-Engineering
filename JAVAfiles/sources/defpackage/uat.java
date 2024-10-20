package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class uat extends apag implements apbu {
    public static final apap a = new qex(5);
    public static final uat b;
    private static volatile apca f;
    public int c;
    public qei d;
    public apao e = emptyIntList();

    static {
        uat uatVar = new uat();
        b = uatVar;
        apag.registerDefaultInstance(uat.class, uatVar);
    }

    private uat() {
    }

    @Override // defpackage.apag
    protected final Object dynamicMethod(apaf apafVar, Object obj, Object obj2) {
        switch (apafVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(b, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဉ\u0000\u0002ࠬ", new Object[]{"c", "d", "e", qgk.g});
            case NEW_MUTABLE_INSTANCE:
                return new uat();
            case NEW_BUILDER:
                return new aozy(b);
            case GET_DEFAULT_INSTANCE:
                return b;
            case GET_PARSER:
                apca apcaVar = f;
                if (apcaVar == null) {
                    synchronized (uat.class) {
                        apcaVar = f;
                        if (apcaVar == null) {
                            apcaVar = new aozz(b);
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
