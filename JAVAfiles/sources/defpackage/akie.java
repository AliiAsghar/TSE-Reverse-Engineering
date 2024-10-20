package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class akie extends apag implements apbu {
    public static final akie a;
    private static volatile apca j;
    public int b;
    public String c = "";
    public String d = "";
    public aozb e = aozb.b;
    public apax f = emptyProtobufList();
    public apax g = apag.emptyProtobufList();
    public int h;
    public long i;

    static {
        akie akieVar = new akie();
        a = akieVar;
        apag.registerDefaultInstance(akie.class, akieVar);
    }

    private akie() {
    }

    @Override // defpackage.apag
    protected final Object dynamicMethod(apaf apafVar, Object obj, Object obj2) {
        switch (apafVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0004\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0002\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ည\u0002\u0004\u001b\u0005\u001a\u0006ဆ\u0003\u0007စ\u0004", new Object[]{"b", "c", "d", "e", "f", akif.class, "g", "h", "i"});
            case NEW_MUTABLE_INSTANCE:
                return new akie();
            case NEW_BUILDER:
                return new aozy(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                apca apcaVar = j;
                if (apcaVar == null) {
                    synchronized (akie.class) {
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
