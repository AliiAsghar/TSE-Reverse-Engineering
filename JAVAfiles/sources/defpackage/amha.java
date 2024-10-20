package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class amha extends apag implements apbu {
    public static final amha a;
    private static volatile apca h;
    public int b;
    public int c;
    public int d;
    public int e;
    public amer f;
    public int g;

    static {
        amha amhaVar = new amha();
        a = amhaVar;
        apag.registerDefaultInstance(amha.class, amhaVar);
    }

    private amha() {
    }

    @Override // defpackage.apag
    protected final Object dynamicMethod(apaf apafVar, Object obj, Object obj2) {
        switch (apafVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\u0005\u0000\u0001\u0001\b\u0005\u0000\u0000\u0000\u0001᠌\u0000\u0002င\u0001\u0006င\u0005\u0007ဉ\u0006\bင\u0007", new Object[]{"b", "c", amgp.o, "d", "e", "f", "g"});
            case NEW_MUTABLE_INSTANCE:
                return new amha();
            case NEW_BUILDER:
                return new aozy(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                apca apcaVar = h;
                if (apcaVar == null) {
                    synchronized (amha.class) {
                        apcaVar = h;
                        if (apcaVar == null) {
                            apcaVar = new aozz(a);
                            h = apcaVar;
                        }
                    }
                }
                return apcaVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
