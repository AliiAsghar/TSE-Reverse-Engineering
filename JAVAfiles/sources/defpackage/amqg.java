package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class amqg extends apag implements apbu {
    public static final amqg a;
    private static volatile apca j;
    public int b;
    public Object d;
    public Object f;
    public amqj g;
    public int h;
    public int i;
    public int c = 0;
    public int e = 0;

    static {
        amqg amqgVar = new amqg();
        a = amqgVar;
        apag.registerDefaultInstance(amqg.class, amqgVar);
    }

    private amqg() {
    }

    @Override // defpackage.apag
    protected final Object dynamicMethod(apaf apafVar, Object obj, Object obj2) {
        switch (apafVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\u0006\u0002\u0001\u0001É\u0006\u0000\u0000\u0000\u0001ဉ\u0000\u0002င\u0001\u0003င\u0002e\u083f\u0000f\u083f\u0000É\u083f\u0001", new Object[]{"d", "c", "f", "e", "b", "g", "h", "i", amoo.q, amoo.p, amoo.r});
            case NEW_MUTABLE_INSTANCE:
                return new amqg();
            case NEW_BUILDER:
                return new aozy(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                apca apcaVar = j;
                if (apcaVar == null) {
                    synchronized (amqg.class) {
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
