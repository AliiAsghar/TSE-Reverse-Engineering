package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class afcy extends apag implements apbu {
    public static final afcy a;
    private static volatile apca j;
    public int b;
    public Object d;
    public long g;
    public apct i;
    public int c = 0;
    public String e = "";
    public String f = "";
    public String h = "";

    static {
        afcy afcyVar = new afcy();
        a = afcyVar;
        apag.registerDefaultInstance(afcy.class, afcyVar);
    }

    private afcy() {
    }

    @Override // defpackage.apag
    protected final Object dynamicMethod(apaf apafVar, Object obj, Object obj2) {
        switch (apafVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0004\u0006\u0001\u0001\u0001È\u0006\u0000\u0000\u0000\u0001ለ\u0000\u0002ለ\u0001\u0003ဂ\u0002\u0004ለ\u0003\u0005ဉ\u0004È<\u0000", new Object[]{"d", "c", "b", "e", "f", "g", "h", "i", afcx.class});
            case NEW_MUTABLE_INSTANCE:
                return new afcy();
            case NEW_BUILDER:
                return new aozy(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                apca apcaVar = j;
                if (apcaVar == null) {
                    synchronized (afcy.class) {
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
