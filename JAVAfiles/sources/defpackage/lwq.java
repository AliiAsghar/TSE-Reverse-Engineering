package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class lwq extends apag implements apbu {
    public static final lwq a;
    private static volatile apca f;
    public int b;
    public Object d;
    public int c = 0;
    public String e = "";

    static {
        lwq lwqVar = new lwq();
        a = lwqVar;
        apag.registerDefaultInstance(lwq.class, lwqVar);
    }

    private lwq() {
    }

    @Override // defpackage.apag
    protected final Object dynamicMethod(apaf apafVar, Object obj, Object obj2) {
        switch (apafVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\u0003\u0001\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002<\u0000\u0003<\u0000", new Object[]{"d", "c", "b", "e", lwp.class, lwo.class});
            case NEW_MUTABLE_INSTANCE:
                return new lwq();
            case NEW_BUILDER:
                return new aozy(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                apca apcaVar = f;
                if (apcaVar == null) {
                    synchronized (lwq.class) {
                        apcaVar = f;
                        if (apcaVar == null) {
                            apcaVar = new aozz(a);
                            f = apcaVar;
                        }
                    }
                }
                return apcaVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
