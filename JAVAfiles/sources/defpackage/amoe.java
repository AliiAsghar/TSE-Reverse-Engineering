package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class amoe extends apab implements apac {
    public static final amoe a;
    private static volatile apca m;
    public int b;
    public int c;
    public int g;
    public aplk h;
    public int i;
    public amnw k;
    private byte n = 2;
    public int d = -1;
    public apao e = emptyIntList();
    public String f = "";
    public int j = -1;

    static {
        amoe amoeVar = new amoe();
        a = amoeVar;
        apag.registerDefaultInstance(amoe.class, amoeVar);
    }

    private amoe() {
    }

    @Override // defpackage.apag
    protected final Object dynamicMethod(apaf apafVar, Object obj, Object obj2) {
        byte b = 1;
        switch (apafVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.n);
            case SET_MEMOIZED_IS_INITIALIZED:
                if (obj == null) {
                    b = 0;
                }
                this.n = b;
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\t\u0000\u0001\u0001è\t\u0000\u0001\u0002\u0001င\u0000\u0003င\u0001\u0004\u0016\u0005ဈ\u0002\u0006᠌\u0005\u0007င\u0003\u000bᐉ\u0004\u0095င\bèᐉ\t", new Object[]{"b", "c", "d", "e", "f", "i", amna.p, "g", "h", "j", "k"});
            case NEW_MUTABLE_INSTANCE:
                return new amoe();
            case NEW_BUILDER:
                return new apaa(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                apca apcaVar = m;
                if (apcaVar == null) {
                    synchronized (amoe.class) {
                        apcaVar = m;
                        if (apcaVar == null) {
                            apcaVar = new aozz(a);
                            m = apcaVar;
                        }
                    }
                }
                return apcaVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
