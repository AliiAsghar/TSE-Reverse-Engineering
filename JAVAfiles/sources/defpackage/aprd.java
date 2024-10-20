package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aprd extends apag implements apbu {
    public static final aprd a;
    private static volatile apca f;
    public int b;
    public int c = 0;
    public Object d;
    public aozn e;

    static {
        aprd aprdVar = new aprd();
        a = aprdVar;
        apag.registerDefaultInstance(aprd.class, aprdVar);
    }

    private aprd() {
    }

    @Override // defpackage.apag
    protected final Object dynamicMethod(apaf apafVar, Object obj, Object obj2) {
        switch (apafVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0004\u0006\u0001\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဉ\u0000\u0002<\u0000\u0003<\u0000\u0004<\u0000\u0005<\u0000\u0006<\u0000", new Object[]{"d", "c", "b", "e", aprc.class, apra.class, apqt.class, apqz.class, aprb.class});
            case NEW_MUTABLE_INSTANCE:
                return new aprd();
            case NEW_BUILDER:
                return new aozy(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                apca apcaVar = f;
                if (apcaVar == null) {
                    synchronized (aprd.class) {
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
