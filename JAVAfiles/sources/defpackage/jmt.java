package defpackage;

import j$.time.Duration;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jmt {
    public final boolean a;
    public final long b;
    public final boolean c;
    public final boolean d;
    public final int e;
    public final Duration f;

    public jmt(boolean z, long j, boolean z2, boolean z3, int i, Duration duration) {
        this.a = z;
        this.b = j;
        this.c = z2;
        this.d = z3;
        this.e = i;
        this.f = duration;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jmt)) {
            return false;
        }
        jmt jmtVar = (jmt) obj;
        if (this.a == jmtVar.a && this.b == jmtVar.b && this.c == jmtVar.c && this.d == jmtVar.d && this.e == jmtVar.e && d.F(this.f, jmtVar.f)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int v = a.v(this.a);
        Duration duration = this.f;
        boolean z = this.d;
        return (((((((((v * 31) + a.A(this.b)) * 31) + a.v(this.c)) * 31) + a.v(z)) * 31) + this.e) * 31) + duration.hashCode();
    }

    public final String toString() {
        return "AttachmentConstraints(allowMultipleVideos=" + this.a + ", maxMessageSizeBytes=" + this.b + ", mediaAttachmentsSupported=" + this.c + ", locationSharingSupported=" + this.d + ", attachmentCountLimit=" + this.e + ", maxVideoDuration=" + this.f + ")";
    }
}
