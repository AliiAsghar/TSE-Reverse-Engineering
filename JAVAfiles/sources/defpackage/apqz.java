package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class apqz extends apag implements apbu {
    public static final apqz a;
    private static volatile apca e;
    public int b = 0;
    public Object c;
    public int d;

    static {
        apqz apqzVar = new apqz();
        a = apqzVar;
        apag.registerDefaultInstance(apqz.class, apqzVar);
    }

    private apqz() {
    }

    @Override // defpackage.apag
    protected final Object dynamicMethod(apaf apafVar, Object obj, Object obj2) {
        switch (apafVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0004\u0005\u0001\u0000\u0001\u0005\u0005\u0000\u0000\u0000\u0001\u000b\u0002<\u0000\u0003<\u0000\u0004<\u0000\u0005<\u0000", new Object[]{"c", "b", "d", apqy.class, apqu.class, apqw.class, apqv.class});
            case NEW_MUTABLE_INSTANCE:
                return new apqz();
            case NEW_BUILDER:
                return new aozy(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                apca apcaVar = e;
                if (apcaVar == null) {
                    synchronized (apqz.class) {
                        apcaVar = e;
                        if (apcaVar == null) {
                            apcaVar = new aozz(a);
                            e = apcaVar;
                        }
                    }
                }
                return apcaVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
