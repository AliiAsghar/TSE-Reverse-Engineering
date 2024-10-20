package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class asjw extends apag implements apbu {
    public static final asjw a;
    private static volatile apca f;
    public int b;
    public aozn d;
    public boolean e;
    private byte g = 2;
    public apax c = emptyProtobufList();

    static {
        asjw asjwVar = new asjw();
        a = asjwVar;
        apag.registerDefaultInstance(asjw.class, asjwVar);
    }

    private asjw() {
    }

    @Override // defpackage.apag
    protected final Object dynamicMethod(apaf apafVar, Object obj, Object obj2) {
        byte b = 1;
        switch (apafVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.g);
            case SET_MEMOIZED_IS_INITIALIZED:
                if (obj == null) {
                    b = 0;
                }
                this.g = b;
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0001\u0001Л\u0002ဉ\u0000\u0003ဇ\u0001", new Object[]{"b", "c", asjv.class, "d", "e"});
            case NEW_MUTABLE_INSTANCE:
                return new asjw();
            case NEW_BUILDER:
                return new aozy(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                apca apcaVar = f;
                if (apcaVar == null) {
                    synchronized (asjw.class) {
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
