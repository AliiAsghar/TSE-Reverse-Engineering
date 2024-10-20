package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aqel extends apag implements apbu {
    public static final aqel a;
    private static volatile apca e;
    public int b = 0;
    public Object c;
    public aqeh d;
    private int f;

    static {
        aqel aqelVar = new aqel();
        a = aqelVar;
        apag.registerDefaultInstance(aqel.class, aqelVar);
    }

    private aqel() {
    }

    @Override // defpackage.apag
    protected final Object dynamicMethod(apaf apafVar, Object obj, Object obj2) {
        switch (apafVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0000\u0007\u0001\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001ဉ\u0000\u0002<\u0000\u0003<\u0000\u0004<\u0000\u0005<\u0000\u0006<\u0000\u0007<\u0000", new Object[]{"c", "b", "f", "d", aqds.class, aqei.class, aqek.class, aqee.class, aqej.class, aqef.class});
            case NEW_MUTABLE_INSTANCE:
                return new aqel();
            case NEW_BUILDER:
                return new aozy(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                apca apcaVar = e;
                if (apcaVar == null) {
                    synchronized (aqel.class) {
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
