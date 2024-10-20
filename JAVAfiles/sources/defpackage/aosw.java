package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aosw extends apag implements apbu {
    public static final aosw a;
    private static volatile apca k;
    public int b;
    public int c;
    public long d;
    public boolean f;
    public int i;
    private byte l = 2;
    public String e = "";
    public int g = 1;
    public String h = "";
    public String j = "";

    static {
        aosw aoswVar = new aosw();
        a = aoswVar;
        apag.registerDefaultInstance(aosw.class, aoswVar);
    }

    private aosw() {
    }

    public static /* synthetic */ void a(aosw aoswVar) {
        aoswVar.b |= 8;
        aoswVar.f = true;
    }

    @Override // defpackage.apag
    protected final Object dynamicMethod(apaf apafVar, Object obj, Object obj2) {
        byte b = 1;
        switch (apafVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.l);
            case SET_MEMOIZED_IS_INITIALIZED:
                if (obj == null) {
                    b = 0;
                }
                this.l = b;
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0000\u0002\u0001ᔄ\u0000\u0002ᔃ\u0001\u0003ဈ\u0002\u0004ဇ\u0003\u0005ဈ\u0005\u0006᠌\u0006\u0007ဈ\u0007\bင\u0004", new Object[]{"b", "c", "d", "e", "f", "h", "i", anbb.n, "j", "g"});
            case NEW_MUTABLE_INSTANCE:
                return new aosw();
            case NEW_BUILDER:
                return new aozy(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                apca apcaVar = k;
                if (apcaVar == null) {
                    synchronized (aosw.class) {
                        apcaVar = k;
                        if (apcaVar == null) {
                            apcaVar = new aozz(a);
                            k = apcaVar;
                        }
                    }
                }
                return apcaVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
