package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class amod extends apab implements apac {
    public static final amod a;
    private static volatile apca k;
    public int b;
    public anas c;
    public int e;
    public int f;
    public int g;
    public amnq j;
    private byte m = 2;
    public int d = -1;
    public int h = -1;
    public apax i = emptyProtobufList();

    static {
        amod amodVar = new amod();
        a = amodVar;
        apag.registerDefaultInstance(amod.class, amodVar);
    }

    private amod() {
    }

    @Override // defpackage.apag
    protected final Object dynamicMethod(apaf apafVar, Object obj, Object obj2) {
        byte b = 1;
        switch (apafVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.m);
            case SET_MEMOIZED_IS_INITIALIZED:
                if (obj == null) {
                    b = 0;
                }
                this.m = b;
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\b\u0000\u0001\u0001\u0010\b\u0000\u0001\u0003\u0001င\u0002\u0003င\u0004\u0004င\u0005\u0005င\u0006\u0006င\u0007\u000eЛ\u000fᐉ\u000e\u0010ᐉ\u0000", new Object[]{"b", "d", "e", "f", "g", "h", "i", amoe.class, "j", "c"});
            case NEW_MUTABLE_INSTANCE:
                return new amod();
            case NEW_BUILDER:
                return new apaa(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                apca apcaVar = k;
                if (apcaVar == null) {
                    synchronized (amod.class) {
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
