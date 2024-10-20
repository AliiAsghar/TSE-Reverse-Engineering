package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class amkv extends apag implements apbu {
    public static final amkv a;
    private static volatile apca l;
    public int b;
    public int c;
    public boolean d;
    public boolean e;
    public boolean f;
    public boolean g;
    public int h;
    public boolean i;
    public boolean j;
    public int k;

    static {
        amkv amkvVar = new amkv();
        a = amkvVar;
        apag.registerDefaultInstance(amkv.class, amkvVar);
    }

    private amkv() {
    }

    @Override // defpackage.apag
    protected final Object dynamicMethod(apaf apafVar, Object obj, Object obj2) {
        switch (apafVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\t\u0000\u0001\u0001\t\t\u0000\u0000\u0000\u0001᠌\u0000\u0002ဇ\u0001\u0003ဇ\u0002\u0004ဇ\u0003\u0005ဇ\u0004\u0006᠌\u0005\u0007ဇ\u0006\bဇ\u0007\tင\b", new Object[]{"b", "c", amjw.p, "d", "e", "f", "g", "h", amjw.o, "i", "j", "k"});
            case NEW_MUTABLE_INSTANCE:
                return new amkv();
            case NEW_BUILDER:
                return new aozy(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                apca apcaVar = l;
                if (apcaVar == null) {
                    synchronized (amkv.class) {
                        apcaVar = l;
                        if (apcaVar == null) {
                            apcaVar = new aozz(a);
                            l = apcaVar;
                        }
                    }
                }
                return apcaVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
