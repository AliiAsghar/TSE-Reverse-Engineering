package defpackage;

import android.R;
import android.content.ContentProviderClient;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.os.CancellationSignal;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jpb extends arrp implements arqr {
    final /* synthetic */ Object a;
    final /* synthetic */ Object b;
    final /* synthetic */ Object c;
    final /* synthetic */ Object d;
    final /* synthetic */ Object e;
    private final /* synthetic */ int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jpb(ahiy ahiyVar, Uri uri, String[] strArr, Bundle bundle, arqr arqrVar, int i) {
        super(1);
        this.f = i;
        this.b = ahiyVar;
        this.c = uri;
        this.a = strArr;
        this.d = bundle;
        this.e = arqrVar;
    }

    /* JADX WARN: Type inference failed for: r0v54, types: [java.lang.Object, arqr] */
    /* JADX WARN: Type inference failed for: r13v18, types: [arwe, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v3, types: [java.lang.Object, arqg] */
    /* JADX WARN: Type inference failed for: r1v13, types: [byn, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v16, types: [dqv, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v18, types: [byn, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v9, types: [bxm, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v0, types: [java.lang.Object, arqg] */
    /* JADX WARN: Type inference failed for: r9v1, types: [aewn, java.lang.Object] */
    @Override // defpackage.arqr
    public final /* synthetic */ Object a(Object obj) {
        jhc jhcVar;
        jpa jpaVar;
        jpa jpaVar2;
        int i = this.f;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        final CancellationSignal cancellationSignal = (CancellationSignal) obj;
                        cancellationSignal.getClass();
                        Object obj2 = this.d;
                        Object obj3 = this.a;
                        final Uri uri = (Uri) this.c;
                        final String[] strArr = (String[]) obj3;
                        final Bundle bundle = (Bundle) obj2;
                        Cursor n = ((ansy) ((ahiy) this.b).a).n(uri, strArr, new akcf() { // from class: akcb
                            @Override // defpackage.akcf
                            public final Cursor a(ContentProviderClient contentProviderClient) {
                                Cursor query;
                                query = contentProviderClient.query(uri, strArr, bundle, cancellationSignal);
                                return query;
                            }
                        }, new ahvu(strArr, uri, bundle, 2));
                        try {
                            alog d = akec.d(n, this.e);
                            armd.i(n, null);
                            return d;
                        } finally {
                        }
                    } else {
                        float floatValue = ((Number) obj).floatValue();
                        int d2 = ((aov) this.c).d().d();
                        arrn.J(this.a, null, null, new uxn((aov) this.c, Math.min(Math.max((int) ((floatValue * d2) / ((Float.intBitsToFloat((int) (((cjt) this.b.a()).a & 4294967295L)) - this.e.em(2.0f)) - ((Number) this.d.a()).floatValue())), 0), d2 - 1), (arpe) null, 8), 3);
                        return arnb.a;
                    }
                } else {
                    cnt cntVar = (cnt) obj;
                    cntVar.getClass();
                    cntVar.p();
                    Object obj4 = this.b;
                    ((czj) this.b).a = adcx.aR(cntVar, clw.a, cku.g, this.a, this.c.b(), (cln) ((czj) obj4).a, (drk) ((czj) this.d).a, (cjt) ((czj) this.e).a);
                    ((czj) this.e).a = new cjt(cntVar.o());
                    ((czj) this.d).a = cntVar.r();
                    return arnb.a;
                }
            } else {
                ((lrc) obj).getClass();
                this.a.a();
                return new aepx((String) this.d, null, null, (String) this.b, false, false, new aewr(jat.l((jat) this.c, R.string.ok), jlc.g), null, this.e, 182);
            }
        } else {
            jhc jhcVar2 = (jhc) obj;
            jhcVar2.getClass();
            if (true != jhcVar2.a()) {
                jhcVar = null;
            } else {
                jhcVar = jhcVar2;
            }
            ((arsb) this.a).a = jhcVar;
            jhc jhcVar3 = (jhc) ((arsb) this.a).a;
            Object obj5 = this.c;
            if (obj5 != null) {
                jpaVar = new jpa((jhc) obj5, true);
            } else {
                if (jhcVar3 != null) {
                    jpaVar2 = new jpa(jhcVar3, false);
                } else {
                    Object obj6 = this.d;
                    if (obj6 != null) {
                        jpaVar2 = new jpa((jhc) obj6, false);
                    } else {
                        jpaVar = new jpa(null, false);
                    }
                }
                jpaVar = jpaVar2;
            }
            ((arrx) this.e).a = jpaVar.b;
            jhc jhcVar4 = jpaVar.a;
            if (jhcVar4 == null) {
                return jhcVar2;
            }
            return jhcVar4;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jpb(aov aovVar, byn bynVar, dqv dqvVar, byn bynVar2, arwe arweVar, int i) {
        super(1);
        this.f = i;
        this.c = aovVar;
        this.b = bynVar;
        this.e = dqvVar;
        this.d = bynVar2;
        this.a = arweVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jpb(arqg arqgVar, String str, String str2, jat jatVar, arqg arqgVar2, int i) {
        super(1);
        this.f = i;
        this.a = arqgVar;
        this.d = str;
        this.b = str2;
        this.c = jatVar;
        this.e = arqgVar2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jpb(arsb arsbVar, jpd jpdVar, jhc jhcVar, jhc jhcVar2, arrx arrxVar, int i) {
        super(1);
        this.f = i;
        this.a = arsbVar;
        this.b = jpdVar;
        this.c = jhcVar;
        this.d = jhcVar2;
        this.e = arrxVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jpb(czj czjVar, aewn aewnVar, czj czjVar2, czj czjVar3, byj byjVar, int i) {
        super(1);
        this.f = i;
        this.b = czjVar;
        this.a = aewnVar;
        this.d = czjVar2;
        this.e = czjVar3;
        this.c = byjVar;
    }
}
