package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class amnl extends apag implements apbu {
    public static final amnl a;
    private static volatile apca s;
    public int b;
    public int c;
    public float d;
    public float e;
    public int f;
    public int g;
    public int h;
    public int i;
    public int j;
    public int k;
    public int l;
    public int m;
    public int n;
    public float o;
    public int p;
    public int q;
    public int r;

    static {
        amnl amnlVar = new amnl();
        a = amnlVar;
        apag.registerDefaultInstance(amnl.class, amnlVar);
    }

    private amnl() {
    }

    @Override // defpackage.apag
    protected final Object dynamicMethod(apaf apafVar, Object obj, Object obj2) {
        switch (apafVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0004\u0010\u0000\u0001\u0001\u0012\u0010\u0000\u0000\u0000\u0001ဌ\u0000\u0002ခ\u0001\u0003ခ\u0002\u0004င\u0003\u0005င\u0004\u0006င\u0005\u0007ဌ\u0006\bင\u0007\tင\b\nဌ\t\u000bင\n\fင\u000b\rခ\f\u000eဌ\r\u0010င\u000e\u0012ဌ\u000f", new Object[]{"b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r"});
            case NEW_MUTABLE_INSTANCE:
                return new amnl();
            case NEW_BUILDER:
                return new aozy(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                apca apcaVar = s;
                if (apcaVar == null) {
                    synchronized (amnl.class) {
                        apcaVar = s;
                        if (apcaVar == null) {
                            apcaVar = new aozz(a);
                            s = apcaVar;
                        }
                    }
                }
                return apcaVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
