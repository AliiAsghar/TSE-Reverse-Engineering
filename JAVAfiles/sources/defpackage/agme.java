package defpackage;

import android.content.ContentValues;
import java.util.List;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class agme extends agml {
    private final agpj a;
    private final int b;

    public agme(String str, int i, agpj agpjVar) {
        super(str);
        int i2;
        this.b = i;
        this.a = agpjVar;
        if (agpjVar instanceof agoz) {
            agoz agozVar = (agoz) agpjVar;
            agpo.b();
            alog P = agozVar.P();
            if (P != null) {
                i2 = P.size();
            } else {
                i2 = 0;
            }
            alog alogVar = agozVar.e.f;
            if (i2 + (alogVar != null ? ((alsx) alogVar).c : 0) != 1) {
                throw new IllegalArgumentException("projection must have exactly one column");
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final boolean h(agpo agpoVar, StringBuilder sb, List list) {
        String str;
        String ae;
        agpj agpjVar = this.a;
        if (agpjVar instanceof agoz) {
            agoz agozVar = (agoz) agpjVar;
            int length = agozVar.N(agpo.b()).length;
            agpo.b();
            alog P = agozVar.P();
            alog alogVar = agozVar.e.f;
            if (length > P.size() + ((alsx) alogVar).c) {
                if (P.size() == 1) {
                    String str2 = (String) P.get(0);
                    str = str2.substring(str2.indexOf(".") + 1);
                } else {
                    agpj agpjVar2 = (agpj) alogVar.get(0);
                    if (agpjVar2 instanceof agly) {
                        str = ((agly) agpjVar2).a;
                    } else {
                        throw new IllegalStateException("subquery with expression must use AsExpression");
                    }
                }
                if (list == null) {
                    ae = this.a.ad(agpoVar);
                } else {
                    ae = this.a.ae(agpoVar, list);
                }
                sb.append(String.format(Locale.US, "(%s %s %s)", f(agpoVar.a()), g(this.b), String.format(Locale.US, "(SELECT %s FROM %s)", str, ae)));
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.agpy
    public final void a(agpo agpoVar, StringBuilder sb, List list) {
        if (this.a == null) {
            sb.append(String.format(Locale.US, "(%s %s)", f(agpoVar.a()), g(this.b)));
        } else {
            if (h(agpoVar, sb, list)) {
                return;
            }
            sb.append(String.format(Locale.US, "(%s %s %s)", f(agpoVar.a()), g(this.b), this.a.ae(agpoVar, list)));
        }
    }

    @Override // defpackage.agpy
    public final void b(agpo agpoVar, StringBuilder sb) {
        if (this.a == null) {
            sb.append(String.format(Locale.US, "(%s %s)", f(agpoVar.a()), g(this.b)));
        } else {
            if (h(agpoVar, sb, null)) {
                return;
            }
            sb.append(String.format(Locale.US, "(%s %s %s)", f(agpoVar.a()), g(this.b), this.a.ad(agpoVar)));
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.agpy
    public final boolean c(String str, ContentValues contentValues) {
        agpj agpjVar = this.a;
        if (agpjVar instanceof agoz) {
            agoz agozVar = (agoz) agpjVar;
            if (this.b - 1 != 2) {
                return false;
            }
            return aglo.u().k(str, contentValues, agozVar);
        }
        return false;
    }

    @Override // defpackage.agml, defpackage.agpy
    public final void e(adwp adwpVar) {
        super.e(adwpVar);
        this.a.af(adwpVar);
    }
}
