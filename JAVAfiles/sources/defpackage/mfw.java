package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class mfw extends apag implements apbu {
    public static final mfw a;
    private static volatile apca b;
    private apbo c = apbo.a;

    static {
        mfw mfwVar = new mfw();
        a = mfwVar;
        apag.registerDefaultInstance(mfw.class, mfwVar);
    }

    private mfw() {
    }

    @Override // defpackage.apag
    protected final Object dynamicMethod(apaf apafVar, Object obj, Object obj2) {
        switch (apafVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012", new Object[]{"c", mfv.a});
            case NEW_MUTABLE_INSTANCE:
                return new mfw();
            case NEW_BUILDER:
                return new aozy(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                apca apcaVar = b;
                if (apcaVar == null) {
                    synchronized (mfw.class) {
                        apcaVar = b;
                        if (apcaVar == null) {
                            apcaVar = new aozz(a);
                            b = apcaVar;
                        }
                    }
                }
                return apcaVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
