package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ahun extends apag implements apbu {
    public static final ahun a;
    private static volatile apca e;
    public int b;
    public apax c = apag.emptyProtobufList();
    public String d = "";

    static {
        ahun ahunVar = new ahun();
        a = ahunVar;
        apag.registerDefaultInstance(ahun.class, ahunVar);
    }

    private ahun() {
    }

    @Override // defpackage.apag
    protected final Object dynamicMethod(apaf apafVar, Object obj, Object obj2) {
        switch (apafVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001a\u0002ဈ\u0000", new Object[]{"b", "c", "d"});
            case NEW_MUTABLE_INSTANCE:
                return new ahun();
            case NEW_BUILDER:
                return new aozy(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                apca apcaVar = e;
                if (apcaVar == null) {
                    synchronized (ahun.class) {
                        apcaVar = e;
                        if (apcaVar == null) {
                            apcaVar = new aozz(a);
                            e = apcaVar;
                        }
                    }
                }
                return apcaVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
