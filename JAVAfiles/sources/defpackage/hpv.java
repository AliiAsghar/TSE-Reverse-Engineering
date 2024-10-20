package defpackage;

import java.nio.ByteBuffer;
import java.security.MessageDigest;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class hpv implements hne {
    private static final hyr b = new hyr(50);
    private final hne c;
    private final hne d;
    private final int e;
    private final int f;
    private final Class g;
    private final hnj h;
    private final hnn i;
    private final hqh j;

    public hpv(hqh hqhVar, hne hneVar, hne hneVar2, int i, int i2, hnn hnnVar, Class cls, hnj hnjVar) {
        this.j = hqhVar;
        this.c = hneVar;
        this.d = hneVar2;
        this.e = i;
        this.f = i2;
        this.i = hnnVar;
        this.g = cls;
        this.h = hnjVar;
    }

    @Override // defpackage.hne
    public final void a(MessageDigest messageDigest) {
        byte[] bArr = (byte[]) this.j.e(byte[].class);
        ByteBuffer.wrap(bArr).putInt(this.e).putInt(this.f).array();
        this.d.a(messageDigest);
        this.c.a(messageDigest);
        messageDigest.update(bArr);
        hnn hnnVar = this.i;
        if (hnnVar != null) {
            hnnVar.a(messageDigest);
        }
        this.h.a(messageDigest);
        Class cls = this.g;
        hyr hyrVar = b;
        byte[] bArr2 = (byte[]) hyrVar.h(cls);
        if (bArr2 == null) {
            bArr2 = this.g.getName().getBytes(a);
            hyrVar.i(this.g, bArr2);
        }
        messageDigest.update(bArr2);
        this.j.c(bArr);
    }

    @Override // defpackage.hne
    public final boolean equals(Object obj) {
        if (obj instanceof hpv) {
            hpv hpvVar = (hpv) obj;
            if (this.f == hpvVar.f && this.e == hpvVar.e && d.F(this.i, hpvVar.i) && this.g.equals(hpvVar.g) && this.c.equals(hpvVar.c) && this.d.equals(hpvVar.d) && this.h.equals(hpvVar.h)) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.hne
    public final int hashCode() {
        int hashCode = (this.c.hashCode() * 31) + this.d.hashCode();
        hnn hnnVar = this.i;
        int i = (((hashCode * 31) + this.e) * 31) + this.f;
        if (hnnVar != null) {
            i = (i * 31) + hnnVar.hashCode();
        }
        return (((i * 31) + this.g.hashCode()) * 31) + this.h.hashCode();
    }

    public final String toString() {
        hnj hnjVar = this.h;
        hnn hnnVar = this.i;
        Class cls = this.g;
        hne hneVar = this.d;
        return "ResourceCacheKey{sourceKey=" + String.valueOf(this.c) + ", signature=" + String.valueOf(hneVar) + ", width=" + this.e + ", height=" + this.f + ", decodedResourceClass=" + String.valueOf(cls) + ", transformation='" + String.valueOf(hnnVar) + "', options=" + String.valueOf(hnjVar) + "}";
    }
}
