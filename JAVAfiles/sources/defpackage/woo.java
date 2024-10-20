package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class woo extends apag implements apbu {
    public static final woo a;
    private static volatile apca e;
    public int b;
    public apbo c = apbo.a;
    public long d;

    static {
        woo wooVar = new woo();
        a = wooVar;
        apag.registerDefaultInstance(woo.class, wooVar);
    }

    private woo() {
    }

    @Override // defpackage.apag
    protected final Object dynamicMethod(apaf apafVar, Object obj, Object obj2) {
        switch (apafVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0001\u0000\u0000\u00012\u0002ဂ\u0000", new Object[]{"b", "c", won.a, "d"});
            case NEW_MUTABLE_INSTANCE:
                return new woo();
            case NEW_BUILDER:
                return new aozy(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                apca apcaVar = e;
                if (apcaVar == null) {
                    synchronized (woo.class) {
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
