package defpackage;

import com.google.android.gms.common.api.Scope;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class achv {
    public static final abqt a;
    static final abqt b;
    public static final aaoc c;
    public static final abmt d;
    public static final abmt e;

    static {
        abmt abmtVar = new abmt();
        d = abmtVar;
        abmt abmtVar2 = new abmt();
        e = abmtVar2;
        achs achsVar = new achs();
        a = achsVar;
        acht achtVar = new acht();
        b = achtVar;
        new Scope("profile");
        new Scope("email");
        c = new aaoc("SignIn.API", achsVar, abmtVar);
        new aaoc("SignIn.INTERNAL_API", achtVar, abmtVar2);
    }
}
