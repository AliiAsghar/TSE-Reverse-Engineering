package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class afdf extends apag implements apbu {
    public static final afdf a;
    private static volatile apca d;
    public int b = 0;
    public Object c;

    static {
        afdf afdfVar = new afdf();
        a = afdfVar;
        apag.registerDefaultInstance(afdf.class, afdfVar);
    }

    private afdf() {
    }

    @Override // defpackage.apag
    protected final Object dynamicMethod(apaf apafVar, Object obj, Object obj2) {
        switch (apafVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0004\u0003\u0001\u0000ÈÊ\u0003\u0000\u0000\u0000È<\u0000É<\u0000Ê<\u0000", new Object[]{"c", "b", afde.class, afdc.class, afdd.class});
            case NEW_MUTABLE_INSTANCE:
                return new afdf();
            case NEW_BUILDER:
                return new aozy(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                apca apcaVar = d;
                if (apcaVar == null) {
                    synchronized (afdf.class) {
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
