package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ahvp extends apag implements apbu {
    public static final ahvp a;
    private static volatile apca h;
    public int b;
    public long f;
    public String c = "";
    public aozb d = aozb.b;
    public String e = "";
    public apax g = emptyProtobufList();

    static {
        ahvp ahvpVar = new ahvp();
        a = ahvpVar;
        apag.registerDefaultInstance(ahvp.class, ahvpVar);
    }

    private ahvp() {
    }

    @Override // defpackage.apag
    protected final Object dynamicMethod(apaf apafVar, Object obj, Object obj2) {
        switch (apafVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0004\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0000\u0001ဈ\u0000\u0002ည\u0001\u0003ဈ\u0002\u0004ဂ\u0003\u0005\u001b", new Object[]{"b", "c", "d", "e", "f", "g", ahvq.class});
            case NEW_MUTABLE_INSTANCE:
                return new ahvp();
            case NEW_BUILDER:
                return new aozy(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                apca apcaVar = h;
                if (apcaVar == null) {
                    synchronized (ahvp.class) {
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
