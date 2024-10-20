package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class vmx extends apag implements apbu {
    public static final vmx a;
    private static volatile apca d;
    public int b;
    public vmq c;
    private apbo e = apbo.a;

    static {
        vmx vmxVar = new vmx();
        a = vmxVar;
        apag.registerDefaultInstance(vmx.class, vmxVar);
    }

    private vmx() {
    }

    @Override // defpackage.apag
    protected final Object dynamicMethod(apaf apafVar, Object obj, Object obj2) {
        switch (apafVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0001\u0000\u0000\u0001ဉ\u0000\u00022", new Object[]{"b", "c", "e", vmw.a});
            case NEW_MUTABLE_INSTANCE:
                return new vmx();
            case NEW_BUILDER:
                return new aozy(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                apca apcaVar = d;
                if (apcaVar == null) {
                    synchronized (vmx.class) {
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
