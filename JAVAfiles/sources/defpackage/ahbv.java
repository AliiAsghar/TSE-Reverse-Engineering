package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ahbv extends apag implements apbu {
    public static final ahbv a;
    public static final apae b;
    private static volatile apca d;
    public ahac c;
    private int e;

    static {
        ahbv ahbvVar = new ahbv();
        a = ahbvVar;
        apag.registerDefaultInstance(ahbv.class, ahbvVar);
        b = apag.newSingularGeneratedExtension(ahbq.a, ahbvVar, ahbvVar, null, 9003, apdf.MESSAGE, ahbv.class);
    }

    private ahbv() {
    }

    @Override // defpackage.apag
    protected final Object dynamicMethod(apaf apafVar, Object obj, Object obj2) {
        switch (apafVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0004\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"e", "c"});
            case NEW_MUTABLE_INSTANCE:
                return new ahbv();
            case NEW_BUILDER:
                return new aozy(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                apca apcaVar = d;
                if (apcaVar == null) {
                    synchronized (ahbv.class) {
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
