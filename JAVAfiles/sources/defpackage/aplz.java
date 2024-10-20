package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aplz extends apag implements apbu {
    public static final aplz a;
    private static volatile apca o;
    public int b;
    public int c;
    public int d;
    public int g;
    public int i;
    public int j;
    public int k;
    public int l;
    public int m;
    public String e = "";
    public String f = "";
    public String h = "";
    public String n = "";

    static {
        aplz aplzVar = new aplz();
        a = aplzVar;
        apag.registerDefaultInstance(aplz.class, aplzVar);
    }

    private aplz() {
    }

    @Override // defpackage.apag
    protected final Object dynamicMethod(apaf apafVar, Object obj, Object obj2) {
        switch (apafVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0004\r\u0000\u0000\u0001\u0011\r\u0000\u0000\u0000\u0001\u0004\u0002\f\u0003\f\u0004Ȉ\u0005Ȉ\u0006\u0004\u0007Ȉ\n\u0004\u000b\u0004\f\u0004\r\f\u0010\f\u0011Ȉ", new Object[]{"b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n"});
            case NEW_MUTABLE_INSTANCE:
                return new aplz();
            case NEW_BUILDER:
                return new aozy(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                apca apcaVar = o;
                if (apcaVar == null) {
                    synchronized (aplz.class) {
                        apcaVar = o;
                        if (apcaVar == null) {
                            apcaVar = new aozz(a);
                            o = apcaVar;
                        }
                    }
                }
                return apcaVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
