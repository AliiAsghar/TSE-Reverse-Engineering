package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aorr extends apag implements apbu {
    public static final aorr a;
    private static volatile apca k;
    public int b;
    public String c = "";
    public boolean d;
    public String e;
    public String f;
    public String g;
    public String h;
    public String i;
    public String j;

    static {
        aorr aorrVar = new aorr();
        a = aorrVar;
        apag.registerDefaultInstance(aorr.class, aorrVar);
    }

    private aorr() {
        emptyProtobufList();
        this.d = true;
        this.e = "";
        this.f = "";
        this.g = "";
        this.h = "";
        this.i = "";
        this.j = "";
    }

    @Override // defpackage.apag
    protected final Object dynamicMethod(apaf apafVar, Object obj, Object obj2) {
        switch (apafVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0004\b\u0000\u0001\u0002\n\b\u0000\u0000\u0000\u0002ဈ\u0001\u0004ဇ\u0002\u0005ဈ\u0003\u0006ဈ\u0004\u0007ဈ\u0005\bဈ\u0006\tဈ\u0007\nဈ\b", new Object[]{"b", "c", "d", "e", "f", "g", "h", "i", "j"});
            case NEW_MUTABLE_INSTANCE:
                return new aorr();
            case NEW_BUILDER:
                return new aozy(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                apca apcaVar = k;
                if (apcaVar == null) {
                    synchronized (aorr.class) {
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
