package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class amrp extends apag implements apbu {
    public static final amrp a;
    private static volatile apca i;
    public int b;
    public boolean c;
    public int d;
    public int e;
    public String f = "";
    public boolean g;
    public boolean h;

    static {
        amrp amrpVar = new amrp();
        a = amrpVar;
        apag.registerDefaultInstance(amrp.class, amrpVar);
    }

    private amrp() {
    }

    @Override // defpackage.apag
    protected final Object dynamicMethod(apaf apafVar, Object obj, Object obj2) {
        switch (apafVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0004\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဇ\u0000\u0002᠌\u0001\u0003᠌\u0002\u0004ဈ\u0003\u0005ဇ\u0004\u0006ဇ\u0005", new Object[]{"b", "c", "d", amfz.p, "e", amff.a, "f", "g", "h"});
            case NEW_MUTABLE_INSTANCE:
                return new amrp();
            case NEW_BUILDER:
                return new aozy(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                apca apcaVar = i;
                if (apcaVar == null) {
                    synchronized (amrp.class) {
                        apcaVar = i;
                        if (apcaVar == null) {
                            apcaVar = new aozz(a);
                            i = apcaVar;
                        }
                    }
                }
                return apcaVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
