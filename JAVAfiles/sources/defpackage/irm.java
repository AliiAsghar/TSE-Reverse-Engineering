package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class irm extends apag<irm, aozy> implements apbu {
    public static final irm a;
    private static volatile apca o;
    public int b;
    public int c;
    public boolean f;
    public boolean g;
    public boolean h;
    public boolean j;
    public boolean k;
    public boolean l;
    public boolean m;
    public int n;
    public String d = "";
    public String e = "";
    public String i = "";

    static {
        irm irmVar = new irm();
        a = irmVar;
        apag.registerDefaultInstance(irm.class, irmVar);
    }

    private irm() {
    }

    @Override // defpackage.apag
    protected final Object dynamicMethod(apaf apafVar, Object obj, Object obj2) {
        switch (apafVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0000\f\u0000\u0001\u0001\f\f\u0000\u0000\u0000\u0001င\u0000\u0002ለ\u0001\u0003ለ\u0002\u0004ဇ\u0003\u0005ဇ\u0004\u0006ဇ\u0005\u0007ለ\u0006\bဇ\u0007\tဇ\b\nဇ\t\u000bဇ\n\fင\u000b", new Object[]{"b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n"});
            case NEW_MUTABLE_INSTANCE:
                return new irm();
            case NEW_BUILDER:
                return new aozy(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                apca apcaVar = o;
                if (apcaVar == null) {
                    synchronized (irm.class) {
                        apcaVar = o;
                        if (apcaVar == null) {
                            apcaVar = new aozz(a);
                            o = apcaVar;
                        }
                    }
                }
                return apcaVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
