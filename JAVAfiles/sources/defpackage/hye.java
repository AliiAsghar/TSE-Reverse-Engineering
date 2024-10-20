package defpackage;

import java.nio.ByteBuffer;
import java.security.MessageDigest;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hye implements hne {
    private final String b;
    private final long c;

    public hye(String str, long j) {
        this.b = str == null ? "" : str;
        this.c = j;
    }

    @Override // defpackage.hne
    public final void a(MessageDigest messageDigest) {
        messageDigest.update(ByteBuffer.allocate(12).putLong(this.c).putInt(0).array());
        messageDigest.update(this.b.getBytes(a));
    }

    @Override // defpackage.hne
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        hye hyeVar = (hye) obj;
        if (this.c == hyeVar.c && this.b.equals(hyeVar.b)) {
            return true;
        }
        return false;
    }

    @Override // defpackage.hne
    public final int hashCode() {
        int hashCode = this.b.hashCode() * 31;
        long j = this.c;
        return (hashCode + ((int) (j ^ (j >>> 32)))) * 31;
    }
}
