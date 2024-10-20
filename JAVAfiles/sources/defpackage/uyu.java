package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class uyu extends apag implements apbu {
    public static final uyu a;
    private static volatile apca d;
    public long b;
    public boolean c;

    static {
        uyu uyuVar = new uyu();
        a = uyuVar;
        apag.registerDefaultInstance(uyu.class, uyuVar);
    }

    private uyu() {
    }

    @Override // defpackage.apag
    protected final Object dynamicMethod(apaf apafVar, Object obj, Object obj2) {
        switch (apafVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0003\u0002\u0007", new Object[]{"b", "c"});
            case NEW_MUTABLE_INSTANCE:
                return new uyu();
            case NEW_BUILDER:
                return new aozy(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                apca apcaVar = d;
                if (apcaVar == null) {
                    synchronized (uyu.class) {
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
