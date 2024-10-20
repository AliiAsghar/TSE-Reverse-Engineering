package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aqgw extends apag implements aqgx {
    public static final aqgw a;
    private static volatile apca i;
    public int b;
    public aqfn c;
    public aqft d;
    public apax e;
    public int f;
    public String g;
    public aqhf h;

    static {
        aqgw aqgwVar = new aqgw();
        a = aqgwVar;
        apag.registerDefaultInstance(aqgw.class, aqgwVar);
    }

    private aqgw() {
        emptyProtobufList();
        this.e = emptyProtobufList();
        this.g = "";
    }

    @Override // defpackage.apag
    protected final Object dynamicMethod(apaf apafVar, Object obj, Object obj2) {
        switch (apafVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0000\u0006\u0000\u0001\u0001\n\u0006\u0000\u0001\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0006\u001b\u0007\f\tȈ\nဉ\u0003", new Object[]{"b", "c", "d", "e", aqgy.class, "f", "g", "h"});
            case NEW_MUTABLE_INSTANCE:
                return new aqgw();
            case NEW_BUILDER:
                return new aozy((char[][]) null);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                apca apcaVar = i;
                if (apcaVar == null) {
                    synchronized (aqgw.class) {
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
