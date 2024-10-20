package defpackage;

import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class yjs {
    private static final alib b;
    public final yju a;

    static {
        alig aligVar = new alig();
        aligVar.e(((Integer) aczf.o().a.aq.a()).intValue());
        aligVar.d(((Integer) aczf.o().a.ar.a()).intValue(), TimeUnit.SECONDS);
        b = aligVar.a();
    }

    public yjs(yju yjuVar) {
        this.a = yjuVar;
    }

    private static String c(String str, alhr alhrVar) {
        alib alibVar = b;
        String str2 = (String) alibVar.l(str);
        if (str2 == null) {
            String str3 = (String) alhrVar.get();
            alibVar.n(str, str3);
            return str3;
        }
        return str2;
    }

    public final String a() {
        yju yjuVar = this.a;
        yjuVar.getClass();
        return c("main", new yim(yjuVar, 2));
    }

    public final String b(int i) {
        return c(String.valueOf(i), new mso(this, i, 8));
    }
}
