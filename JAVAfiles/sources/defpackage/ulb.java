package defpackage;

import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ulb {
    public final int a;
    public final boolean b;
    public final int c;

    public ulb(int i, int i2, boolean z) {
        this.a = i;
        this.c = i2;
        this.b = z;
    }

    public final rzy a(int i, String str) {
        return b(i, str, xxw.a());
    }

    public final rzy b(int i, String str, Integer[] numArr) {
        String str2;
        rzy rzyVar = new rzy();
        rzyVar.i = this.c;
        rzyVar.d = 32;
        rzyVar.b = this.a;
        rzyVar.h = str;
        rzyVar.c();
        rzyVar.g = this.b;
        Locale locale = Locale.US;
        String d = rzx.d(i);
        if (this.c != 3) {
            str2 = "NEW.";
        } else {
            str2 = "OLD.";
        }
        rzyVar.b(String.format(Locale.US, "%s NOT IN (%s)", String.format(locale, "(SELECT cms_life_cycle FROM %s as parent WHERE %s = parent.%s)", d, str2.concat(str), "_id"), algs.c(',').e(numArr)));
        return rzyVar;
    }

    public ulb(int i, boolean z, int i2) {
        this.c = i;
        this.b = z;
        this.a = i2;
    }
}
