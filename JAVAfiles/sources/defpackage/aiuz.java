package defpackage;

import android.accounts.Account;
import android.content.Context;
import android.net.Uri;
import java.util.regex.Pattern;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aiuz {
    private final String b;
    private String c = "files";
    private String d = "common";
    private final Account e = aiva.b;
    private String f = "";
    public final alob a = new alob();

    public aiuz(Context context) {
        boolean z;
        if (context != null) {
            z = true;
        } else {
            z = false;
        }
        ahmc.af(z, "Context cannot be null", new Object[0]);
        this.b = context.getPackageName();
    }

    public final Uri a() {
        boolean z;
        boolean z2;
        String str;
        String str2 = this.c;
        String str3 = this.d;
        Account account = aiux.a;
        Account account2 = this.e;
        boolean z3 = true;
        if (account2.type.indexOf(58) == -1) {
            z = true;
        } else {
            z = false;
        }
        ahmc.af(z, "Account type contains ':'.", new Object[0]);
        if (account2.type.indexOf(47) == -1) {
            z2 = true;
        } else {
            z2 = false;
        }
        ahmc.af(z2, "Account type contains '/'.", new Object[0]);
        if (account2.name.indexOf(47) != -1) {
            z3 = false;
        }
        ahmc.af(z3, "Account name contains '/'.", new Object[0]);
        if (aiux.a(account2)) {
            str = "shared";
        } else {
            str = account2.type + ":" + account2.name;
        }
        return new Uri.Builder().scheme("android").authority(this.b).path("/" + str2 + "/" + str3 + "/" + str + "/" + this.f).encodedFragment(aivv.a(this.a.g())).build();
    }

    public final void b() {
        ahmc.af(aiva.d.contains("directboot-files"), "The only supported locations are %s: %s", aiva.d, "directboot-files");
        this.c = "directboot-files";
    }

    public final void c(String str) {
        ahmc.af(aiva.a.matcher(str).matches(), "Module must match [a-z]+(_[a-z]+)*: %s", str);
        ahmc.af(!aiva.c.contains(str), "Module name is reserved and cannot be used: %s", str);
        this.d = str;
    }

    public final void d(String str) {
        if (str.startsWith("/")) {
            str = str.substring(1);
        }
        Pattern pattern = aiva.a;
        this.f = str;
    }
}
