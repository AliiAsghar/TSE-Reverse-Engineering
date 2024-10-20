package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class vdt extends apag implements apbu {
    public static final vdt a;
    private static volatile apca c;
    public long b;

    static {
        vdt vdtVar = new vdt();
        a = vdtVar;
        apag.registerDefaultInstance(vdt.class, vdtVar);
    }

    private vdt() {
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
                return newMessageInfo(a, "\u0000\u0001\u0000\u0000\u0007\u0007\u0001\u0000\u0000\u0000\u0007\u0002", new Object[]{"b"});
            case NEW_MUTABLE_INSTANCE:
                return new vdt();
            case NEW_BUILDER:
                return new aozy(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                apca apcaVar = c;
                if (apcaVar == null) {
                    synchronized (vdt.class) {
                        apcaVar = c;
                        if (apcaVar == null) {
                            apcaVar = new aozz(a);
                            c = apcaVar;
                        }
                    }
                }
                return apcaVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
