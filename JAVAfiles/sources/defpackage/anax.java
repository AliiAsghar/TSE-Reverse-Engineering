package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class anax extends apag implements apbu {
    public static final anax a;
    private static volatile apca g;
    public int b;
    public long e;
    private byte h = 2;
    public String c = "";
    public String d = "";
    public apax f = emptyProtobufList();

    static {
        anax anaxVar = new anax();
        a = anaxVar;
        apag.registerDefaultInstance(anax.class, anaxVar);
    }

    private anax() {
    }

    @Override // defpackage.apag
    protected final Object dynamicMethod(apaf apafVar, Object obj, Object obj2) {
        byte b = 1;
        switch (apafVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.h);
            case SET_MEMOIZED_IS_INITIALIZED:
                if (obj == null) {
                    b = 0;
                }
                this.h = b;
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0002\u0001ᔈ\u0000\u0002ဈ\u0001\u0003ဂ\u0002\u0004б", new Object[]{"b", "c", "d", "e", "f", anaw.class});
            case NEW_MUTABLE_INSTANCE:
                return new anax();
            case NEW_BUILDER:
                return new aozy(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                apca apcaVar = g;
                if (apcaVar == null) {
                    synchronized (anax.class) {
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
