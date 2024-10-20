package defpackage;

import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ahip {
    public Uri a;
    public String b;
    public ahio c;
    public int d;
    public alog e;
    public algw f;
    public aoyo g;
    public byte h;

    public ahip() {
        throw null;
    }

    public final void a(aoyo aoyoVar) {
        if (aoyoVar != null) {
            this.g = aoyoVar;
            return;
        }
        throw new NullPointerException("Null customDownloaderMetadata");
    }

    public final void b(ahio ahioVar) {
        if (ahioVar != null) {
            this.c = ahioVar;
            return;
        }
        throw new NullPointerException("Null downloadConstraints");
    }

    public final void c(alog alogVar) {
        if (alogVar != null) {
            this.e = alogVar;
            return;
        }
        throw new NullPointerException("Null extraHttpHeaders");
    }

    public final void d(int i) {
        this.d = i;
        this.h = (byte) 1;
    }

    public ahip(byte[] bArr) {
        this.f = alfd.a;
    }
}
