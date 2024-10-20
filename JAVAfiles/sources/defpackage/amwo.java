package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class amwo extends apag implements apbu {
    public static final amwo a;
    private static volatile apca h;
    public int b;
    public int c = 0;
    public Object d;
    public int e;
    public boolean f;
    public int g;

    static {
        amwo amwoVar = new amwo();
        a = amwoVar;
        apag.registerDefaultInstance(amwo.class, amwoVar);
    }

    private amwo() {
    }

    @Override // defpackage.apag
    protected final Object dynamicMethod(apaf apafVar, Object obj, Object obj2) {
        switch (apafVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\b\u0001\u0001\u0001\b\b\u0000\u0000\u0000\u0001᠌\u0000\u0002ဇ\u0001\u0003<\u0000\u0004<\u0000\u0005<\u0000\u0006<\u0000\u0007᠌\u0002\b<\u0000", new Object[]{"d", "c", "b", "e", amvg.u, "f", amwl.class, amwn.class, amwi.class, amwk.class, "g", amwm.d, amwj.class});
            case NEW_MUTABLE_INSTANCE:
                return new amwo();
            case NEW_BUILDER:
                return new aozy(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                apca apcaVar = h;
                if (apcaVar == null) {
                    synchronized (amwo.class) {
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
