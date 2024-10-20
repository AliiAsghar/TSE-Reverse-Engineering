package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class afqu extends apag implements apbu {
    public static final afqu a;
    private static volatile apca i;
    public int b;
    public Object d;
    public afvg h;
    public int c = 0;
    public String e = "";
    public String f = "";
    public String g = "";

    static {
        afqu afquVar = new afqu();
        a = afquVar;
        apag.registerDefaultInstance(afqu.class, afquVar);
    }

    private afqu() {
    }

    @Override // defpackage.apag
    protected final Object dynamicMethod(apaf apafVar, Object obj, Object obj2) {
        switch (apafVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0004\u0005\u0001\u0001\u0001È\u0005\u0000\u0000\u0000\u0001ለ\u0000\u0002ለ\u0001\u0003ለ\u0002dဉ\u0003È<\u0000", new Object[]{"d", "c", "b", "e", "f", "g", "h", afqt.class});
            case NEW_MUTABLE_INSTANCE:
                return new afqu();
            case NEW_BUILDER:
                return new aozy(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                apca apcaVar = i;
                if (apcaVar == null) {
                    synchronized (afqu.class) {
                        apcaVar = i;
                        if (apcaVar == null) {
                            apcaVar = new aozz(a);
                            i = apcaVar;
                        }
                    }
                }
                return apcaVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
