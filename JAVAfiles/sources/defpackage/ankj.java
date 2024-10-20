package defpackage;

import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ankj implements aqum {
    private final /* synthetic */ int a;

    public ankj(int i) {
        this.a = i;
    }

    @Override // defpackage.aqum
    public final /* synthetic */ Object a(byte[] bArr) {
        int i = this.a;
        if (i != 0) {
            if (i != 1) {
                return bArr;
            }
            if (bArr == null) {
                return aqgi.a;
            }
            try {
                aozs aozsVar = aozs.a;
                apcc apccVar = apcc.a;
                return (aqgi) apag.parseFrom(aqgi.a, bArr, aozs.a);
            } catch (apba unused) {
                return aqgi.a;
            }
        }
        bArr.getClass();
        try {
            aozs aozsVar2 = aozs.a;
            apcc apccVar2 = apcc.a;
            return (aqgi) apag.parseFrom(aqgi.a, bArr, aozs.a);
        } catch (apba e) {
            anjs anjsVar = new anjs(null);
            anjsVar.c();
            anjsVar.d = Optional.of(e);
            anjsVar.b = "Failed to parse TachyonError from bytes.";
            xdj.a(anjsVar.a());
            return aqgi.a;
        }
    }

    @Override // defpackage.aqum
    public final /* synthetic */ byte[] b(Object obj) {
        int i = this.a;
        if (i != 0) {
            if (i != 1) {
                return (byte[]) obj;
            }
            return ((aqgi) obj).toByteArray();
        }
        return ((aqgi) obj).toByteArray();
    }
}
