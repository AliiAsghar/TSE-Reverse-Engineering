package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aock extends apag implements apbu {
    public static final aock a;
    private static volatile apca d;
    public String b = "";
    public int c;

    static {
        aock aockVar = new aock();
        a = aockVar;
        apag.registerDefaultInstance(aock.class, aockVar);
    }

    private aock() {
    }

    @Override // defpackage.apag
    protected final Object dynamicMethod(apaf apafVar, Object obj, Object obj2) {
        switch (apafVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0004\u0002\u0000\u0000\u0001\u0003\u0002\u0000\u0000\u0000\u0001Ȉ\u0003\u0004", new Object[]{"b", "c"});
            case NEW_MUTABLE_INSTANCE:
                return new aock();
            case NEW_BUILDER:
                return new aozy(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                apca apcaVar = d;
                if (apcaVar == null) {
                    synchronized (aock.class) {
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
