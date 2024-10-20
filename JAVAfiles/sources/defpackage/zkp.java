package defpackage;

import androidx.preference.Preference;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class zkp implements gfa {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ zkp(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v24, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.concurrent.Executor, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v10, types: [java.util.concurrent.Executor, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v5, types: [java.util.concurrent.Executor, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v10, types: [java.util.concurrent.Executor, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v4, types: [java.util.concurrent.Executor, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v36, types: [mho, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v37, types: [mho, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v38, types: [iby, java.lang.Object] */
    @Override // defpackage.gfa
    public final boolean a(Preference preference, Object obj) {
        int i;
        int i2 = 5;
        int i3 = 1;
        switch (this.b) {
            case 0:
                int i4 = alog.d;
                return ((zkv) this.a).o(obj, alsx.a);
            case 1:
                boolean booleanValue = ((Boolean) obj).booleanValue();
                Object obj2 = this.a;
                if (booleanValue) {
                    zkv zkvVar = (zkv) obj2;
                    ajgi ajgiVar = new ajgi(zkvVar.q.x());
                    ajgiVar.y(zkvVar.q.S(R.string.enable_rcs_auto_fallback_dialog_title));
                    ajgiVar.n(zkvVar.q.S(R.string.enable_rcs_auto_fallback_dialog_description_v2));
                    ajgiVar.u(zkvVar.q.S(R.string.confirm_rcs_auto_fallback), new aabt((aksr) zkvVar.E.b(), "RcsSettingsFragmentV2Peer#setupRcsAutoFallbackPreference", new ivs(obj2, 17), 8));
                    ajgiVar.p(zkvVar.q.S(android.R.string.cancel), null);
                    ajgiVar.a();
                    return false;
                }
                zkv zkvVar2 = (zkv) obj2;
                ((ykw) zkvVar2.x.b()).h(zkvVar2.e, false);
                ((mbl) zkvVar2.v.b()).e("Bugle.RCS.Chat.AutoFallback.Tap.Counts", 2);
                return true;
            case 2:
                boolean equals = Boolean.TRUE.equals(obj);
                zlf zlfVar = (zlf) this.a;
                akbo akboVar = (akbo) zlfVar.j.b();
                rae raeVar = (rae) zlfVar.e.b();
                akboVar.j(ahlp.l(aktp.ah(new hwm(raeVar, equals, 4, null), raeVar.f).h(new itk(raeVar, 15), raeVar.g)), new ahlp(Boolean.valueOf(equals)), zlfVar.c);
                return false;
            case 3:
                boolean equals2 = Boolean.TRUE.equals(obj);
                zlf zlfVar2 = (zlf) this.a;
                ((akbo) zlfVar2.j.b()).j(ahlp.l(((rae) zlfVar2.e.b()).a(equals2)), new ahlp(Boolean.valueOf(equals2)), zlfVar2.b);
                return false;
            case 4:
                boolean equals3 = Boolean.TRUE.equals(obj);
                zlf zlfVar3 = (zlf) this.a;
                akbo akboVar2 = (akbo) zlfVar3.j.b();
                rae raeVar2 = (rae) zlfVar3.e.b();
                akboVar2.j(ahlp.l(aktp.ah(new hwm(raeVar2, equals3, 2, null), raeVar2.f).h(new itk(raeVar2, 12), raeVar2.g).i(new led(raeVar2, equals3, i3), raeVar2.g)), new ahlp(Boolean.valueOf(equals3)), zlfVar3.a);
                return false;
            case 5:
                boolean equals4 = Boolean.TRUE.equals(obj);
                Object obj3 = this.a;
                ((zmh) obj3).e.ifPresent(new ive(obj3, equals4, i2));
                return false;
            case 6:
                boolean equals5 = Boolean.TRUE.equals(obj);
                Object obj4 = this.a;
                ((zmj) obj4).d.ifPresent(new ive(obj4, equals5, 6));
                return false;
            case 7:
                boolean booleanValue2 = ((Boolean) obj).booleanValue();
                zmn zmnVar = (zmn) this.a;
                wfh wfhVar = (wfh) ((yyt) zmnVar.b).c.b();
                atal X = wfhVar.X();
                if (true != booleanValue2) {
                    i = 2;
                } else {
                    i = 1;
                }
                xyl.k(wfhVar.V(X, i));
                if (ymd.a()) {
                    if (booleanValue2) {
                        zmnVar.c.aA(2, 3);
                    } else {
                        zmnVar.c.aX(2);
                    }
                }
                return true;
            case 8:
                obj.getClass();
                ((Boolean) obj).booleanValue();
                this.a.e();
                return false;
            case 9:
                boolean equals6 = Boolean.TRUE.equals(obj);
                lcg lcgVar = new lcg(equals6, i2);
                zoe zoeVar = (zoe) this.a;
                zoeVar.c.j(ahlp.l(zoeVar.b.i(lcgVar)), new ahlp(Boolean.valueOf(equals6)), zoeVar.e);
                return false;
            default:
                boolean booleanValue3 = ((Boolean) obj).booleanValue();
                Object obj5 = this.a;
                if (!booleanValue3) {
                    xzb.j("Bugle", "Verified SMS user setting disabled by user.");
                    ((ukh) ((zoh) obj5).b).b();
                } else {
                    xzb.j("Bugle", "Verified SMS user setting enabled by user.");
                    ((zxy) ((zoh) obj5).c).k(true);
                }
                return true;
        }
    }
}
