package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes4.dex */
final class ambq implements ambr {
    public static final ambq a;
    private static final /* synthetic */ ambq[] b;

    static {
        ambq ambqVar = new ambq();
        a = ambqVar;
        b = new ambq[]{ambqVar};
    }

    private ambq() {
    }

    public static ambq[] values() {
        return (ambq[]) b.clone();
    }

    @Override // defpackage.ambr
    public final /* synthetic */ long a(byte[] bArr, int i) {
        if (ordinal() == 0) {
            return albo.cl(bArr[i + 7], bArr[i + 6], bArr[i + 5], bArr[i + 4], bArr[i + 3], bArr[i + 2], bArr[i + 1], bArr[i]);
        }
        throw null;
    }
}
