package defpackage;

import java.util.List;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class agph extends agml {
    private final String a;
    private final String b;

    public agph(String str, String str2, String str3) {
        super(str);
        this.a = str2;
        this.b = str3;
    }

    @Override // defpackage.agpy
    public final void a(agpo agpoVar, StringBuilder sb, List list) {
        sb.append(String.format(Locale.US, "%s >= ? AND %s <= ?", f(agpoVar.a()), f(agpoVar.a())));
        list.add(this.a);
        list.add(this.b);
    }

    @Override // defpackage.agpy
    public final void b(agpo agpoVar, StringBuilder sb) {
        agox a = agpoVar.a();
        sb.append(String.format(Locale.US, "%s >= %s AND %s <= %s", f(a), this.a, f(a), this.b));
    }
}
