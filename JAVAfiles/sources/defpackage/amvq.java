package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class amvq extends apag implements apbu {
    public static final amvq a;
    private static volatile apca g;
    public int b;
    public Object d;
    public int c = 0;
    public aozb e = aozb.b;
    public apao f = emptyIntList();

    static {
        amvq amvqVar = new amvq();
        a = amvqVar;
        apag.registerDefaultInstance(amvq.class, amvqVar);
    }

    private amvq() {
    }

    @Override // defpackage.apag
    protected final Object dynamicMethod(apaf apafVar, Object obj, Object obj2) {
        switch (apafVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\u000e\u0001\u0001\u0001\u000e\u000e\u0000\u0001\u0000\u0001ည\u0000\u0002<\u0000\u0003<\u0000\u0004<\u0000\u0005<\u0000\u0006<\u0000\u0007ࠞ\b<\u0000\t<\u0000\n<\u0000\u000b<\u0000\f<\u0000\r<\u0000\u000e<\u0000", new Object[]{"d", "c", "b", "e", amvn.class, amvh.class, amvc.class, amvb.class, amvf.class, "f", amvg.d, amve.class, amvk.class, amvp.class, amvj.class, amvo.class, amvi.class, amvd.class});
            case NEW_MUTABLE_INSTANCE:
                return new amvq();
            case NEW_BUILDER:
                return new aozy(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                apca apcaVar = g;
                if (apcaVar == null) {
                    synchronized (amvq.class) {
                        apcaVar = g;
                        if (apcaVar == null) {
                            apcaVar = new aozz(a);
                            g = apcaVar;
                        }
                    }
                }
                return apcaVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
