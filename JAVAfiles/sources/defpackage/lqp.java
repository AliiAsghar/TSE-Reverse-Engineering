package defpackage;

import android.content.Context;
import androidx.preference.Preference;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class lqp implements gfa {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ lqp(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v12, types: [java.util.concurrent.Executor, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v18, types: [java.util.concurrent.Executor, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.util.concurrent.Executor, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v7, types: [java.util.concurrent.Executor, java.lang.Object] */
    @Override // defpackage.gfa
    public final boolean a(Preference preference, Object obj) {
        akul c;
        int i = 8;
        byte[] bArr = null;
        int i2 = 3;
        int i3 = 1;
        int i4 = 0;
        switch (this.b) {
            case 0:
                if (!(obj instanceof Boolean)) {
                    return false;
                }
                lqq lqqVar = (lqq) this.a;
                akbo akboVar = (akbo) lqqVar.c.b();
                c = qjh.c(lqqVar.d, arpj.a, arwf.a, new kca(lqqVar, obj, (arpe) null, 15));
                akboVar.j(ahlp.l(c), new ahlp((Boolean) obj), lqqVar.g);
                return true;
            case 1:
                boolean equals = Boolean.TRUE.equals(obj);
                lpj lpjVar = (lpj) this.a;
                lpjVar.c.j(ahlp.l(((wol) lpjVar.e.get()).c()), new ahlp(Boolean.valueOf(equals)), lpjVar.h);
                if (true == equals) {
                    i2 = 2;
                }
                lpjVar.f.bb(i2);
                return false;
            case 2:
                boolean equals2 = Boolean.TRUE.equals(obj);
                lrh lrhVar = (lrh) this.a;
                usk uskVar = (usk) lrhVar.g.b();
                ((akbo) lrhVar.d.b()).j(ahlp.l(akul.g(((aiwu) uskVar.b).b(new uam(equals2, i3), uskVar.d)).h(new ttg(uskVar, 17), uskVar.f)), new ahlp(Boolean.valueOf(equals2)), lrhVar.j);
                return false;
            case 3:
                boolean equals3 = Boolean.TRUE.equals(obj);
                lrw lrwVar = (lrw) this.a;
                usk uskVar2 = (usk) lrwVar.e.b();
                lrwVar.c.j(ahlp.l(akul.g(((aiwu) uskVar2.b).b(new uam(equals3, i4), uskVar2.d)).h(new ttg(uskVar2, 18), uskVar2.f)), new ahlp(Boolean.valueOf(equals3)), lrwVar.h);
                return false;
            case 4:
                zhc zhcVar = (zhc) ((zhw) this.a).O.get();
                Boolean.TRUE.equals(obj);
                zhcVar.e();
                return false;
            case 5:
                xyo c2 = zhw.a.c();
                c2.H("Split view prefs changed");
                c2.z("newValue", obj);
                c2.q();
                Boolean bool = (Boolean) obj;
                lga.c = bool;
                zhw zhwVar = (zhw) this.a;
                qoq qoqVar = (qoq) zhwVar.w.b();
                Context x = zhwVar.f.x();
                x.getClass();
                qoqVar.i(x, null);
                ((mbl) zhwVar.x.b()).e("Bugle.SplitView.Toggle.Count", bool.booleanValue() ? 1 : 0);
                return true;
            case 6:
                zhw zhwVar2 = (zhw) this.a;
                if (!((Optional) zhwVar2.y.b()).isEmpty()) {
                    boolean equals4 = Boolean.TRUE.equals(obj);
                    int i5 = 4;
                    zhwVar2.ah.ifPresent(new zhp(preference, i5));
                    zxm zxmVar = (zxm) ((Optional) zhwVar2.y.b()).get();
                    ((ahiy) zxmVar.c.b()).q(zxmVar.a().j(new vfq(zxmVar, equals4, i5)), "CONVERSATION_SCALE_CONTENT_KEY");
                }
                return false;
            case 7:
                yfr yfrVar = (yfr) ((zhw) this.a).H.b();
                yfrVar.d.q(yfrVar.b().j(new vfq(yfrVar, Boolean.TRUE.equals(obj), i2)), yfr.a);
                return false;
            case 8:
                boolean booleanValue = ((Boolean) obj).booleanValue();
                zii ziiVar = (zii) this.a;
                ((yid) ((apwt) ziiVar.aj.get()).b()).d();
                if (booleanValue) {
                    ziiVar.ak.aA(3, 3);
                } else {
                    ziiVar.ak.aX(3);
                    ziiVar.al.ifPresent(new zih(0));
                }
                return true;
            case 9:
                boolean equals5 = Boolean.TRUE.equals(obj);
                zjp zjpVar = (zjp) this.a;
                ((akbo) zjpVar.c.b()).j(ahlp.l(((yiz) ((Optional) ((apxx) zjpVar.d).a).get()).d()), new ahlp(Boolean.valueOf(equals5)), zjpVar.i);
                return false;
            case 10:
                boolean equals6 = Boolean.TRUE.equals(obj);
                zjp zjpVar2 = (zjp) this.a;
                ((akbo) zjpVar2.c.b()).j(ahlp.l(((yiz) ((Optional) ((apxx) zjpVar2.d).a).get()).c()), new ahlp(Boolean.valueOf(equals6)), zjpVar2.j);
                return false;
            case 11:
                preference.G(false);
                boolean equals7 = Boolean.TRUE.equals(obj);
                zjx zjxVar = (zjx) this.a;
                zke b = zjxVar.b();
                akul j = b.d.j(new uam(equals7, 10));
                b.l(j);
                zjxVar.P.j(ahlp.l(j), new ahlp(zjxVar.B), zjxVar.w);
                return true;
            case 12:
                preference.G(false);
                boolean equals8 = Boolean.TRUE.equals(obj);
                zjx zjxVar2 = (zjx) this.a;
                zke b2 = zjxVar2.b();
                akul j2 = b2.d.j(new uam(equals8, i));
                b2.l(j2);
                zjxVar2.P.j(ahlp.l(j2), new ahlp(zjxVar2.y), zjxVar2.w);
                return true;
            case 13:
                preference.G(false);
                boolean equals9 = Boolean.TRUE.equals(obj);
                zjx zjxVar3 = (zjx) this.a;
                zke b3 = zjxVar3.b();
                akul j3 = b3.d.j(new uam(equals9, 6));
                b3.l(j3);
                zjxVar3.P.j(ahlp.l(j3), new ahlp(zjxVar3.A), zjxVar3.w);
                return true;
            case 14:
                preference.G(false);
                Boolean.TRUE.equals(obj);
                zjx zjxVar4 = (zjx) this.a;
                zjxVar4.P.j(ahlp.l(((wla) zjxVar4.X.get()).c()), new ahlp(zjxVar4.E), zjxVar4.w);
                return true;
            case 15:
                preference.G(false);
                boolean equals10 = Boolean.TRUE.equals(obj);
                zjx zjxVar5 = (zjx) this.a;
                zke b4 = zjxVar5.b();
                akul j4 = b4.d.j(new uam(equals10, 5));
                b4.l(j4);
                zjxVar5.P.j(ahlp.l(j4), new ahlp(zjxVar5.C), zjxVar5.w);
                zjxVar5.j(equals10);
                return true;
            case 16:
                preference.G(false);
                boolean equals11 = Boolean.TRUE.equals(obj);
                zjx zjxVar6 = (zjx) this.a;
                zke b5 = zjxVar6.b();
                akul j5 = b5.d.j(new uam(equals11, 9));
                b5.l(j5);
                zjxVar6.P.j(ahlp.l(j5), new ahlp(zjxVar6.z), zjxVar6.w);
                return true;
            case 17:
                String obj2 = obj.toString();
                Object obj3 = this.a;
                yxs yxsVar = new yxs(obj3, obj2, i, bArr);
                zjx zjxVar7 = (zjx) obj3;
                zjxVar7.P.j(new ahlp(aktp.W(yxsVar, zjxVar7.M)), new ahlp(obj2), zjxVar7.ad);
                return true;
            case 18:
                ((zjx) this.a).j(((Boolean) obj).booleanValue());
                return true;
            case 19:
                ((zjx) this.a).i();
                return true;
            default:
                Boolean bool2 = (Boolean) obj;
                boolean booleanValue2 = bool2.booleanValue();
                ((alvg) ((alvg) zkv.a.d()).h("com/google/android/apps/messaging/ui/appsettings/RcsSettingsFragmentV2Peer", "saveAutoDownloadFilesInRoamingPreference", 1658, "RcsSettingsFragmentV2Peer.java")).t("saveAutoDownloadFilesInRoamingPreference : enabled %s", bool2);
                zkv zkvVar = (zkv) this.a;
                ((ykw) zkvVar.x.b()).h(zkvVar.f, booleanValue2);
                return booleanValue2;
        }
    }

    public lqp(zjx zjxVar, int i, byte[][] bArr) {
        this.b = i;
        this.a = zjxVar;
    }
}
