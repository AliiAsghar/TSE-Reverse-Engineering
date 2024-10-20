package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class asiy extends apag implements apbu {
    public static final asiy a;
    private static volatile apca i;
    public int b;
    public long c;
    public boolean d;
    public int e;
    public int g;
    public String f = "";
    public String h = "";

    static {
        asiy asiyVar = new asiy();
        a = asiyVar;
        apag.registerDefaultInstance(asiy.class, asiyVar);
    }

    private asiy() {
    }

    @Override // defpackage.apag
    protected final Object dynamicMethod(apaf apafVar, Object obj, Object obj2) {
        switch (apafVar.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဇ\u0001\u0003င\u0002\u0004ဈ\u0003\u0005င\u0004\u0006ဈ\u0005", new Object[]{"b", "c", "d", "e", "f", "g", "h"});
            case 3:
                return new asiy();
            case 4:
                return new aozy(a);
            case 5:
                return a;
            case 6:
                apca apcaVar = i;
                if (apcaVar == null) {
                    synchronized (asiy.class) {
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
