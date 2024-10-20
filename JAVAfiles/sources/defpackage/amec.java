package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class amec extends apag implements apbu {
    public static final amec a;
    private static volatile apca h;
    public int b;
    public int c;
    public int d;
    public amdz e;
    public int f;
    public long g;
    private byte j = 2;
    private int i = -1;

    static {
        amec amecVar = new amec();
        a = amecVar;
        apag.registerDefaultInstance(amec.class, amecVar);
    }

    private amec() {
    }

    public static /* synthetic */ void a(amec amecVar) {
        amecVar.b |= 2;
        amecVar.i = 1;
    }

    @Override // defpackage.apag
    protected final Object dynamicMethod(apaf apafVar, Object obj, Object obj2) {
        byte b = 1;
        switch (apafVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.j);
            case SET_MEMOIZED_IS_INITIALIZED:
                if (obj == null) {
                    b = 0;
                }
                this.j = b;
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0004\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0001\u0001ဌ\u0000\u0002င\u0001\u0003ဌ\u0002\u0004ᐉ\u0003\u0005ဌ\u0004\u0006ဂ\u0005", new Object[]{"b", "c", "i", "d", "e", "f", "g"});
            case NEW_MUTABLE_INSTANCE:
                return new amec();
            case NEW_BUILDER:
                return new aozy(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                apca apcaVar = h;
                if (apcaVar == null) {
                    synchronized (amec.class) {
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
