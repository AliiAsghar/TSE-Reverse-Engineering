package defpackage;

import java.util.regex.Pattern;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class asnw extends asmp {
    private final String a;
    private final long b;
    private final asqw c;

    public asnw(String str, long j, asqw asqwVar) {
        this.a = str;
        this.b = j;
        this.c = asqwVar;
    }

    @Override // defpackage.asmp
    public final long a() {
        return this.b;
    }

    @Override // defpackage.asmp
    public final aslz b() {
        String str = this.a;
        if (str == null) {
            return null;
        }
        Pattern pattern = aslz.a;
        try {
            return aotl.an(str);
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }

    @Override // defpackage.asmp
    public final asqw c() {
        return this.c;
    }
}
