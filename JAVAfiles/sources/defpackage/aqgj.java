package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aqgj extends apag implements apbu {
    public static final aqgj a;
    private static volatile apca f;
    public aqfn b;
    public long c;
    public aqgw d;
    public apax e = emptyProtobufList();
    private int g;

    static {
        aqgj aqgjVar = new aqgj();
        a = aqgjVar;
        apag.registerDefaultInstance(aqgj.class, aqgjVar);
    }

    private aqgj() {
    }

    @Override // defpackage.apag
    protected final Object dynamicMethod(apaf apafVar, Object obj, Object obj2) {
        switch (apafVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001ဉ\u0000\u0002\u0002\u0003ဉ\u0001\u0004\u001b", new Object[]{"g", "b", "c", "d", "e", aqfn.class});
            case NEW_MUTABLE_INSTANCE:
                return new aqgj();
            case NEW_BUILDER:
                return new aozy(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                apca apcaVar = f;
                if (apcaVar == null) {
                    synchronized (aqgj.class) {
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
