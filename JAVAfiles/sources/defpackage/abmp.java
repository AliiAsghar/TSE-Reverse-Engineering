package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class abmp extends apag implements apbu {
    public static final abmp a;
    private static volatile apca g;
    public int b;
    public Object d;
    public int f;
    public int c = 0;
    public String e = "";

    static {
        abmp abmpVar = new abmp();
        a = abmpVar;
        apag.registerDefaultInstance(abmp.class, abmpVar);
    }

    private abmp() {
    }

    @Override // defpackage.apag
    protected final Object dynamicMethod(apaf apafVar, Object obj, Object obj2) {
        switch (apafVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0000\u0003\u0001\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ለ\u0000\u0002င\u0001\u0003<\u0000", new Object[]{"d", "c", "b", "e", "f", abnd.class});
            case NEW_MUTABLE_INSTANCE:
                return new abmp();
            case NEW_BUILDER:
                return new aozy(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                apca apcaVar = g;
                if (apcaVar == null) {
                    synchronized (abmp.class) {
                        apcaVar = g;
                        if (apcaVar == null) {
                            apcaVar = new aozz(a);
                            g = apcaVar;
                        }
                    }
                }
                return apcaVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
