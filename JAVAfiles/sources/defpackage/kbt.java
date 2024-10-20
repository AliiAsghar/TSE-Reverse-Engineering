package defpackage;

import android.content.Context;
import android.net.Uri;
import com.google.android.apps.messaging.R;
import j$.util.Optional;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class kbt extends arrp implements arqr {
    final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kbt(Object obj, int i) {
        super(1);
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r1v22, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, lrc] */
    /* JADX WARN: Type inference failed for: r1v7, types: [java.lang.Object, lrc] */
    /* JADX WARN: Type inference failed for: r2v38, types: [java.lang.Object, miz] */
    /* JADX WARN: Type inference failed for: r2v40, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v45, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v46, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v47, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v48, types: [java.util.List, java.lang.Object] */
    @Override // defpackage.arqr
    public final /* synthetic */ Object a(Object obj) {
        int i = 3;
        switch (this.b) {
            case 0:
                this.a.a();
                return arnb.a;
            case 1:
                this.a.a();
                return arnb.a;
            case 2:
                ((lrc) obj).getClass();
                return ((kjd) ((kcr) this.a).n.get()).a();
            case 3:
                long j = ((cjn) obj).a;
                ((zfh) ((rae) this.a).c.b()).f();
                Uri parse = Uri.parse("https://support.google.com/messages/?p=premium_sms");
                parse.getClass();
                ((lkd) ((rae) this.a).h).b(new lms(parse));
                return true;
            case 4:
                aruo aruoVar = (aruo) obj;
                aruoVar.getClass();
                return new aeie(aein.c, aruoVar.b().a, aruoVar.b().b + 1, aruoVar.a(), new jpi(this.a, aruoVar, 17, null));
            case 5:
                long j2 = ((cjn) obj).a;
                kff kffVar = (kff) this.a;
                qjh.l(kffVar.b, null, new jks(kffVar, (arpe) null, 6), 3);
                return true;
            case 6:
                long j3 = ((cjn) obj).a;
                kff kffVar2 = (kff) this.a;
                qjh.l(kffVar2.b, null, new jsu(kffVar2, (arpe) null, 13), 3);
                return true;
            case 7:
                long j4 = ((cjn) obj).a;
                kff kffVar3 = (kff) this.a;
                qjh.l(kffVar3.b, null, new jks(kffVar3, (arpe) null, 7, (byte[]) null), 3);
                return true;
            case 8:
                long j5 = ((cjn) obj).a;
                kff kffVar4 = (kff) this.a;
                qjh.m(kffVar4.b, new jks(kffVar4, (arpe) null, 8, (char[]) null));
                return true;
            case 9:
                lrc lrcVar = (lrc) obj;
                lrcVar.getClass();
                return ((jwt) ((Optional) this.a).get()).a(lrcVar);
            case 10:
                lrc lrcVar2 = (lrc) obj;
                lrcVar2.getClass();
                String string = ((Context) ((kjp) this.a).e).getString(R.string.satellite_messaging_toolstone_link);
                string.getClass();
                List B = aqjn.B(((kjp) this.a).a(R.string.sky_view_list_item, aerb.dn), ((kjp) this.a).a(R.string.message_time_list_item, aerb.bT), ((kjp) this.a).a(R.string.message_recipient_list_item, aerb.bf));
                String string2 = ((Context) ((kjp) this.a).e).getString(R.string.got_it_button);
                string2.getClass();
                aewr aewrVar = new aewr(string2, new jwl((Object) lrcVar2, 5, (short[]) null));
                String string3 = ((Context) ((kjp) this.a).e).getString(R.string.more_about_satellite_button);
                string3.getClass();
                return new aeqa(string, B, null, null, aewrVar, new aewr(string3, new jwl(((kjp) this.a).b, 6, (float[]) null)), null, 76);
            case 11:
                miz mizVar = (miz) obj;
                mizVar.getClass();
                return Boolean.valueOf(d.F(mizVar.b(), this.a.b()));
            case 12:
                miz mizVar2 = (miz) obj;
                mizVar2.getClass();
                return Boolean.valueOf(this.a.contains(mizVar2.b()));
            case 13:
                lrc lrcVar3 = (lrc) obj;
                lrcVar3.getClass();
                Object obj2 = this.a;
                return new kij(new kfq(lrcVar3, obj2, 3, null), new kfq(lrcVar3, obj2, 4, null), i);
            case 14:
                kix kixVar = (kix) obj;
                kixVar.getClass();
                ((khy) this.a).j.a(kixVar);
                return arnb.a;
            case 15:
                this.a.get(((Number) obj).intValue());
                return null;
            case 16:
                aos aosVar = (aos) obj;
                aosVar.getClass();
                aor.a(aosVar, null, new cdj(-2070070675, true, new jjs(this.a, 11)), 3);
                List list = ((kif) this.a).a;
                aosVar.b(list.size(), null, new kbt(list, 15), new cdj(-632812321, true, new jle(list, 3)));
                return arnb.a;
            case 17:
                this.a.get(((Number) obj).intValue());
                return null;
            case 18:
                aos aosVar2 = (aos) obj;
                aosVar2.getClass();
                aor.a(aosVar2, null, kig.a, 3);
                ArrayList arrayList = new ArrayList();
                for (Object obj3 : ((kih) this.a).a) {
                    arrayList.add(obj3);
                }
                aosVar2.b(arrayList.size(), null, new kbt(arrayList, 17), new cdj(-632812321, true, new kii(arrayList, this.a, 0)));
                return arnb.a;
            case 19:
                this.a.get(((Number) obj).intValue());
                return null;
            default:
                this.a.get(((Number) obj).intValue());
                return null;
        }
    }
}
