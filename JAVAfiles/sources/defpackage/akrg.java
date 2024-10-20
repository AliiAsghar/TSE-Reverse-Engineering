package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class akrg extends apag implements apbu {
    public static final akrg a;
    private static volatile apca n;
    public int b;
    public String c = "";
    public int d;
    public int e;
    public long f;
    public int g;
    public long h;
    public int i;
    public int j;
    public boolean k;
    public int l;
    public boolean m;

    static {
        akrg akrgVar = new akrg();
        a = akrgVar;
        apag.registerDefaultInstance(akrg.class, akrgVar);
    }

    private akrg() {
    }

    @Override // defpackage.apag
    protected final Object dynamicMethod(apaf apafVar, Object obj, Object obj2) {
        switch (apafVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0004\u000b\u0000\u0001\u0001\u000b\u000b\u0000\u0000\u0000\u0001ဈ\u0000\u0002င\u0001\u0003င\u0002\u0004ဂ\u0003\u0005ဂ\u0005\u0006ဇ\b\u0007င\u0007\b᠌\t\tဇ\n\nင\u0004\u000bင\u0006", new Object[]{"b", "c", "d", "e", "f", "h", "k", "j", "l", ahbp.h, "m", "g", "i"});
            case NEW_MUTABLE_INSTANCE:
                return new akrg();
            case NEW_BUILDER:
                return new aozy(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                apca apcaVar = n;
                if (apcaVar == null) {
                    synchronized (akrg.class) {
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
