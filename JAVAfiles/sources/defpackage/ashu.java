package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ashu extends apab<ashu, apaa> implements apac {
    public static final ashu a;
    private static volatile apca b;
    private byte c = 2;

    static {
        ashu ashuVar = new ashu();
        a = ashuVar;
        apag.registerDefaultInstance(ashu.class, ashuVar);
    }

    private ashu() {
    }

    @Override // defpackage.apag
    protected final Object dynamicMethod(apaf apafVar, Object obj, Object obj2) {
        byte b2;
        switch (apafVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.c);
            case 1:
                if (obj == null) {
                    b2 = 0;
                } else {
                    b2 = 1;
                }
                this.c = b2;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0000", null);
            case 3:
                return new ashu();
            case 4:
                return new apaa(a);
            case 5:
                return a;
            case 6:
                apca apcaVar = b;
                if (apcaVar == null) {
                    synchronized (ashu.class) {
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
