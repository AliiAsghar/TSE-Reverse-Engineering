package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ahai extends apag implements apbu {
    public static final ahai a;
    private static volatile apca f;
    public int b;
    public Object d;
    public int c = 0;
    public String e = "";

    static {
        ahai ahaiVar = new ahai();
        a = ahaiVar;
        apag.registerDefaultInstance(ahai.class, ahaiVar);
    }

    private ahai() {
    }

    @Override // defpackage.apag
    protected final Object dynamicMethod(apaf apafVar, Object obj, Object obj2) {
        switch (apafVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0004\u0007\u0001\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001ဈ\u0000\u0002:\u0000\u0003@\u0000\u0004A\u0000\u00054\u0000\u0006;\u0000\u0007<\u0000", new Object[]{"d", "c", "b", "e", ahaq.class});
            case NEW_MUTABLE_INSTANCE:
                return new ahai();
            case NEW_BUILDER:
                return new aozy(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                apca apcaVar = f;
                if (apcaVar == null) {
                    synchronized (ahai.class) {
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
