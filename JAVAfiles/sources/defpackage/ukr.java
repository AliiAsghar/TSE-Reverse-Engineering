package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ukr extends apag implements apbu {
    public static final ukr a;
    private static volatile apca j;
    public int b;
    public int c;
    public int d;
    public int f;
    public boolean g;
    public apct h;
    private byte k = 2;
    public String e = "";
    public String i = "";

    static {
        ukr ukrVar = new ukr();
        a = ukrVar;
        apag.registerDefaultInstance(ukr.class, ukrVar);
    }

    private ukr() {
    }

    @Override // defpackage.apag
    protected final Object dynamicMethod(apaf apafVar, Object obj, Object obj2) {
        byte b = 1;
        switch (apafVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.k);
            case SET_MEMOIZED_IS_INITIALIZED:
                if (obj == null) {
                    b = 0;
                }
                this.k = b;
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\u0007\u0000\u0001\u0001\b\u0007\u0000\u0000\u0004\u0001ᔄ\u0000\u0002ᔄ\u0001\u0003ᔈ\u0002\u0004င\u0003\u0005ᔇ\u0004\u0007ဉ\u0006\bဈ\u0007", new Object[]{"b", "c", "d", "e", "f", "g", "h", "i"});
            case NEW_MUTABLE_INSTANCE:
                return new ukr();
            case NEW_BUILDER:
                return new aozy(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                apca apcaVar = j;
                if (apcaVar == null) {
                    synchronized (ukr.class) {
                        apcaVar = j;
                        if (apcaVar == null) {
                            apcaVar = new aozz(a);
                            j = apcaVar;
                        }
                    }
                }
                return apcaVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
