package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aocl extends apag implements apbu {
    public static final aocl a;
    private static volatile apca i;
    public int b;
    public int d;
    public aocn f;
    public boolean g;
    public String c = "";
    public apax e = emptyProtobufList();
    public apao h = emptyIntList();

    static {
        aocl aoclVar = new aocl();
        a = aoclVar;
        apag.registerDefaultInstance(aocl.class, aoclVar);
    }

    private aocl() {
    }

    @Override // defpackage.apag
    protected final Object dynamicMethod(apaf apafVar, Object obj, Object obj2) {
        switch (apafVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0004\u0006\u0000\u0001\u0001\t\u0006\u0000\u0002\u0000\u0001Ȉ\u0002\f\u0005\u001b\u0007ဉ\u0000\b\u0007\t'", new Object[]{"b", "c", "d", "e", aock.class, "f", "g", "h"});
            case NEW_MUTABLE_INSTANCE:
                return new aocl();
            case NEW_BUILDER:
                return new aozy(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                apca apcaVar = i;
                if (apcaVar == null) {
                    synchronized (aocl.class) {
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
