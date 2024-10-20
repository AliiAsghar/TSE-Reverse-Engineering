package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class amob extends apag implements apbu {
    public static final amob a;
    private static volatile apca e;
    public int b;
    public anah d;
    private amzx f;
    private byte g = 2;
    public int c = 1;

    static {
        amob amobVar = new amob();
        a = amobVar;
        apag.registerDefaultInstance(amob.class, amobVar);
    }

    private amob() {
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
                return newMessageInfo(a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0002\u0001᠌\u0000\u0002ᐉ\u0001\u0003ᐉ\u0002", new Object[]{"b", "c", amna.o, "d", "f"});
            case NEW_MUTABLE_INSTANCE:
                return new amob();
            case NEW_BUILDER:
                return new aozy(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                apca apcaVar = e;
                if (apcaVar == null) {
                    synchronized (amob.class) {
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
