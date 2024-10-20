package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class amht extends apag implements apbu {
    public static final amht a;
    private static volatile apca k;
    public int b;
    public int c;
    public amee d;
    public int e;
    public amfk f;
    public int g;
    public amjd h;
    public String i = "";
    public amly j;

    static {
        amht amhtVar = new amht();
        a = amhtVar;
        apag.registerDefaultInstance(amht.class, amhtVar);
    }

    private amht() {
    }

    @Override // defpackage.apag
    protected final Object dynamicMethod(apaf apafVar, Object obj, Object obj2) {
        switch (apafVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\b\u0000\u0001\u0001\t\b\u0000\u0000\u0000\u0001᠌\u0000\u0002ဉ\u0001\u0003᠌\u0002\u0005ဉ\u0004\u0006᠌\u0005\u0007ဉ\u0006\bဈ\u0007\tဉ\b", new Object[]{"b", "c", amhj.k, "d", "e", amhj.l, "f", "g", amhj.m, "h", "i", "j"});
            case NEW_MUTABLE_INSTANCE:
                return new amht();
            case NEW_BUILDER:
                return new aozy(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                apca apcaVar = k;
                if (apcaVar == null) {
                    synchronized (amht.class) {
                        apcaVar = k;
                        if (apcaVar == null) {
                            apcaVar = new aozz(a);
                            k = apcaVar;
                        }
                    }
                }
                return apcaVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
