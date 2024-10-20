package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class qog extends apag implements apbu {
    public static final qog a;
    private static volatile apca g;
    public int b;
    public apax c = emptyProtobufList();
    public int d;
    public int e;
    public int f;

    static {
        qog qogVar = new qog();
        a = qogVar;
        apag.registerDefaultInstance(qog.class, qogVar);
    }

    private qog() {
    }

    @Override // defpackage.apag
    protected final Object dynamicMethod(apaf apafVar, Object obj, Object obj2) {
        switch (apafVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0000\u0004\u0000\u0001\u0001\u0005\u0004\u0000\u0001\u0000\u0001\u001b\u0002င\u0000\u0003င\u0001\u0005ဌ\u0002", new Object[]{"b", "c", qoo.class, "d", "e", "f"});
            case NEW_MUTABLE_INSTANCE:
                return new qog();
            case NEW_BUILDER:
                return new aozy(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                apca apcaVar = g;
                if (apcaVar == null) {
                    synchronized (qog.class) {
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
