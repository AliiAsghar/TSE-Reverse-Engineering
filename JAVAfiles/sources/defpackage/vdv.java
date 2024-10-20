package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class vdv extends apag implements apbu {
    public static final vdv a;
    private static volatile apca h;
    public String b = "";
    public aozb c = aozb.b;
    public long d;
    public aozb e;
    public aozb f;
    public long g;

    static {
        vdv vdvVar = new vdv();
        a = vdvVar;
        apag.registerDefaultInstance(vdv.class, vdvVar);
    }

    private vdv() {
        aozb aozbVar = aozb.b;
        this.e = aozbVar;
        this.f = aozbVar;
    }

    @Override // defpackage.apag
    protected final Object dynamicMethod(apaf apafVar, Object obj, Object obj2) {
        switch (apafVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0000\u0006\u0000\u0000\u0001\u0006\u0006\u0000\u0000\u0000\u0001Ȉ\u0002\n\u0003\u0002\u0004\n\u0005\n\u0006\u0002", new Object[]{"b", "c", "d", "e", "f", "g"});
            case NEW_MUTABLE_INSTANCE:
                return new vdv();
            case NEW_BUILDER:
                return new aozy(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                apca apcaVar = h;
                if (apcaVar == null) {
                    synchronized (vdv.class) {
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
