package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class apke extends apag implements apbu {
    public static final apke a;
    private static volatile apca k;
    public int b;
    public Object d;
    public int h;
    public int i;
    public int j;
    public int c = 0;
    public String e = "";
    public String f = "";
    public String g = "";

    static {
        apke apkeVar = new apke();
        a = apkeVar;
        apag.registerDefaultInstance(apke.class, apkeVar);
    }

    private apke() {
    }

    @Override // defpackage.apag
    protected final Object dynamicMethod(apaf apafVar, Object obj, Object obj2) {
        switch (apafVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0004\b\u0001\u0001\u0001\b\b\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000\u0003ဈ\u0000\u0004ဈ\u0001\u0005ဈ\u0002\u0006င\u0003\u0007င\u0004\bဌ\u0005", new Object[]{"d", "c", "b", apkg.class, apkh.class, "e", "f", "g", "h", "i", "j"});
            case NEW_MUTABLE_INSTANCE:
                return new apke();
            case NEW_BUILDER:
                return new aozy(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                apca apcaVar = k;
                if (apcaVar == null) {
                    synchronized (apke.class) {
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
