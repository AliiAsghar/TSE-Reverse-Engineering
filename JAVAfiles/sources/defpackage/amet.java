package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class amet extends apag implements apbu {
    public static final amet a;
    private static volatile apca k;
    public int b;
    public int c;
    public int d;
    public amew e;
    public amez f;
    public amey g;
    public amev h;
    public amex i;
    public ameu j;

    static {
        amet ametVar = new amet();
        a = ametVar;
        apag.registerDefaultInstance(amet.class, ametVar);
    }

    private amet() {
    }

    @Override // defpackage.apag
    protected final Object dynamicMethod(apaf apafVar, Object obj, Object obj2) {
        switch (apafVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0000\u0000\u0001᠌\u0000\u0002᠌\u0001\u0003ဉ\u0002\u0004ဉ\u0003\u0005ဉ\u0004\u0006ဉ\u0005\u0007ဉ\u0006\bဉ\u0007", new Object[]{"b", "c", ameh.j, "d", ameh.k, "e", "f", "g", "h", "i", "j"});
            case NEW_MUTABLE_INSTANCE:
                return new amet();
            case NEW_BUILDER:
                return new aozy(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                apca apcaVar = k;
                if (apcaVar == null) {
                    synchronized (amet.class) {
                        apcaVar = k;
                        if (apcaVar == null) {
                            apcaVar = new aozz(a);
                            k = apcaVar;
                        }
                    }
                }
                return apcaVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
