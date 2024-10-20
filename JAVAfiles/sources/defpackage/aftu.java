package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aftu extends apag implements apbu {
    public static final aftu a;
    private static volatile apca h;
    public int b;
    public int c = 0;
    public Object d;
    public aozn e;
    public aggp f;
    public afuh g;

    static {
        aftu aftuVar = new aftu();
        a = aftuVar;
        apag.registerDefaultInstance(aftu.class, aftuVar);
    }

    private aftu() {
    }

    @Override // defpackage.apag
    protected final Object dynamicMethod(apaf apafVar, Object obj, Object obj2) {
        switch (apafVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0004\u0004\u0001\u0001\u0001È\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001dဉ\u0002È<\u0000", new Object[]{"d", "c", "b", "e", "f", "g", aftt.class});
            case NEW_MUTABLE_INSTANCE:
                return new aftu();
            case NEW_BUILDER:
                return new aozy(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                apca apcaVar = h;
                if (apcaVar == null) {
                    synchronized (aftu.class) {
                        apcaVar = h;
                        if (apcaVar == null) {
                            apcaVar = new aozz(a);
                            h = apcaVar;
                        }
                    }
                }
                return apcaVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
