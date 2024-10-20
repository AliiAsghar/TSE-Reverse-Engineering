package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class amrl extends apag implements apbu {
    public static final amrl a;
    private static volatile apca j;
    public int b;
    public int c = 0;
    public Object d;
    public int e;
    public amrm f;
    public amur g;
    public amro h;
    public int i;

    static {
        amrl amrlVar = new amrl();
        a = amrlVar;
        apag.registerDefaultInstance(amrl.class, amrlVar);
    }

    private amrl() {
    }

    @Override // defpackage.apag
    protected final Object dynamicMethod(apaf apafVar, Object obj, Object obj2) {
        switch (apafVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\b\u0001\u0001\u0001\b\b\u0000\u0000\u0000\u0001᠌\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဉ\u0003\u0005င\u0004\u0006<\u0000\u0007\u083f\u0000\b\u083f\u0000", new Object[]{"d", "c", "b", "e", amqk.p, "f", "g", "h", "i", aptw.class, amqk.q, amqk.o});
            case NEW_MUTABLE_INSTANCE:
                return new amrl();
            case NEW_BUILDER:
                return new aozy(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                apca apcaVar = j;
                if (apcaVar == null) {
                    synchronized (amrl.class) {
                        apcaVar = j;
                        if (apcaVar == null) {
                            apcaVar = new aozz(a);
                            j = apcaVar;
                        }
                    }
                }
                return apcaVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
