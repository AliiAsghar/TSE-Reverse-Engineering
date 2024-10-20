package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aowv extends apag implements apbu {
    public static final aowv a;
    private static volatile apca i;
    public int b;
    public String c = "";
    public apup d;
    public apup e;
    public double f;
    public aovr g;
    public apct h;

    static {
        aowv aowvVar = new aowv();
        a = aowvVar;
        apag.registerDefaultInstance(aowv.class, aowvVar);
    }

    private aowv() {
    }

    @Override // defpackage.apag
    protected final Object dynamicMethod(apaf apafVar, Object obj, Object obj2) {
        switch (apafVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0000\u0006\u0000\u0001\u0002\u000e\u0006\u0000\u0000\u0000\u0002Ȉ\u0007\u0000\tဉ\u0000\fဉ\u0001\rဉ\u0002\u000eဉ\u0003", new Object[]{"b", "c", "f", "d", "e", "g", "h"});
            case NEW_MUTABLE_INSTANCE:
                return new aowv();
            case NEW_BUILDER:
                return new aozy(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                apca apcaVar = i;
                if (apcaVar == null) {
                    synchronized (aowv.class) {
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
