package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class apzp extends apag implements apbu {
    public static final apzp a;
    private static volatile apca i;
    public int b;
    public String c = "";
    public String d = "";
    public String e = "";
    public String f = "";
    public String g = "";
    public apzq h;

    static {
        apzp apzpVar = new apzp();
        a = apzpVar;
        apag.registerDefaultInstance(apzp.class, apzpVar);
    }

    private apzp() {
    }

    @Override // defpackage.apag
    protected final Object dynamicMethod(apaf apafVar, Object obj, Object obj2) {
        switch (apafVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0000\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ\u0004Ȉ\u0005Ȉ\u0006ဉ\u0000", new Object[]{"b", "c", "d", "e", "f", "g", "h"});
            case NEW_MUTABLE_INSTANCE:
                return new apzp();
            case NEW_BUILDER:
                return new aozy(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                apca apcaVar = i;
                if (apcaVar == null) {
                    synchronized (apzp.class) {
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
