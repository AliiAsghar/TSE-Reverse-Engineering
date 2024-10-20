package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class alen extends apag implements apbu {
    public static final alen a;
    private static volatile apca i;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public int g;
    public alex h;

    static {
        alen alenVar = new alen();
        a = alenVar;
        apag.registerDefaultInstance(alen.class, alenVar);
    }

    private alen() {
    }

    @Override // defpackage.apag
    protected final Object dynamicMethod(apaf apafVar, Object obj, Object obj2) {
        switch (apafVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0000\u0006\u0000\u0001\u0001\u0007\u0006\u0000\u0000\u0000\u0001\u000b\u0002\u000b\u0003\u000b\u0004\u000b\u0005ဉ\u0000\u0007\u000b", new Object[]{"b", "c", "d", "e", "g", "h", "f"});
            case NEW_MUTABLE_INSTANCE:
                return new alen();
            case NEW_BUILDER:
                return new aozy(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                apca apcaVar = i;
                if (apcaVar == null) {
                    synchronized (alen.class) {
                        apcaVar = i;
                        if (apcaVar == null) {
                            apcaVar = new aozz(a);
                            i = apcaVar;
                        }
                    }
                }
                return apcaVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
