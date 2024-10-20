package defpackage;

import android.util.Pair;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aijg extends aijo {
    public aijg(String str, String str2) {
        super(str, str2);
    }

    public static aijg a(String str) {
        Pair e = e(ahji.o(str, "a="));
        return new aijg((String) e.first, (String) e.second);
    }

    @Override // defpackage.aijm
    public final void b(StringBuilder sb) {
        sb.append("a=");
        g(sb);
    }

    @Override // defpackage.aijo
    public final String c() {
        return this.a;
    }

    @Override // defpackage.aijo
    public final String d() {
        return this.b;
    }
}
