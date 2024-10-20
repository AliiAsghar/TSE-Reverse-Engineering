package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class amty extends apag implements apbu {
    public static final amty a;
    public static final apae b;
    private static volatile apca g;
    public int c;
    public amtz d;
    public amua e;
    public amrp f;

    static {
        amty amtyVar = new amty();
        a = amtyVar;
        apag.registerDefaultInstance(amty.class, amtyVar);
        b = apag.newSingularGeneratedExtension(amnq.a, amtyVar, amtyVar, null, 216, apdf.MESSAGE, amty.class);
    }

    private amty() {
    }

    @Override // defpackage.apag
    protected final Object dynamicMethod(apaf apafVar, Object obj, Object obj2) {
        switch (apafVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0004\u0003\u0000\u0001\u0002\u0006\u0003\u0000\u0000\u0000\u0002ဉ\u0001\u0004ဉ\u0003\u0006ဉ\u0005", new Object[]{"c", "d", "e", "f"});
            case NEW_MUTABLE_INSTANCE:
                return new amty();
            case NEW_BUILDER:
                return new aozy(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                apca apcaVar = g;
                if (apcaVar == null) {
                    synchronized (amty.class) {
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
