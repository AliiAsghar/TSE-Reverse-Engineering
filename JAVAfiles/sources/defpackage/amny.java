package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class amny extends apab implements apac {
    public static final amny a;
    private static volatile apca h;
    public int b;
    public amoa c;
    public int d;
    public amoa e;
    public long f;
    public boolean g;
    private byte i = 2;

    static {
        amny amnyVar = new amny();
        a = amnyVar;
        apag.registerDefaultInstance(amny.class, amnyVar);
    }

    private amny() {
    }

    @Override // defpackage.apag
    protected final Object dynamicMethod(apaf apafVar, Object obj, Object obj2) {
        byte b = 1;
        switch (apafVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.i);
            case SET_MEMOIZED_IS_INITIALIZED:
                if (obj == null) {
                    b = 0;
                }
                this.i = b;
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\u0005\u0000\u0001\u0001\u0006\u0005\u0000\u0000\u0002\u0001ᐉ\u0000\u0002᠌\u0001\u0003ᐉ\u0002\u0004ဂ\u0004\u0006ဇ\u0005", new Object[]{"b", "c", "d", amna.n, "e", "f", "g"});
            case NEW_MUTABLE_INSTANCE:
                return new amny();
            case NEW_BUILDER:
                return new apaa(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                apca apcaVar = h;
                if (apcaVar == null) {
                    synchronized (amny.class) {
                        apcaVar = h;
                        if (apcaVar == null) {
                            apcaVar = new aozz(a);
                            h = apcaVar;
                        }
                    }
                }
                return apcaVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
