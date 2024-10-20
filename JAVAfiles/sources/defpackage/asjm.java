package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class asjm extends apag implements apbu {
    public static final asjm a;
    private static volatile apca p;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public int g;
    public int h;
    public int i;
    public asjp j;
    public apax k = emptyProtobufList();
    public int l;
    public int m;
    public int n;
    public asjp o;

    static {
        asjm asjmVar = new asjm();
        a = asjmVar;
        apag.registerDefaultInstance(asjm.class, asjmVar);
    }

    private asjm() {
    }

    @Override // defpackage.apag
    protected final Object dynamicMethod(apaf apafVar, Object obj, Object obj2) {
        switch (apafVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\r\u0000\u0001\u0001\r\r\u0000\u0001\u0000\u0001င\u0000\u0002င\u0001\u0003င\u0003\u0004င\u0006\u0005\u001b\u0006င\b\u0007င\u0002\bင\u0004\tင\u0005\nဉ\u0007\u000bင\t\fင\n\rဉ\u000b", new Object[]{"b", "c", "d", "f", "i", "k", asjl.class, "l", "e", "g", "h", "j", "m", "n", "o"});
            case NEW_MUTABLE_INSTANCE:
                return new asjm();
            case NEW_BUILDER:
                return new aozy(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                apca apcaVar = p;
                if (apcaVar == null) {
                    synchronized (asjm.class) {
                        apcaVar = p;
                        if (apcaVar == null) {
                            apcaVar = new aozz(a);
                            p = apcaVar;
                        }
                    }
                }
                return apcaVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
