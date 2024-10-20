package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class asje extends apag implements apbu {
    public static final asje a;
    private static volatile apca b;
    private int c;
    private anav d;
    private byte e = 2;

    static {
        asje asjeVar = new asje();
        a = asjeVar;
        apag.registerDefaultInstance(asje.class, asjeVar);
    }

    private asje() {
        emptyProtobufList();
        apag.emptyProtobufList();
    }

    @Override // defpackage.apag
    protected final Object dynamicMethod(apaf apafVar, Object obj, Object obj2) {
        byte b2 = 1;
        switch (apafVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.e);
            case SET_MEMOIZED_IS_INITIALIZED:
                if (obj == null) {
                    b2 = 0;
                }
                this.e = b2;
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\u0001\u0000\u0001\u0005\u0005\u0001\u0000\u0000\u0001\u0005ᐉ\u0003", new Object[]{"c", "d"});
            case NEW_MUTABLE_INSTANCE:
                return new asje();
            case NEW_BUILDER:
                return new aozy(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                apca apcaVar = b;
                if (apcaVar == null) {
                    synchronized (asje.class) {
                        apcaVar = b;
                        if (apcaVar == null) {
                            apcaVar = new aozz(a);
                            b = apcaVar;
                        }
                    }
                }
                return apcaVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
