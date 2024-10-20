package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class apzn extends apag implements apbu {
    public static final apzn a;
    private static volatile apca l;
    public int b;
    public aqgb c;
    public int d;
    public apzm e;
    public int f;
    public boolean g;
    public float h;
    public String i = "";
    public String j = "";
    public aqge k;

    static {
        apzn apznVar = new apzn();
        a = apznVar;
        apag.registerDefaultInstance(apzn.class, apznVar);
    }

    private apzn() {
    }

    @Override // defpackage.apag
    protected final Object dynamicMethod(apaf apafVar, Object obj, Object obj2) {
        switch (apafVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0000\t\u0000\u0001\u0001\n\t\u0000\u0000\u0000\u0001ဉ\u0000\u0002\f\u0003ဉ\u0001\u0004\f\u0005\u0001\u0006Ȉ\u0007Ȉ\b\u0007\nဉ\u0002", new Object[]{"b", "c", "d", "e", "f", "h", "i", "j", "g", "k"});
            case NEW_MUTABLE_INSTANCE:
                return new apzn();
            case NEW_BUILDER:
                return new aozy(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                apca apcaVar = l;
                if (apcaVar == null) {
                    synchronized (apzn.class) {
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
