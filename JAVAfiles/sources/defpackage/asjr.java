package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class asjr extends apag implements apbu {
    public static final asjr a;
    private static volatile apca e;
    public int b;
    public int c;
    private asjq f;
    private byte g = 2;
    public int d = 1;

    static {
        asjr asjrVar = new asjr();
        a = asjrVar;
        apag.registerDefaultInstance(asjr.class, asjrVar);
    }

    private asjr() {
    }

    @Override // defpackage.apag
    protected final Object dynamicMethod(apaf apafVar, Object obj, Object obj2) {
        byte b = 1;
        switch (apafVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.g);
            case SET_MEMOIZED_IS_INITIALIZED:
                if (obj == null) {
                    b = 0;
                }
                this.g = b;
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0001\u0001᠌\u0000\u0002င\u0001\u0003ᐉ\u0002", new Object[]{"b", "c", asif.n, "d", "f"});
            case NEW_MUTABLE_INSTANCE:
                return new asjr();
            case NEW_BUILDER:
                return new aozy(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                apca apcaVar = e;
                if (apcaVar == null) {
                    synchronized (asjr.class) {
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
