package defpackage;

import android.content.Context;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.shared.api.messaging.recipient.ResolvedRecipient;
import java.util.ArrayList;
import java.util.LinkedHashMap;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class zyw extends arpw implements arra {
    /* synthetic */ Object a;
    /* synthetic */ Object b;
    /* synthetic */ Object c;
    /* synthetic */ Object d;
    /* synthetic */ boolean e;
    /* synthetic */ Object f;
    final /* synthetic */ aaya g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zyw(aaya aayaVar, arpe arpeVar) {
        super(7, arpeVar);
        this.g = aayaVar;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [miu, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, java.lang.Iterable] */
    @Override // defpackage.arpq
    public final Object b(Object obj) {
        boolean z;
        String quantityString;
        alog aZ;
        String o;
        aqil.P(obj);
        aaya aayaVar = this.g;
        armf armfVar = aayaVar.f;
        ?? r1 = this.a;
        Object obj2 = this.b;
        ?? r3 = this.c;
        ?? r4 = this.d;
        boolean z2 = this.e;
        Object obj3 = this.f;
        if (z2) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        for (ResolvedRecipient resolvedRecipient : r3) {
            String p = resolvedRecipient.p();
            if ((p != null && p.length() != 0) || ((o = resolvedRecipient.o()) != null && o.length() != 0)) {
                arrayList.add(resolvedRecipient);
            } else {
                String s = resolvedRecipient.s();
                if (s != null && s.length() != 0) {
                    arrayList2.add(resolvedRecipient);
                } else {
                    arrayList3.add(resolvedRecipient);
                }
            }
        }
        aron aronVar = new aron((byte[]) null);
        aronVar.addAll(aqjn.au(arrayList, new lvh(20)));
        aronVar.addAll(aqjn.au(arrayList2, new zyv(1)));
        aronVar.addAll(aqjn.au(arrayList3, new zyv(0)));
        alog<ResolvedRecipient> aZ2 = alzz.aZ(aqjn.x(aronVar));
        if (!((mwc) obj2).c.h && !r1.p()) {
            z = false;
        } else {
            z = true;
        }
        int size = aZ2.size();
        if (((Boolean) iyr.a.e()).booleanValue()) {
            quantityString = gvf.P((Context) aayaVar.i, R.string.participant_list_count_title_icu, "count", Integer.valueOf(size));
        } else {
            quantityString = ((Context) aayaVar.i).getResources().getQuantityString(R.plurals.participant_list_count_title, size, Integer.valueOf(size));
            quantityString.getClass();
        }
        if (((pct) aayaVar.d.b()).a()) {
            LinkedHashMap linkedHashMap = new LinkedHashMap(arrn.r(aqjn.i(aqjn.J(r4, 10)), 16));
            for (nfw nfwVar : r4) {
                armo armoVar = new armo(arsd.k(nfwVar.i()), nfwVar.k());
                linkedHashMap.put(armoVar.a, armoVar.b);
            }
            ArrayList arrayList4 = new ArrayList(aqjn.J(aZ2, 10));
            for (ResolvedRecipient resolvedRecipient2 : aZ2) {
                resolvedRecipient2.getClass();
                arrayList4.add(aayaVar.b(resolvedRecipient2, z, r1.j(), (String) linkedHashMap.get(resolvedRecipient2.f())));
            }
            aZ = alzz.aZ(arrayList4);
        } else {
            ArrayList arrayList5 = new ArrayList(aqjn.J(aZ2, 10));
            for (ResolvedRecipient resolvedRecipient3 : aZ2) {
                resolvedRecipient3.getClass();
                arrayList5.add(aayaVar.b(resolvedRecipient3, z, r1.j(), null));
            }
            aZ = alzz.aZ(arrayList5);
        }
        return new zyx(quantityString, aZ, (aehz) obj3);
    }

    @Override // defpackage.arra
    public final /* bridge */ /* synthetic */ Object i(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7) {
        boolean booleanValue = ((Boolean) obj5).booleanValue();
        zyw zywVar = new zyw(this.g, (arpe) obj7);
        zywVar.a = (miu) obj;
        zywVar.b = (mwc) obj2;
        zywVar.c = (alog) obj3;
        zywVar.d = (alog) obj4;
        zywVar.e = booleanValue;
        zywVar.f = (aehz) obj6;
        return zywVar.b(arnb.a);
    }
}
