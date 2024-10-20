package defpackage;

import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ygf {
    public final yge a;
    public final Optional b;
    public final Optional c;
    public final Optional d;
    public final Optional e;
    public final Optional f;

    public ygf() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ygf) {
            ygf ygfVar = (ygf) obj;
            if (this.a.equals(ygfVar.a) && this.b.equals(ygfVar.b) && this.c.equals(ygfVar.c) && this.d.equals(ygfVar.d) && this.e.equals(ygfVar.e) && this.f.equals(ygfVar.f)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode()) * 1000003) ^ this.f.hashCode();
    }

    public final String toString() {
        Optional optional = this.f;
        Optional optional2 = this.e;
        Optional optional3 = this.d;
        Optional optional4 = this.c;
        Optional optional5 = this.b;
        return "AudioPlaybackRequest{dataSource=" + String.valueOf(this.a) + ", fallbackDataSource=" + String.valueOf(optional5) + ", volume=" + String.valueOf(optional4) + ", looping=" + String.valueOf(optional3) + ", audioAttributes=" + String.valueOf(optional2) + ", audioFocusParameters=" + String.valueOf(optional) + "}";
    }

    public ygf(yge ygeVar, Optional optional, Optional optional2, Optional optional3, Optional optional4, Optional optional5) {
        this.a = ygeVar;
        this.b = optional;
        this.c = optional2;
        this.d = optional3;
        this.e = optional4;
        this.f = optional5;
    }
}
