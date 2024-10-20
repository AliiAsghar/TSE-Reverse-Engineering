package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aoxc extends apag implements apbu {
    public static final aoxc a;
    private static volatile apca h;
    public int d;
    public boolean e;
    public boolean g;
    public String b = "";
    public String c = "";
    public apao f = emptyIntList();

    static {
        aoxc aoxcVar = new aoxc();
        a = aoxcVar;
        apag.registerDefaultInstance(aoxc.class, aoxcVar);
    }

    private aoxc() {
    }

    @Override // defpackage.apag
    protected final Object dynamicMethod(apaf apafVar, Object obj, Object obj2) {
        switch (apafVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0000\u0006\u0000\u0000\u0001\f\u0006\u0000\u0001\u0000\u0001Ȉ\u0002Ȉ\u0004\f\u0007\u0007\u000b,\f\u0007", new Object[]{"b", "c", "d", "e", "f", "g"});
            case NEW_MUTABLE_INSTANCE:
                return new aoxc();
            case NEW_BUILDER:
                return new aozy(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                apca apcaVar = h;
                if (apcaVar == null) {
                    synchronized (aoxc.class) {
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
