package defpackage;

import java.security.Provider;
import java.security.Security;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aobo {
    public static final aobo a = new aobo(new aobp(1));
    public static final aobo b = new aobo(new aobp(4));
    public static final aobo c = new aobo(new aobp(6));
    public static final aobo d = new aobo(new aobp(5));
    public static final aobo e = new aobo(new aobp(0));
    public static final aobo f = new aobo(new aobp(3));
    public static final aobo g = new aobo(new aobp(2));
    private final aobn h;

    public aobo(aobq aobqVar) {
        if (anqi.a()) {
            this.h = new aobm(aobqVar, 2);
        } else if (aode.q()) {
            this.h = new aobm(aobqVar, 1);
        } else {
            this.h = new aobm(aobqVar, 0);
        }
    }

    public static List b(String... strArr) {
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            Provider provider = Security.getProvider(str);
            if (provider != null) {
                arrayList.add(provider);
            }
        }
        return arrayList;
    }

    public final Object a(String str) {
        return this.h.a(str);
    }
}
