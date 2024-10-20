package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class anmn extends apag implements apbu {
    public static final anmn a;
    private static volatile apca i;
    public int b;
    public apct d;
    public int g;
    public apax c = emptyProtobufList();
    public aozb e = aozb.b;
    public String f = "";
    public apax h = emptyProtobufList();

    static {
        anmn anmnVar = new anmn();
        a = anmnVar;
        apag.registerDefaultInstance(anmn.class, anmnVar);
    }

    private anmn() {
    }

    @Override // defpackage.apag
    protected final Object dynamicMethod(apaf apafVar, Object obj, Object obj2) {
        switch (apafVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0000\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0002\u0000\u0001\u001c\u0002ဉ\u0000\u0003\n\u0004Ȉ\u0005\f\u0006\u001b", new Object[]{"b", "c", "d", "e", "f", "g", "h", apct.class});
            case NEW_MUTABLE_INSTANCE:
                return new anmn();
            case NEW_BUILDER:
                return new aozy(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                apca apcaVar = i;
                if (apcaVar == null) {
                    synchronized (anmn.class) {
                        apcaVar = i;
                        if (apcaVar == null) {
                            apcaVar = new aozz(a);
                            i = apcaVar;
                        }
                    }
                }
                return apcaVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
