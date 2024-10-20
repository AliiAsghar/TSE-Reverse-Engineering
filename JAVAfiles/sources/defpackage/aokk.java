package defpackage;

import android.accounts.Account;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aokk {
    public final Account a;
    public final String b;

    public aokk() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof aokk) {
            aokk aokkVar = (aokk) obj;
            if (this.a.equals(aokkVar.a) && this.b.equals(aokkVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        return "AccountAndScope{account=" + this.a.toString() + ", scope=" + this.b + "}";
    }

    public aokk(Account account, String str) {
        this.a = account;
        this.b = str;
    }
}
