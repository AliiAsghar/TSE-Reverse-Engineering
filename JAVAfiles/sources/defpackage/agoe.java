package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.provider.ContactsContract;
import j$.util.Objects;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class agoe {
    public final int a;
    public final Object b;
    public final Object c;
    public final Object d;
    public final Object e;

    public agoe(fms fmsVar, efu efuVar, byte[] bArr, akip[] akipVarArr, int i) {
        this.c = fmsVar;
        this.b = efuVar;
        this.e = bArr;
        this.d = akipVarArr;
        this.a = i;
    }

    /* JADX WARN: Type inference failed for: r2v8, types: [java.util.List, java.lang.Object] */
    public final int a() {
        agnw d = agnc.d((String) this.e);
        StringBuilder sb = new StringBuilder();
        sb.append("INSERT ");
        sb.append(albo.ag(agnc.g(this.a)));
        sb.append(" INTO ");
        sb.append((String) this.d);
        sb.append(" (");
        ?? r2 = this.b;
        int i = ((alsx) r2).c;
        boolean z = false;
        for (int i2 = 0; i2 < i; i2++) {
            sb.append(agnc.l((String) r2.get(i2)));
            sb.append(",");
        }
        sb.setLength(sb.length() - 1);
        sb.append(") ");
        agoz agozVar = (agoz) this.c;
        sb.append(agozVar.z(new agpo(agozVar.n, agozVar.e, true, null), true, null));
        String sb2 = sb.toString();
        aoij C = aglo.C(d, (String) this.d, new agod(this));
        akrh e = aktp.e("Insert#insert update");
        try {
            int c = d.c(d.j().compileStatement(sb2), new agni((String) this.d, "-insert"));
            e.close();
            if (c > 0) {
                z = true;
            }
            C.a(z);
            return c;
        } catch (Throwable th) {
            try {
                e.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final String b() {
        Object obj;
        if (this.a == 0 && (obj = this.d) != null && !d.am((String) obj)) {
            return (String) this.d;
        }
        return ((Resources) this.c).getString(ContactsContract.CommonDataKinds.Phone.getTypeLabelResource(this.a));
    }

    public final boolean c(int i) {
        if (((fbg[]) this.e)[i] != null) {
            return true;
        }
        return false;
    }

    public final boolean d(agoe agoeVar, int i) {
        if (agoeVar == null || !Objects.equals(((fbg[]) this.e)[i], ((fbg[]) agoeVar.e)[i]) || !Objects.equals(((fje[]) this.d)[i], ((fje[]) agoeVar.d)[i])) {
            return false;
        }
        return true;
    }

    public agoe(String str, String str2, alog alogVar, agoz agozVar, int i) {
        this.d = str;
        this.e = str2;
        this.b = alogVar;
        this.c = agozVar;
        this.a = i;
    }

    public agoe(Context context, msk mskVar, int i, String str) {
        this.c = context.getResources();
        this.a = i;
        this.d = null;
        msh n = mskVar.n(str);
        this.b = n;
        this.e = n.F().toString();
    }

    public agoe(fbg[] fbgVarArr, fje[] fjeVarArr, esg esgVar, Object obj) {
        int length = fbgVarArr.length;
        d.s(length == fjeVarArr.length);
        this.e = fbgVarArr;
        this.d = (fje[]) fjeVarArr.clone();
        this.b = esgVar;
        this.c = obj;
        this.a = length;
    }

    public agoe(Context context, msk mskVar, int i, String str, String str2, String str3) {
        this.c = context.getResources();
        this.a = i;
        this.d = str;
        this.b = mskVar.n(str2);
        this.e = str3;
    }
}
