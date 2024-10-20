package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class afxt extends apag implements apbu {
    public static final afxt a;
    private static volatile apca f;
    public int b;
    public int c = 0;
    public Object d;
    public afqu e;

    static {
        afxt afxtVar = new afxt();
        a = afxtVar;
        apag.registerDefaultInstance(afxt.class, afxtVar);
    }

    private afxt() {
    }

    @Override // defpackage.apag
    protected final Object dynamicMethod(apaf apafVar, Object obj, Object obj2) {
        switch (apafVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0004\u0002\u0001\u0001dÈ\u0002\u0000\u0000\u0000dဉ\u0000È<\u0000", new Object[]{"d", "c", "b", "e", afxs.class});
            case NEW_MUTABLE_INSTANCE:
                return new afxt();
            case NEW_BUILDER:
                return new aozy(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                apca apcaVar = f;
                if (apcaVar == null) {
                    synchronized (afxt.class) {
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
