package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class amrh extends apag implements apbu {
    public static final amrh a;
    private static volatile apca g;
    public int b;
    public amrf d;
    public amrf e;
    public String c = "";
    public apax f = emptyProtobufList();

    static {
        amrh amrhVar = new amrh();
        a = amrhVar;
        apag.registerDefaultInstance(amrh.class, amrhVar);
    }

    private amrh() {
    }

    @Override // defpackage.apag
    protected final Object dynamicMethod(apaf apafVar, Object obj, Object obj2) {
        switch (apafVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001ဈ\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004\u001b", new Object[]{"b", "c", "d", "e", "f", amri.class});
            case NEW_MUTABLE_INSTANCE:
                return new amrh();
            case NEW_BUILDER:
                return new aozy(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                apca apcaVar = g;
                if (apcaVar == null) {
                    synchronized (amrh.class) {
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
