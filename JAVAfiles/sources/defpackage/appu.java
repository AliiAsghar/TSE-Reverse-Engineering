package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class appu extends apag implements apbu {
    public static final appu a;
    private static volatile apca d;
    public int b = 0;
    public Object c;

    static {
        appu appuVar = new appu();
        a = appuVar;
        apag.registerDefaultInstance(appu.class, appuVar);
    }

    private appu() {
    }

    @Override // defpackage.apag
    protected final Object dynamicMethod(apaf apafVar, Object obj, Object obj2) {
        switch (apafVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0004\u0007\u0001\u0000\u0001\u0007\u0007\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000\u0003<\u0000\u0004<\u0000\u0005<\u0000\u0006<\u0000\u0007<\u0000", new Object[]{"c", "b", appz.class, appx.class, appy.class, apqa.class, appt.class, appv.class, appw.class});
            case NEW_MUTABLE_INSTANCE:
                return new appu();
            case NEW_BUILDER:
                return new aozy(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                apca apcaVar = d;
                if (apcaVar == null) {
                    synchronized (appu.class) {
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
