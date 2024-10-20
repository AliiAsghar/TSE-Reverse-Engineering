package defpackage;

import android.content.Context;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.TreeSet;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class aiqc extends epp {
    private List j;

    public aiqc(Context context) {
        super(context.getApplicationContext());
    }

    @Override // defpackage.epp
    public final /* bridge */ /* synthetic */ Object a() {
        boolean z;
        TreeSet treeSet = new TreeSet();
        String[] split = ahmc.O(this.c.getApplicationContext(), "third_party_license_metadata", 0L, -1).split("\n");
        ArrayList arrayList = new ArrayList(split.length);
        for (String str : split) {
            int indexOf = str.indexOf(32);
            String[] split2 = str.substring(0, indexOf).split(":");
            if (split2.length == 2 && indexOf > 0) {
                z = true;
            } else {
                z = false;
            }
            albo.X(z, "Invalid license meta-data line:\n%s", str);
            arrayList.add(new aiqb(str.substring(indexOf + 1), Long.parseLong(split2[0]), Integer.parseInt(split2[1])));
        }
        Collections.sort(arrayList);
        treeSet.addAll(arrayList);
        return DesugarCollections.unmodifiableList(new ArrayList(treeSet));
    }

    @Override // defpackage.epr
    public final void l() {
        List list = this.j;
        if (list != null) {
            i(list);
        } else {
            f();
        }
    }

    @Override // defpackage.epr
    public final void m() {
        g();
    }

    @Override // defpackage.epr
    /* renamed from: o, reason: merged with bridge method [inline-methods] */
    public final void i(List list) {
        this.j = list;
        super.i(list);
    }
}
