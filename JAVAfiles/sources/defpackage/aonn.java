package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aonn extends apag implements apbu {
    public static final aonn a;
    private static volatile apca f;
    public int b;
    public long c;
    public apar d;
    public apax e;

    static {
        aonn aonnVar = new aonn();
        a = aonnVar;
        apag.registerDefaultInstance(aonn.class, aonnVar);
    }

    private aonn() {
        apag.emptyProtobufList();
        this.d = emptyLongList();
        this.e = emptyProtobufList();
    }

    @Override // defpackage.apag
    protected final Object dynamicMethod(apaf apafVar, Object obj, Object obj2) {
        switch (apafVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0004\u0003\u0000\u0001\u0004\u0006\u0003\u0000\u0002\u0000\u0004\u001b\u0005စ\u0001\u0006\u0017", new Object[]{"b", "e", aonm.class, "c", "d"});
            case NEW_MUTABLE_INSTANCE:
                return new aonn();
            case NEW_BUILDER:
                return new aozy(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                apca apcaVar = f;
                if (apcaVar == null) {
                    synchronized (aonn.class) {
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
