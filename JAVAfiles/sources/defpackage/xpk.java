package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class xpk extends algf {
    @Override // defpackage.algf
    protected final /* bridge */ /* synthetic */ Object a(Object obj) {
        xpu xpuVar = (xpu) obj;
        int ordinal = xpuVar.ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                return ajqd.THUMBNAIL;
            }
            throw new IllegalArgumentException("unknown enum value: ".concat(xpuVar.toString()));
        }
        return ajqd.FILE;
    }

    @Override // defpackage.algf
    protected final /* bridge */ /* synthetic */ Object b(Object obj) {
        ajqd ajqdVar = (ajqd) obj;
        int ordinal = ajqdVar.ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                return xpu.THUMBNAIL;
            }
            throw new IllegalArgumentException("unknown enum value: ".concat(ajqdVar.toString()));
        }
        return xpu.FILE;
    }
}
