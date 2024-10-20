package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class mcc extends apag implements apbu {
    public static final mcc a;
    private static volatile apca e;
    public int b = 0;
    public Object c;
    public int d;
    private int f;

    static {
        mcc mccVar = new mcc();
        a = mccVar;
        apag.registerDefaultInstance(mcc.class, mccVar);
    }

    private mcc() {
    }

    @Override // defpackage.apag
    protected final Object dynamicMethod(apaf apafVar, Object obj, Object obj2) {
        switch (apafVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\u0003\u0001\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u083f\u0000\u0002\u083f\u0000\u0003င\u0000", new Object[]{"c", "b", "f", amff.k, amqk.s, "d"});
            case NEW_MUTABLE_INSTANCE:
                return new mcc();
            case NEW_BUILDER:
                return new aozy(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                apca apcaVar = e;
                if (apcaVar == null) {
                    synchronized (mcc.class) {
                        apcaVar = e;
                        if (apcaVar == null) {
                            apcaVar = new aozz(a);
                            e = apcaVar;
                        }
                    }
                }
                return apcaVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
