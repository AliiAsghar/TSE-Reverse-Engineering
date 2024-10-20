package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class apmr extends apag implements apbu {
    public static final apmr a;
    private static volatile apca g;
    public int b;
    public Object d;
    public int c = 0;
    public String e = "";
    public String f = "";

    static {
        apmr apmrVar = new apmr();
        a = apmrVar;
        apag.registerDefaultInstance(apmr.class, apmrVar);
    }

    private apmr() {
    }

    @Override // defpackage.apag
    protected final Object dynamicMethod(apaf apafVar, Object obj, Object obj2) {
        switch (apafVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0000\b\u0001\u0001\u0001\b\b\u0000\u0000\u0000\u0001ለ\u0000\u0002<\u0000\u0003<\u0000\u0004<\u0000\u0005<\u0000\u0006<\u0000\u0007<\u0000\bለ\u0001", new Object[]{"d", "c", "b", "e", apmv.class, apms.class, apmt.class, apmu.class, apmq.class, apmw.class, "f"});
            case NEW_MUTABLE_INSTANCE:
                return new apmr();
            case NEW_BUILDER:
                return new aozy(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                apca apcaVar = g;
                if (apcaVar == null) {
                    synchronized (apmr.class) {
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
