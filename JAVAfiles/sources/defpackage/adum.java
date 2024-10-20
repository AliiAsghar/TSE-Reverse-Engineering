package defpackage;

import j$.util.Objects;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class adum {
    public final long a;
    public final String d;
    public Optional e;
    public Optional f;
    public Optional c = Optional.ofNullable(null);
    public Optional b = Optional.empty();
    public Optional g = Optional.empty();

    public adum(long j, String str, String str2, String str3) {
        this.a = j;
        this.f = Optional.ofNullable(str2);
        this.d = str;
        this.e = Optional.ofNullable(str3);
    }

    public final void a(acop acopVar) {
        this.b = Optional.of(acopVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            adum adumVar = (adum) obj;
            if (this.a == adumVar.a && Objects.equals(this.b, adumVar.b) && this.d.equals(adumVar.d) && Objects.equals(this.e, adumVar.e) && Objects.equals(this.f, adumVar.f) && Objects.equals(this.g, adumVar.g)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Long.valueOf(this.a), this.b, this.d, this.e, this.f, this.g);
    }

    public final String toString() {
        return "Group ID: " + this.d + ", rcs session ID: " + this.a + ", conference URI: " + advq.URI.c(this.e) + ", conference Info: " + String.valueOf(this.b) + ", subject: " + advq.MESSAGE_CONTENT.c(this.f);
    }
}
