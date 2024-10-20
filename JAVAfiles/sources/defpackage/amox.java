package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class amox extends apag implements apbu {
    public static final amox a;
    private static volatile apca f;
    public int b;
    public int c = 0;
    public Object d;
    public boolean e;

    static {
        amox amoxVar = new amox();
        a = amoxVar;
        apag.registerDefaultInstance(amox.class, amoxVar);
    }

    private amox() {
    }

    @Override // defpackage.apag
    protected final Object dynamicMethod(apaf apafVar, Object obj, Object obj2) {
        switch (apafVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0004\u0005\u0001\u0001\u0001h\u0005\u0000\u0000\u0000\u0001ဇ\u0000e<\u0000f<\u0000g<\u0000h<\u0000", new Object[]{"d", "c", "b", "e", amou.class, amot.class, amov.class, amow.class});
            case NEW_MUTABLE_INSTANCE:
                return new amox();
            case NEW_BUILDER:
                return new aozy(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                apca apcaVar = f;
                if (apcaVar == null) {
                    synchronized (amox.class) {
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
