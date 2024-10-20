package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class yil extends apag implements apbu {
    public static final apap a = new qex(8);
    public static final yil b;
    private static volatile apca d;
    public apao c = emptyIntList();

    static {
        yil yilVar = new yil();
        b = yilVar;
        apag.registerDefaultInstance(yil.class, yilVar);
    }

    private yil() {
    }

    @Override // defpackage.apag
    protected final Object dynamicMethod(apaf apafVar, Object obj, Object obj2) {
        switch (apafVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001ࠬ", new Object[]{"c", apwb.k});
            case NEW_MUTABLE_INSTANCE:
                return new yil();
            case NEW_BUILDER:
                return new aozy(b);
            case GET_DEFAULT_INSTANCE:
                return b;
            case GET_PARSER:
                apca apcaVar = d;
                if (apcaVar == null) {
                    synchronized (yil.class) {
                        apcaVar = d;
                        if (apcaVar == null) {
                            apcaVar = new aozz(b);
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
