package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class anlx extends apag implements apbu {
    public static final anlx a;
    private static volatile apca i;
    public int b;
    public anmq c;
    public anmb e;
    public apax g;
    public int h;
    public String d = "";
    public String f = "";

    static {
        anlx anlxVar = new anlx();
        a = anlxVar;
        apag.registerDefaultInstance(anlx.class, anlxVar);
    }

    private anlx() {
        emptyProtobufList();
        this.g = emptyProtobufList();
    }

    @Override // defpackage.apag
    protected final Object dynamicMethod(apaf apafVar, Object obj, Object obj2) {
        switch (apafVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0000\u0006\u0000\u0001\u0001\b\u0006\u0000\u0001\u0000\u0001ဉ\u0000\u0002Ȉ\u0003ဉ\u0001\u0004Ȉ\u0006\u001b\b\f", new Object[]{"b", "c", "d", "e", "f", "g", anmc.class, "h"});
            case NEW_MUTABLE_INSTANCE:
                return new anlx();
            case NEW_BUILDER:
                return new aozy(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                apca apcaVar = i;
                if (apcaVar == null) {
                    synchronized (anlx.class) {
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
