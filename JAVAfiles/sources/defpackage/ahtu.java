package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ahtu extends apag implements apbu {
    public static final ahtu a;
    private static volatile apca j;
    public int b;
    public String c = "";
    public aozb d = aozb.b;
    public String e = "";
    public apax f = emptyProtobufList();
    public apax g = apag.emptyProtobufList();
    public boolean h;
    public long i;

    static {
        ahtu ahtuVar = new ahtu();
        a = ahtuVar;
        apag.registerDefaultInstance(ahtu.class, ahtuVar);
    }

    private ahtu() {
    }

    @Override // defpackage.apag
    protected final Object dynamicMethod(apaf apafVar, Object obj, Object obj2) {
        switch (apafVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0004\u0007\u0000\u0001\u0001\t\u0007\u0000\u0002\u0000\u0001ဈ\u0002\u0002ဈ\u0000\u0003ည\u0001\u0004\u001b\u0005\u001a\bဇ\u0003\tဂ\u0004", new Object[]{"b", "e", "c", "d", "f", ahtw.class, "g", "h", "i"});
            case NEW_MUTABLE_INSTANCE:
                return new ahtu();
            case NEW_BUILDER:
                return new aozy(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                apca apcaVar = j;
                if (apcaVar == null) {
                    synchronized (ahtu.class) {
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
