package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class apqg extends apag implements apbu {
    public static final apqg a;
    private static volatile apca h;
    public int b;
    public int c;
    public int d;
    public String e = "";
    public boolean f;
    public apqi g;

    static {
        apqg apqgVar = new apqg();
        a = apqgVar;
        apag.registerDefaultInstance(apqg.class, apqgVar);
    }

    private apqg() {
    }

    @Override // defpackage.apag
    protected final Object dynamicMethod(apaf apafVar, Object obj, Object obj2) {
        switch (apafVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0004\u0005\u0000\u0001\u0001\u0006\u0005\u0000\u0000\u0000\u0001\f\u0002\u000b\u0003Ȉ\u0004\u0007\u0006ဉ\u0000", new Object[]{"b", "c", "d", "e", "f", "g"});
            case NEW_MUTABLE_INSTANCE:
                return new apqg();
            case NEW_BUILDER:
                return new aozy(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                apca apcaVar = h;
                if (apcaVar == null) {
                    synchronized (apqg.class) {
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
