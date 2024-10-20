package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class amrb extends apag implements apbu {
    public static final amrb a;
    private static volatile apca j;
    public int b;
    public int c;
    public int d;
    public int e;
    public amqz f;
    public amqz g;
    public amqz h;
    public apax i;

    static {
        amrb amrbVar = new amrb();
        a = amrbVar;
        apag.registerDefaultInstance(amrb.class, amrbVar);
    }

    private amrb() {
        emptyProtobufList();
        this.i = emptyProtobufList();
    }

    @Override // defpackage.apag
    protected final Object dynamicMethod(apaf apafVar, Object obj, Object obj2) {
        switch (apafVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\u0007\u0000\u0001\u0001\t\u0007\u0000\u0001\u0000\u0001᠌\u0000\u0002᠌\u0001\u0004᠌\u0003\u0005ဉ\u0004\u0006ဉ\u0006\b\u001b\tဉ\u0005", new Object[]{"b", "c", amqk.k, "d", amqk.i, "e", amqk.j, "f", "h", "i", amqw.class, "g"});
            case NEW_MUTABLE_INSTANCE:
                return new amrb();
            case NEW_BUILDER:
                return new aozy(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                apca apcaVar = j;
                if (apcaVar == null) {
                    synchronized (amrb.class) {
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
