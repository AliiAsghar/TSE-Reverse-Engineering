package defpackage;

import android.util.Pair;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aije extends aijo {
    public aije(String str, int i) {
        super(str, Integer.toString(i));
    }

    public static aije a(String str) {
        Pair e = e(ahji.o(str, "b="));
        return new aije((String) e.first, ahji.m((String) e.second));
    }

    @Override // defpackage.aijm
    public final void b(StringBuilder sb) {
        sb.append("b=");
        g(sb);
    }
}
