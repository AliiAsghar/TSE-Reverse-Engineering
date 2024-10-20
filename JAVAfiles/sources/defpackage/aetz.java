package defpackage;

import android.app.Activity;
import android.app.admin.DevicePolicyManager;
import android.webkit.WebView;
import j$.util.Optional;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aetz extends arrp implements arqg {
    final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aetz(Object obj, int i) {
        super(0);
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [byn, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, arqr] */
    /* JADX WARN: Type inference failed for: r0v20, types: [byn, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v22, types: [byn, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v24, types: [byn, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v26, types: [byn, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v37, types: [byn, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v40, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v47, types: [java.lang.Object, java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r0v50, types: [java.lang.Object, java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r0v53, types: [armf, java.lang.Object] */
    @Override // defpackage.arqg
    public final /* synthetic */ Object a() {
        Object afdmVar;
        Object afdmVar2;
        byte[] bArr = null;
        switch (this.b) {
            case 0:
                adcx.cm(this.a, null);
                return arnb.a;
            case 1:
                ((aetu) this.a).a();
                return arnb.a;
            case 2:
                arqr arqrVar = ((aeun) this.a).c;
                if (arqrVar != null) {
                    arqrVar.a(null);
                }
                return arnb.a;
            case 3:
                this.a.a(aeuj.b);
                return true;
            case 4:
                arqg arqgVar = ((aeuy) this.a).b;
                if (arqgVar != null) {
                    arqgVar.a();
                }
                return arnb.a;
            case 5:
                arqg arqgVar2 = ((aeuy) this.a).b;
                if (arqgVar2 != null) {
                    arqgVar2.a();
                }
                return arnb.a;
            case 6:
                this.a.h(Boolean.valueOf(false));
                return arnb.a;
            case 7:
                this.a.h(Boolean.valueOf(false));
                return arnb.a;
            case 8:
                this.a.h(Boolean.valueOf(true));
                return arnb.a;
            case 9:
                this.a.h(Boolean.valueOf(false));
                return arnb.a;
            case 10:
                qdq qdqVar = (qdq) this.a;
                Optional optional = (Optional) ((apxx) ((kbc) qdqVar.a).b).a;
                if (optional.isPresent()) {
                    ((ibz) optional.get()).a();
                    ((mbl) ((kbc) qdqVar.a).c.b()).c("Bugle.Vmt.ManualTriggerTranscribe.Click.Count");
                    return arnb.a;
                }
                throw new IllegalStateException("ManualTranscriptionController not provided.");
            case 11:
                WebView bc = adom.bc(this.a);
                if (bc != null) {
                    bc.goBack();
                }
                return arnb.a;
            case 12:
                Object b = this.a.b();
                b.getClass();
                Optional optional2 = (Optional) b;
                if (optional2.isPresent()) {
                    afdmVar = optional2.get();
                } else {
                    afdmVar = new afdm(bArr);
                }
                return (afdm) afdmVar;
            case 13:
                ?? r0 = this.a;
                Set set = arnx.a;
                Iterator it = r0.iterator();
                while (it.hasNext()) {
                    set = aqjn.h(set, ((afdw) it.next()).i);
                }
                return new afdx(afeb.b(set));
            case 14:
                ?? r02 = this.a;
                Set set2 = arnx.a;
                Iterator it2 = r02.iterator();
                while (it2.hasNext()) {
                    set2 = aqjn.h(set2, ((afdw) it2.next()).h);
                }
                return new afdx(afeb.b(set2));
            case 15:
                Object b2 = this.a.b();
                b2.getClass();
                Optional optional3 = (Optional) b2;
                if (optional3.isPresent()) {
                    afdmVar2 = optional3.get();
                } else {
                    afdmVar2 = new afdm(bArr);
                }
                return (afdm) afdmVar2;
            case 16:
                Iterable iterable = (Iterable) ((affy) this.a).f.e.a();
                ArrayList arrayList = new ArrayList(aqjn.J(iterable, 10));
                Iterator it3 = iterable.iterator();
                while (it3.hasNext()) {
                    arrayList.add(((afru) it3.next()).c().a());
                }
                List B = aqjn.B(1, 3);
                return arsd.s("mime_type IN ('" + aqjn.aK(arrayList, "','", null, null, null, 62) + "') \n    AND media_type IN (" + aqjn.aK(B, ",", null, null, null, 62) + ")");
            case 17:
                Object systemService = ((Activity) this.a).getSystemService("device_policy");
                systemService.getClass();
                return (DevicePolicyManager) systemService;
            case 18:
                afru afruVar = (afru) afgv.a.get(this.a);
                if (afruVar == null) {
                    return null;
                }
                return afruVar.c();
            case 19:
                return ((afhd) this.a).d;
            default:
                ((afhd) this.a).g.G();
                return arnb.a;
        }
    }
}
