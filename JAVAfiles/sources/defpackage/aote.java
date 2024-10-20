package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aote extends apag implements apbu {
    public static final aote a;
    private static volatile apca i;
    public int b;
    public aozb c = aozb.b;
    public aozb d;
    public aozb e;
    public aotp f;
    public apax g;
    public int h;

    static {
        aote aoteVar = new aote();
        a = aoteVar;
        apag.registerDefaultInstance(aote.class, aoteVar);
    }

    private aote() {
        aozb aozbVar = aozb.b;
        this.d = aozbVar;
        this.e = aozbVar;
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
                return newMessageInfo(a, "\u0000\u0006\u0000\u0001\u0001\u000e\u0006\u0000\u0001\u0000\u0001\n\u0002\n\u0006\n\fဉ\u0003\r\u001b\u000e\f", new Object[]{"b", "c", "d", "e", "f", "g", aoto.class, "h"});
            case NEW_MUTABLE_INSTANCE:
                return new aote();
            case NEW_BUILDER:
                return new aozy(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                apca apcaVar = i;
                if (apcaVar == null) {
                    synchronized (aote.class) {
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
