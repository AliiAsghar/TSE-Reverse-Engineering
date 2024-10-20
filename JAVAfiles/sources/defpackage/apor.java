package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class apor extends apag implements apbu {
    public static final apor a;
    private static volatile apca g;
    public int b;
    public int c;
    public apao d = emptyIntList();
    public String e = "";
    public String f = "";

    static {
        apor aporVar = new apor();
        a = aporVar;
        apag.registerDefaultInstance(apor.class, aporVar);
    }

    private apor() {
        emptyProtobufList();
    }

    @Override // defpackage.apag
    protected final Object dynamicMethod(apaf apafVar, Object obj, Object obj2) {
        switch (apafVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0004\u0005\u0000\u0000\u0001\u0005\u0005\u0000\u0001\u0000\u0001\f\u0002\u000b\u0003+\u0004Ȉ\u0005Ȉ", new Object[]{"b", "c", "d", "e", "f"});
            case NEW_MUTABLE_INSTANCE:
                return new apor();
            case NEW_BUILDER:
                return new aozy(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                apca apcaVar = g;
                if (apcaVar == null) {
                    synchronized (apor.class) {
                        apcaVar = g;
                        if (apcaVar == null) {
                            apcaVar = new aozz(a);
                            g = apcaVar;
                        }
                    }
                }
                return apcaVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
