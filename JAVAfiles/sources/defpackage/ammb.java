package defpackage;

/* compiled from: PG */
@Deprecated
/* loaded from: classes4.dex */
public final class ammb extends apag implements apbu {
    public static final ammb a;
    private static volatile apca k;
    public int b;
    public int c;
    public apao d = emptyIntList();
    public apao e = emptyIntList();
    public apao f = emptyIntList();
    public int g;
    public int h;
    public int i;
    public int j;

    static {
        ammb ammbVar = new ammb();
        a = ammbVar;
        apag.registerDefaultInstance(ammb.class, ammbVar);
    }

    private ammb() {
    }

    @Override // defpackage.apag
    protected final Object dynamicMethod(apaf apafVar, Object obj, Object obj2) {
        switch (apafVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                apam apamVar = amln.i;
                return newMessageInfo(a, "\u0001\b\u0000\u0001\u0001\t\b\u0000\u0003\u0000\u0001᠌\u0000\u0003ࠞ\u0004ࠞ\u0005ࠞ\u0006᠌\u0001\u0007᠌\u0002\b᠌\u0003\t᠌\u0004", new Object[]{"b", "c", amln.f, "d", apamVar, "e", apamVar, "f", apamVar, "g", amln.k, "h", amln.h, "i", amln.j, "j", amln.g});
            case NEW_MUTABLE_INSTANCE:
                return new ammb();
            case NEW_BUILDER:
                return new aozy(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                apca apcaVar = k;
                if (apcaVar == null) {
                    synchronized (ammb.class) {
                        apcaVar = k;
                        if (apcaVar == null) {
                            apcaVar = new aozz(a);
                            k = apcaVar;
                        }
                    }
                }
                return apcaVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
