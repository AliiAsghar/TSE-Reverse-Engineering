package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class whm extends apag implements apbu {
    public static final whm a;
    private static volatile apca i;
    public int b;
    public int c;
    public String d = "";
    public String e = "";
    public apct f;
    public apct g;
    public int h;

    static {
        whm whmVar = new whm();
        a = whmVar;
        apag.registerDefaultInstance(whm.class, whmVar);
    }

    private whm() {
    }

    @Override // defpackage.apag
    protected final Object dynamicMethod(apaf apafVar, Object obj, Object obj2) {
        switch (apafVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0000\u0006\u0000\u0001\u0001\u0007\u0006\u0000\u0000\u0000\u0001\f\u0002Ȉ\u0003Ȉ\u0005ဉ\u0000\u0006ဉ\u0001\u0007\f", new Object[]{"b", "c", "d", "e", "f", "g", "h"});
            case NEW_MUTABLE_INSTANCE:
                return new whm();
            case NEW_BUILDER:
                return new aozy(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                apca apcaVar = i;
                if (apcaVar == null) {
                    synchronized (whm.class) {
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
