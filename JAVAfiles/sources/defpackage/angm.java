package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class angm extends apag implements apbu {
    public static final angm a;
    private static volatile apca i;
    public int b;
    public int c;
    public int d;
    public String e = "";
    public String f = "";
    public boolean g;
    public angl h;

    static {
        angm angmVar = new angm();
        a = angmVar;
        apag.registerDefaultInstance(angm.class, angmVar);
    }

    private angm() {
    }

    @Override // defpackage.apag
    protected final Object dynamicMethod(apaf apafVar, Object obj, Object obj2) {
        switch (apafVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0004\u0006\u0000\u0001\u0002\u0007\u0006\u0000\u0000\u0000\u0002\f\u0003\f\u0004Ȉ\u0005Ȉ\u0006\u0007\u0007ဉ\u0000", new Object[]{"b", "c", "d", "e", "f", "g", "h"});
            case NEW_MUTABLE_INSTANCE:
                return new angm();
            case NEW_BUILDER:
                return new aozy(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                apca apcaVar = i;
                if (apcaVar == null) {
                    synchronized (angm.class) {
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
