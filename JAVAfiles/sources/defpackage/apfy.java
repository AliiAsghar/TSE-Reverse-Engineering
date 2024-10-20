package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class apfy extends apag implements apbu {
    public static final apfy a;
    private static volatile apca r;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public long g;
    public long h;
    public long i;
    public int j;
    public int k;
    public String l = "";
    public long m;
    public long n;
    public boolean o;
    public apfx p;
    public long q;

    static {
        apfy apfyVar = new apfy();
        a = apfyVar;
        apag.registerDefaultInstance(apfy.class, apfyVar);
    }

    private apfy() {
    }

    @Override // defpackage.apag
    protected final Object dynamicMethod(apaf apafVar, Object obj, Object obj2) {
        switch (apafVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                apam apamVar = apez.q;
                apam apamVar2 = apjw.p;
                return newMessageInfo(a, "\u0004\u000f\u0000\u0001\u0001\u000f\u000f\u0000\u0000\u0000\u0001᠌\u0000\u0002᠌\u0001\u0003᠌\u0002\u0004᠌\u0003\u0005ဂ\u0004\u0006ဂ\u0005\u0007ဂ\u0006\b᠌\u0007\t᠌\b\nဈ\t\u000bဂ\n\fဂ\u000b\rဇ\f\u000eဉ\r\u000fဂ\u000e", new Object[]{"b", "c", apamVar, "d", apamVar, "e", apez.p, "f", apez.r, "g", "h", "i", "j", apamVar2, "k", apamVar2, "l", "m", "n", "o", "p", "q"});
            case NEW_MUTABLE_INSTANCE:
                return new apfy();
            case NEW_BUILDER:
                return new aozy(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                apca apcaVar = r;
                if (apcaVar == null) {
                    synchronized (apfy.class) {
                        apcaVar = r;
                        if (apcaVar == null) {
                            apcaVar = new aozz(a);
                            r = apcaVar;
                        }
                    }
                }
                return apcaVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
