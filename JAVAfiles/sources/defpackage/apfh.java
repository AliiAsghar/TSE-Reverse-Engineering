package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class apfh extends apag implements apbu {
    public static final apfh a;
    private static volatile apca h;
    public int b;
    public Object d;
    public int e;
    public int c = 0;
    private byte i = 2;
    public String f = "";
    public String g = "";

    static {
        apfh apfhVar = new apfh();
        a = apfhVar;
        apag.registerDefaultInstance(apfh.class, apfhVar);
    }

    private apfh() {
    }

    @Override // defpackage.apag
    protected final Object dynamicMethod(apaf apafVar, Object obj, Object obj2) {
        byte b = 1;
        switch (apafVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.i);
            case SET_MEMOIZED_IS_INITIALIZED:
                if (obj == null) {
                    b = 0;
                }
                this.i = b;
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0004\u0005\u0001\u0001\u0001f\u0005\u0000\u0000\u0001\u0001ᴌ\u0000\u0002ဈ\u0001\u0003ဈ\u0002e<\u0000f<\u0000", new Object[]{"d", "c", "b", "e", apez.f, "f", "g", apff.class, apfg.class});
            case NEW_MUTABLE_INSTANCE:
                return new apfh();
            case NEW_BUILDER:
                return new aozy(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                apca apcaVar = h;
                if (apcaVar == null) {
                    synchronized (apfh.class) {
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
