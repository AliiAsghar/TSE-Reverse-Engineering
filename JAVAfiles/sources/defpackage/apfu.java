package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class apfu extends apag implements apbu {
    public static final apfu a;
    private static volatile apca h;
    public int b;
    public boolean c;
    public int d;
    public long e;
    public int f;
    public int g;

    static {
        apfu apfuVar = new apfu();
        a = apfuVar;
        apag.registerDefaultInstance(apfu.class, apfuVar);
    }

    private apfu() {
    }

    @Override // defpackage.apag
    protected final Object dynamicMethod(apaf apafVar, Object obj, Object obj2) {
        switch (apafVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0004\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဇ\u0000\u0002င\u0001\u0003ဂ\u0002\u0004᠌\u0003\u0005င\u0004", new Object[]{"b", "c", "d", "e", "f", apez.o, "g"});
            case NEW_MUTABLE_INSTANCE:
                return new apfu();
            case NEW_BUILDER:
                return new aozy(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                apca apcaVar = h;
                if (apcaVar == null) {
                    synchronized (apfu.class) {
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
