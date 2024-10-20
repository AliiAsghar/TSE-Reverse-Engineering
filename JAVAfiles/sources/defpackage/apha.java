package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class apha extends apag implements apbu {
    public static final apha a;
    private static volatile apca j;
    public int b;
    public String c = "";
    public String d = "";
    public apgz e;
    public apgw f;
    public apgy g;
    public aphb h;
    public apgx i;

    static {
        apha aphaVar = new apha();
        a = aphaVar;
        apag.registerDefaultInstance(apha.class, aphaVar);
    }

    private apha() {
    }

    @Override // defpackage.apag
    protected final Object dynamicMethod(apaf apafVar, Object obj, Object obj2) {
        switch (apafVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001ဉ\u0002\u0002ဉ\u0003\u0003ဉ\u0004\u0004ဉ\u0005\u0005ဉ\u0006\u0006ဈ\u0000\u0007ဈ\u0001", new Object[]{"b", "e", "f", "g", "h", "i", "c", "d"});
            case NEW_MUTABLE_INSTANCE:
                return new apha();
            case NEW_BUILDER:
                return new aozy(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                apca apcaVar = j;
                if (apcaVar == null) {
                    synchronized (apha.class) {
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
