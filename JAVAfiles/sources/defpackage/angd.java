package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class angd extends apag implements apbu {
    public static final angd a;
    private static volatile apca d;
    public int b = 0;
    public Object c;

    static {
        angd angdVar = new angd();
        a = angdVar;
        apag.registerDefaultInstance(angd.class, angdVar);
    }

    private angd() {
    }

    @Override // defpackage.apag
    protected final Object dynamicMethod(apaf apafVar, Object obj, Object obj2) {
        switch (apafVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0004\u000e\u0001\u0000\u0002\u000f\u000e\u0000\u0000\u0000\u0002<\u0000\u0003<\u0000\u0004<\u0000\u0005<\u0000\u0006<\u0000\u0007<\u0000\b<\u0000\t<\u0000\n<\u0000\u000b<\u0000\f<\u0000\r<\u0000\u000e<\u0000\u000f<\u0000", new Object[]{"c", "b", anfu.class, angn.class, anhc.class, angw.class, anhf.class, anfo.class, anfs.class, angc.class, anfz.class, angt.class, anfp.class, angb.class, anhd.class, anga.class});
            case NEW_MUTABLE_INSTANCE:
                return new angd();
            case NEW_BUILDER:
                return new aozy(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                apca apcaVar = d;
                if (apcaVar == null) {
                    synchronized (angd.class) {
                        apcaVar = d;
                        if (apcaVar == null) {
                            apcaVar = new aozz(a);
                            d = apcaVar;
                        }
                    }
                }
                return apcaVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
