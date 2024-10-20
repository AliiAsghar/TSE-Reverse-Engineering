package defpackage;

import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class nar implements mzy {
    public final Object a;
    private final /* synthetic */ int b;
    private final Object c;

    public nar(nat natVar, int i) {
        this.b = i;
        natVar.getClass();
        this.c = natVar;
        this.a = aqil.r(new myq[]{myq.TABLE_HEAD, myq.TABLE_BODY, myq.TABLE_ROW, myq.TABLE_CELL});
    }

    @Override // defpackage.mzy
    public final sxy a(sxy sxyVar) {
        if (this.b != 0) {
            stj a = stl.a();
            a.w("LoadMessageAnnotationExtension#extendQuery");
            a.c(new mva(7));
            a.e(new mva(8));
            sti b = a.b();
            Object obj = stl.e.f;
            sxp sxpVar = MessagesTable.c.a;
            stk stkVar = new stk();
            stkVar.b();
            sxyVar.D(b.q((agmh) obj, sxpVar, new agpw(stkVar)).a());
            return sxyVar;
        }
        ssp c = sss.c();
        c.w("PreviewMessageStateExtension#extendQuery");
        c.d(new nas(1));
        sxyVar.D(agoh.b(c.b(), sss.d.b, MessagesTable.c.a).a());
        return sxyVar;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [mzm, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v2, types: [mzm, java.lang.Object] */
    @Override // defpackage.mzy
    public final mzm c() {
        if (this.b != 0) {
            return this.c;
        }
        return this.c;
    }

    /* JADX WARN: Type inference failed for: r3v3, types: [java.util.Set, java.lang.Object] */
    @Override // defpackage.mzy
    public final void e(mzw mzwVar, MessagesTable.BindData bindData, ifs ifsVar, alor alorVar) {
        ndk ndkVar = null;
        if (this.b != 0) {
            bindData.getClass();
            ifsVar.getClass();
            alorVar.getClass();
            String[] strArr = stl.a;
            stc[] stcVarArr = (stc[]) bindData.au("messages_annotations", new stc[0]);
            alob alobVar = new alob();
            stcVarArr.getClass();
            int i = 1;
            for (stc stcVar : stcVarArr) {
                if (stcVar.h() == 1) {
                    i = 2;
                }
                aqby m = stcVar.m();
                if (m != null) {
                    qdq qdqVar = new qdq(m, null);
                    if (this.a.contains(qdqVar.e())) {
                        Object e = ((utz) yig.Y.get()).e();
                        e.getClass();
                        if (((Boolean) e).booleanValue()) {
                            alobVar.h(qdqVar);
                        }
                    } else {
                        alobVar.h(qdqVar);
                    }
                }
            }
            mzwVar.f = i;
            mzwVar.b(alobVar.g());
            return;
        }
        bindData.getClass();
        ifsVar.getClass();
        alorVar.getClass();
        String[] strArr2 = sss.a;
        ssi[] ssiVarArr = (ssi[]) bindData.au("link_preview", new ssi[0]);
        ssiVarArr.getClass();
        ssi ssiVar = (ssi) aqil.m(ssiVarArr);
        if (ssiVar != null) {
            ndkVar = new ndk(ssiVar, this, (byte[]) null);
        }
        mzwVar.g = ndkVar;
    }

    public nar(nat natVar, xnv xnvVar, int i) {
        this.b = i;
        natVar.getClass();
        xnvVar.getClass();
        this.c = natVar;
        this.a = xnvVar;
    }

    @Override // defpackage.mzy
    public final void b() {
    }

    @Override // defpackage.mzy
    public final /* synthetic */ void d() {
    }
}
