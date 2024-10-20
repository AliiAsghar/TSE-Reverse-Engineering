package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class idu extends arrd implements arqw {
    public idu(Object obj) {
        super(3, obj, idy.class, "getFirstValidBannerContent", "getFirstValidBannerContent(Ljava/util/List;Ljava/util/Map;)Lcom/google/android/apps/messaging/banner/api/BannerContent;", 4);
    }

    @Override // defpackage.arqw
    public final /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        Object obj4;
        iec iecVar;
        armo armoVar;
        List list = (List) obj;
        Map map = (Map) obj2;
        idy idyVar = (idy) this.b;
        ArrayList<armo> arrayList = new ArrayList();
        for (Object obj5 : list) {
            akec akecVar = (akec) ((armo) obj5).a;
            if ((akecVar instanceof akek) || ((akecVar instanceof akem) && ((akem) akecVar).a != null)) {
                arrayList.add(obj5);
            }
        }
        if (arrayList.size() != list.size()) {
            ((alvg) idy.a.g().h("com/google/android/apps/messaging/banner/BannersUiAdapterImpl", "getFirstValidBannerContent", 123, "BannersUiAdapterImpl.kt")).q("Banners are still loading, waiting until loaded to prioritize");
        } else {
            ((alvg) idy.a.g().h("com/google/android/apps/messaging/banner/BannersUiAdapterImpl", "getFirstValidBannerContent", 129, "BannersUiAdapterImpl.kt")).q("All banners have finished loading, getting the first non-null, eligible to display");
            ArrayList arrayList2 = new ArrayList(aqjn.J(arrayList, 10));
            for (armo armoVar2 : arrayList) {
                akec akecVar2 = (akec) armoVar2.a;
                ied iedVar = (ied) armoVar2.b;
                if (akecVar2 instanceof akek) {
                    iecVar = (iec) ((akek) akecVar2).a;
                } else if (akecVar2 instanceof akem) {
                    iecVar = (iec) ((akem) akecVar2).a;
                } else {
                    iecVar = null;
                }
                if (iecVar == null) {
                    ((alvg) idy.a.g().h("com/google/android/apps/messaging/banner/BannersUiAdapterImpl", "getFirstValidBannerContent", 142, "BannersUiAdapterImpl.kt")).t("Filtering out banner with %s because of invalid LocalSnapshot or null content", iedVar);
                } else if (idyVar.f.b && !d.F(iecVar.a(), idyVar.c) && !iedVar.a) {
                    ((alvg) idy.a.g().h("com/google/android/apps/messaging/banner/BannersUiAdapterImpl", "getFirstValidBannerContent", 160, "BannersUiAdapterImpl.kt")).D("Filtering out banner %s with %s because of being blocked", iecVar, iedVar);
                } else {
                    armoVar = new armo(iecVar, iedVar);
                    arrayList2.add(armoVar);
                }
                armoVar = null;
                arrayList2.add(armoVar);
            }
            List<armo> an = aqjn.an(arrayList2);
            ArrayList arrayList3 = new ArrayList(aqjn.J(an, 10));
            for (armo armoVar3 : an) {
                Object obj6 = armoVar3.a;
                obj6.getClass();
                arrayList3.add(new armo(obj6, armoVar3.b));
            }
            Iterator it = arrayList3.iterator();
            while (true) {
                if (it.hasNext()) {
                    obj4 = it.next();
                    if (!map.containsKey(((iec) ((armo) obj4).a).a())) {
                        break;
                    }
                } else {
                    obj4 = null;
                    break;
                }
            }
            armo armoVar4 = (armo) obj4;
            if (armoVar4 != null && !((ied) armoVar4.b).b) {
                idyVar.e.b = true;
                if (idyVar.c == null) {
                    idyVar.c = idy.a(armoVar4).a();
                }
            }
            if (armoVar4 != null) {
                return idy.a(armoVar4);
            }
        }
        return null;
    }
}
