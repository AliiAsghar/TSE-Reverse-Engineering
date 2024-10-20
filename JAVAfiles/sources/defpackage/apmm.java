package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class apmm extends apag implements apbu {
    public static final apmm a;
    private static volatile apca d;
    public int b = 0;
    public Object c;

    static {
        apmm apmmVar = new apmm();
        a = apmmVar;
        apag.registerDefaultInstance(apmm.class, apmmVar);
    }

    private apmm() {
    }

    @Override // defpackage.apag
    protected final Object dynamicMethod(apaf apafVar, Object obj, Object obj2) {
        switch (apafVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0000\u0005\u0001\u0000\u0001\u0005\u0005\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000\u0003<\u0000\u0004<\u0000\u0005<\u0000", new Object[]{"c", "b", apmo.class, apmp.class, apmr.class, apml.class, apmn.class});
            case NEW_MUTABLE_INSTANCE:
                return new apmm();
            case NEW_BUILDER:
                return new aozy(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                apca apcaVar = d;
                if (apcaVar == null) {
                    synchronized (apmm.class) {
                        apcaVar = d;
                        if (apcaVar == null) {
                            apcaVar = new aozz(a);
                            d = apcaVar;
                        }
                    }
                }
                return apcaVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
