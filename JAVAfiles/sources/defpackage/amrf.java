package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class amrf extends apag implements apbu {
    public static final amrf a;
    private static volatile apca d;
    public apax b = emptyProtobufList();
    public apax c = emptyProtobufList();

    static {
        amrf amrfVar = new amrf();
        a = amrfVar;
        apag.registerDefaultInstance(amrf.class, amrfVar);
    }

    private amrf() {
    }

    @Override // defpackage.apag
    protected final Object dynamicMethod(apaf apafVar, Object obj, Object obj2) {
        switch (apafVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0002\u0000\u0001\u001b\u0002\u001b", new Object[]{"b", amrg.class, "c", amri.class});
            case NEW_MUTABLE_INSTANCE:
                return new amrf();
            case NEW_BUILDER:
                return new aozy(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                apca apcaVar = d;
                if (apcaVar == null) {
                    synchronized (amrf.class) {
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
