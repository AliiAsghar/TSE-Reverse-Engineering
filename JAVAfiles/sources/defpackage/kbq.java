package defpackage;

import android.content.Context;
import android.content.res.Resources;
import com.google.android.apps.messaging.R;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class kbq {
    private static final utz g = uuh.j(uuh.b, "emotify_badge_scale", 1.3f);
    public final armf a;
    public final kbu b;
    public final khj c;
    public final armf d;
    public final lre e;
    public final jxv f;
    private final Context h;

    public kbq(Context context, arwe arweVar, mjg mjgVar, armf armfVar, kbu kbuVar, lre lreVar, khj khjVar, jxv jxvVar, armf armfVar2) {
        context.getClass();
        arweVar.getClass();
        mjgVar.getClass();
        armfVar.getClass();
        lreVar.getClass();
        khjVar.getClass();
        armfVar2.getClass();
        this.h = context;
        this.a = armfVar;
        this.b = kbuVar;
        this.e = lreVar;
        this.c = khjVar;
        this.f = jxvVar;
        this.d = armfVar2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v0 */
    /* JADX WARN: Type inference failed for: r9v1, types: [aelg, arqg] */
    /* JADX WARN: Type inference failed for: r9v6 */
    public static /* synthetic */ aelg a(kbq kbqVar, miz mizVar) {
        ArrayList arrayList;
        ?? r9;
        int i;
        ArrayList arrayList2;
        int i2;
        aelb aekxVar;
        int i3;
        aeli aeliVar = new aeli(null);
        ArrayList arrayList3 = new ArrayList();
        nbe f = mizVar.f();
        char c = 1;
        if (f != null && !f.a().isEmpty()) {
            Long j = mizVar.j();
            alog a = f.a();
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            alur it = a.iterator();
            it.getClass();
            while (it.hasNext()) {
                nbb nbbVar = (nbb) it.next();
                int i4 = nbbVar.b;
                Integer num = (Integer) linkedHashMap.get(nbbVar.a);
                if (num != null) {
                    i3 = num.intValue();
                } else {
                    i3 = 0;
                }
                linkedHashMap.put(nbbVar.a, Integer.valueOf(i3 + i4));
            }
            List<Map.Entry> av = aqjn.av(linkedHashMap.entrySet(), 5);
            int size = linkedHashMap.size() - 5;
            ArrayList arrayList4 = new ArrayList(aqjn.J(av, 10));
            for (Map.Entry entry : av) {
                nbg nbgVar = (nbg) entry.getKey();
                int intValue = ((Number) entry.getValue()).intValue();
                if (nbgVar instanceof nbc) {
                    nbc nbcVar = (nbc) nbgVar;
                    nbcVar.a();
                    String a2 = nbcVar.a();
                    String a3 = nbcVar.a();
                    Resources resources = kbqVar.h.getResources();
                    Object[] objArr = new Object[2];
                    objArr[0] = Integer.valueOf(intValue);
                    objArr[c] = a3;
                    String quantityString = resources.getQuantityString(R.plurals.reaction_badges_content_description, intValue, objArr);
                    quantityString.getClass();
                    aekxVar = new aekw(a2, intValue, quantityString, aeliVar);
                    arrayList2 = arrayList4;
                    i2 = size;
                } else if (nbgVar instanceof nbd) {
                    nbd nbdVar = (nbd) nbgVar;
                    String a4 = nbdVar.a();
                    String b = nbdVar.b();
                    Float f2 = (Float) g.e();
                    f2.getClass();
                    Context context = kbqVar.h;
                    float floatValue = f2.floatValue();
                    String quantityString2 = context.getResources().getQuantityString(R.plurals.reaction_badges_content_description, intValue, Integer.valueOf(intValue), kbqVar.h.getResources().getString(R.string.emotify_badge_title));
                    quantityString2.getClass();
                    arrayList2 = arrayList4;
                    i2 = size;
                    aekxVar = new aekx(a4, b, floatValue, intValue, quantityString2, aeliVar);
                } else {
                    throw new armm();
                }
                arrayList2.add(aekxVar);
                size = i2;
                arrayList4 = arrayList2;
                c = 1;
            }
            int i5 = size;
            List az = aqjn.az(arrayList4);
            if (i5 > 0) {
                if (i5 < 10) {
                    i = R.string.truncated_reaction_badges_text_less_than_ten;
                } else {
                    i = R.string.truncated_reaction_badges_text_more_than_nine;
                }
                Context context2 = kbqVar.h;
                Integer valueOf = Integer.valueOf(i5);
                String string = context2.getString(i, valueOf);
                string.getClass();
                String string2 = kbqVar.h.getString(R.string.truncated_reaction_badges_content_description, valueOf);
                string2.getClass();
                aqjn.S(az, aqjn.y(new aela(string, string2, aeliVar)));
            }
            arrayList = arrayList3;
            r9 = 0;
            arrayList.add(new aeku(az, new jfq(kbqVar, j, a, 10, (short[]) null), new jkq(a, kbqVar, 20, null), 2));
        } else {
            arrayList = arrayList3;
            r9 = 0;
        }
        if (mizVar instanceof mty) {
            arrayList.add(new aeku(aqjn.y(new aeky(kbqVar.h.getString(R.string.scheduled_send_badges_content_description), aeliVar, 1)), new kbp(kbqVar, (mty) mizVar, 0), r9, 10));
        }
        if (arrayList.size() > 0) {
            return new aelg(arrayList);
        }
        return r9;
    }
}
