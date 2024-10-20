package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ulz extends apag implements apbu {
    public static final ulz a;
    private static volatile apca d;
    public apax b = apag.emptyProtobufList();
    public apax c = apag.emptyProtobufList();

    static {
        ulz ulzVar = new ulz();
        a = ulzVar;
        apag.registerDefaultInstance(ulz.class, ulzVar);
    }

    private ulz() {
    }

    @Override // defpackage.apag
    protected final Object dynamicMethod(apaf apafVar, Object obj, Object obj2) {
        switch (apafVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0002\u0000\u0001Ț\u0002Ț", new Object[]{"b", "c"});
            case NEW_MUTABLE_INSTANCE:
                return new ulz();
            case NEW_BUILDER:
                return new aozy(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                apca apcaVar = d;
                if (apcaVar == null) {
                    synchronized (ulz.class) {
                        apcaVar = d;
                        if (apcaVar == null) {
                            apcaVar = new aozz(a);
                            d = apcaVar;
                        }
                    }
                }
                return apcaVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
