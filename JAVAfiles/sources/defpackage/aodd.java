package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aodd extends apag implements apbu {
    public static final aodd a;
    private static volatile apca g;
    public int b;
    public String c = "";
    public String d = "";
    public int e;
    public int f;

    static {
        aodd aoddVar = new aodd();
        a = aoddVar;
        apag.registerDefaultInstance(aodd.class, aoddVar);
    }

    private aodd() {
    }

    @Override // defpackage.apag
    protected final Object dynamicMethod(apaf apafVar, Object obj, Object obj2) {
        switch (apafVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0004\u0005\u0000\u0000\u0001\u0006\u0005\u0000\u0000\u0000\u0001\f\u0002Ȉ\u0004\f\u0005Ȉ\u0006\f", new Object[]{"b", "c", "e", "d", "f"});
            case NEW_MUTABLE_INSTANCE:
                return new aodd();
            case NEW_BUILDER:
                return new aozy(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                apca apcaVar = g;
                if (apcaVar == null) {
                    synchronized (aodd.class) {
                        apcaVar = g;
                        if (apcaVar == null) {
                            apcaVar = new aozz(a);
                            g = apcaVar;
                        }
                    }
                }
                return apcaVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
