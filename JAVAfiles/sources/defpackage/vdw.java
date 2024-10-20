package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class vdw extends apag implements apbu {
    public static final vdw a;
    private static volatile apca d;
    public long b;
    public long c;

    static {
        vdw vdwVar = new vdw();
        a = vdwVar;
        apag.registerDefaultInstance(vdw.class, vdwVar);
    }

    private vdw() {
        aozb aozbVar = aozb.b;
    }

    @Override // defpackage.apag
    protected final Object dynamicMethod(apaf apafVar, Object obj, Object obj2) {
        switch (apafVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0000\u0002\u0000\u0000\u0003\u0004\u0002\u0000\u0000\u0000\u0003\u0002\u0004\u0002", new Object[]{"b", "c"});
            case NEW_MUTABLE_INSTANCE:
                return new vdw();
            case NEW_BUILDER:
                return new aozy(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                apca apcaVar = d;
                if (apcaVar == null) {
                    synchronized (vdw.class) {
                        apcaVar = d;
                        if (apcaVar == null) {
                            apcaVar = new aozz(a);
                            d = apcaVar;
                        }
                    }
                }
                return apcaVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
