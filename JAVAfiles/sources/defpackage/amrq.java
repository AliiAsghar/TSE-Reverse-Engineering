package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class amrq extends apag implements apbu {
    public static final amrq a;
    public static final apae b;
    public static final apae c;
    private static volatile apca f;
    public int d;
    public amrr e;

    static {
        amrq amrqVar = new amrq();
        a = amrqVar;
        apag.registerDefaultInstance(amrq.class, amrqVar);
        b = apag.newSingularGeneratedExtension(amnq.a, amrqVar, amrqVar, null, 249, apdf.MESSAGE, amrq.class);
        c = apag.newSingularGeneratedExtension(amoe.a, amrqVar, amrqVar, null, 974, apdf.MESSAGE, amrq.class);
    }

    private amrq() {
    }

    @Override // defpackage.apag
    protected final Object dynamicMethod(apaf apafVar, Object obj, Object obj2) {
        switch (apafVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0004\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"d", "e"});
            case NEW_MUTABLE_INSTANCE:
                return new amrq();
            case NEW_BUILDER:
                return new aozy(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                apca apcaVar = f;
                if (apcaVar == null) {
                    synchronized (amrq.class) {
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
