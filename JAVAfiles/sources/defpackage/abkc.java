package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class abkc extends apag implements apbu {
    public static final abkc a;
    private static volatile apca h;
    public int b;
    public String c = "";
    public String d = "";
    public apax e = apag.emptyProtobufList();
    public apax f = emptyProtobufList();
    public boolean g;

    static {
        abkc abkcVar = new abkc();
        a = abkcVar;
        apag.registerDefaultInstance(abkc.class, abkcVar);
    }

    private abkc() {
    }

    @Override // defpackage.apag
    protected final Object dynamicMethod(apaf apafVar, Object obj, Object obj2) {
        switch (apafVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0000\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0002\u0000\u0001ለ\u0000\u0002ለ\u0001\u0003Ț\u0004\u001b\u0005ဇ\u0002", new Object[]{"b", "c", "d", "e", "f", abjx.class, "g"});
            case NEW_MUTABLE_INSTANCE:
                return new abkc();
            case NEW_BUILDER:
                return new aozy(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                apca apcaVar = h;
                if (apcaVar == null) {
                    synchronized (abkc.class) {
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
