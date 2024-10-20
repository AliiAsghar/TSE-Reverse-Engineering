package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ammt extends apag implements apbu {
    public static final ammt a;
    private static volatile apca f;
    public int b;
    public int c;
    public amms d;
    public apax e = emptyProtobufList();

    static {
        ammt ammtVar = new ammt();
        a = ammtVar;
        apag.registerDefaultInstance(ammt.class, ammtVar);
    }

    private ammt() {
    }

    @Override // defpackage.apag
    protected final Object dynamicMethod(apaf apafVar, Object obj, Object obj2) {
        switch (apafVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001င\u0000\u0002ဉ\u0001\u0003\u001b", new Object[]{"b", "c", "d", "e", ammv.class});
            case NEW_MUTABLE_INSTANCE:
                return new ammt();
            case NEW_BUILDER:
                return new aozy(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                apca apcaVar = f;
                if (apcaVar == null) {
                    synchronized (ammt.class) {
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
