package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aocw extends apag implements apbu {
    public static final aocw a;
    private static volatile apca n;
    public int b;
    public Object d;
    public Object f;
    public boolean h;
    public aozb j;
    public int k;
    public long l;
    public aozb m;
    public int c = 0;
    public int e = 0;
    public String g = "";
    public apax i = apag.emptyProtobufList();

    static {
        aocw aocwVar = new aocw();
        a = aocwVar;
        apag.registerDefaultInstance(aocw.class, aocwVar);
    }

    private aocw() {
        emptyIntList();
        this.j = aozb.b;
        this.m = aozb.b;
    }

    @Override // defpackage.apag
    protected final Object dynamicMethod(apaf apafVar, Object obj, Object obj2) {
        switch (apafVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\u000b\u0002\u0001\u0001\u000f\u000b\u0000\u0001\u0000\u0001ဈ\u0000\u00027\u0000\u0003\u001a\u0005ည\u0002\u0007;\u0001\t᠌\u0005\n;\u0001\u000bဇ\u0001\rဎ\u0007\u000eည\b\u000f5\u0000", new Object[]{"d", "c", "f", "e", "b", "g", "i", "j", "k", anbb.f, "h", "l", "m"});
            case NEW_MUTABLE_INSTANCE:
                return new aocw();
            case NEW_BUILDER:
                return new aozy(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                apca apcaVar = n;
                if (apcaVar == null) {
                    synchronized (aocw.class) {
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
