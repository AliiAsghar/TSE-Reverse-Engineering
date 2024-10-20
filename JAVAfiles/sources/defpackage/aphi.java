package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aphi extends apag implements apbu {
    public static final aphi a;
    private static volatile apca j;
    public int b;
    public int c;
    public boolean d;
    public int e;
    public int f;
    public int g;
    public int h;
    public String i = "";

    static {
        aphi aphiVar = new aphi();
        a = aphiVar;
        apag.registerDefaultInstance(aphi.class, aphiVar);
    }

    private aphi() {
    }

    @Override // defpackage.apag
    protected final Object dynamicMethod(apaf apafVar, Object obj, Object obj2) {
        switch (apafVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001᠌\u0000\u0002ဇ\u0001\u0003᠌\u0002\u0004᠌\u0003\u0005င\u0004\u0006᠌\u0005\u0007ဈ\u0006", new Object[]{"b", "c", apgo.t, "d", "e", apgo.r, "f", apgg.e, "g", "h", apgo.s, "i"});
            case NEW_MUTABLE_INSTANCE:
                return new aphi();
            case NEW_BUILDER:
                return new aozy(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                apca apcaVar = j;
                if (apcaVar == null) {
                    synchronized (aphi.class) {
                        apcaVar = j;
                        if (apcaVar == null) {
                            apcaVar = new aozz(a);
                            j = apcaVar;
                        }
                    }
                }
                return apcaVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
