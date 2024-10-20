package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aovj extends apag implements apbu {
    public static final aovj a;
    private static volatile apca j;
    public int b;
    public String c = "";
    public int d;
    public apct e;
    public apct f;
    public aovl g;
    public aovg h;
    public aovi i;

    static {
        aovj aovjVar = new aovj();
        a = aovjVar;
        apag.registerDefaultInstance(aovj.class, aovjVar);
    }

    private aovj() {
    }

    @Override // defpackage.apag
    protected final Object dynamicMethod(apaf apafVar, Object obj, Object obj2) {
        switch (apafVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\u0007\u0000\u0001\u0001\b\u0007\u0000\u0000\u0000\u0001᠌\u0001\u0002ဉ\u0002\u0003ဉ\u0003\u0004ဉ\u0004\u0005ဉ\u0005\u0007ဈ\u0000\bဉ\u0007", new Object[]{"b", "d", anbb.o, "e", "f", "g", "h", "c", "i"});
            case NEW_MUTABLE_INSTANCE:
                return new aovj();
            case NEW_BUILDER:
                return new aozy(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                apca apcaVar = j;
                if (apcaVar == null) {
                    synchronized (aovj.class) {
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
