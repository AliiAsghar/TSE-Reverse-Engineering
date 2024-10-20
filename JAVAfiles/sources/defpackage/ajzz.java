package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ajzz extends apag implements apbu {
    public static final ajzz a;
    private static volatile apca f;
    public int b;
    public int c;
    public ajzb d;
    public int e;
    private byte g = 2;

    static {
        ajzz ajzzVar = new ajzz();
        a = ajzzVar;
        apag.registerDefaultInstance(ajzz.class, ajzzVar);
    }

    private ajzz() {
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
                return newMessageInfo(a, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0001\u0001င\u0000\u0002ᐉ\u0001\u0003᠌\u0002", new Object[]{"b", "c", "d", "e", ahbp.g});
            case NEW_MUTABLE_INSTANCE:
                return new ajzz();
            case NEW_BUILDER:
                return new aozy(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                apca apcaVar = f;
                if (apcaVar == null) {
                    synchronized (ajzz.class) {
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
