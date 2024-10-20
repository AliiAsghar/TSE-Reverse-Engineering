package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class amph extends apag implements apbu {
    public static final amph a;
    private static volatile apca d;
    public int b;
    public String c = "";
    private boolean e;

    static {
        amph amphVar = new amph();
        a = amphVar;
        apag.registerDefaultInstance(amph.class, amphVar);
    }

    private amph() {
    }

    public static /* synthetic */ void a(amph amphVar) {
        amphVar.b |= 2;
        amphVar.e = true;
    }

    @Override // defpackage.apag
    protected final Object dynamicMethod(apaf apafVar, Object obj, Object obj2) {
        switch (apafVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဇ\u0001", new Object[]{"b", "c", "e"});
            case NEW_MUTABLE_INSTANCE:
                return new amph();
            case NEW_BUILDER:
                return new aozy(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                apca apcaVar = d;
                if (apcaVar == null) {
                    synchronized (amph.class) {
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
