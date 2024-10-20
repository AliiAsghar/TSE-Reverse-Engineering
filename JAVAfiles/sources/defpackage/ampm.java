package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ampm extends apag implements apbu {
    public static final ampm a;
    private static volatile apca i;
    public int b;
    public Object d;
    public int e;
    public int f;
    public int h;
    public int c = 0;
    public String g = "";

    static {
        ampm ampmVar = new ampm();
        a = ampmVar;
        apag.registerDefaultInstance(ampm.class, ampmVar);
    }

    private ampm() {
    }

    @Override // defpackage.apag
    protected final Object dynamicMethod(apaf apafVar, Object obj, Object obj2) {
        switch (apafVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0004\u000e\u0001\u0001\u0001n\u000e\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001\u0004ဈ\u0003\u0005င\u0004e<\u0000f<\u0000g<\u0000h<\u0000i<\u0000j<\u0000k<\u0000l<\u0000m<\u0000n<\u0000", new Object[]{"d", "c", "b", "e", "f", "g", "h", ampd.class, ampg.class, ampf.class, amph.class, ampk.class, ampc.class, ampi.class, ampl.class, ampj.class, ampe.class});
            case NEW_MUTABLE_INSTANCE:
                return new ampm();
            case NEW_BUILDER:
                return new aozy(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                apca apcaVar = i;
                if (apcaVar == null) {
                    synchronized (ampm.class) {
                        apcaVar = i;
                        if (apcaVar == null) {
                            apcaVar = new aozz(a);
                            i = apcaVar;
                        }
                    }
                }
                return apcaVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
