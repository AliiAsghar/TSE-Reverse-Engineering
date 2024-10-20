package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class amhw extends apag implements apbu {
    public static final amhw a;
    private static volatile apca k;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public int g;
    public int h;
    public apax i = emptyProtobufList();
    public boolean j;

    static {
        amhw amhwVar = new amhw();
        a = amhwVar;
        apag.registerDefaultInstance(amhw.class, amhwVar);
    }

    private amhw() {
    }

    @Override // defpackage.apag
    protected final Object dynamicMethod(apaf apafVar, Object obj, Object obj2) {
        switch (apafVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\b\u0000\u0001\u0001\n\b\u0000\u0001\u0000\u0001᠌\u0000\u0004᠌\u0003\u0005᠌\u0004\u0006᠌\u0005\u0007᠌\u0006\b᠌\u0007\t\u001b\nဇ\b", new Object[]{"b", "c", amwm.f, "d", amhj.q, "e", amhj.p, "f", amhj.o, "g", amhj.r, "h", amhj.n, "i", amwv.class, "j"});
            case NEW_MUTABLE_INSTANCE:
                return new amhw();
            case NEW_BUILDER:
                return new aozy(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                apca apcaVar = k;
                if (apcaVar == null) {
                    synchronized (amhw.class) {
                        apcaVar = k;
                        if (apcaVar == null) {
                            apcaVar = new aozz(a);
                            k = apcaVar;
                        }
                    }
                }
                return apcaVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
