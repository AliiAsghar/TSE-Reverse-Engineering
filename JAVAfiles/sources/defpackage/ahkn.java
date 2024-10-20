package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ahkn extends apag implements apbu {
    public static final ahkn a;
    private static volatile apca d;
    public Object c;
    public int b = 0;
    private byte e = 2;

    static {
        ahkn ahknVar = new ahkn();
        a = ahknVar;
        apag.registerDefaultInstance(ahkn.class, ahknVar);
    }

    private ahkn() {
    }

    @Override // defpackage.apag
    protected final Object dynamicMethod(apaf apafVar, Object obj, Object obj2) {
        byte b = 1;
        switch (apafVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.e);
            case SET_MEMOIZED_IS_INITIALIZED:
                if (obj == null) {
                    b = 0;
                }
                this.e = b;
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0004\u0002\u0001\u0000\u0001\u0002\u0002\u0000\u0000\u0001\u0001м\u0000\u0002<\u0000", new Object[]{"c", "b", ashu.class, ahko.class});
            case NEW_MUTABLE_INSTANCE:
                return new ahkn();
            case NEW_BUILDER:
                return new aozy(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                apca apcaVar = d;
                if (apcaVar == null) {
                    synchronized (ahkn.class) {
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
