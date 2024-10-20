package defpackage;

import android.app.Activity;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.preference.SwitchPreferenceCompat;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.shared.datamodel.data.suggestions.impl.SmartSuggestionItemSuggestionData;
import com.google.android.apps.messaging.ui.appsettings.VmtSettingsActivity;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ynn extends arrp implements arqr {
    final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ynn(Object obj, int i) {
        super(1);
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v12, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v13, types: [cas, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v21, types: [java.util.List, java.lang.Object] */
    @Override // defpackage.arqr
    public final /* synthetic */ Object a(Object obj) {
        int min;
        int i = 0;
        SwitchPreferenceCompat switchPreferenceCompat = null;
        switch (this.b) {
            case 0:
                aozy aozyVar = (aozy) obj;
                aozyVar.getClass();
                if (((ynr) this.a).h(aozyVar)) {
                    if (!aozyVar.a.isMutable()) {
                        aozyVar.b = aozyVar.r();
                    } else {
                        throw new IllegalArgumentException("Default instance must be immutable.");
                    }
                }
                return arnb.a;
            case 1:
                return Boolean.valueOf(d.F(this.a, (String) obj));
            case 2:
                yvg yvgVar = (yvg) obj;
                yvgVar.getClass();
                aozy builder = yvgVar.toBuilder();
                long max = Math.max(((arsa) this.a).a, yvgVar.c);
                if (!builder.b.isMutable()) {
                    builder.u();
                }
                yvg yvgVar2 = (yvg) builder.b;
                yvgVar2.b |= 1;
                yvgVar2.c = max;
                apag s = builder.s();
                s.getClass();
                return (yvg) s;
            case 3:
                anw anwVar = (anw) obj;
                anwVar.getClass();
                int a = anwVar.a();
                yzz yzzVar = (yzz) this.a;
                alog alogVar = yzzVar.a;
                int size = alogVar.size() - 1;
                while (true) {
                    if (i <= size) {
                        min = (i + size) / 2;
                        mkc mkcVar = (mkc) yzzVar.a.get(min);
                        if (a > mkcVar.d) {
                            i = min + 1;
                        } else if (a < mkcVar.b) {
                            size = min - 1;
                        }
                    } else {
                        min = Math.min(i, yzzVar.a.size() - 1);
                    }
                }
                E e = alogVar.get(min);
                e.getClass();
                return ((mkc) e).a;
            case 4:
                this.a.get(((Number) obj).intValue());
                return null;
            case 5:
                aos aosVar = (aos) obj;
                aosVar.getClass();
                List x = a.x(this.a);
                aosVar.b(x.size(), null, new ynn(x, 4), new cdj(-632812321, true, new jle(x, 11)));
                return arnb.a;
            case 6:
                ((Number) obj).intValue();
                ((zav) this.a).a.a();
                return arnb.a;
            case 7:
                dho dhoVar = (dho) obj;
                dhoVar.getClass();
                dhl.f(dhoVar, (String) this.a);
                return arnb.a;
            case 8:
                dho dhoVar2 = (dho) obj;
                dhoVar2.getClass();
                String str = ((zcx) this.a).d;
                str.getClass();
                dhl.i(dhoVar2, str);
                return arnb.a;
            case 9:
                this.a.get(((Number) obj).intValue());
                return null;
            case 10:
                aos aosVar2 = (aos) obj;
                aosVar2.getClass();
                if (!((zcx) this.a).b.isEmpty()) {
                    aor.a(aosVar2, ((zcx) this.a).a, zcw.a, 2);
                }
                Object obj2 = this.a;
                yzm yzmVar = yzm.f;
                List list = ((zcx) obj2).b;
                aosVar2.b(list.size(), new wup(yzmVar, list, 12, null), new ynn(list, 9), new cdj(-632812321, true, new jle(list, 12)));
                return arnb.a;
            case 11:
                Integer num = (Integer) obj;
                num.getClass();
                ((Activity) this.a).getTheme().applyStyle(num.intValue(), true);
                return arnb.a;
            case 12:
                Integer num2 = (Integer) obj;
                num2.getClass();
                ((Activity) this.a).getTheme().applyStyle(num2.intValue(), true);
                return arnb.a;
            case 13:
                iby ibyVar = (iby) obj;
                ibyVar.getClass();
                ((VmtSettingsActivity) ((znp) this.a).a).setTitle(ibyVar.c());
                ((TextView) ((VmtSettingsActivity) ((znp) this.a).a).findViewById(R.id.vmt_preferences_education)).setText(ibyVar.b());
                bd bdVar = new bd(((VmtSettingsActivity) ((znp) this.a).a).a());
                znq znqVar = new znq();
                apxh.e(znqVar);
                bdVar.z(R.id.vmt_preferences_fragment_container, znqVar);
                bdVar.b();
                return arnb.a;
            case 14:
                iby ibyVar2 = (iby) obj;
                ibyVar2.getClass();
                ((znr) this.a).b.a(R.id.vmt_settings_subscription_id, ibyVar2.d(), ((znr) this.a).e);
                return arnb.a;
            case 15:
                iby ibyVar3 = (iby) obj;
                ibyVar3.getClass();
                ((znr) this.a).a.fR(R.xml.vmt_preferences);
                ((znr) this.a).a.d().ag();
                znr znrVar = (znr) this.a;
                znq znqVar2 = znrVar.a;
                SwitchPreferenceCompat switchPreferenceCompat2 = (SwitchPreferenceCompat) znqVar2.a(znqVar2.S(R.string.vmt_enabled_pref_key));
                if (switchPreferenceCompat2 != null) {
                    Object obj3 = this.a;
                    switchPreferenceCompat2.G(false);
                    switchPreferenceCompat2.N(false);
                    switchPreferenceCompat2.n = new akvd(((znr) obj3).d, "VmtSettingsFragmentPeer:toggleVmtEnabled", new zkp(ibyVar3, 8));
                    switchPreferenceCompat2.L(ibyVar3.a());
                    switchPreferenceCompat = switchPreferenceCompat2;
                }
                znrVar.f = switchPreferenceCompat;
                return arnb.a;
            case 16:
                long j = ((cjn) obj).a;
                ((aehz) this.a).j.a();
                return false;
            case 17:
                zsi zsiVar = (zsi) obj;
                zsiVar.getClass();
                SmartSuggestionItemSuggestionData smartSuggestionItemSuggestionData = (SmartSuggestionItemSuggestionData) this.a;
                smartSuggestionItemSuggestionData.i();
                smartSuggestionItemSuggestionData.t();
                zsiVar.a();
                return arnb.a;
            case 18:
                akms akmsVar = (akms) obj;
                akmsVar.getClass();
                Object obj4 = this.a;
                obj4.getClass();
                akmsVar.v(new aagj((ImageView) obj4));
                return arnb.a;
            case 19:
                aagp aagpVar = (aagp) obj;
                aagpVar.getClass();
                aagpVar.e();
                Object obj5 = this.a;
                if ((obj5 instanceof SmartSuggestionItemSuggestionData) && ((SmartSuggestionItemSuggestionData) obj5).s() == aqbc.STARRING) {
                    aagpVar.f();
                }
                return arnb.a;
            default:
                duk.a((dho) obj, (duj) this.a);
                return arnb.a;
        }
    }
}
