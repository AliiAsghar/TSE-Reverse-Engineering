package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aptl extends apag implements apbu {
    public static final aptl a;
    private static volatile apca d;
    public String b = "";
    public apax c = emptyProtobufList();
    private int e;

    static {
        aptl aptlVar = new aptl();
        a = aptlVar;
        apag.registerDefaultInstance(aptl.class, aptlVar);
    }

    private aptl() {
    }

    @Override // defpackage.apag
    protected final Object dynamicMethod(apaf apafVar, Object obj, Object obj2) {
        switch (apafVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဈ\u0000\u0002\u001b", new Object[]{"e", "b", "c", aptk.class});
            case NEW_MUTABLE_INSTANCE:
                return new aptl();
            case NEW_BUILDER:
                return new aozy(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                apca apcaVar = d;
                if (apcaVar == null) {
                    synchronized (aptl.class) {
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
