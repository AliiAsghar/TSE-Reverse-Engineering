package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class apkr extends apag implements apbu {
    public static final apkr a;
    private static volatile apca g;
    public int b;
    public Object d;
    public apfw e;
    public apfu f;
    public int c = 0;
    private byte h = 2;

    static {
        apkr apkrVar = new apkr();
        a = apkrVar;
        apag.registerDefaultInstance(apkr.class, apkrVar);
    }

    private apkr() {
    }

    @Override // defpackage.apag
    protected final Object dynamicMethod(apaf apafVar, Object obj, Object obj2) {
        byte b = 1;
        switch (apafVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.h);
            case SET_MEMOIZED_IS_INITIALIZED:
                if (obj == null) {
                    b = 0;
                }
                this.h = b;
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0004\f\u0001\u0001\u0001\u000e\f\u0000\u0000\u0001\u0001<\u0000\u0002<\u0000\u0004<\u0000\u0005<\u0000\u0006<\u0000\bဉ\u0002\tဉ\u0003\n<\u0000\u000bм\u0000\f<\u0000\r<\u0000\u000e<\u0000", new Object[]{"d", "c", "b", apkq.class, aphn.class, apho.class, apex.class, apfy.class, "e", "f", apfo.class, apfh.class, apfa.class, apgv.class, aphe.class});
            case NEW_MUTABLE_INSTANCE:
                return new apkr();
            case NEW_BUILDER:
                return new aozy(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                apca apcaVar = g;
                if (apcaVar == null) {
                    synchronized (apkr.class) {
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
