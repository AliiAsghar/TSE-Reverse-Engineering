package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class wiy extends apag implements apbu {
    public static final wiy a;
    private static volatile apca d;
    public apbo b = apbo.a;
    public apbo c = apbo.a;

    static {
        wiy wiyVar = new wiy();
        a = wiyVar;
        apag.registerDefaultInstance(wiy.class, wiyVar);
    }

    private wiy() {
    }

    @Override // defpackage.apag
    protected final Object dynamicMethod(apaf apafVar, Object obj, Object obj2) {
        switch (apafVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\u0002\u0000\u0000\u0001\u0002\u0002\u0002\u0000\u0000\u00012\u00022", new Object[]{"b", wiw.a, "c", wix.a});
            case NEW_MUTABLE_INSTANCE:
                return new wiy();
            case NEW_BUILDER:
                return new aozy(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                apca apcaVar = d;
                if (apcaVar == null) {
                    synchronized (wiy.class) {
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
