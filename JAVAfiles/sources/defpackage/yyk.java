package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class yyk extends apag implements apbu {
    public static final yyk a;
    private static volatile apca f;
    public long c;
    public boolean e;
    public String b = "";
    public String d = "";

    static {
        yyk yykVar = new yyk();
        a = yykVar;
        apag.registerDefaultInstance(yyk.class, yykVar);
    }

    private yyk() {
    }

    @Override // defpackage.apag
    protected final Object dynamicMethod(apaf apafVar, Object obj, Object obj2) {
        switch (apafVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0000\u0004\u0000\u0000\u0002\u0005\u0004\u0000\u0000\u0000\u0002Ȉ\u0003\u0002\u0004Ȉ\u0005\u0007", new Object[]{"b", "c", "d", "e"});
            case NEW_MUTABLE_INSTANCE:
                return new yyk();
            case NEW_BUILDER:
                return new aozy(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                apca apcaVar = f;
                if (apcaVar == null) {
                    synchronized (yyk.class) {
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
