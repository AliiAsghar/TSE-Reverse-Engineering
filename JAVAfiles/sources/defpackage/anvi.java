package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class anvi extends apag implements apbu {
    public static final anvi a;
    private static volatile apca f;
    public int b;
    public int c;
    public anvn d;
    public anwv e;

    static {
        anvi anviVar = new anvi();
        a = anviVar;
        apag.registerDefaultInstance(anvi.class, anviVar);
    }

    private anvi() {
    }

    @Override // defpackage.apag
    protected final Object dynamicMethod(apaf apafVar, Object obj, Object obj2) {
        switch (apafVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002ဉ\u0000\u0003ဉ\u0001", new Object[]{"b", "c", "d", "e"});
            case NEW_MUTABLE_INSTANCE:
                return new anvi();
            case NEW_BUILDER:
                return new aozy(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                apca apcaVar = f;
                if (apcaVar == null) {
                    synchronized (anvi.class) {
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
