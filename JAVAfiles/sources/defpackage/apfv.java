package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class apfv extends apag implements apbu {
    public static final apfv a;
    private static volatile apca i;
    public int b;
    public String c = "";
    public int d;
    public int e;
    public int f;
    public int g;
    public apew h;

    static {
        apfv apfvVar = new apfv();
        a = apfvVar;
        apag.registerDefaultInstance(apfv.class, apfvVar);
    }

    private apfv() {
    }

    @Override // defpackage.apag
    protected final Object dynamicMethod(apaf apafVar, Object obj, Object obj2) {
        switch (apafVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0004\u0006\u0000\u0001\u0001\u0010\u0006\u0000\u0000\u0000\u0001ဈ\u0000\u0006᠌\u0004\u0007᠌\u0005\t᠌\u0007\n᠌\b\u0010ဉ\u000e", new Object[]{"b", "c", "d", apkm.e, "e", apkm.g, "f", apkm.f, "g", amwm.f, "h"});
            case NEW_MUTABLE_INSTANCE:
                return new apfv();
            case NEW_BUILDER:
                return new aozy(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                apca apcaVar = i;
                if (apcaVar == null) {
                    synchronized (apfv.class) {
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
