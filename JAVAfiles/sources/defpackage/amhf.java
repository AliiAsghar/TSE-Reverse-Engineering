package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class amhf extends apag implements apbu {
    public static final amhf a;
    private static volatile apca e;
    public int b;
    public apax c = emptyProtobufList();
    public int d;

    static {
        amhf amhfVar = new amhf();
        a = amhfVar;
        apag.registerDefaultInstance(amhf.class, amhfVar);
    }

    private amhf() {
    }

    @Override // defpackage.apag
    protected final Object dynamicMethod(apaf apafVar, Object obj, Object obj2) {
        switch (apafVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001b\u0002᠌\u0000", new Object[]{"b", "c", amhe.class, "d", amgp.t});
            case NEW_MUTABLE_INSTANCE:
                return new amhf();
            case NEW_BUILDER:
                return new aozy(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                apca apcaVar = e;
                if (apcaVar == null) {
                    synchronized (amhf.class) {
                        apcaVar = e;
                        if (apcaVar == null) {
                            apcaVar = new aozz(a);
                            e = apcaVar;
                        }
                    }
                }
                return apcaVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
