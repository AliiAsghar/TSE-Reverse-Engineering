package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ahtv extends apag implements apbu {
    public static final ahtv a;
    private static volatile apca j;
    public int b;
    public String c = "";
    public apax d = emptyProtobufList();
    public apax e = emptyProtobufList();
    public apax f = emptyProtobufList();
    public apax g = emptyProtobufList();
    public apax h = emptyProtobufList();
    public apao i = emptyIntList();

    static {
        ahtv ahtvVar = new ahtv();
        a = ahtvVar;
        apag.registerDefaultInstance(ahtv.class, ahtvVar);
    }

    private ahtv() {
    }

    @Override // defpackage.apag
    protected final Object dynamicMethod(apaf apafVar, Object obj, Object obj2) {
        switch (apafVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0004\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0006\u0000\u0001ဈ\u0000\u0002\u001c\u0003\u001c\u0004\u001c\u0005\u001c\u0006\u001c\u0007\u0016", new Object[]{"b", "c", "d", "e", "f", "g", "h", "i"});
            case NEW_MUTABLE_INSTANCE:
                return new ahtv();
            case NEW_BUILDER:
                return new aozy(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                apca apcaVar = j;
                if (apcaVar == null) {
                    synchronized (ahtv.class) {
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
