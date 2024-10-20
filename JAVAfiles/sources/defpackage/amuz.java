package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class amuz extends apag implements apbu {
    public static final amuz a;
    private static volatile apca h;
    public int b;
    public aozn c;
    public amuy d;
    public amuy e;
    public aozb f = aozb.b;
    public int g;

    static {
        amuz amuzVar = new amuz();
        a = amuzVar;
        apag.registerDefaultInstance(amuz.class, amuzVar);
    }

    private amuz() {
    }

    @Override // defpackage.apag
    protected final Object dynamicMethod(apaf apafVar, Object obj, Object obj2) {
        switch (apafVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ည\u0003\u0005᠌\u0004", new Object[]{"b", "c", "d", "e", "f", "g", amud.u});
            case NEW_MUTABLE_INSTANCE:
                return new amuz();
            case NEW_BUILDER:
                return new aozy(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                apca apcaVar = h;
                if (apcaVar == null) {
                    synchronized (amuz.class) {
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
