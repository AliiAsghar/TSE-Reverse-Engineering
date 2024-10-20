package defpackage;

import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class abde extends abdf {
    private final Uri a;
    private final long b;
    private final int c;
    private final int d;

    public abde(Uri uri, long j, int i, int i2) {
        if (uri != null) {
            this.a = uri;
            this.b = j;
            this.c = i;
            this.d = i2;
            return;
        }
        throw new NullPointerException("Null videoUri");
    }

    @Override // defpackage.abdf
    public final int a() {
        return this.d;
    }

    @Override // defpackage.abdf
    public final int b() {
        return this.c;
    }

    @Override // defpackage.abdf
    public final long c() {
        return this.b;
    }

    @Override // defpackage.abdf
    public final Uri d() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof abdf) {
            abdf abdfVar = (abdf) obj;
            if (this.a.equals(abdfVar.d()) && this.b == abdfVar.c() && this.c == abdfVar.b() && this.d == abdfVar.a()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() ^ 1000003;
        long j = this.b;
        return (((((hashCode * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ this.c) * 1000003) ^ this.d;
    }

    public final String toString() {
        return "VideoAttachmentNeedsTrimmingEvent{videoUri=" + this.a.toString() + ", outputFileSizeKb=" + this.b + ", width=" + this.c + ", height=" + this.d + "}";
    }
}
