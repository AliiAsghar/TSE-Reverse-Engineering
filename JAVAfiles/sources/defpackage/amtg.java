package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class amtg extends apag implements apbu {
    public static final amtg a;
    private static volatile apca f;
    public int b;
    public Object d;
    public int c = 0;
    public String e = "";

    static {
        amtg amtgVar = new amtg();
        a = amtgVar;
        apag.registerDefaultInstance(amtg.class, amtgVar);
    }

    private amtg() {
    }

    @Override // defpackage.apag
    protected final Object dynamicMethod(apaf apafVar, Object obj, Object obj2) {
        switch (apafVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\u000f\u0001\u0001\u0001\u000f\u000f\u0000\u0000\u0000\u0001<\u0000\u0002ဈ\u0000\u0003<\u0000\u0004<\u0000\u0005<\u0000\u0006<\u0000\u0007<\u0000\b<\u0000\t<\u0000\n<\u0000\u000b<\u0000\f<\u0000\r<\u0000\u000e<\u0000\u000f<\u0000", new Object[]{"d", "c", "b", amsv.class, "e", amsx.class, amsv.class, amsw.class, amsy.class, amsz.class, amta.class, amtl.class, amtd.class, amtb.class, amte.class, amth.class, amtf.class, amtk.class});
            case NEW_MUTABLE_INSTANCE:
                return new amtg();
            case NEW_BUILDER:
                return new aozy(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                apca apcaVar = f;
                if (apcaVar == null) {
                    synchronized (amtg.class) {
                        apcaVar = f;
                        if (apcaVar == null) {
                            apcaVar = new aozz(a);
                            f = apcaVar;
                        }
                    }
                }
                return apcaVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
