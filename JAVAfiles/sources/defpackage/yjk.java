package defpackage;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import com.google.android.apps.messaging.R;
import com.google.android.material.snackbar.Snackbar;
import j$.util.Objects;
import j$.util.Optional;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class yjk implements rv {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public yjk(arvo arvoVar, int i) {
        this.b = i;
        this.a = arvoVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v17, types: [rv, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v18, types: [arvo, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v20, types: [java.lang.Object, arpe] */
    @Override // defpackage.rv
    public final void a(Object obj) {
        Intent intent;
        ajce ajceVar;
        String S;
        Object obj2;
        boolean z = true;
        ajxt ajxtVar = null;
        Class cls = null;
        ajxt ajxtVar2 = null;
        ajxt ajxtVar3 = null;
        Class cls2 = null;
        ajxt ajxtVar4 = null;
        switch (this.b) {
            case 0:
                ru ruVar = (ru) obj;
                wfh wfhVar = (wfh) ((yjl) this.a).b.remove(yjh.SCHEDULED_SEND_PERMISSIONS);
                if (wfhVar == null) {
                    return;
                }
                if (ruVar.a == -1) {
                    wfhVar.D();
                    return;
                } else {
                    wfhVar.C();
                    return;
                }
            case 1:
                if (((ru) obj).a == -1) {
                    ((ixd) this.a).aP.ifPresent(new isb(13));
                    return;
                }
                return;
            case 2:
                zhw zhwVar = (zhw) this.a;
                zho zhoVar = zhwVar.f;
                ru ruVar2 = (ru) obj;
                Optional ofNullable = Optional.ofNullable(zhoVar.a(zhoVar.S(R.string.profile_pref_key)));
                if (ruVar2.a == -1 && (intent = ruVar2.b) != null) {
                    Bundle bundle = (Bundle) Objects.requireNonNullElse(intent.getExtras(), Bundle.EMPTY);
                    bundle.getClass();
                    String string = bundle.getString("profile.limited.Result");
                    if (string == null || (ajceVar = (ajce) Enum.valueOf(ajce.class, string)) == null) {
                        ajceVar = ajce.a;
                    }
                    alwl alwlVar = (alwl) zhw.c.g();
                    alwlVar.X(new alvz("limited_profile_result_status", ajce.class, false, false), ajceVar);
                    ((alwl) alwlVar.h("com/google/android/apps/messaging/ui/appsettings/ApplicationSettingsFragmentPeer", "onProfileOnboardingResult", 661, "ApplicationSettingsFragmentPeer.java")).q("User interacted with profile onboarding screen");
                    ((Optional) zhwVar.P.b()).ifPresent(new zhp(ajceVar, 7));
                    if (ajceVar == ajce.c) {
                        ahiy ahiyVar = (ahiy) zhwVar.M.b();
                        akul ag = aktp.ag(null);
                        int i = zhl.a;
                        ahiyVar.r(ag, zhj.a);
                    } else {
                        ofNullable.ifPresent(new xyh(10));
                    }
                    if (zhwVar.f.Q != null) {
                        int ordinal = ajceVar.ordinal();
                        if (ordinal != 1) {
                            if (ordinal != 2) {
                                if (ordinal != 3) {
                                    return;
                                } else {
                                    S = zhwVar.f.S(R.string.profile_onboarding_banner_snackbar_save_error_text);
                                }
                            } else {
                                S = zhwVar.f.S(R.string.profile_onboarding_banner_snackbar_success_text);
                            }
                        } else {
                            S = zhwVar.f.S(R.string.profile_onboarding_banner_snackbar_load_error_text);
                        }
                        Snackbar.q(zhwVar.f.L(), S, 0).i();
                        return;
                    }
                    return;
                }
                ofNullable.ifPresent(new xyh(8));
                zho zhoVar2 = zhwVar.f;
                Snackbar.q(zhoVar2.L(), zhoVar2.S(R.string.profile_onboarding_banner_snackbar_load_error_text), 0).i();
                ((Optional) zhwVar.P.b()).ifPresent(new xyh(9));
                return;
            case 3:
                if (((ru) obj).a == -1) {
                    ((zkv) this.a).c();
                    return;
                }
                return;
            case 4:
                List list = (List) obj;
                list.getClass();
                if (!list.isEmpty()) {
                    Object obj3 = this.a;
                    arrn.J(((agai) obj3).bo(), null, null, new adzx((afid) obj3, list, (arpe) null, 20), 3);
                    return;
                } else {
                    ((alvg) afid.a.g().h("com/google/android/libraries/compose/cameragallery/ui/screen/CameraGalleryScreen", "onCreate$lambda$0", 227, "CameraGalleryScreen.kt")).q("No gallery media was selected");
                    return;
                }
            case 5:
                Uri uri = (Uri) obj;
                if (uri != null) {
                    obj2 = aqjn.y(uri);
                } else {
                    obj2 = arnv.a;
                }
                this.a.a(obj2);
                return;
            case 6:
                if (this.a.i()) {
                    this.a.w(obj);
                    return;
                }
                return;
            case 7:
                ru ruVar3 = (ru) obj;
                int i2 = ruVar3.a;
                Intent intent2 = ruVar3.b;
                Object obj4 = this.a;
                if (i2 == -1) {
                    ((ajxf) obj4).s(ajwt.a(intent2.getIntExtra("new_account_id", -1)));
                } else {
                    ajxf ajxfVar = (ajxf) obj4;
                    if (!ajxfVar.e.c()) {
                        if (intent2 != null) {
                            ajxtVar = (ajxt) intent2.getSerializableExtra("account_error");
                        }
                        ajyp ajypVar = ajxfVar.e;
                        if (ajxtVar == null) {
                            ajxtVar = new ajxz();
                        }
                        ajypVar.l(ajxtVar);
                    }
                    ajxfVar.k();
                }
                ((ajxf) obj4).m();
                return;
            case 8:
                ru ruVar4 = (ru) obj;
                int i3 = ruVar4.a;
                Intent intent3 = ruVar4.b;
                Object obj5 = this.a;
                if (i3 == -1) {
                    ((ajxf) obj5).s(ajwt.a(intent3.getIntExtra("new_account_id", -1)));
                } else {
                    if (intent3 != null && intent3.getBooleanExtra("restart_account_selector", false)) {
                        ajxf ajxfVar2 = (ajxf) obj5;
                        ajxfVar2.j();
                        ajxfVar2.i();
                        akrh e = aktp.e("Switch Account Interactive");
                        try {
                            alog alogVar = ((ajxf) obj5).l.b;
                            int i4 = ((alsx) alogVar).c - 1;
                            while (true) {
                                if (i4 >= 0) {
                                    if (ajyh.class.isAssignableFrom((Class) alogVar.get(i4))) {
                                        cls2 = (Class) alogVar.get(i4);
                                    } else {
                                        i4--;
                                    }
                                }
                            }
                            if (cls2 == null) {
                                z = false;
                            }
                            albo.U(z, "No interactive selector found.");
                            ((ajxf) obj5).n(alog.r(cls2), 0);
                            e.close();
                        } catch (Throwable th) {
                            try {
                                e.close();
                            } catch (Throwable th2) {
                                th.addSuppressed(th2);
                            }
                            throw th;
                        }
                    } else {
                        if (intent3 != null) {
                            ajxtVar4 = (ajxt) intent3.getSerializableExtra("account_error");
                        }
                        ajyp ajypVar2 = ((ajxf) obj5).e;
                        if (ajxtVar4 == null) {
                            ajxtVar4 = new ajxz();
                        }
                        ajypVar2.l(ajxtVar4);
                    }
                    ((ajxf) obj5).k();
                }
                ((ajxf) obj5).m();
                return;
            case 9:
                ru ruVar5 = (ru) obj;
                int i5 = ruVar5.a;
                Intent intent4 = ruVar5.b;
                Object obj6 = this.a;
                if (i5 == -1) {
                    ((ajxm) obj6).s(ajwt.a(intent4.getIntExtra("new_account_id", -1)));
                } else {
                    ajxm ajxmVar = (ajxm) obj6;
                    if (!ajxmVar.e.c()) {
                        if (intent4 != null) {
                            ajxtVar3 = (ajxt) intent4.getSerializableExtra("account_error");
                        }
                        ajyp ajypVar3 = ajxmVar.e;
                        if (ajxtVar3 == null) {
                            ajxtVar3 = new ajxz();
                        }
                        ajypVar3.l(ajxtVar3);
                    }
                    ajxmVar.k();
                }
                ((ajxm) obj6).m();
                return;
            default:
                ru ruVar6 = (ru) obj;
                int i6 = ruVar6.a;
                Intent intent5 = ruVar6.b;
                Object obj7 = this.a;
                if (i6 == -1) {
                    ((ajxm) obj7).s(ajwt.a(intent5.getIntExtra("new_account_id", -1)));
                } else {
                    if (intent5 != null && intent5.getBooleanExtra("restart_account_selector", false)) {
                        ajxm ajxmVar2 = (ajxm) obj7;
                        ajxmVar2.j();
                        ajxmVar2.i();
                        akrh e2 = aktp.e("Switch Account Interactive");
                        try {
                            alog alogVar2 = ((ajxm) obj7).l.b;
                            int i7 = ((alsx) alogVar2).c - 1;
                            while (true) {
                                if (i7 >= 0) {
                                    if (ajyh.class.isAssignableFrom((Class) alogVar2.get(i7))) {
                                        cls = (Class) alogVar2.get(i7);
                                    } else {
                                        i7--;
                                    }
                                }
                            }
                            if (cls == null) {
                                z = false;
                            }
                            albo.U(z, "No interactive selector found.");
                            ((ajxm) obj7).n(alog.r(cls), 0);
                            e2.close();
                        } catch (Throwable th3) {
                            try {
                                e2.close();
                            } catch (Throwable th4) {
                                th3.addSuppressed(th4);
                            }
                            throw th3;
                        }
                    } else {
                        if (intent5 != null) {
                            ajxtVar2 = (ajxt) intent5.getSerializableExtra("account_error");
                        }
                        ajyp ajypVar4 = ((ajxm) obj7).e;
                        if (ajxtVar2 == null) {
                            ajxtVar2 = new ajxz();
                        }
                        ajypVar4.l(ajxtVar2);
                    }
                    ((ajxm) obj7).k();
                }
                ((ajxm) obj7).m();
                return;
        }
    }

    public /* synthetic */ yjk(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }
}
