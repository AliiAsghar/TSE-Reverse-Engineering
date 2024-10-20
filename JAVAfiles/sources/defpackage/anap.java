package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class anap extends apag implements apbu {
    public static final anap a;
    private static volatile apca j;
    public int b;
    public int c;
    public apax d = apag.emptyProtobufList();
    public apax e = apag.emptyProtobufList();
    public apax f = apag.emptyProtobufList();
    public apax g = apag.emptyProtobufList();
    public anam h;
    public boolean i;

    static {
        anap anapVar = new anap();
        a = anapVar;
        apag.registerDefaultInstance(anap.class, anapVar);
    }

    private anap() {
    }

    @Override // defpackage.apag
    protected final Object dynamicMethod(apaf apafVar, Object obj, Object obj2) {
        switch (apafVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\u0007\u0000\u0001\u0001\t\u0007\u0000\u0004\u0000\u0001᠌\u0000\u0002\u001a\u0003\u001a\u0004\u001a\u0005\u001a\u0007ဉ\u0002\tဇ\u0004", new Object[]{"b", "c", anbb.b, "d", "e", "f", "g", "h", "i"});
            case NEW_MUTABLE_INSTANCE:
                return new anap();
            case NEW_BUILDER:
                return new aozy(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                apca apcaVar = j;
                if (apcaVar == null) {
                    synchronized (anap.class) {
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
