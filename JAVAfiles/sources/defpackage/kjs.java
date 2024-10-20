package defpackage;

import android.content.Context;
import com.google.android.apps.messaging.R;
import j$.util.DesugarCollections;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class kjs extends arrp implements arqr {
    final /* synthetic */ Object a;
    final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kjs(Object obj, Object obj2, int i) {
        super(1);
        this.c = i;
        this.a = obj;
        this.b = obj2;
    }

    /* JADX WARN: Type inference failed for: r0v20, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v26, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v27, types: [java.lang.Object, arqr] */
    /* JADX WARN: Type inference failed for: r0v47, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v67, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v78, types: [java.lang.Object, adiv] */
    /* JADX WARN: Type inference failed for: r0v81, types: [java.lang.Object, adiv] */
    /* JADX WARN: Type inference failed for: r0v85, types: [java.lang.Object, adiv] */
    /* JADX WARN: Type inference failed for: r0v88, types: [java.lang.Object, adiv] */
    /* JADX WARN: Type inference failed for: r10v3, types: [enm, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v30, types: [enm, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v48, types: [java.lang.Object, arxm] */
    /* JADX WARN: Type inference failed for: r1v11, types: [java.lang.Object, arqr] */
    /* JADX WARN: Type inference failed for: r1v29, types: [java.lang.Object, nfw] */
    /* JADX WARN: Type inference failed for: r1v50, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v59, types: [java.lang.Object, adiv] */
    /* JADX WARN: Type inference failed for: r1v8, types: [ixo, java.lang.Object] */
    @Override // defpackage.arqr
    public final /* synthetic */ Object a(Object obj) {
        Integer valueOf;
        int i = 10;
        Object obj2 = null;
        switch (this.c) {
            case 0:
                ((bxi) obj).getClass();
                rb rbVar = new rb(this.b, 4);
                this.a.N().c(rbVar);
                return new ljs(this.a, rbVar, 1);
            case 1:
                aos aosVar = (aos) obj;
                aosVar.getClass();
                String str = ((kin) this.b).c;
                if (str != null) {
                    aor.a(aosVar, null, new cdj(2006866291, true, new jjs(str, 12)), 3);
                }
                String str2 = ((kin) this.b).d;
                if (str2 != null) {
                    aor.a(aosVar, null, new cdj(1968775452, true, new jjs(str2, 13)), 3);
                }
                Object obj3 = this.b;
                Object obj4 = this.a;
                List list = ((kin) obj3).a;
                aosVar.b(list.size(), null, new kbt(list, 19), new cdj(-1091073711, true, new kii(list, obj4, 2)));
                return arnb.a;
            case 2:
                dk dkVar = (dk) obj;
                dkVar.getClass();
                lex lexVar = (lex) this.b;
                this.a.i(dkVar, lexVar.d().f(lexVar.O));
                return arnb.a;
            case 3:
                jhc jhcVar = (jhc) obj;
                jhcVar.getClass();
                Iterator it = jhcVar.b.iterator();
                while (true) {
                    if (it.hasNext()) {
                        ?? r1 = this.a;
                        Object next = it.next();
                        if (((Boolean) r1.a(next)).booleanValue()) {
                            obj2 = next;
                        }
                    }
                }
                jha jhaVar = (jha) obj2;
                ((arsb) this.b).a = jhaVar;
                if (jhaVar == null) {
                    return jhcVar;
                }
                return jhc.c(jhcVar, null, aqjn.ap(jhcVar.b, jhaVar), null, false, false, 0, 1021);
            case 4:
                jha jhaVar2 = (jha) this.b.get(((Number) obj).intValue());
                ((alvg) lgo.a.f().h("com/google/android/apps/messaging/multishare/editmessage/bottomcontent/composerow/attachments/DraftAttachmentUiAdapterImpl", "onRemove", 93, "DraftAttachmentUiAdapterImpl.kt")).t("Attachments onRemove %s", jhaVar2);
                kju kjuVar = new kju(jhaVar2, 10);
                lgo lgoVar = (lgo) this.a;
                qjh.l(lgoVar.c, null, new kca(lgoVar, kjuVar, (arpe) null, 12), 3);
                return arnb.a;
            case 5:
                return this.b.a(this.a.get(((Number) obj).intValue()));
            case 6:
                ((bxi) obj).getClass();
                rb rbVar2 = new rb(this.a, 5);
                this.b.N().c(rbVar2);
                return new ljs(this.b, rbVar2, 0);
            case 7:
                alog alogVar = (alog) obj;
                alogVar.getClass();
                ((StringBuilder) this.b).append('\n');
                ((StringBuilder) this.b).append(((Context) ((lhm) this.a).k).getString(R.string.group_canonical_address));
                StringBuilder sb = new StringBuilder("[");
                alur it2 = alogVar.iterator();
                it2.getClass();
                while (it2.hasNext()) {
                    msh mshVar = (msh) it2.next();
                    sb.append(" ");
                    sb.append(mshVar.m());
                }
                Object obj5 = this.b;
                sb.append(" ]");
                ((StringBuilder) obj5).append(sb.toString());
                return arnb.a;
            case 8:
                ((StringBuilder) this.b).append(((Context) ((lhm) this.a).k).getString(R.string.from_label));
                String m = ((msh) obj).m();
                StringBuilder sb2 = (StringBuilder) this.b;
                sb2.append(m);
                sb2.append('\n');
                return arnb.a;
            case 9:
                return ((msk) ((kjp) this.a).a.b()).t(albo.ag((String) obj), this.b.b());
            case 10:
                ((akuk) this.a).a.m();
                this.b.v(null);
                return arnb.a;
            case 11:
                return ((msk) ((rcr) this.a).j.b()).g((msh) obj, new qwq(this.b, i));
            case 12:
                return ((msk) ((rcr) this.a).j.b()).g((msh) obj, new qwq(this.b, 11));
            case 13:
                uqa uqaVar = (uqa) obj;
                uqaVar.getClass();
                uqaVar.g((String) this.a);
                valueOf = Integer.valueOf(a.bp().c());
                int intValue = valueOf.intValue();
                if (intValue < 48020) {
                    agnc.t("cancellation_tag", intValue);
                }
                uqaVar.U(new agmd("work_queue.cancellation_tag", 1, this.b));
                return arnb.a;
            case 14:
                adiv adivVar = (adiv) obj;
                adivVar.getClass();
                amwt b = ((vru) ((wyp) this.a).e.b()).b(adom.n(adivVar).a);
                b.getClass();
                aozy aozyVar = (aozy) ((ahmn) this.b).a;
                if (!aozyVar.b.isMutable()) {
                    aozyVar.u();
                }
                amxh amxhVar = (amxh) aozyVar.b;
                amxh amxhVar2 = amxh.a;
                amxhVar.c = b.E;
                amxhVar.b |= 1;
                return arnb.a;
            case 15:
                wxb wxbVar = (wxb) obj;
                aozy createBuilder = wie.a.createBuilder();
                createBuilder.getClass();
                DesugarCollections.unmodifiableMap(DesugarCollections.unmodifiableMap(((wie) createBuilder.b).b)).getClass();
                String str3 = wxbVar.c;
                str3.getClass();
                createBuilder.ad(str3, (acun) this.a);
                DesugarCollections.unmodifiableMap(DesugarCollections.unmodifiableMap(((wie) createBuilder.b).c)).getClass();
                String str4 = wxbVar.c;
                str4.getClass();
                createBuilder.ae(str4, ((vqu) this.b.b()).L());
                apag s = createBuilder.s();
                s.getClass();
                return (wie) s;
            case 16:
                wie wieVar = (wie) obj;
                wieVar.getClass();
                aozy builder = wieVar.toBuilder();
                String str5 = adom.n(this.b).a;
                if (!builder.b.isMutable()) {
                    builder.u();
                }
                ((wie) builder.b).a().put(str5, this.a);
                apag s2 = builder.s();
                s2.getClass();
                return (wie) s2;
            case 17:
                aozy builder2 = ((wie) obj).toBuilder();
                builder2.ad(adom.n(this.b).a, (acun) this.a);
                return (wie) builder2.s();
            case 18:
                wjc wjcVar = (wjc) obj;
                wjcVar.getClass();
                aozy builder3 = wjcVar.toBuilder();
                wiy wiyVar = wjcVar.d;
                if (wiyVar == null) {
                    wiyVar = wiy.a;
                }
                ?? r12 = this.a;
                aozy builder4 = wiyVar.toBuilder();
                String str6 = adom.n(r12).a;
                Object obj6 = this.b;
                if (!builder4.b.isMutable()) {
                    builder4.u();
                }
                wiy wiyVar2 = (wiy) builder4.b;
                apbo apboVar = wiyVar2.b;
                if (!apboVar.b) {
                    wiyVar2.b = apboVar.a();
                }
                wiyVar2.b.put(str6, obj6);
                if (!builder3.b.isMutable()) {
                    builder3.u();
                }
                wjc wjcVar2 = (wjc) builder3.b;
                wiy wiyVar3 = (wiy) builder4.s();
                wiyVar3.getClass();
                wjcVar2.d = wiyVar3;
                wjcVar2.b |= 1;
                apag s3 = builder3.s();
                s3.getClass();
                return (wjc) s3;
            case 19:
                wjc wjcVar3 = (wjc) obj;
                wjcVar3.getClass();
                aozy builder5 = wjcVar3.toBuilder();
                builder5.af(adom.n(this.b).a, (wja) this.a);
                apag s4 = builder5.s();
                s4.getClass();
                return (wjc) s4;
            default:
                aozy builder6 = ((wjc) obj).toBuilder();
                builder6.af(adom.n(this.b).a, (wja) this.a);
                return (wjc) builder6.s();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kjs(Object obj, Object obj2, int i, byte[] bArr) {
        super(1);
        this.c = i;
        this.b = obj;
        this.a = obj2;
    }
}
