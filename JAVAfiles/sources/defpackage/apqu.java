package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class apqu extends apag implements apbu {
    public static final apqu a;
    private static volatile apca c;
    public apax b = emptyProtobufList();

    static {
        apqu apquVar = new apqu();
        a = apquVar;
        apag.registerDefaultInstance(apqu.class, apquVar);
    }

    private apqu() {
    }

    @Override // defpackage.apag
    protected final Object dynamicMethod(apaf apafVar, Object obj, Object obj2) {
        switch (apafVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"b", apqx.class});
            case NEW_MUTABLE_INSTANCE:
                return new apqu();
            case NEW_BUILDER:
                return new aozy((byte[]) null, (byte[]) null);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                apca apcaVar = c;
                if (apcaVar == null) {
                    synchronized (apqu.class) {
                        apcaVar = c;
                        if (apcaVar == null) {
                            apcaVar = new aozz(a);
                            c = apcaVar;
                        }
                    }
                }
                return apcaVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
