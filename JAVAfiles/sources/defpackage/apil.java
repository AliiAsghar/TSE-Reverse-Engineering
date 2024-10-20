package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class apil extends apag implements apbu {
    public static final apil a;
    private static volatile apca j;
    public int b;
    public int c;
    public long d;
    public long e;
    public int f;
    public long g;
    public long h;
    public long i;

    static {
        apil apilVar = new apil();
        a = apilVar;
        apag.registerDefaultInstance(apil.class, apilVar);
    }

    private apil() {
    }

    @Override // defpackage.apag
    protected final Object dynamicMethod(apaf apafVar, Object obj, Object obj2) {
        switch (apafVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0004\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001᠌\u0000\u0002ဂ\u0001\u0003ဂ\u0002\u0004င\u0003\u0005ဂ\u0004\u0006ဂ\u0005\u0007ဂ\u0006", new Object[]{"b", "c", aphl.k, "d", "e", "f", "g", "h", "i"});
            case NEW_MUTABLE_INSTANCE:
                return new apil();
            case NEW_BUILDER:
                return new aozy(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                apca apcaVar = j;
                if (apcaVar == null) {
                    synchronized (apil.class) {
                        apcaVar = j;
                        if (apcaVar == null) {
                            apcaVar = new aozz(a);
                            j = apcaVar;
                        }
                    }
                }
                return apcaVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
