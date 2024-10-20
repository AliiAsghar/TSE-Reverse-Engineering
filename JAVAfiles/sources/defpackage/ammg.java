package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ammg extends apag implements apbu {
    public static final ammg a;
    private static volatile apca m;
    public int b;
    public aozn c;
    public int d;
    public int e;
    public int f;
    public int g;
    public int h;
    public int i;
    public int j;
    public int k;
    public aozb l = aozb.b;

    static {
        ammg ammgVar = new ammg();
        a = ammgVar;
        apag.registerDefaultInstance(ammg.class, ammgVar);
    }

    private ammg() {
    }

    @Override // defpackage.apag
    protected final Object dynamicMethod(apaf apafVar, Object obj, Object obj2) {
        switch (apafVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                apam apamVar = amoo.a;
                return newMessageInfo(a, "\u0001\n\u0000\u0001\u0001\n\n\u0000\u0000\u0000\u0001ဉ\u0000\u0002᠌\u0001\u0003᠌\u0002\u0004᠌\u0003\u0005᠌\u0004\u0006᠌\u0005\u0007င\u0006\bင\u0007\t᠌\b\nည\t", new Object[]{"b", "c", "d", apamVar, "e", apamVar, "f", apamVar, "g", apamVar, "h", apamVar, "i", "j", "k", amln.q, "l"});
            case NEW_MUTABLE_INSTANCE:
                return new ammg();
            case NEW_BUILDER:
                return new aozy(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                apca apcaVar = m;
                if (apcaVar == null) {
                    synchronized (ammg.class) {
                        apcaVar = m;
                        if (apcaVar == null) {
                            apcaVar = new aozz(a);
                            m = apcaVar;
                        }
                    }
                }
                return apcaVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
