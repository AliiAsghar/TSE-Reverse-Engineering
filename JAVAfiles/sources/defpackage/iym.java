package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class iym extends apag implements apbu {
    public static final iym a;
    private static volatile apca k;
    public String b = "";
    public boolean c;
    public boolean d;
    public int e;
    public int f;
    public boolean g;
    public boolean h;
    public int i;
    public int j;

    static {
        iym iymVar = new iym();
        a = iymVar;
        apag.registerDefaultInstance(iym.class, iymVar);
    }

    private iym() {
    }

    @Override // defpackage.apag
    protected final Object dynamicMethod(apaf apafVar, Object obj, Object obj2) {
        switch (apafVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0000\t\u0000\u0000\u0001\t\t\u0000\u0000\u0000\u0001Ȉ\u0002\u0007\u0003\u0007\u0004\u0004\u0005\f\u0006\u0007\u0007\u0007\b\u0004\t\u0004", new Object[]{"b", "c", "d", "e", "f", "g", "h", "i", "j"});
            case NEW_MUTABLE_INSTANCE:
                return new iym();
            case NEW_BUILDER:
                return new aozy(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                apca apcaVar = k;
                if (apcaVar == null) {
                    synchronized (iym.class) {
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
