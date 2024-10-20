package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class apti extends apag implements apbu {
    public static final apti a;
    private static volatile apca b;
    private int c;
    private byte g = 2;
    private String d = "";
    private String e = "";
    private String f = "";

    static {
        apti aptiVar = new apti();
        a = aptiVar;
        apag.registerDefaultInstance(apti.class, aptiVar);
    }

    private apti() {
        emptyProtobufList();
    }

    @Override // defpackage.apag
    protected final Object dynamicMethod(apaf apafVar, Object obj, Object obj2) {
        byte b2 = 1;
        switch (apafVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.g);
            case SET_MEMOIZED_IS_INITIALIZED:
                if (obj == null) {
                    b2 = 0;
                }
                this.g = b2;
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0004\u0003\u0000\u0001\u0003\u0005\u0003\u0000\u0000\u0003\u0003ᔈ\u0002\u0004ᔈ\u0003\u0005ᔈ\u0004", new Object[]{"c", "d", "e", "f"});
            case NEW_MUTABLE_INSTANCE:
                return new apti();
            case NEW_BUILDER:
                return new aozy(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                apca apcaVar = b;
                if (apcaVar == null) {
                    synchronized (apti.class) {
                        apcaVar = b;
                        if (apcaVar == null) {
                            apcaVar = new aozz(a);
                            b = apcaVar;
                        }
                    }
                }
                return apcaVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
