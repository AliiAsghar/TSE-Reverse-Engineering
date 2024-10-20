package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class amzk extends apag implements apbu {
    public static final amzk a;
    private static volatile apca h;
    public int b;
    public boolean c;
    public boolean d;
    public boolean e;
    public boolean f;
    public apax g = emptyProtobufList();

    static {
        amzk amzkVar = new amzk();
        a = amzkVar;
        apag.registerDefaultInstance(amzk.class, amzkVar);
    }

    private amzk() {
    }

    @Override // defpackage.apag
    protected final Object dynamicMethod(apaf apafVar, Object obj, Object obj2) {
        switch (apafVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0004\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0000\u0001ဇ\u0000\u0002ဇ\u0001\u0003ဇ\u0002\u0004ဇ\u0003\u0005\u001b", new Object[]{"b", "c", "d", "e", "f", "g", amze.class});
            case NEW_MUTABLE_INSTANCE:
                return new amzk();
            case NEW_BUILDER:
                return new aozy(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                apca apcaVar = h;
                if (apcaVar == null) {
                    synchronized (amzk.class) {
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
