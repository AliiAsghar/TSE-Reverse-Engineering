package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class abgy extends apag implements apbu {
    public static final abgy a;
    private static volatile apca h;
    public Object c;
    public apct d;
    public abhf f;
    public int g;
    private int i;
    public int b = 0;
    public String e = "";

    static {
        abgy abgyVar = new abgy();
        a = abgyVar;
        apag.registerDefaultInstance(abgy.class, abgyVar);
    }

    private abgy() {
    }

    @Override // defpackage.apag
    protected final Object dynamicMethod(apaf apafVar, Object obj, Object obj2) {
        switch (apafVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0004\u0006\u0001\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001<\u0000\u0002ဉ\u0000\u0003ለ\u0001\u0004ဉ\u0002\u0005<\u0000\u0006ဌ\u0003", new Object[]{"c", "b", "i", abha.class, "d", "e", "f", abgl.class, "g"});
            case NEW_MUTABLE_INSTANCE:
                return new abgy();
            case NEW_BUILDER:
                return new aozy(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                apca apcaVar = h;
                if (apcaVar == null) {
                    synchronized (abgy.class) {
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
