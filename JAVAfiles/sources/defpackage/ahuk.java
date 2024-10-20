package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ahuk extends apag implements apbu {
    public static final apap a = new qex(12);
    public static final ahuk b;
    private static volatile apca m;
    public int c;
    public boolean e;
    public ahul j;
    public boolean k;
    public boolean l;
    public aozb d = aozb.b;
    public String f = "";
    public apax g = apag.emptyProtobufList();
    public apax h = apag.emptyProtobufList();
    public apao i = emptyIntList();

    static {
        ahuk ahukVar = new ahuk();
        b = ahukVar;
        apag.registerDefaultInstance(ahuk.class, ahukVar);
    }

    private ahuk() {
    }

    @Override // defpackage.apag
    protected final Object dynamicMethod(apaf apafVar, Object obj, Object obj2) {
        switch (apafVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(b, "\u0004\t\u0000\u0001\u0001\u000b\t\u0000\u0003\u0000\u0001ည\u0000\u0002ဇ\u0001\u0003ဈ\u0002\u0004\u001a\u0005\u001a\u0007ࠬ\bဉ\u0003\nဇ\u0004\u000bဇ\u0005", new Object[]{"c", "d", "e", "f", "g", "h", "i", anbb.e, "j", "k", "l"});
            case NEW_MUTABLE_INSTANCE:
                return new ahuk();
            case NEW_BUILDER:
                return new aozy(b);
            case GET_DEFAULT_INSTANCE:
                return b;
            case GET_PARSER:
                apca apcaVar = m;
                if (apcaVar == null) {
                    synchronized (ahuk.class) {
                        apcaVar = m;
                        if (apcaVar == null) {
                            apcaVar = new aozz(b);
                            m = apcaVar;
                        }
                    }
                }
                return apcaVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
