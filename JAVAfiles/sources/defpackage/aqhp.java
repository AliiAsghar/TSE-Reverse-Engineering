package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aqhp extends apag implements apbu {
    public static final aqhp a;
    private static volatile apca l;
    public int b;
    public aqgb c;
    public float f;
    public int i;
    public aqge k;
    public String d = "";
    public String e = "";
    public String g = "";
    public String h = "";
    public aozb j = aozb.b;

    static {
        aqhp aqhpVar = new aqhp();
        a = aqhpVar;
        apag.registerDefaultInstance(aqhp.class, aqhpVar);
    }

    private aqhp() {
    }

    @Override // defpackage.apag
    protected final Object dynamicMethod(apaf apafVar, Object obj, Object obj2) {
        switch (apafVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0000\t\u0000\u0001\u0001\n\t\u0000\u0000\u0000\u0001ဉ\u0000\u0002Ȉ\u0003Ȉ\u0005\u0001\u0006Ȉ\u0007Ȉ\b\f\t\n\nဉ\u0001", new Object[]{"b", "c", "d", "e", "f", "g", "h", "i", "j", "k"});
            case NEW_MUTABLE_INSTANCE:
                return new aqhp();
            case NEW_BUILDER:
                return new aozy(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                apca apcaVar = l;
                if (apcaVar == null) {
                    synchronized (aqhp.class) {
                        apcaVar = l;
                        if (apcaVar == null) {
                            apcaVar = new aozz(a);
                            l = apcaVar;
                        }
                    }
                }
                return apcaVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
