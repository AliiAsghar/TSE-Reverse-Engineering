package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ansh implements anmv {
    private final anmv a;
    private final byte[] b;

    public ansh(anmv anmvVar, byte[] bArr) {
        this.a = anmvVar;
        this.b = bArr;
    }

    @Override // defpackage.anmv
    public final byte[] a(byte[] bArr, byte[] bArr2) {
        byte[] bArr3 = this.b;
        if (bArr3.length == 0) {
            return this.a.a(bArr, bArr2);
        }
        return aode.O(bArr3, this.a.a(bArr, bArr2));
    }
}
