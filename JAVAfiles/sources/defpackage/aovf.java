package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aovf extends apag implements apbu {
    public static final aovf a;
    private static volatile apca i;
    public int b;
    public aous c;
    public int f;
    public aouz g;
    public String d = "";
    public apax e = apag.emptyProtobufList();
    public apax h = apag.emptyProtobufList();

    static {
        aovf aovfVar = new aovf();
        a = aovfVar;
        apag.registerDefaultInstance(aovf.class, aovfVar);
    }

    private aovf() {
    }

    @Override // defpackage.apag
    protected final Object dynamicMethod(apaf apafVar, Object obj, Object obj2) {
        switch (apafVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0000\u0006\u0000\u0001\u0001\u0007\u0006\u0000\u0002\u0000\u0001ဉ\u0000\u0002Ȉ\u0003Ț\u0004\f\u0006ဉ\u0001\u0007Ț", new Object[]{"b", "c", "d", "e", "f", "g", "h"});
            case NEW_MUTABLE_INSTANCE:
                return new aovf();
            case NEW_BUILDER:
                return new aozy(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                apca apcaVar = i;
                if (apcaVar == null) {
                    synchronized (aovf.class) {
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
