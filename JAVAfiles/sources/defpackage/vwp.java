package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class vwp extends apag implements apbu {
    public static final vwp a;
    private static volatile apca i;
    public int b;
    public String c = "";
    public String d = "";
    public String e = "";
    public apax f = emptyProtobufList();
    public vws g;
    public long h;

    static {
        vwp vwpVar = new vwp();
        a = vwpVar;
        apag.registerDefaultInstance(vwp.class, vwpVar);
    }

    private vwp() {
    }

    @Override // defpackage.apag
    protected final Object dynamicMethod(apaf apafVar, Object obj, Object obj2) {
        switch (apafVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0000\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ\u0004\u001b\u0005ဉ\u0000\u0006\u0002", new Object[]{"b", "c", "d", "e", "f", vwl.class, "g", "h"});
            case NEW_MUTABLE_INSTANCE:
                return new vwp();
            case NEW_BUILDER:
                return new aozy(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                apca apcaVar = i;
                if (apcaVar == null) {
                    synchronized (vwp.class) {
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
