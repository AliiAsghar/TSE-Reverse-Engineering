package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ammz extends apag implements apbu {
    public static final ammz a;
    private static volatile apca f;
    public int b;
    public int c;
    public int d;
    public int e;

    static {
        ammz ammzVar = new ammz();
        a = ammzVar;
        apag.registerDefaultInstance(ammz.class, ammzVar);
    }

    private ammz() {
    }

    @Override // defpackage.apag
    protected final Object dynamicMethod(apaf apafVar, Object obj, Object obj2) {
        switch (apafVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                apam apamVar = amjw.k;
                return newMessageInfo(a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001᠌\u0000\u0002᠌\u0001\u0003᠌\u0002", new Object[]{"b", "c", apamVar, "d", apamVar, "e", amna.b});
            case NEW_MUTABLE_INSTANCE:
                return new ammz();
            case NEW_BUILDER:
                return new aozy(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                apca apcaVar = f;
                if (apcaVar == null) {
                    synchronized (ammz.class) {
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
