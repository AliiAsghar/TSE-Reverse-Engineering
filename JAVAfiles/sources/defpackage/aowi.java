package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aowi extends apag implements apbu {
    public static final aowi a;
    private static volatile apca h;
    public int b;
    public int c;
    public int d;
    public int e;
    public apun f;
    public boolean g;

    static {
        aowi aowiVar = new aowi();
        a = aowiVar;
        apag.registerDefaultInstance(aowi.class, aowiVar);
    }

    private aowi() {
    }

    @Override // defpackage.apag
    protected final Object dynamicMethod(apaf apafVar, Object obj, Object obj2) {
        switch (apafVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0000\u0005\u0000\u0001\u0001\u0006\u0005\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001\u0003င\u0002\u0005\u0007\u0006ဉ\u0003", new Object[]{"b", "c", "d", "e", "g", "f"});
            case NEW_MUTABLE_INSTANCE:
                return new aowi();
            case NEW_BUILDER:
                return new aozy(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                apca apcaVar = h;
                if (apcaVar == null) {
                    synchronized (aowi.class) {
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
