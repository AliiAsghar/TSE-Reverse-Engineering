package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class amkf extends apag implements apbu {
    public static final amkf a;
    private static volatile apca i;
    public int b;
    public int c;
    public boolean f;
    public int g;
    public apax d = emptyProtobufList();
    public apax e = emptyProtobufList();
    public String h = "";

    static {
        amkf amkfVar = new amkf();
        a = amkfVar;
        apag.registerDefaultInstance(amkf.class, amkfVar);
    }

    private amkf() {
    }

    @Override // defpackage.apag
    protected final Object dynamicMethod(apaf apafVar, Object obj, Object obj2) {
        switch (apafVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0002\u0000\u0001᠌\u0000\u0002\u001b\u0003\u001b\u0004ဇ\u0001\u0005င\u0002\u0006ဈ\u0003", new Object[]{"b", "c", amjw.g, "d", amke.class, "e", amke.class, "f", "g", "h"});
            case NEW_MUTABLE_INSTANCE:
                return new amkf();
            case NEW_BUILDER:
                return new aozy(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                apca apcaVar = i;
                if (apcaVar == null) {
                    synchronized (amkf.class) {
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
