package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ahsg extends apag implements apbu {
    public static final ahsg a;
    public static final apae b;
    private static volatile apca k;
    public int c;
    public boolean f;
    public boolean j;
    public String d = "";
    public String e = "";
    public String g = "";
    public String h = "";
    public apao i = emptyIntList();

    static {
        ahsg ahsgVar = new ahsg();
        a = ahsgVar;
        apag.registerDefaultInstance(ahsg.class, ahsgVar);
        b = apag.newSingularGeneratedExtension(ahsb.a, ahsgVar, ahsgVar, null, 334728578, apdf.MESSAGE, ahsg.class);
    }

    private ahsg() {
    }

    @Override // defpackage.apag
    protected final Object dynamicMethod(apaf apafVar, Object obj, Object obj2) {
        switch (apafVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0004\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0001\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဇ\u0002\u0004ဈ\u0003\u0005ဈ\u0004\u0006'\u0007ဇ\u0005", new Object[]{"c", "d", "e", "f", "g", "h", "i", "j"});
            case NEW_MUTABLE_INSTANCE:
                return new ahsg();
            case NEW_BUILDER:
                return new aozy(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                apca apcaVar = k;
                if (apcaVar == null) {
                    synchronized (ahsg.class) {
                        apcaVar = k;
                        if (apcaVar == null) {
                            apcaVar = new aozz(a);
                            k = apcaVar;
                        }
                    }
                }
                return apcaVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
