package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class afub extends apag implements apbu {
    public static final afub a;
    private static volatile apca d;
    public int b = 0;
    public Object c;

    static {
        afub afubVar = new afub();
        a = afubVar;
        apag.registerDefaultInstance(afub.class, afubVar);
    }

    private afub() {
    }

    @Override // defpackage.apag
    protected final Object dynamicMethod(apaf apafVar, Object obj, Object obj2) {
        switch (apafVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0004\u0002\u0001\u0000de\u0002\u0000\u0000\u0000d<\u0000e<\u0000", new Object[]{"c", "b", aftz.class, afua.class});
            case NEW_MUTABLE_INSTANCE:
                return new afub();
            case NEW_BUILDER:
                return new aozy(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                apca apcaVar = d;
                if (apcaVar == null) {
                    synchronized (afub.class) {
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
