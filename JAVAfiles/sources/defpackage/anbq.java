package defpackage;

import java.util.Comparator;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes4.dex */
final class anbq implements Comparator {
    public static final anbq a;
    private static final /* synthetic */ anbq[] b;

    static {
        anbq anbqVar = new anbq();
        a = anbqVar;
        b = new anbq[]{anbqVar};
    }

    private anbq() {
    }

    public static anbq[] values() {
        return (anbq[]) b.clone();
    }

    @Override // java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        byte[] bArr = (byte[]) obj;
        byte[] bArr2 = (byte[]) obj2;
        int min = Math.min(bArr.length, bArr2.length);
        for (int i = 0; i < min; i++) {
            int ci = albo.ci(bArr[i]) - albo.ci(bArr2[i]);
            if (ci != 0) {
                return ci;
            }
        }
        return bArr.length - bArr2.length;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return "UnsignedBytes.lexicographicalComparator() (pure Java version)";
    }
}
