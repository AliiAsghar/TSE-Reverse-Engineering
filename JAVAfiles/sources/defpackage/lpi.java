package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import androidx.preference.Preference;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class lpi implements gfb {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ lpi(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.util.concurrent.Executor, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v41, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v47, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v9, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v3, types: [armf, java.lang.Object] */
    @Override // defpackage.gfb
    public final boolean a(Preference preference) {
        switch (this.b) {
            case 0:
                lpj lpjVar = (lpj) this.a;
                Resources z = lpjVar.b.z();
                String string = z.getString(R.string.notifications_enabled_pref_key);
                boolean z2 = z.getBoolean(R.bool.notifications_enabled_pref_default);
                zxy zxyVar = lpjVar.l;
                lpjVar.c.j(ahlp.l(aktp.ai(new mti(zxyVar, string, z2, 5), zxyVar.d)), new ahlp((Object) null), lpjVar.i);
                return true;
            case 1:
                ibm ibmVar = (ibm) this.a;
                qjh.l(ibmVar.g, null, new eie(ibmVar, (arpe) null, 18), 3);
                return true;
            case 2:
                zfp zfpVar = (zfp) this.a;
                if (((yjf) zfpVar.e.b()).g()) {
                    ((abbu) zfpVar.f.b()).h(R.string.spotlights_location_permissions_already_enabled);
                } else {
                    ((yjl) zfpVar.d.b()).c(new zfo());
                }
                return true;
            case 3:
                zhe zheVar = (zhe) this.a;
                return zheVar.aP(zheVar.aj.a());
            case 4:
                zhe zheVar2 = (zhe) this.a;
                return zheVar2.aP(zheVar2.aj.b());
            case 5:
                ((zig) ((zhw) this.a).p.b()).c();
                return true;
            case 6:
                zhw zhwVar = (zhw) this.a;
                String string2 = zhwVar.f.fe().getString(R.string.notifications_enabled_pref_key);
                if (!zhwVar.h.q(string2, zhwVar.f.z().getBoolean(R.bool.notifications_enabled_pref_default))) {
                    zhwVar.h.h(string2, true);
                }
                vjs vjsVar = (vjs) zhwVar.D.b();
                Intent a = lqn.g("android.settings.APP_NOTIFICATION_SETTINGS").a();
                a.putExtra("android.provider.extra.APP_PACKAGE", ((Context) vjsVar.a).getPackageName());
                zhwVar.f.startActivityForResult(a, 1001);
                return true;
            case 7:
                zjp zjpVar = (zjp) this.a;
                ((lzv) zjpVar.e.b()).y(((zjn) zjpVar.a.b()).F(), (String) yig.t.e());
                return true;
            case 8:
                ((zjx) this.a).I.c("Bugle.Preference.Smsc.Editor.Open");
                return false;
            case 9:
                zjx zjxVar = (zjx) this.a;
                zjxVar.P.j(ahlp.k(((iht) zjxVar.U.get()).a()), new ahlp((Object) null), zjxVar.x);
                return true;
            case 10:
                ((zjx) this.a).v.c();
                ev evVar = ((zjx) this.a).v.f;
                if (evVar != null) {
                    evVar.b().getLayoutParams().height = ((zjx) this.a).v.a.getResources().getDimensionPixelSize(R.dimen.group_mms_preference_dialog_listview_height);
                }
                return true;
            case 11:
                zlc zlcVar = (zlc) ((zkv) this.a).z.b();
                Context context = (Context) zlcVar.c.b();
                context.getClass();
                ydf ydfVar = (ydf) zlcVar.b.b();
                ydfVar.getClass();
                ykw ykwVar = (ykw) zlcVar.d.b();
                ykwVar.getClass();
                new zhy(context, ydfVar, ykwVar, zlcVar.a).c();
                return true;
            case 12:
                zkv zkvVar = (zkv) this.a;
                zhg zhgVar = (zhg) zkvVar.D.b();
                cj fe = zkvVar.q.fe();
                fe.getClass();
                ?? r0 = zhgVar.a;
                int i = zkvVar.g;
                ykw ykwVar2 = (ykw) r0.b();
                ykwVar2.getClass();
                new zkg(ykwVar2, fe, i).c();
                return true;
            case 13:
                zkv zkvVar2 = (zkv) this.a;
                ksm ksmVar = (ksm) zkvVar2.t.b();
                cj fe2 = zkvVar2.q.fe();
                fe2.getClass();
                ksmVar.i(fe2);
                return true;
            case 14:
                zkv zkvVar3 = (zkv) this.a;
                ksm ksmVar2 = (ksm) zkvVar3.t.b();
                cj fe3 = zkvVar3.q.fe();
                fe3.getClass();
                ksmVar2.i(fe3);
                return true;
            case 15:
                zmh zmhVar = (zmh) this.a;
                zmhVar.c.y(zmhVar.b.fe(), (String) yig.s.e());
                return true;
            default:
                zmj zmjVar = (zmj) this.a;
                zmjVar.b.y(zmjVar.a.fe(), (String) yig.s.e());
                return true;
        }
    }

    public lpi(zjx zjxVar, int i, char[] cArr) {
        this.b = i;
        this.a = zjxVar;
    }
}
