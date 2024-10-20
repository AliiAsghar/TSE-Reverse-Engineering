package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import com.google.android.gms.appdatasearch.QuerySpecification;
import com.google.android.gms.search.queries.QueryCall$Request;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class mkg implements mkd {
    public static final /* synthetic */ int g = 0;
    private static final alwo h = alwo.o("BugleContacts");
    public final anen a;
    public final anen b;
    public final anen c;
    public final armf d;
    public final armf e;
    public final armf f;
    private final Resources i;
    private final armf j;
    private final armf k;
    private final armf l;

    public mkg(Context context, anen anenVar, anen anenVar2, anen anenVar3, armf armfVar, armf armfVar2, armf armfVar3, armf armfVar4, armf armfVar5, armf armfVar6) {
        this.i = context.getResources();
        this.a = anenVar;
        this.b = anenVar2;
        this.c = anenVar3;
        this.j = armfVar;
        this.d = armfVar2;
        this.e = armfVar3;
        this.k = armfVar4;
        this.f = armfVar5;
        this.l = armfVar6;
    }

    @Override // defpackage.mkd
    public final akul a(String str) {
        if (!((Boolean) ycj.a.e()).booleanValue()) {
            int i = alog.d;
            return aktp.ag(alsx.a);
        }
        return aktp.aj(new imi(this, str, 3), this.b).h(new ijq(this, ((ahqr) this.f.b()).d(), 20), this.a);
    }

    @Override // defpackage.mkd
    public final akul b(String str) {
        akul c;
        if (((Boolean) yyv.g.e()).booleanValue()) {
            mkn mknVar = (mkn) this.k.b();
            str.getClass();
            if (str.length() == 0) {
                int i = alog.d;
                akul ag = aktp.ag(alsx.a);
                ag.getClass();
                return ag;
            }
            ahqq d = ((ahqr) mknVar.d.b()).d();
            Object obj = mknVar.f;
            QuerySpecification querySpecification = mkn.b;
            QueryCall$Request queryCall$Request = new QueryCall$Request();
            queryCall$Request.g = new Bundle();
            queryCall$Request.g.putLong("request_timestamp_ms", System.currentTimeMillis());
            queryCall$Request.a = str;
            queryCall$Request.b = "com.google.android.gms";
            queryCall$Request.c = new String[]{"internal.3p:Person"};
            queryCall$Request.d = 0;
            queryCall$Request.e = 20;
            queryCall$Request.f = querySpecification;
            ajxp ajxpVar = new ajxp(null);
            ajxpVar.c = new abot(queryCall$Request, 13);
            ajxpVar.b = 8117;
            c = qjh.c(mknVar.c, arpj.a, arwf.a, new mkm(((abrc) obj).g(ajxpVar.b()), mknVar, d, null));
            return c;
        }
        int i2 = 1;
        return akuk.b(new mke(this, str, i2), this.c).d(new mkf(this, ((ahqr) this.f.b()).d(), i2), this.c).f();
    }

    @Override // defpackage.mkd
    public final akul c(String str) {
        int i = 0;
        return akuk.b(new mke(this, str, i), this.c).d(new mkf(this, ((ahqr) this.f.b()).d(), i), this.a).f();
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00e8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final defpackage.alog d(android.database.Cursor r18) {
        /*
            Method dump skipped, instructions count: 302
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mkg.d(android.database.Cursor):alog");
    }
}
