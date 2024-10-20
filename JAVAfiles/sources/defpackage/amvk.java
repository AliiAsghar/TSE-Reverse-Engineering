package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class amvk extends apag implements apbu {
    public static final amvk a;
    private static volatile apca g;
    public int b;
    public aozb c = aozb.b;
    public boolean d;
    public boolean e;
    public int f;

    static {
        amvk amvkVar = new amvk();
        a = amvkVar;
        apag.registerDefaultInstance(amvk.class, amvkVar);
    }

    private amvk() {
    }

    @Override // defpackage.apag
    protected final Object dynamicMethod(apaf apafVar, Object obj, Object obj2) {
        switch (apafVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ည\u0000\u0002ဇ\u0001\u0003ဇ\u0002\u0004᠌\u0003", new Object[]{"b", "c", "d", "e", "f", amvg.c});
            case NEW_MUTABLE_INSTANCE:
                return new amvk();
            case NEW_BUILDER:
                return new aozy(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                apca apcaVar = g;
                if (apcaVar == null) {
                    synchronized (amvk.class) {
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
