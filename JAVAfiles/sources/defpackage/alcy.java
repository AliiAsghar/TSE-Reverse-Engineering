package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class alcy extends apag implements apbu {
    public static final alcy a;
    private static volatile apca h;
    public int b;
    public alcs c;
    public int f;
    public apax d = emptyProtobufList();
    public apax e = emptyProtobufList();
    public int g = 1;

    static {
        alcy alcyVar = new alcy();
        a = alcyVar;
        apag.registerDefaultInstance(alcy.class, alcyVar);
    }

    private alcy() {
    }

    @Override // defpackage.apag
    protected final Object dynamicMethod(apaf apafVar, Object obj, Object obj2) {
        switch (apafVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0004\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0002\u0000\u0001ဉ\u0000\u0002\u001b\u0003\u001b\u0004င\u0001\u0005᠌\u0002", new Object[]{"b", "c", "d", alcw.class, "e", alcx.class, "f", "g", ahbp.k});
            case NEW_MUTABLE_INSTANCE:
                return new alcy();
            case NEW_BUILDER:
                return new aozy(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                apca apcaVar = h;
                if (apcaVar == null) {
                    synchronized (alcy.class) {
                        apcaVar = h;
                        if (apcaVar == null) {
                            apcaVar = new aozz(a);
                            h = apcaVar;
                        }
                    }
                }
                return apcaVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
