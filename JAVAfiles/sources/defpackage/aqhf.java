package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aqhf extends apag implements apbu {
    public static final aqhf a;
    private static volatile apca e;
    public int b;
    public int c;
    public int d;

    static {
        aqhf aqhfVar = new aqhf();
        a = aqhfVar;
        apag.registerDefaultInstance(aqhf.class, aqhfVar);
    }

    private aqhf() {
    }

    @Override // defpackage.apag
    protected final Object dynamicMethod(apaf apafVar, Object obj, Object obj2) {
        switch (apafVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\f\u0002\f\u0003\f", new Object[]{"b", "c", "d"});
            case NEW_MUTABLE_INSTANCE:
                return new aqhf();
            case NEW_BUILDER:
                return new aozy(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                apca apcaVar = e;
                if (apcaVar == null) {
                    synchronized (aqhf.class) {
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
