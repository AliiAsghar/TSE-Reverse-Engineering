package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class apnf extends apag implements apbu {
    public static final apnf a;
    private static volatile apca m;
    public int b;
    public int e;
    public boolean f;
    public boolean g;
    public boolean h;
    public boolean j;
    public boolean k;
    public int l;
    public String c = "";
    public String d = "";
    public String i = "";

    static {
        apnf apnfVar = new apnf();
        a = apnfVar;
        apag.registerDefaultInstance(apnf.class, apnfVar);
    }

    private apnf() {
    }

    @Override // defpackage.apag
    protected final Object dynamicMethod(apaf apafVar, Object obj, Object obj2) {
        switch (apafVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\n\u0000\u0001\u0001\n\n\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003᠌\u0002\u0004ဇ\u0003\u0005ဇ\u0004\u0006ဇ\u0005\u0007ဈ\u0006\bဇ\u0007\tဇ\b\nင\t", new Object[]{"b", "c", "d", "e", apkm.s, "f", "g", "h", "i", "j", "k", "l"});
            case NEW_MUTABLE_INSTANCE:
                return new apnf();
            case NEW_BUILDER:
                return new aozy(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                apca apcaVar = m;
                if (apcaVar == null) {
                    synchronized (apnf.class) {
                        apcaVar = m;
                        if (apcaVar == null) {
                            apcaVar = new aozz(a);
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
