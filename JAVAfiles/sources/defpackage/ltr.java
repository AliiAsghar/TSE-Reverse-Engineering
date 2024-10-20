package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ltr extends apag implements apbu {
    public static final ltr a;
    private static volatile apca d;
    public int b = 0;
    public Object c;

    static {
        ltr ltrVar = new ltr();
        a = ltrVar;
        apag.registerDefaultInstance(ltr.class, ltrVar);
    }

    private ltr() {
    }

    @Override // defpackage.apag
    protected final Object dynamicMethod(apaf apafVar, Object obj, Object obj2) {
        switch (apafVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0000\u0003\u0001\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȼ\u0000\u0002?\u0000\u0003<\u0000", new Object[]{"c", "b", ltt.class});
            case NEW_MUTABLE_INSTANCE:
                return new ltr();
            case NEW_BUILDER:
                return new aozy(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                apca apcaVar = d;
                if (apcaVar == null) {
                    synchronized (ltr.class) {
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
