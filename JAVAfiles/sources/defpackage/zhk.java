package defpackage;

import android.accounts.Account;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class zhk {
    public final lrx a;
    public final Account b;
    public final String c;

    public zhk(lrx lrxVar, Account account, String str) {
        lrxVar.getClass();
        this.a = lrxVar;
        this.b = account;
        this.c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zhk)) {
            return false;
        }
        zhk zhkVar = (zhk) obj;
        if (this.a == zhkVar.a && d.F(this.b, zhkVar.b) && d.F(this.c, zhkVar.c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = this.a.hashCode() * 31;
        Account account = this.b;
        int i = 0;
        if (account == null) {
            hashCode = 0;
        } else {
            hashCode = account.hashCode();
        }
        int i2 = (hashCode2 + hashCode) * 31;
        String str = this.c;
        if (str != null) {
            i = str.hashCode();
        }
        return i2 + i;
    }

    public final String toString() {
        return "ProfileSettingsUiData(eligibility=" + this.a + ", androidAccount=" + this.b + ", phoneNumber=" + this.c + ")";
    }
}
