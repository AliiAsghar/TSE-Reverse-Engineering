package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class anxi extends apag implements apbu {
    public static final anxi a;
    private static volatile apca d;
    public int b;
    public apax c = emptyProtobufList();

    static {
        anxi anxiVar = new anxi();
        a = anxiVar;
        apag.registerDefaultInstance(anxi.class, anxiVar);
    }

    private anxi() {
    }

    @Override // defpackage.apag
    protected final Object dynamicMethod(apaf apafVar, Object obj, Object obj2) {
        switch (apafVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u000b\u0002\u001b", new Object[]{"b", "c", anxh.class});
            case NEW_MUTABLE_INSTANCE:
                return new anxi();
            case NEW_BUILDER:
                return new aozy(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                apca apcaVar = d;
                if (apcaVar == null) {
                    synchronized (anxi.class) {
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
