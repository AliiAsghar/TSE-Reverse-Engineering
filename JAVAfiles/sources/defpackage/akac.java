package defpackage;

import java.io.File;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class akac {
    public static final aknr a = new aknr(1, 2);
    public final ajwt b;
    public final anen c;
    public final aohs d;

    public akac(aohs aohsVar, ajwt ajwtVar, anen anenVar) {
        boolean z;
        this.d = aohsVar;
        this.b = ajwtVar;
        this.c = anenVar;
        if (ajwtVar.a != -1) {
            z = true;
        } else {
            z = false;
        }
        albo.U(z, "Account Id is invalid");
    }

    public static String a(ajwt ajwtVar) {
        return "accounts" + File.separator + ajwtVar.a;
    }

    public final agxw b(aknr aknrVar, String str) {
        return new agxw(new asqe(aknrVar, this.d, a(this.b) + File.separator + str));
    }
}
