package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aqby extends apag implements aqbz {
    public static final aqby a;
    private static volatile apca i;
    public Object c;
    public int d;
    public int f;
    public int g;
    public int h;
    private int j;
    public int b = 0;
    private byte k = 2;
    public String e = "";

    static {
        aqby aqbyVar = new aqby();
        a = aqbyVar;
        apag.registerDefaultInstance(aqby.class, aqbyVar);
    }

    private aqby() {
    }

    @Override // defpackage.apag
    protected final Object dynamicMethod(apaf apafVar, Object obj, Object obj2) {
        byte b = 1;
        switch (apafVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.k);
            case SET_MEMOIZED_IS_INITIALIZED:
                if (obj == null) {
                    b = 0;
                }
                this.k = b;
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0000\u0016\u0001\u0001\u0001\u0016\u0016\u0000\u0000\u0002\u0001\f\u0002<\u0000\u0003\u0004\u0004\u0004\u0005м\u0000\u0006<\u0000\u0007<\u0000\b<\u0000\t<\u0000\nм\u0000\u000b<\u0000\fȈ\r<\u0000\u000e<\u0000\u000f<\u0000\u0010<\u0000\u0011<\u0000\u0012<\u0000\u0013<\u0000\u0014ဌ\u0000\u0015<\u0000\u0016<\u0000", new Object[]{"c", "b", "j", "d", aqce.class, "g", "h", alcl.class, aqbj.class, aqbe.class, aqbw.class, aqdg.class, aqbf.class, aqcb.class, "e", aqcv.class, aqbn.class, aqde.class, aqcc.class, aqdh.class, aqbp.class, aqch.class, "f", aqbu.class, aqbx.class});
            case NEW_MUTABLE_INSTANCE:
                return new aqby();
            case NEW_BUILDER:
                return new aozy((short[]) null, (byte[]) null);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                apca apcaVar = i;
                if (apcaVar == null) {
                    synchronized (aqby.class) {
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
