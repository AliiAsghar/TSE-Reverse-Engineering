package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aprq extends apag implements apbu {
    public static final aprq a;
    private static volatile apca h;
    public int b;
    public int c;
    public apao d = emptyIntList();
    public String e = "";
    public String f = "";
    public apax g = emptyProtobufList();

    static {
        aprq aprqVar = new aprq();
        a = aprqVar;
        apag.registerDefaultInstance(aprq.class, aprqVar);
    }

    private aprq() {
    }

    @Override // defpackage.apag
    protected final Object dynamicMethod(apaf apafVar, Object obj, Object obj2) {
        switch (apafVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0004\u0006\u0000\u0000\u0001\u0006\u0006\u0000\u0002\u0000\u0001\f\u0002\u000b\u0003+\u0004Ȉ\u0005Ȉ\u0006\u001b", new Object[]{"b", "c", "d", "e", "f", "g", aprp.class});
            case NEW_MUTABLE_INSTANCE:
                return new aprq();
            case NEW_BUILDER:
                return new aozy(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                apca apcaVar = h;
                if (apcaVar == null) {
                    synchronized (aprq.class) {
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
