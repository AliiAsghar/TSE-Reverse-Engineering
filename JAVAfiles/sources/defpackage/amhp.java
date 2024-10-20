package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class amhp extends apag implements apbu {
    public static final amhp a;
    private static volatile apca i;
    public int b;
    public amhq c;
    public int d;
    public int e;
    public int f;
    public int g;
    public int h;

    static {
        amhp amhpVar = new amhp();
        a = amhpVar;
        apag.registerDefaultInstance(amhp.class, amhpVar);
    }

    private amhp() {
    }

    @Override // defpackage.apag
    protected final Object dynamicMethod(apaf apafVar, Object obj, Object obj2) {
        switch (apafVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဉ\u0000\u0002᠌\u0001\u0003᠌\u0002\u0004᠌\u0003\u0005᠌\u0004\u0006᠌\u0005", new Object[]{"b", "c", "d", amhj.h, "e", amhj.i, "f", amhj.e, "g", amhj.f, "h", amhj.g});
            case NEW_MUTABLE_INSTANCE:
                return new amhp();
            case NEW_BUILDER:
                return new aozy(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                apca apcaVar = i;
                if (apcaVar == null) {
                    synchronized (amhp.class) {
                        apcaVar = i;
                        if (apcaVar == null) {
                            apcaVar = new aozz(a);
                            i = apcaVar;
                        }
                    }
                }
                return apcaVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
