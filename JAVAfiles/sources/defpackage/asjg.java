package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class asjg extends apag implements apbu {
    public static final asjg a;
    private static volatile apca m;
    public int b;
    public boolean c;
    public asiz d;
    public int g;
    public anba i;
    public apna j;
    public asji k;
    public asjf l;
    private byte n = 2;
    public String e = "";
    public String f = "";
    public String h = "";

    static {
        asjg asjgVar = new asjg();
        a = asjgVar;
        apag.registerDefaultInstance(asjg.class, asjgVar);
    }

    private asjg() {
    }

    @Override // defpackage.apag
    protected final Object dynamicMethod(apaf apafVar, Object obj, Object obj2) {
        byte b = 1;
        switch (apafVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.n);
            case SET_MEMOIZED_IS_INITIALIZED:
                if (obj == null) {
                    b = 0;
                }
                this.n = b;
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\n\u0000\u0001\u0001\f\n\u0000\u0000\u0001\u0001ဇ\u0000\u0002ဉ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005᠌\u0004\u0007ဈ\u0007\tᐉ\b\nဉ\t\u000bဉ\n\fဉ\u000b", new Object[]{"b", "c", "d", "e", "f", "g", asif.m, "h", "i", "j", "k", "l"});
            case NEW_MUTABLE_INSTANCE:
                return new asjg();
            case NEW_BUILDER:
                return new aozy(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                apca apcaVar = m;
                if (apcaVar == null) {
                    synchronized (asjg.class) {
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
