package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class apfs extends apag implements apbu {
    public static final apfs a;
    private static volatile apca g;
    public int b;
    public int d;
    public int f;
    public String c = "";
    public String e = "";

    static {
        apfs apfsVar = new apfs();
        a = apfsVar;
        apag.registerDefaultInstance(apfs.class, apfsVar);
    }

    private apfs() {
    }

    @Override // defpackage.apag
    protected final Object dynamicMethod(apaf apafVar, Object obj, Object obj2) {
        switch (apafVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဋ\u0001\u0003ဈ\u0002\u0004᠌\u0003", new Object[]{"b", "c", "d", "e", "f", apjw.o});
            case NEW_MUTABLE_INSTANCE:
                return new apfs();
            case NEW_BUILDER:
                return new aozy(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                apca apcaVar = g;
                if (apcaVar == null) {
                    synchronized (apfs.class) {
                        apcaVar = g;
                        if (apcaVar == null) {
                            apcaVar = new aozz(a);
                            g = apcaVar;
                        }
                    }
                }
                return apcaVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
