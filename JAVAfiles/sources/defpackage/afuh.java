package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class afuh extends apag implements apbu {
    public static final afuh a;
    private static volatile apca h;
    public int b;
    public int c = 0;
    public Object d;
    public afdf e;
    public afcy f;
    public afvg g;

    static {
        afuh afuhVar = new afuh();
        a = afuhVar;
        apag.registerDefaultInstance(afuh.class, afuhVar);
    }

    private afuh() {
    }

    @Override // defpackage.apag
    protected final Object dynamicMethod(apaf apafVar, Object obj, Object obj2) {
        switch (apafVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0004\u0007\u0001\u0001dË\u0007\u0000\u0000\u0000dဉ\u0000eဉ\u0001fဉ\u0002È<\u0000É<\u0000Ê<\u0000Ë<\u0000", new Object[]{"d", "c", "b", "e", "f", "g", afub.class, afuf.class, afug.class, afty.class});
            case NEW_MUTABLE_INSTANCE:
                return new afuh();
            case NEW_BUILDER:
                return new aozy(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                apca apcaVar = h;
                if (apcaVar == null) {
                    synchronized (afuh.class) {
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
