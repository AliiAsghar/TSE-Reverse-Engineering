package defpackage;

import java.security.KeyPair;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class acbn {
    public final KeyPair a;
    public final long b;

    public acbn(KeyPair keyPair, long j) {
        this.a = keyPair;
        this.b = j;
    }

    public final String a() {
        return adqg.m(this.a.getPrivate().getEncoded());
    }

    public final String b() {
        return adqg.m(this.a.getPublic().getEncoded());
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof acbn)) {
            return false;
        }
        acbn acbnVar = (acbn) obj;
        if (this.b != acbnVar.b || !this.a.getPublic().equals(acbnVar.a.getPublic()) || !this.a.getPrivate().equals(acbnVar.a.getPrivate())) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a.getPublic(), this.a.getPrivate(), Long.valueOf(this.b)});
    }
}
