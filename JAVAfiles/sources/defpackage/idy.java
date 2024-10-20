package defpackage;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class idy {
    public static final alvi a = alvi.m("com/google/android/apps/messaging/banner/BannersUiAdapterImpl");
    public final asai b;
    public String c;
    public final ascv d;
    public final iek e;
    public final iek f;
    public final ifb g;

    public idy(ifb ifbVar, iek iekVar, iek iekVar2, arwe arweVar, Map map, asai asaiVar, asai asaiVar2) {
        this.g = ifbVar;
        this.e = iekVar;
        this.f = iekVar2;
        this.b = asaiVar2;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : map.entrySet()) {
            if (!((ieb) entry.getKey()).b()) {
                ((alvg) a.g().h("com/google/android/apps/messaging/banner/BannersUiAdapterImpl", "isEnabled", 70, "BannersUiAdapterImpl.kt")).D("Filtering out banner %s with %s because of being disabled", entry.getKey(), entry.getValue());
            }
            if (((ieb) entry.getKey()).b()) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        List<armo> au = aqjn.au(aqjn.w(linkedHashMap), new ebn(19));
        ArrayList arrayList = new ArrayList(aqjn.J(au, 10));
        for (armo armoVar : au) {
            arrayList.add(new idx(((ieb) armoVar.a).a(), armoVar, 1));
        }
        asdn asdnVar = new asdn(new idw(null, this, 2, null), new jdn(new jdn(new idx((asai[]) aqjn.ax(arrayList).toArray(new asai[0]), this, 0), asaiVar, new liz((Object) this, 1, (byte[]) null), 17, null), this.f.a, new idu(this), 17, null));
        int i = ascp.a;
        this.d = arrn.T(asdnVar, arweVar, asco.a(0L, 3), null);
    }

    public static final iec a(armo armoVar) {
        return (iec) armoVar.a;
    }

    public static final ied b(armo armoVar) {
        return (ied) armoVar.b;
    }
}
