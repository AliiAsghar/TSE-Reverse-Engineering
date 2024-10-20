package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aptf extends apab implements apac {
    public static final aptf a;
    private static volatile apca e;
    public int b;
    public apte c;
    public aozn d;
    private byte f = 2;

    static {
        aptf aptfVar = new aptf();
        a = aptfVar;
        apag.registerDefaultInstance(aptf.class, aptfVar);
    }

    private aptf() {
    }

    @Override // defpackage.apag
    protected final Object dynamicMethod(apaf apafVar, Object obj, Object obj2) {
        byte b = 1;
        switch (apafVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.f);
            case SET_MEMOIZED_IS_INITIALIZED:
                if (obj == null) {
                    b = 0;
                }
                this.f = b;
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\u0002\u0000\u0001\u0003\u0006\u0002\u0000\u0000\u0000\u0003ဉ\u0002\u0006ဉ\u0001", new Object[]{"b", "d", "c"});
            case NEW_MUTABLE_INSTANCE:
                return new aptf();
            case NEW_BUILDER:
                return new apaa(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                apca apcaVar = e;
                if (apcaVar == null) {
                    synchronized (aptf.class) {
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
