package defpackage;

import j$.util.Optional;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class rov implements alhr {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ rov(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r1v32, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v37, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v42, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v49, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v54, types: [armf, java.lang.Object] */
    @Override // defpackage.alhr
    public final Object get() {
        switch (this.b) {
            case 0:
                return "send_destination:".concat(String.valueOf(((row) this.a).getString(3)));
            case 1:
                return "normalized_destination:".concat(String.valueOf(((row) this.a).getString(2)));
            case 2:
                return "display_destination:".concat(String.valueOf(((row) this.a).getString(4)));
            case 3:
                return "first_name:".concat(String.valueOf(((row) this.a).getString(5)));
            case 4:
                return "full_name:".concat(String.valueOf(((row) this.a).getString(6)));
            case 5:
                return "is_self:".concat(String.valueOf(((row) this.a).getString(7)));
            case 6:
                return "blocked:".concat(String.valueOf(((row) this.a).getString(8)));
            case 7:
                return "participant_type:".concat(String.valueOf(((row) this.a).getString(9)));
            case 8:
                return "is_spam:".concat(String.valueOf(((row) this.a).getString(10)));
            case 9:
                return "is_spam_source:".concat(String.valueOf(((row) this.a).getString(11)));
            case 10:
                return "country_code:".concat(String.valueOf(((row) this.a).getString(12)));
            case 11:
                return "color_palette_index:".concat(String.valueOf(((row) this.a).getString(13)));
            case 12:
                return "color_type:".concat(String.valueOf(((row) this.a).getString(14)));
            case 13:
                return "extended_color:".concat(String.valueOf(((row) this.a).getString(15)));
            case 14:
                return "cms_id:".concat(String.valueOf(((row) this.a).getString(16)));
            case 15:
                return "cms_life_cycle:".concat(String.valueOf(((row) this.a).getString(17)));
            case 16:
                return "my_identity_token_foreign_key:".concat(String.valueOf(((row) this.a).getString(1)));
            case 17:
                lru lruVar = (lru) this.a;
                List l = ((yjy) lruVar.c.b()).l();
                ArrayList arrayList = new ArrayList(aqjn.J(l, 10));
                Iterator it = l.iterator();
                while (it.hasNext()) {
                    arrayList.add(lruVar.f(((ykb) it.next()).r()));
                }
                ArrayList arrayList2 = new ArrayList(aqjn.J(l, 10));
                Iterator it2 = l.iterator();
                while (it2.hasNext()) {
                    arrayList2.add(lruVar.f(((ykb) it2.next()).u()));
                }
                yjt f = lruVar.f(((yjy) lruVar.c.b()).g().n());
                yjt f2 = lruVar.f((String) ((yjy) lruVar.c.b()).g().f().orElse(""));
                yjt f3 = lruVar.f(((yjy) lruVar.c.b()).g().m());
                String str = null;
                yjo yjoVar = (yjo) ((Optional) lruVar.b.b()).orElse(null);
                if (yjoVar != null) {
                    str = yjoVar.b();
                }
                return new ryc(f2, f3, f, lruVar.f(str), arrayList2, arrayList);
            case 18:
                return "participant_id:".concat(String.valueOf(((sfb) this.a).getString(0)));
            case 19:
                return "conversation_toolstone_state:".concat(String.valueOf(((sfb) this.a).getString(1)));
            default:
                return "conversation_subscription_state:".concat(String.valueOf(((sfb) this.a).getString(2)));
        }
    }
}
