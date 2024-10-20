package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aqcz extends apag implements apbu {
    public static final aqcz a;
    private static volatile apca f;
    public int b;
    public int c = 0;
    public Object d;
    public aqcy e;

    static {
        aqcz aqczVar = new aqcz();
        a = aqczVar;
        apag.registerDefaultInstance(aqcz.class, aqczVar);
    }

    private aqcz() {
    }

    @Override // defpackage.apag
    protected final Object dynamicMethod(apaf apafVar, Object obj, Object obj2) {
        switch (apafVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0000\u001e\u0001\u0001\u0002 \u001e\u0000\u0000\u0000\u0002<\u0000\u0003<\u0000\u0004<\u0000\u0005<\u0000\u0006<\u0000\u0007<\u0000\bဉ\u0000\t<\u0000\u000b<\u0000\f<\u0000\r<\u0000\u000e<\u0000\u000f<\u0000\u0010<\u0000\u0011<\u0000\u0012<\u0000\u0013<\u0000\u0014<\u0000\u0015<\u0000\u0016<\u0000\u0017<\u0000\u0018<\u0000\u0019<\u0000\u001a<\u0000\u001b<\u0000\u001c<\u0000\u001d<\u0000\u001e<\u0000\u001f<\u0000 <\u0000", new Object[]{"d", "c", "b", aqda.class, aqct.class, aqcg.class, aqbt.class, aqbk.class, aqbg.class, "e", aqdb.class, aqbl.class, aqck.class, aqbq.class, aqbo.class, aqcp.class, aqcr.class, aqcs.class, aqce.class, aqbi.class, aqcu.class, aqdf.class, aqbh.class, aqcd.class, aqbs.class, aqcn.class, aqdc.class, aqco.class, aqcq.class, aqbm.class, aqca.class, aqcf.class, aqcj.class});
            case NEW_MUTABLE_INSTANCE:
                return new aqcz();
            case NEW_BUILDER:
                return new aozy((byte[]) null);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                apca apcaVar = f;
                if (apcaVar == null) {
                    synchronized (aqcz.class) {
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
