package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class amqn extends apag implements apbu {
    public static final amqn a;
    private static volatile apca d;
    public int b = 0;
    public Object c;

    static {
        amqn amqnVar = new amqn();
        a = amqnVar;
        apag.registerDefaultInstance(amqn.class, amqnVar);
    }

    private amqn() {
    }

    @Override // defpackage.apag
    protected final Object dynamicMethod(apaf apafVar, Object obj, Object obj2) {
        switch (apafVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0004\u0005\u0001\u0000\u0001\u0005\u0005\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000\u0003<\u0000\u0004<\u0000\u0005<\u0000", new Object[]{"c", "b", amqp.class, amqr.class, amql.class, amqo.class, amqs.class});
            case NEW_MUTABLE_INSTANCE:
                return new amqn();
            case NEW_BUILDER:
                return new amqm();
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                apca apcaVar = d;
                if (apcaVar == null) {
                    synchronized (amqn.class) {
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
