package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class apjh extends apag implements apbu {
    public static final apjh a;
    private static volatile apca h;
    public int b;
    public Object d;
    public int f;
    public int c = 0;
    public String e = "";
    public String g = "";

    static {
        apjh apjhVar = new apjh();
        a = apjhVar;
        apag.registerDefaultInstance(apjh.class, apjhVar);
    }

    private apjh() {
    }

    @Override // defpackage.apag
    protected final Object dynamicMethod(apaf apafVar, Object obj, Object obj2) {
        switch (apafVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0004\u000b\u0001\u0001\u0001\f\u000b\u0000\u0000\u0000\u0001ဈ\u0000\u0002င\u0001\u0003<\u0000\u0004<\u0000\u0005<\u0000\u0006<\u0000\u0007ဈ\u0002\b<\u0000\n<\u0000\u000b:\u0000\f<\u0000", new Object[]{"d", "c", "b", "e", "f", apjm.class, apjn.class, apjt.class, apfu.class, "g", apkb.class, apkd.class, apjz.class});
            case NEW_MUTABLE_INSTANCE:
                return new apjh();
            case NEW_BUILDER:
                return new aozy(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                apca apcaVar = h;
                if (apcaVar == null) {
                    synchronized (apjh.class) {
                        apcaVar = h;
                        if (apcaVar == null) {
                            apcaVar = new aozz(a);
                            h = apcaVar;
                        }
                    }
                }
                return apcaVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
