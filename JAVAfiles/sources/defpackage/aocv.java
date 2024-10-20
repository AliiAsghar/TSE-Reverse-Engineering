package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aocv extends apab implements apac {
    public static final aocv a;
    private static volatile apca b;
    private byte c = 2;

    static {
        aocv aocvVar = new aocv();
        a = aocvVar;
        apag.registerDefaultInstance(aocv.class, aocvVar);
    }

    private aocv() {
    }

    @Override // defpackage.apag
    protected final Object dynamicMethod(apaf apafVar, Object obj, Object obj2) {
        byte b2;
        switch (apafVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.c);
            case SET_MEMOIZED_IS_INITIALIZED:
                if (obj == null) {
                    b2 = 0;
                } else {
                    b2 = 1;
                }
                this.c = b2;
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0004\u0000", null);
            case NEW_MUTABLE_INSTANCE:
                return new aocv();
            case NEW_BUILDER:
                return new apaa(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                apca apcaVar = b;
                if (apcaVar == null) {
                    synchronized (aocv.class) {
                        apcaVar = b;
                        if (apcaVar == null) {
                            apcaVar = new aozz(a);
                            b = apcaVar;
                        }
                    }
                }
                return apcaVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
