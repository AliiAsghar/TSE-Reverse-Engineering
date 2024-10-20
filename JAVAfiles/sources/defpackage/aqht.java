package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aqht extends apag implements apbu {
    public static final aqht a;
    private static volatile apca h;
    public Object c;
    public int d;
    public int e;
    public int b = 0;
    public String f = "";
    public String g = "";

    static {
        aqht aqhtVar = new aqht();
        a = aqhtVar;
        apag.registerDefaultInstance(aqht.class, aqhtVar);
    }

    private aqht() {
    }

    @Override // defpackage.apag
    protected final Object dynamicMethod(apaf apafVar, Object obj, Object obj2) {
        switch (apafVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0000\u0005\u0001\u0000\u0001\u0007\u0005\u0000\u0000\u0000\u0001\f\u0002\f\u0003Ȉ\u0004Ȉ\u0007<\u0000", new Object[]{"c", "b", "d", "e", "f", "g", aqhs.class});
            case NEW_MUTABLE_INSTANCE:
                return new aqht();
            case NEW_BUILDER:
                return new aozy(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                apca apcaVar = h;
                if (apcaVar == null) {
                    synchronized (aqht.class) {
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
