package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class apja extends apag implements apbu {
    public static final apja a;
    private static volatile apca k;
    public int b;
    public int c;
    public int e;
    public apiw f;
    public int h;
    public int i;
    public int j;
    public String d = "";
    public String g = "";

    static {
        apja apjaVar = new apja();
        a = apjaVar;
        apag.registerDefaultInstance(apja.class, apjaVar);
    }

    private apja() {
    }

    @Override // defpackage.apag
    protected final Object dynamicMethod(apaf apafVar, Object obj, Object obj2) {
        switch (apafVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                apam apamVar = apjb.b;
                return newMessageInfo(a, "\u0004\b\u0000\u0001\u0001\n\b\u0000\u0000\u0000\u0001᠌\u0000\u0002ဈ\u0001\u0003᠌\u0002\u0006ဉ\u0005\u0007ဈ\u0006\b᠌\u0007\tင\b\nင\t", new Object[]{"b", "c", aphl.u, "d", "e", apamVar, "f", "g", "h", apamVar, "i", "j"});
            case NEW_MUTABLE_INSTANCE:
                return new apja();
            case NEW_BUILDER:
                return new aozy(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                apca apcaVar = k;
                if (apcaVar == null) {
                    synchronized (apja.class) {
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
