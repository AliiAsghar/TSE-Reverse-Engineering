package defpackage;

import android.content.res.ColorStateList;
import android.support.v7.widget.RecyclerView;
import com.google.android.apps.messaging.R;
import com.google.android.material.button.MaterialButton;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aezb extends arrp implements arqr {
    final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aezb(Object obj, int i) {
        super(1);
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r0v15, types: [java.lang.Object, java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r0v65, types: [java.lang.Object, arqr] */
    /* JADX WARN: Type inference failed for: r13v16, types: [byn, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v69, types: [com.google.common.util.concurrent.ListenableFuture, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v0, types: [arwe, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v0, types: [afgq, java.lang.Object] */
    @Override // defpackage.arqr
    public final /* synthetic */ Object a(Object obj) {
        aozy builder;
        boolean z = true;
        RecyclerView recyclerView = null;
        Object obj2 = null;
        switch (this.b) {
            case 0:
                dho dhoVar = (dho) obj;
                dhoVar.getClass();
                Object obj3 = this.a;
                if (obj3 != null) {
                    dhl.f(dhoVar, (String) obj3);
                }
                return arnb.a;
            case 1:
                dho dhoVar2 = (dho) obj;
                dhoVar2.getClass();
                Object obj4 = this.a;
                if (obj4 != null) {
                    dhl.f(dhoVar2, (String) obj4);
                }
                return arnb.a;
            case 2:
                cle cleVar = (cle) obj;
                cleVar.getClass();
                cleVar.o(((Number) ((zj) this.a).d()).floatValue());
                return arnb.a;
            case 3:
                dho dhoVar3 = (dho) obj;
                dhoVar3.getClass();
                String str = ((aezf) this.a).f;
                if (str != null) {
                    dhl.f(dhoVar3, str);
                }
                return arnb.a;
            case 4:
                Class cls = (Class) obj;
                cls.getClass();
                if (!afcq.class.isAssignableFrom(cls) || aqjn.aH(this.a, cls)) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 5:
                dho dhoVar4 = (dho) obj;
                dhoVar4.getClass();
                dhl.f(dhoVar4, (String) this.a);
                return arnb.a;
            case 6:
                this.a.h(new dqy(((dqy) obj).a));
                return arnb.a;
            case 7:
                dho dhoVar5 = (dho) obj;
                dhoVar5.getClass();
                dhl.f(dhoVar5, (String) this.a);
                return arnb.a;
            case 8:
                dho dhoVar6 = (dho) obj;
                dhoVar6.getClass();
                dhl.f(dhoVar6, (String) this.a);
                return arnb.a;
            case 9:
                MaterialButton materialButton = (MaterialButton) obj;
                materialButton.getClass();
                int b = ckw.b(((afzr) this.a).a.a);
                ColorStateList valueOf = ColorStateList.valueOf(b);
                valueOf.getClass();
                materialButton.setTextColor(b);
                if (materialButton.c != valueOf) {
                    materialButton.c = valueOf;
                    materialButton.g(false);
                }
                if (materialButton.j()) {
                    ajer ajerVar = materialButton.b;
                    if (ajerVar.l != valueOf) {
                        ajerVar.l = valueOf;
                        ajkm a = ajerVar.a();
                        ajkm b2 = ajerVar.b();
                        if (a != null) {
                            a.M(ajerVar.i, ajerVar.l);
                            if (b2 != null) {
                                b2.L(ajerVar.i, 0);
                            }
                        }
                    }
                }
                return arnb.a;
            case 10:
                agcp agcpVar = (agcp) obj;
                agcpVar.getClass();
                afhv d = ((afid) this.a).d();
                d.getClass();
                afhw e = afid.e((afid) this.a);
                e.getClass();
                Object obj5 = this.a;
                ncd ncdVar = new ncd(obj5, 11, (boolean[][]) null);
                ncd ncdVar2 = new ncd(obj5, 12, (float[][]) null);
                afgo afgoVar = e.d;
                if (afgoVar == null) {
                    return null;
                }
                return new afii(agcpVar.a, (cg) agcpVar.b, agcpVar.c, d, afgoVar, ncdVar, ncdVar2);
            case 11:
                fzu fzuVar = (fzu) obj;
                fzuVar.getClass();
                Object obj6 = this.a;
                afid afidVar = (afid) obj6;
                RecyclerView recyclerView2 = afidVar.b;
                if (recyclerView2 == null) {
                    arro.b("recyclerView");
                } else {
                    recyclerView = recyclerView2;
                }
                no noVar = recyclerView.l;
                noVar.getClass();
                gaz gazVar = fzuVar.a;
                if (gazVar instanceof gay) {
                    if (noVar.b() == 0) {
                        ((alvg) afid.a.g().h("com/google/android/libraries/compose/cameragallery/ui/screen/CameraGalleryScreen", "onLoadStateChanged", 607, "CameraGalleryScreen.kt")).q("No media or camera found, showing error screen");
                        afidVar.bb(R.string.no_media_description, Integer.valueOf(R.string.no_media_caption), R.string.no_media_button, ((agai) obj6).bh().a("CameraGalleryScreen.NoMediaSystemPickerButton#onClick", new acah(obj6, 7)));
                    } else {
                        ((alvg) afid.a.g().h("com/google/android/libraries/compose/cameragallery/ui/screen/CameraGalleryScreen", "onLoadStateChanged", 618, "CameraGalleryScreen.kt")).q("Media or camera found, hiding error and showing media");
                        afidVar.aV();
                    }
                } else if (gazVar instanceof gaw) {
                    ((alvg) ((alvg) afid.a.h()).g(((gaw) gazVar).a).h("com/google/android/libraries/compose/cameragallery/ui/screen/CameraGalleryScreen", "onLoadStateChanged", 623, "CameraGalleryScreen.kt")).q("Load state switched to error");
                } else {
                    ((alvg) afid.a.g().h("com/google/android/libraries/compose/cameragallery/ui/screen/CameraGalleryScreen", "onLoadStateChanged", 624, "CameraGalleryScreen.kt")).t("Load state updated to: %s", gazVar);
                }
                return arnb.a;
            case 12:
                afis afisVar = (afis) obj;
                afisVar.getClass();
                this.a.getClass();
                afisVar.a();
                return arnb.a;
            case 13:
                Class cls2 = (Class) obj;
                cls2.getClass();
                Object obj7 = ((afkw) this.a).a().get(cls2);
                if (!(obj7 instanceof afkt)) {
                    return null;
                }
                return (afkt) obj7;
            case 14:
                ((ejx) obj).getClass();
                aflf aflfVar = (aflf) this.a;
                aflh aflhVar = aflfVar.d;
                aflhVar.getClass();
                aflfVar.b.addTextChangedListener(aflfVar.a.h(aflhVar));
                return arnb.a;
            case 15:
                List list = (List) obj;
                list.getClass();
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    for (afnb afnbVar : ((aflx) it.next()).b) {
                        linkedHashMap.put(afnbVar.a().a(), afnbVar);
                        Iterator it2 = afnbVar.i().iterator();
                        while (it2.hasNext()) {
                            linkedHashMap.put(((aflp) it2.next()).a(), afnbVar);
                        }
                    }
                }
                ((afmd) this.a).e = linkedHashMap;
                return arnb.a;
            case 16:
                List list2 = (List) obj;
                list2.getClass();
                Iterator it3 = list2.iterator();
                while (true) {
                    if (it3.hasNext()) {
                        Object obj8 = this.a;
                        Object next = it3.next();
                        if (((aflx) next).b.contains(obj8)) {
                            obj2 = next;
                        }
                    }
                }
                return (aflx) obj2;
            case 17:
                Map map = (Map) obj;
                map.getClass();
                return (afnb) map.get(this.a);
            case 18:
                this.a.cancel(false);
                return arnb.a;
            case 19:
                afnm afnmVar = (afnm) obj;
                if (afnmVar == null || (builder = afnmVar.toBuilder()) == null) {
                    return null;
                }
                this.a.a(builder);
                return (afnm) builder.s();
            default:
                afmf afmfVar = (afmf) obj;
                afmfVar.getClass();
                if (afmfVar.a == this.a) {
                    z = false;
                }
                return Boolean.valueOf(z);
        }
    }
}
