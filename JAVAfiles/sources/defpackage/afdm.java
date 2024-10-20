package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class afdm {
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    private final boolean f;

    public afdm() {
        this(null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof afdm)) {
            return false;
        }
        afdm afdmVar = (afdm) obj;
        boolean z = afdmVar.f;
        if (this.a == afdmVar.a && this.b == afdmVar.b && this.c == afdmVar.c && this.d == afdmVar.d && this.e == afdmVar.e) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int v = a.v(true);
        boolean z = this.e;
        boolean z2 = this.d;
        boolean z3 = this.c;
        return (((((((((v * 31) + a.v(this.a)) * 31) + a.v(this.b)) * 31) + a.v(z3)) * 31) + a.v(z2)) * 31) + a.v(z);
    }

    public final String toString() {
        return "AttachmentResolverConfiguration(parseMediaMetadataWhenNoCursor=true, useUriStreamOpener=" + this.a + ", consumeInputStreamForSize=" + this.b + ", resolveAudioMetadata=" + this.c + ", useFullRangeAsFormatFallback=" + this.d + ", addMoreExifOrientationOptions=" + this.e + ")";
    }

    public afdm(boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        this.f = true;
        this.a = z;
        this.b = z2;
        this.c = z3;
        this.d = z4;
        this.e = z5;
    }

    public /* synthetic */ afdm(byte[] bArr) {
        this(false, false, false, true, false);
    }
}
