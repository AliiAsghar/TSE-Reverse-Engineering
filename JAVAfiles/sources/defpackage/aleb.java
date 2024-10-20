package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aleb extends apag implements apbu {
    public static final aleb a;
    private static volatile apca d;
    private byte e = 2;
    public apax b = emptyProtobufList();
    public aozb c = aozb.b;

    static {
        aleb alebVar = new aleb();
        a = alebVar;
        apag.registerDefaultInstance(aleb.class, alebVar);
    }

    private aleb() {
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
                return newMessageInfo(a, "\u0000\u0002\u0000\u0000\u0001\u0004\u0002\u0000\u0001\u0001\u0001Л\u0004\n", new Object[]{"b", alem.class, "c"});
            case NEW_MUTABLE_INSTANCE:
                return new aleb();
            case NEW_BUILDER:
                return new aozy(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                apca apcaVar = d;
                if (apcaVar == null) {
                    synchronized (aleb.class) {
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
