package defpackage;

import android.content.SharedPreferences;
import com.google.android.apps.messaging.R;
import j$.time.Duration;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ixz extends arrp implements arqg {
    final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ixz(Object obj, int i) {
        super(0);
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r0v29, types: [java.lang.Object, arml] */
    /* JADX WARN: Type inference failed for: r0v32, types: [java.lang.Object, arml] */
    /* JADX WARN: Type inference failed for: r0v44, types: [java.lang.Object, lrc] */
    @Override // defpackage.arqg
    public final /* synthetic */ Object a() {
        SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener = null;
        enb enbVar = null;
        switch (this.b) {
            case 0:
                return Integer.valueOf(((iyc) this.a).b.getResources().getDimensionPixelSize(R.dimen.conversation_scroll_to_bottom_button_minimum_clickable_width));
            case 1:
                return Integer.valueOf(((iyc) this.a).b.getResources().getDimensionPixelSize(R.dimen.conversation_scroll_to_bottom_button_minimum_clickable_height));
            case 2:
                return Integer.valueOf(((iyc) this.a).b.getResources().getDimensionPixelSize(R.dimen.conversation_scroll_to_bottom_button_background_width_in_no_text_mode));
            case 3:
                ykw ykwVar = (ykw) ((jbt) this.a).h.b();
                SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener2 = ((jbt) this.a).k;
                if (onSharedPreferenceChangeListener2 == null) {
                    arro.b("prefsListener");
                } else {
                    onSharedPreferenceChangeListener = onSharedPreferenceChangeListener2;
                }
                ykwVar.o(onSharedPreferenceChangeListener);
                return arnb.a;
            case 4:
                return this.a;
            case 5:
                return ((ixz) this.a).a;
            case 6:
                return dyt.d(this.a).aL();
            case 7:
                eoz d = dyt.d(this.a);
                if (d instanceof enb) {
                    enbVar = (enb) d;
                }
                if (enbVar != null) {
                    return enbVar.Q();
                }
                return epb.a;
            case 8:
                return new aehz[((asai[]) this.a).length];
            case 9:
                jdo jdoVar = (jdo) this.a;
                qjh.l(jdoVar.a, null, new ikq(jdoVar, (arpe) null, 10), 3);
                return arnb.a;
            case 10:
                this.a.a();
                return arnb.a;
            case 11:
                Object obj = this.a;
                ((jej) obj).b.b(llg.a);
                return arnb.a;
            case 12:
                ((lkd) this.a).b(new lmo(null, null, 3));
                return arnb.a;
            case 13:
                Object obj2 = this.a;
                ((jew) obj2).b.b(lnu.a);
                return arnb.a;
            case 14:
                jfb jfbVar = (jfb) this.a;
                jfbVar.c.b(new lmd(jfbVar.a));
                return arnb.a;
            case 15:
                ((lkd) this.a).b(lof.a);
                return arnb.a;
            case 16:
                ((jsy) this.a).d();
                return arnb.a;
            case 17:
                if (((Optional) ((apxx) ((jfi) this.a).a).a).isPresent()) {
                    ((lkd) ((jfi) this.a).b.b()).b(new lms(((vni) ((Optional) ((apxx) ((jfi) this.a).a).a).get()).d()));
                }
                return arnb.a;
            case 18:
                ((wfh) ((jat) this.a).c).w(8);
                return arnb.a;
            case 19:
                ((wfh) ((jat) this.a).c).w(5);
                return arnb.a;
            default:
                jia jiaVar = (jia) this.a;
                jhz jhzVar = jiaVar.h;
                Duration duration = jiaVar.b;
                return new jmt(jhzVar instanceof jhv, jiaVar.a, jhzVar.h(), jhzVar.g(), jhzVar.a(), duration);
        }
    }
}
