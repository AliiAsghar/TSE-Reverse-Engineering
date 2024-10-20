package defpackage;

import com.google.android.gms.appdatasearch.QuerySpecification;
import com.google.android.gms.appdatasearch.Section;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class mkn {
    public static final alwo a = alwo.o("Bugle");
    public static final QuerySpecification b;
    public final arwe c;
    public final armf d;
    public final msk e;
    public final achn f;
    public final armf g;

    static {
        ArrayList arrayList;
        boolean z;
        int[] iArr;
        ArrayList arrayList2 = new ArrayList();
        Section section = new Section("thing_proto", true, 16);
        int i = 0;
        if (section.a.startsWith("semantic#")) {
            ArrayList arrayList3 = new ArrayList();
            arrayList3.add(section);
            arrayList = arrayList3;
            z = true;
        } else {
            ArrayList arrayList4 = new ArrayList();
            arrayList4.add(section);
            arrayList = arrayList4;
            z = false;
        }
        if (arrayList2.isEmpty()) {
            iArr = new int[0];
        } else {
            int[] iArr2 = new int[arrayList2.size()];
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                iArr2[i] = ((Integer) it.next()).intValue();
                i++;
            }
            iArr = iArr2;
        }
        b = new QuerySpecification(true, null, arrayList, true, 0, 0, z, 0, true, iArr, null, null, null, null);
    }

    public mkn(arwe arweVar, armf armfVar, msk mskVar, achn achnVar, armf armfVar2) {
        this.c = arweVar;
        this.d = armfVar;
        this.e = mskVar;
        this.f = achnVar;
        this.g = armfVar2;
    }

    public static final String a(apvy apvyVar, String str) {
        apax apaxVar = apvyVar.b;
        apaxVar.getClass();
        ArrayList arrayList = new ArrayList();
        for (Object obj : apaxVar) {
            apvx apvxVar = (apvx) obj;
            if (apvxVar.bE().equals(str) && apvxVar.bD() > 0) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(aqjn.J(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((apvx) it.next()).bG());
        }
        String str2 = (String) aqjn.Z(arrayList2);
        if (str2 == null) {
            return "";
        }
        return str2;
    }
}
