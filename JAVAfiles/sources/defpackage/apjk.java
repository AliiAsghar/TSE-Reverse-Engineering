package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class apjk extends apag implements apbu {
    public static final apjk a;
    private static volatile apca k;
    public int b;
    public int c;
    public int d;
    public int e;
    public boolean f;
    public int g;
    public int h;
    public apko i;
    public boolean j;

    static {
        apjk apjkVar = new apjk();
        a = apjkVar;
        apag.registerDefaultInstance(apjk.class, apjkVar);
    }

    private apjk() {
    }

    @Override // defpackage.apag
    protected final Object dynamicMethod(apaf apafVar, Object obj, Object obj2) {
        switch (apafVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0004\b\u0000\u0001\u0001\f\b\u0000\u0000\u0000\u0001᠌\u0000\u0002င\u0001\u0006᠌\u0005\bဇ\u0007\t᠌\b\n᠌\t\u000bဉ\n\fဇ\u000b", new Object[]{"b", "c", apjb.p, "d", "e", apjb.o, "f", "g", apjw.u, "h", apkm.g, "i", "j"});
            case NEW_MUTABLE_INSTANCE:
                return new apjk();
            case NEW_BUILDER:
                return new aozy(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                apca apcaVar = k;
                if (apcaVar == null) {
                    synchronized (apjk.class) {
                        apcaVar = k;
                        if (apcaVar == null) {
                            apcaVar = new aozz(a);
                            k = apcaVar;
                        }
                    }
                }
                return apcaVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
