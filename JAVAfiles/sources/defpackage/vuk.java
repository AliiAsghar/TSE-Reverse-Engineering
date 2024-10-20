package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class vuk extends apag implements apbu {
    public static final vuk a;
    private static volatile apca h;
    public int b;
    public String c = "";
    public int d;
    public apct e;
    public boolean f;
    public int g;

    static {
        vuk vukVar = new vuk();
        a = vukVar;
        apag.registerDefaultInstance(vuk.class, vukVar);
    }

    private vuk() {
    }

    @Override // defpackage.apag
    protected final Object dynamicMethod(apaf apafVar, Object obj, Object obj2) {
        switch (apafVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0000\u0005\u0000\u0001\u0001\u0006\u0005\u0000\u0000\u0000\u0001Ȉ\u0002\f\u0004ဉ\u0000\u0005ဇ\u0001\u0006င\u0002", new Object[]{"b", "c", "d", "e", "f", "g"});
            case NEW_MUTABLE_INSTANCE:
                return new vuk();
            case NEW_BUILDER:
                return new aozy(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                apca apcaVar = h;
                if (apcaVar == null) {
                    synchronized (vuk.class) {
                        apcaVar = h;
                        if (apcaVar == null) {
                            apcaVar = new aozz(a);
                            h = apcaVar;
                        }
                    }
                }
                return apcaVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
