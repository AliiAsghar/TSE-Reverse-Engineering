package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class amiw extends apag implements apbu {
    public static final amiw a;
    private static volatile apca k;
    public int b;
    public int c;
    public boolean d;
    public boolean e;
    public boolean f;
    public boolean g;
    public boolean h;
    public int i;
    public boolean j;
    private boolean l;

    static {
        amiw amiwVar = new amiw();
        a = amiwVar;
        apag.registerDefaultInstance(amiw.class, amiwVar);
    }

    private amiw() {
    }

    public static /* synthetic */ void a(amiw amiwVar) {
        amiwVar.b |= 2;
        amiwVar.l = true;
    }

    @Override // defpackage.apag
    protected final Object dynamicMethod(apaf apafVar, Object obj, Object obj2) {
        switch (apafVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\t\u0000\u0001\u0001\t\t\u0000\u0000\u0000\u0001᠌\u0000\u0002ဇ\u0001\u0003ဇ\u0002\u0004ဇ\u0003\u0005ဇ\u0004\u0006ဇ\u0005\u0007ဇ\u0006\b᠌\u0007\tဇ\b", new Object[]{"b", "c", amff.f, "l", "d", "e", "f", "g", "h", "i", amiv.a, "j"});
            case NEW_MUTABLE_INSTANCE:
                return new amiw();
            case NEW_BUILDER:
                return new aozy(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                apca apcaVar = k;
                if (apcaVar == null) {
                    synchronized (amiw.class) {
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
