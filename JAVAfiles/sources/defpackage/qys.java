package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class qys extends algf {
    @Override // defpackage.algf
    protected final /* bridge */ /* synthetic */ Object a(Object obj) {
        mez mezVar = (mez) obj;
        int ordinal = mezVar.ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal != 2) {
                    if (ordinal != 3) {
                        if (ordinal != 4) {
                            if (ordinal == 5) {
                                return amed.TRANSPORT_WIFI;
                            }
                            throw new IllegalArgumentException("unknown enum value: ".concat(mezVar.toString()));
                        }
                        return amed.TRANSPORT_VPN;
                    }
                    return amed.TRANSPORT_ETHERNET;
                }
                return amed.TRANSPORT_CELLULAR;
            }
            return amed.TRANSPORT_BLUETOOTH;
        }
        return amed.TRANSPORT_OTHER;
    }

    @Override // defpackage.algf
    protected final /* bridge */ /* synthetic */ Object b(Object obj) {
        amed amedVar = (amed) obj;
        int ordinal = amedVar.ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal != 2) {
                    if (ordinal != 3) {
                        if (ordinal != 4) {
                            if (ordinal == 5) {
                                return mez.TRANSPORT_WIFI;
                            }
                            throw new IllegalArgumentException("unknown enum value: ".concat(amedVar.toString()));
                        }
                        return mez.TRANSPORT_VPN;
                    }
                    return mez.TRANSPORT_ETHERNET;
                }
                return mez.TRANSPORT_CELLULAR;
            }
            return mez.TRANSPORT_BLUETOOTH;
        }
        return mez.TRANSPORT_OTHER;
    }
}
