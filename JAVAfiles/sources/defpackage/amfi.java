package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class amfi extends apag implements apbu {
    public static final amfi a;
    private static volatile apca f;
    public int b;
    public int c;
    public long d;
    public apax e = emptyProtobufList();

    static {
        amfi amfiVar = new amfi();
        a = amfiVar;
        apag.registerDefaultInstance(amfi.class, amfiVar);
    }

    private amfi() {
    }

    @Override // defpackage.apag
    protected final Object dynamicMethod(apaf apafVar, Object obj, Object obj2) {
        switch (apafVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001᠌\u0000\u0002ဂ\u0001\u0003\u001b", new Object[]{"b", "c", amff.e, "d", "e", amji.class});
            case NEW_MUTABLE_INSTANCE:
                return new amfi();
            case NEW_BUILDER:
                return new aozy(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                apca apcaVar = f;
                if (apcaVar == null) {
                    synchronized (amfi.class) {
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
