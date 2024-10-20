package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ahbq extends apab implements apac {
    public static final ahbq a;
    private static volatile apca c;
    public int b;
    private int d;
    private byte e = 2;

    static {
        ahbq ahbqVar = new ahbq();
        a = ahbqVar;
        apag.registerDefaultInstance(ahbq.class, ahbqVar);
    }

    private ahbq() {
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
                return newMessageInfo(a, "\u0004\u0001\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0000\u0002᠌\u0001", new Object[]{"d", "b", ahbp.a});
            case NEW_MUTABLE_INSTANCE:
                return new ahbq();
            case NEW_BUILDER:
                return new apaa(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                apca apcaVar = c;
                if (apcaVar == null) {
                    synchronized (ahbq.class) {
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
