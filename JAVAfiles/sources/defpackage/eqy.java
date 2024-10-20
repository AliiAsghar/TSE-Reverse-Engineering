package defpackage;

import android.net.Uri;
import j$.util.Objects;
import java.util.Arrays;
import java.util.UUID;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class eqy {
    public final UUID a;
    public final Uri b;
    public final alor c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    public final alog g;
    public final byte[] h;

    static {
        dze.e();
    }

    public eqy(eqx eqxVar) {
        dzg.d(true);
        UUID uuid = eqxVar.a;
        dzg.g(uuid);
        this.a = uuid;
        this.b = null;
        this.c = eqxVar.c;
        this.d = false;
        this.f = false;
        this.e = true;
        this.g = eqxVar.d;
        byte[] bArr = eqxVar.e;
        this.h = bArr != null ? Arrays.copyOf(bArr, bArr.length) : null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof eqy)) {
            return false;
        }
        eqy eqyVar = (eqy) obj;
        if (this.a.equals(eqyVar.a)) {
            Uri uri = eqyVar.b;
            if (Objects.equals(null, null) && Objects.equals(this.c, eqyVar.c)) {
                boolean z = eqyVar.d;
                boolean z2 = eqyVar.f;
                boolean z3 = eqyVar.e;
                if (alzz.at(this.g, eqyVar.g) && Arrays.equals(this.h, eqyVar.h)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((((((this.a.hashCode() * 961) + this.c.hashCode()) * 29791) + 1) * 31) + this.g.hashCode()) * 31) + Arrays.hashCode(this.h);
    }
}
