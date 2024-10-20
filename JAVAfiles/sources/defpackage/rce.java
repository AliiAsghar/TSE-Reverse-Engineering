package defpackage;

import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class rce {
    public final byte[] a;
    public final long b;

    public rce(byte[] bArr, long j) {
        this.a = bArr;
        this.b = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rce)) {
            return false;
        }
        rce rceVar = (rce) obj;
        if (d.F(this.a, rceVar.a) && this.b == rceVar.b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        byte[] bArr = this.a;
        if (bArr == null) {
            hashCode = 0;
        } else {
            hashCode = Arrays.hashCode(bArr);
        }
        return (hashCode * 31) + ((int) this.b);
    }

    public final String toString() {
        return "DownloadedDataInfo(downloadedData=" + Arrays.toString(this.a) + ", messageSizeBytes=" + this.b + ")";
    }
}
