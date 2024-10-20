package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ahuj extends apag implements apbu {
    public static final apap a = new qex(11);
    public static final ahuj b;
    private static volatile apca n;
    public int c;
    public boolean e;
    public long g;
    public ahul k;
    public boolean l;
    public boolean m;
    public aozb d = aozb.b;
    public String f = "";
    public apax h = apag.emptyProtobufList();
    public apax i = apag.emptyProtobufList();
    public apao j = emptyIntList();

    static {
        ahuj ahujVar = new ahuj();
        b = ahujVar;
        apag.registerDefaultInstance(ahuj.class, ahujVar);
    }

    private ahuj() {
    }

    @Override // defpackage.apag
    protected final Object dynamicMethod(apaf apafVar, Object obj, Object obj2) {
        switch (apafVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(b, "\u0004\n\u0000\u0001\u0001\u000b\n\u0000\u0003\u0000\u0001ည\u0000\u0002ဇ\u0001\u0003ဈ\u0002\u0004ဂ\u0003\u0005\u001a\u0006\u001a\u0007ࠬ\bဉ\u0004\nဇ\u0005\u000bဇ\u0006", new Object[]{"c", "d", "e", "f", "g", "h", "i", "j", anbb.e, "k", "l", "m"});
            case NEW_MUTABLE_INSTANCE:
                return new ahuj();
            case NEW_BUILDER:
                return new aozy(b);
            case GET_DEFAULT_INSTANCE:
                return b;
            case GET_PARSER:
                apca apcaVar = n;
                if (apcaVar == null) {
                    synchronized (ahuj.class) {
                        apcaVar = n;
                        if (apcaVar == null) {
                            apcaVar = new aozz(b);
                            n = apcaVar;
                        }
                    }
                }
                return apcaVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
