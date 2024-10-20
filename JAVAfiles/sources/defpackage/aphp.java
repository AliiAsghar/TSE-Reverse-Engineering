package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aphp extends apag implements apbu {
    public static final aphp a;
    private static volatile apca n;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public int g;
    public int h;
    public int i;
    public int j;
    public int k;
    public int l;
    public int m;

    static {
        aphp aphpVar = new aphp();
        a = aphpVar;
        apag.registerDefaultInstance(aphp.class, aphpVar);
    }

    private aphp() {
    }

    @Override // defpackage.apag
    protected final Object dynamicMethod(apaf apafVar, Object obj, Object obj2) {
        switch (apafVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\u000b\u0000\u0001\u0001\u000b\u000b\u0000\u0000\u0000\u0001᠌\u0000\u0002င\u0001\u0003င\u0002\u0004င\u0003\u0005င\u0004\u0006င\u0005\u0007᠌\u0006\bင\u0007\tင\b\nင\t\u000bင\n", new Object[]{"b", "c", apkm.j, "d", "e", "f", "g", "h", "i", apkm.k, "j", "k", "l", "m"});
            case NEW_MUTABLE_INSTANCE:
                return new aphp();
            case NEW_BUILDER:
                return new aozy(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                apca apcaVar = n;
                if (apcaVar == null) {
                    synchronized (aphp.class) {
                        apcaVar = n;
                        if (apcaVar == null) {
                            apcaVar = new aozz(a);
                            n = apcaVar;
                        }
                    }
                }
                return apcaVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
