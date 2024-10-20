package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class apgv extends apag implements apbu {
    public static final apgv a;
    private static volatile apca h;
    public int b;
    public int c = 0;
    public Object d;
    public long e;
    public int f;
    public int g;

    static {
        apgv apgvVar = new apgv();
        a = apgvVar;
        apag.registerDefaultInstance(apgv.class, apgvVar);
    }

    private apgv() {
    }

    @Override // defpackage.apag
    protected final Object dynamicMethod(apaf apafVar, Object obj, Object obj2) {
        switch (apafVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\r\u0001\u0001\u0001\r\r\u0000\u0000\u0000\u0001ဂ\u0000\u0002᠌\u0002\u0003<\u0000\u0004᠌\u0001\u0005<\u0000\u0006<\u0000\u0007<\u0000\b<\u0000\t<\u0000\n<\u0000\u000b<\u0000\f<\u0000\r<\u0000", new Object[]{"d", "c", "b", "e", "g", apez.s, aphd.class, "f", apez.t, apgl.class, apha.class, apgp.class, apgu.class, apgm.class, apgn.class, apgh.class, apgt.class, apgr.class});
            case NEW_MUTABLE_INSTANCE:
                return new apgv();
            case NEW_BUILDER:
                return new aozy(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                apca apcaVar = h;
                if (apcaVar == null) {
                    synchronized (apgv.class) {
                        apcaVar = h;
                        if (apcaVar == null) {
                            apcaVar = new aozz(a);
                            h = apcaVar;
                        }
                    }
                }
                return apcaVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
