package defpackage;

/* compiled from: PG */
@Deprecated
/* loaded from: classes4.dex */
public final class anfs extends apag implements apbu {
    public static final anfs a;
    private static volatile apca d;
    public String b = "";
    public apax c = emptyProtobufList();

    static {
        anfs anfsVar = new anfs();
        a = anfsVar;
        apag.registerDefaultInstance(anfs.class, anfsVar);
    }

    private anfs() {
    }

    @Override // defpackage.apag
    protected final Object dynamicMethod(apaf apafVar, Object obj, Object obj2) {
        switch (apafVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0004\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001Ȉ\u0002\u001b", new Object[]{"b", "c", ango.class});
            case NEW_MUTABLE_INSTANCE:
                return new anfs();
            case NEW_BUILDER:
                return new aozy(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                apca apcaVar = d;
                if (apcaVar == null) {
                    synchronized (anfs.class) {
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
