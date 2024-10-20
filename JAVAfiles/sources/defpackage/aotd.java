package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aotd extends apag implements apbu {
    public static final aotd a;
    private static volatile apca h;
    public int b;
    public aotk c;
    public aotg d;
    public aozb e = aozb.b;
    public aotq f;
    public int g;

    static {
        aotd aotdVar = new aotd();
        a = aotdVar;
        apag.registerDefaultInstance(aotd.class, aotdVar);
    }

    private aotd() {
    }

    @Override // defpackage.apag
    protected final Object dynamicMethod(apaf apafVar, Object obj, Object obj2) {
        switch (apafVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0000\u0005\u0000\u0001\u0001\b\u0005\u0000\u0000\u0000\u0001ဉ\u0000\u0003ဉ\u0001\u0004\n\u0007ဉ\u0002\b\f", new Object[]{"b", "c", "d", "e", "f", "g"});
            case NEW_MUTABLE_INSTANCE:
                return new aotd();
            case NEW_BUILDER:
                return new aozy(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                apca apcaVar = h;
                if (apcaVar == null) {
                    synchronized (aotd.class) {
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
