package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class asiw extends apag implements apbu {
    public static final asiw a;
    private static volatile apca f;
    public int b;
    public String c = "";
    public long d;
    public apar e;

    static {
        asiw asiwVar = new asiw();
        a = asiwVar;
        apag.registerDefaultInstance(asiw.class, asiwVar);
    }

    private asiw() {
        emptyLongList();
        this.e = emptyLongList();
    }

    @Override // defpackage.apag
    protected final Object dynamicMethod(apaf apafVar, Object obj, Object obj2) {
        switch (apafVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0001\u0000\u0001ဈ\u0000\u0002ဃ\u0001\u0004\u0015", new Object[]{"b", "c", "d", "e"});
            case NEW_MUTABLE_INSTANCE:
                return new asiw();
            case NEW_BUILDER:
                return new aozy(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                apca apcaVar = f;
                if (apcaVar == null) {
                    synchronized (asiw.class) {
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
