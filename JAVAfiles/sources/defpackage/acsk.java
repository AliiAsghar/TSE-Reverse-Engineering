package defpackage;

import java.security.Principal;

/* compiled from: PG */
/* loaded from: classes.dex */
final class acsk extends actd {
    private final Principal a;
    private final String b;

    public acsk(Principal principal, String str) {
        this.a = principal;
        if (str != null) {
            this.b = str;
            return;
        }
        throw new NullPointerException("Null password");
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof actd) {
            actd actdVar = (actd) obj;
            if (this.a.equals(actdVar.getUserPrincipal()) && this.b.equals(actdVar.getPassword())) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.actd, org.apache.http.auth.Credentials
    public final String getPassword() {
        return this.b;
    }

    @Override // defpackage.actd, org.apache.http.auth.Credentials
    public final Principal getUserPrincipal() {
        return this.a;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        return "GbaCredentials{userPrincipal=" + this.a.toString() + ", password=" + this.b + "}";
    }
}
