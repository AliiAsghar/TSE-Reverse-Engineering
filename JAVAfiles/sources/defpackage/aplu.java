package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aplu extends apag implements apbu {
    public static final aplu a;
    private static volatile apca k;
    public int b;
    public String c = "";
    public int d;
    public int e;
    public int f;
    public int g;
    public int h;
    public amee i;
    public int j;

    static {
        aplu apluVar = new aplu();
        a = apluVar;
        apag.registerDefaultInstance(aplu.class, apluVar);
    }

    private aplu() {
    }

    @Override // defpackage.apag
    protected final Object dynamicMethod(apaf apafVar, Object obj, Object obj2) {
        switch (apafVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0004\b\u0000\u0001\u0001\b\b\u0000\u0000\u0000\u0001Ȉ\u0002\f\u0003\f\u0004\u0004\u0005\f\u0006\f\u0007ဉ\u0000\b\f", new Object[]{"b", "c", "d", "e", "f", "g", "h", "i", "j"});
            case NEW_MUTABLE_INSTANCE:
                return new aplu();
            case NEW_BUILDER:
                return new aozy(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                apca apcaVar = k;
                if (apcaVar == null) {
                    synchronized (aplu.class) {
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
