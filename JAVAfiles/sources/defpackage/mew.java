package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class mew extends algf {
    @Override // defpackage.algf
    protected final /* bridge */ /* synthetic */ Object a(Object obj) {
        amed amedVar = (amed) obj;
        int ordinal = amedVar.ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal != 2) {
                    if (ordinal != 3) {
                        if (ordinal != 4) {
                            if (ordinal == 5) {
                                return yap.WIFI;
                            }
                            throw new IllegalArgumentException("unknown enum value: ".concat(amedVar.toString()));
                        }
                        return yap.VPN;
                    }
                    return yap.ETHERNET;
                }
                return yap.CELLULAR;
            }
            return yap.BLUETOOTH;
        }
        return yap.OTHER;
    }

    @Override // defpackage.algf
    protected final /* bridge */ /* synthetic */ Object b(Object obj) {
        yap yapVar = (yap) obj;
        int ordinal = yapVar.ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal != 2) {
                    if (ordinal != 3) {
                        if (ordinal != 4) {
                            if (ordinal == 5) {
                                return amed.TRANSPORT_OTHER;
                            }
                            throw new IllegalArgumentException("unknown enum value: ".concat(yapVar.toString()));
                        }
                        return amed.TRANSPORT_WIFI;
                    }
                    return amed.TRANSPORT_VPN;
                }
                return amed.TRANSPORT_ETHERNET;
            }
            return amed.TRANSPORT_CELLULAR;
        }
        return amed.TRANSPORT_BLUETOOTH;
    }
}
