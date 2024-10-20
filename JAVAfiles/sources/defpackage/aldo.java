package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aldo extends apag implements apbu {
    public static final aldo a;
    private static volatile apca j;
    public int b;
    public aldb c;
    public aldm e;
    public aldp f;
    public boolean g;
    public boolean h;
    public aldl i;
    private byte k = 2;
    public apax d = emptyProtobufList();

    static {
        aldo aldoVar = new aldo();
        a = aldoVar;
        apag.registerDefaultInstance(aldo.class, aldoVar);
    }

    private aldo() {
    }

    @Override // defpackage.apag
    protected final Object dynamicMethod(apaf apafVar, Object obj, Object obj2) {
        byte b = 1;
        switch (apafVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.k);
            case SET_MEMOIZED_IS_INITIALIZED:
                if (obj == null) {
                    b = 0;
                }
                this.k = b;
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0004\u0007\u0000\u0001\t\u000f\u0007\u0000\u0001\u0001\tᐉ\u0001\nဉ\u0003\u000b\u001b\fဉ\u0004\rဇ\u0005\u000eဉ\u0007\u000fဇ\u0006", new Object[]{"b", "c", "e", "d", alcs.class, "f", "g", "i", "h"});
            case NEW_MUTABLE_INSTANCE:
                return new aldo();
            case NEW_BUILDER:
                return new aozy(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                apca apcaVar = j;
                if (apcaVar == null) {
                    synchronized (aldo.class) {
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
