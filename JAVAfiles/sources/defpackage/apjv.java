package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class apjv extends apag implements apbu {
    public static final apjv a;
    private static volatile apca g;
    public int b;
    public int c;
    public long d;
    public long e;
    public apju f;

    static {
        apjv apjvVar = new apjv();
        a = apjvVar;
        apag.registerDefaultInstance(apjv.class, apjvVar);
    }

    private apjv() {
    }

    @Override // defpackage.apag
    protected final Object dynamicMethod(apaf apafVar, Object obj, Object obj2) {
        switch (apafVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001᠌\u0000\u0002ဂ\u0001\u0003ဂ\u0002\u0004ဉ\u0003", new Object[]{"b", "c", apjw.a, "d", "e", "f"});
            case NEW_MUTABLE_INSTANCE:
                return new apjv();
            case NEW_BUILDER:
                return new aozy(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                apca apcaVar = g;
                if (apcaVar == null) {
                    synchronized (apjv.class) {
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
