package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class apir extends apag implements apbu {
    public static final apir a;
    private static volatile apca m;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public String g = "";
    public apax h = apag.emptyProtobufList();
    public String i = "";
    public int j;
    public boolean k;
    public int l;

    static {
        apir apirVar = new apir();
        a = apirVar;
        apag.registerDefaultInstance(apir.class, apirVar);
    }

    private apir() {
    }

    @Override // defpackage.apag
    protected final Object dynamicMethod(apaf apafVar, Object obj, Object obj2) {
        switch (apafVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0004\n\u0000\u0001\u0001\f\n\u0000\u0001\u0000\u0001᠌\u0000\u0002᠌\u0001\u0003᠌\u0002\u0004ဈ\u0005\u0005ဈ\u0006\u0006᠌\u0003\t\u001a\nဇ\t\u000bင\u0007\f᠌\n", new Object[]{"b", "c", aphl.m, "d", aphl.p, "e", aphl.o, "g", "i", "f", aphl.n, "h", "k", "j", "l", aphl.l});
            case NEW_MUTABLE_INSTANCE:
                return new apir();
            case NEW_BUILDER:
                return new aozy(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                apca apcaVar = m;
                if (apcaVar == null) {
                    synchronized (apir.class) {
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
