package defpackage;

import android.app.assist.AssistContent;
import android.content.LocusId;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class kju extends arrp implements arqr {
    final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kju(Object obj, int i) {
        super(1);
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v25, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v38, types: [arwe, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v35, types: [ixo, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v36, types: [afcs, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v42, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v43, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v44, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v46, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v3, types: [armf, java.lang.Object] */
    @Override // defpackage.arqr
    public final /* synthetic */ Object a(Object obj) {
        int min;
        boolean z = false;
        int i = 0;
        z = false;
        switch (this.b) {
            case 0:
                cti ctiVar = (cti) obj;
                ctiVar.getClass();
                long g = ctiVar.g() & 4294967295L;
                ((kjr) this.a).f.a(Integer.valueOf((int) g));
                return arnb.a;
            case 1:
                aos aosVar = (aos) obj;
                aosVar.getClass();
                aor.a(aosVar, null, kir.a, 3);
                List list = ((kis) this.a).a;
                aosVar.b(list.size(), null, new kbt(list, 20), new cdj(-632812321, true, new jle(list, 4)));
                return arnb.a;
            case 2:
                aozy aozyVar = (aozy) obj;
                long epochMilli = ((xnv) ((kkg) this.a).b).f().toEpochMilli();
                if (!aozyVar.b.isMutable()) {
                    aozyVar.u();
                }
                kjy kjyVar = (kjy) aozyVar.b;
                kjy kjyVar2 = kjy.a;
                kjyVar.c = epochMilli;
                return arnb.a;
            case 3:
                kjy kjyVar3 = (kjy) obj;
                kjyVar3.getClass();
                if (kjyVar3.c <= 0) {
                    kkg kkgVar = (kkg) this.a;
                    qjh.l(kkgVar.d, null, new kbl(kkgVar, (arpe) null, 12), 3);
                    return false;
                }
                long j = kjyVar3.b;
                long longValue = ((Number) ((kkg) this.a).e.b()).longValue();
                long j2 = kjyVar3.c;
                Object b = ((kkg) this.a).a.b();
                b.getClass();
                long longValue2 = j2 + ((Number) b).longValue();
                long epochMilli2 = ((xnv) ((kkg) this.a).b).f().toEpochMilli();
                if (j < longValue && longValue2 < epochMilli2) {
                    z = true;
                }
                return Boolean.valueOf(z);
            case 4:
                aozy aozyVar2 = (aozy) obj;
                apag apagVar = aozyVar2.b;
                int i2 = ((kjy) apagVar).b + 1;
                if (!apagVar.isMutable()) {
                    aozyVar2.u();
                }
                ((kjy) aozyVar2.b).b = i2;
                long epochMilli3 = ((xnv) ((kkg) this.a).b).f().toEpochMilli();
                if (!aozyVar2.b.isMutable()) {
                    aozyVar2.u();
                }
                ((kjy) aozyVar2.b).c = epochMilli3;
                return arnb.a;
            case 5:
                jfy jfyVar = (jfy) obj;
                jfyVar.getClass();
                qjh.l(jfyVar.d, null, new jec(jfyVar, (AssistContent) this.a, (arpe) null, 5), 3);
                return arnb.a;
            case 6:
                kps kpsVar = (kps) obj;
                kpsVar.getClass();
                ((ajxd) this.a).c(kpsVar.a());
                return arnb.a;
            case 7:
                String str = (String) obj;
                str.getClass();
                ((lex) this.a).b.setLocusContext(new LocusId(str), null);
                return arnb.a;
            case 8:
                kps kpsVar2 = (kps) obj;
                kpsVar2.getClass();
                kpsVar2.c();
                return arnb.a;
            case 9:
                dk dkVar = (dk) obj;
                dkVar.getClass();
                this.a.h(dkVar);
                return arnb.a;
            case 10:
                jha jhaVar = (jha) obj;
                jhaVar.getClass();
                return Boolean.valueOf(aeke.cj(jhaVar, this.a));
            case 11:
                ((jhc) obj).getClass();
                return this.a;
            case 12:
                lgw lgwVar = (lgw) obj;
                lgwVar.getClass();
                if (lgwVar instanceof lgv) {
                    return new aeoi(aerb.cJ, (arqg) new kfq(this.a, lgwVar, 11, null), (arqg) null, (String) null, true, new aeoh(true, false, 10), 28);
                }
                if (lgwVar instanceof lgu) {
                    return new aeoi(aerb.cJ, (arqg) kek.o, (arqg) null, ((lgu) lgwVar).a, false, new aeoh(true, false, 10), 20);
                }
                throw new armm();
            case 13:
                jhc jhcVar = (jhc) obj;
                jhcVar.getClass();
                return jhc.c(jhcVar, (String) this.a, null, null, false, false, 1, 766);
            case 14:
                return ((lhx) this.a.get(((Number) obj).intValue())).a;
            case 15:
                anw anwVar = (anw) obj;
                anwVar.getClass();
                int a = anwVar.a();
                lid lidVar = (lid) this.a;
                alog alogVar = lidVar.a;
                int size = alogVar.size() - 1;
                while (true) {
                    if (i <= size) {
                        min = (i + size) / 2;
                        mkc mkcVar = (mkc) lidVar.a.get(min);
                        if (a > mkcVar.d) {
                            i = min + 1;
                        } else if (a < mkcVar.b) {
                            size = min - 1;
                        }
                    } else {
                        min = Math.min(i, lidVar.a.size() - 1);
                    }
                }
                E e = alogVar.get(min);
                e.getClass();
                return ((mkc) e).a;
            case 16:
                this.a.get(((Number) obj).intValue());
                return null;
            case 17:
                aos aosVar2 = (aos) obj;
                aosVar2.getClass();
                ?? r2 = this.a;
                aosVar2.b(r2.size(), null, new kju(r2, 16), new cdj(-632812321, true, new jle(r2, 7)));
                return arnb.a;
            case 18:
                this.a.get(((Number) obj).intValue());
                return null;
            case 19:
                aos aosVar3 = (aos) obj;
                aosVar3.getClass();
                if (!((lix) this.a).b.isEmpty()) {
                    aor.a(aosVar3, ((lix) this.a).a, lip.a, 2);
                }
                Object obj2 = this.a;
                lgk lgkVar = lgk.k;
                List list2 = ((lix) obj2).b;
                aosVar3.b(list2.size(), new kjs(lgkVar, list2, 5, null), new kju(list2, 18), new cdj(-632812321, true, new jle(list2, 8)));
                return arnb.a;
            default:
                ahlp ahlpVar = (ahlp) obj;
                ahlpVar.getClass();
                Object obj3 = ahlpVar.a;
                aozy aozyVar3 = (aozy) obj3;
                if (!aozyVar3.b.isMutable()) {
                    aozyVar3.u();
                }
                Object obj4 = this.a;
                amwg amwgVar = (amwg) ((amwc) obj3).b;
                amwg amwgVar2 = amwg.a;
                amwgVar.c = obj4;
                amwgVar.b = 1;
                return arnb.a;
        }
    }
}
