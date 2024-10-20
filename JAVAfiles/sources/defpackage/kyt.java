package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.shared.datamodel.data.MessageData;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import j$.util.Collection;
import j$.util.Objects;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class kyt implements kzy {
    public TextView a;
    private final rtp b;
    private final Context c;
    private final armf d;
    private final armf e;
    private final armf f;
    private final armf g;
    private final armf h;
    private final armf i;
    private boolean j = false;
    private final wfh k;

    public kyt(Context context, rtp rtpVar, wfh wfhVar, armf armfVar, armf armfVar2, armf armfVar3, armf armfVar4, armf armfVar5, armf armfVar6) {
        this.c = context;
        this.b = rtpVar;
        this.k = wfhVar;
        this.d = armfVar;
        this.e = armfVar2;
        this.f = armfVar3;
        this.g = armfVar4;
        this.h = armfVar5;
        this.i = armfVar6;
    }

    private static void f(kzw kzwVar, String str, String str2, String str3) {
        kzwVar.h = str;
        kzwVar.M = str2;
        kzwVar.L = str3;
    }

    @Override // defpackage.kzy
    public final void b(kzx kzxVar, boolean z) {
        alpt alptVar;
        String quantityString;
        int i;
        ryi ryiVar;
        String str;
        int i2 = 2;
        if (((ohf) this.h.b()).a() && (str = kzxVar.ab) != null) {
            this.a.setText(str);
            TextView textView = this.a;
            textView.setTypeface(textView.getTypeface(), 2);
        } else {
            Typeface typeface = kzxVar.t;
            if ((!ofn.a() || kzxVar.a.ac != mmy.c) && (alptVar = kzxVar.Z) != null && !alptVar.isEmpty()) {
                TextView textView2 = this.a;
                if (kzxVar.a.w == 1) {
                    quantityString = this.c.getString(R.string.one_to_one_typing_indicator);
                } else {
                    alpt alptVar2 = kzxVar.Z;
                    alptVar2.getClass();
                    if (alptVar2.size() == 1) {
                        quantityString = this.c.getString(R.string.single_typing_indicators_in_group, ((iew) this.f.b()).n((ParticipantsTable.BindData) Collection.EL.stream(alptVar2).findFirst().get(), false));
                    } else {
                        quantityString = this.c.getResources().getQuantityString(R.plurals.multiple_typing_indicators_in_groups, alptVar2.size(), Integer.valueOf(alptVar2.size()));
                    }
                }
                textView2.setText(quantityString);
                TextView textView3 = this.a;
                typeface.getClass();
                if (true == typeface.isBold()) {
                    i2 = 3;
                }
                textView3.setTypeface(typeface, i2);
            } else {
                this.a.setText(kzxVar.i);
                this.a.setTypeface(typeface, kzxVar.g);
            }
        }
        this.a.setMaxLines(kzxVar.h);
        TextView textView4 = this.a;
        if (true != kzxVar.o) {
            i = R.attr.colorOnSurface;
        } else {
            i = R.attr.colorOnSurfaceVariant;
        }
        textView4.setTextColor(ahnz.d(textView4, i));
        if (kzxVar.H && !this.j) {
            this.j = true;
            Resources resources = this.c.getResources();
            TextView textView5 = this.a;
            textView5.setPadding(textView5.getPaddingLeft(), this.a.getPaddingTop(), this.a.getPaddingRight() + resources.getDimensionPixelSize(R.dimen.snippet_rtl_right_padding), this.a.getPaddingBottom());
            this.a.setShadowLayer(ean.a(resources, R.dimen.snippet_rtl_shadow_radius), brg.a, brg.a, this.c.getColor(R.color.snippet_rtl_shadow_color));
        }
        if (((oju) this.i.b()).a() && kzxVar.aa != null && this.a.getParent() != null && this.a.getParent().getParent() != null) {
            View view = (View) this.a.getParent().getParent();
            Boolean bool = kzxVar.aa;
            bool.getClass();
            view.setActivated(bool.booleanValue());
        }
        if (wtj.a().booleanValue() && yhx.i && (ryiVar = kzxVar.I) != null) {
            ryiVar.b().ifPresent(new ktm(this, 17));
        }
    }

    @Override // defpackage.kzy
    public final void c(View view) {
        this.a = (TextView) view.findViewById(R.id.conversation_snippet);
    }

    @Override // defpackage.kzy
    public final boolean d(kzx kzxVar, kzx kzxVar2) {
        boolean z;
        boolean z2;
        Boolean bool;
        if (TextUtils.equals(kzxVar2.i, kzxVar.i) && Objects.equals(kzxVar2.t, kzxVar.t) && kzxVar2.g == kzxVar.g && Objects.equals(kzxVar2.Z, kzxVar.Z)) {
            if ((!((ohf) this.h.b()).a() || Objects.equals(kzxVar2.ab, kzxVar.ab)) && (!((oju) this.i.b()).a() || (Objects.equals(kzxVar2.aa, kzxVar.aa) && ((bool = kzxVar2.aa) == null || !bool.booleanValue())))) {
                if (wtj.a().booleanValue() && yhx.i) {
                    ryi ryiVar = kzxVar.I;
                    if (ryiVar != null && ryiVar.b().isPresent() && ((aqby) ryiVar.b().get()).b == 2) {
                        z = true;
                    } else {
                        z = false;
                    }
                    ryi ryiVar2 = kzxVar2.I;
                    if (ryiVar2 != null && ryiVar2.b().isPresent() && ((aqby) ryiVar2.b().get()).b == 2) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (z != z2) {
                    }
                }
                return false;
            }
        }
        return true;
    }

    @Override // defpackage.kzy
    public final void e(kzw kzwVar, kzd kzdVar) {
        String str;
        String str2;
        int i;
        int i2;
        boolean z;
        Typeface d;
        String string;
        boolean z2;
        boolean z3;
        boolean z4 = kzdVar.G;
        Resources resources = this.c.getResources();
        if (z4) {
            str = kzdVar.g;
        } else if (kzdVar.M == 210) {
            str = resources.getString(R.string.conversation_list_snippet_link);
        } else {
            str = kzdVar.K;
        }
        if (kzdVar.G) {
            str2 = kzdVar.e;
        } else {
            str2 = kzdVar.A;
        }
        boolean K = lga.K(kzdVar);
        if (true != kzdVar.G) {
            i = 0;
        } else {
            i = 2;
        }
        kzwVar.i(i);
        if (true != K) {
            i2 = 3;
        } else {
            i2 = 1;
        }
        kzwVar.g = i2;
        kzwVar.S |= 2;
        if (kzdVar.G && this.k.A()) {
            z = true;
        } else {
            z = false;
        }
        kzwVar.A = z;
        kzwVar.S |= 8192;
        if (K) {
            d = xvw.e(this.c);
        } else {
            d = xvw.d(this.c);
        }
        kzwVar.p = d;
        int i3 = kzdVar.M;
        boolean G = lga.G(kzdVar);
        rtp rtpVar = this.b;
        String str3 = kzdVar.i;
        String str4 = kzdVar.j;
        String str5 = kzdVar.d;
        int i4 = kzdVar.c;
        String a = rtpVar.a(str3, str4, str5);
        alpt alptVar = ujx.a;
        if (ofn.a() && kzdVar.ac.equals(mmy.c)) {
            String string2 = resources.getString(R.string.ask_parent_for_approval_snippet);
            f(kzwVar, string2, string2, "");
            kzwVar.i(2);
            kzwVar.p = xvw.e(this.c);
            return;
        }
        boolean z5 = d.z(i3);
        boolean c = tvu.c(i4);
        if (!TextUtils.isEmpty(str)) {
            String x = wfh.x(str);
            if (((trz) this.e.b()).n() && MessageData.bY(i3)) {
                String string3 = resources.getString(((iew) this.d.b()).j());
                f(kzwVar, string3, string3, "");
                return;
            }
            if (G) {
                if (c && a != null && !z5) {
                    f(kzwVar, resources.getString(R.string.snippet, a, x), x, resources.getString(R.string.conversation_list_item_view_sent_from_other_prefix, a));
                    return;
                }
                z3 = true;
            } else {
                z3 = false;
            }
            if ((i3 != 0 && !z3) || kzdVar.G) {
                f(kzwVar, resources.getString(R.string.snippet_from_you, x), x, resources.getString(R.string.conversation_list_item_view_sent_from_you_prefix));
                return;
            } else {
                f(kzwVar, x, x, "");
                return;
            }
        }
        if (kzdVar.R == 4) {
            String string4 = resources.getString(R.string.lighter_empty_snippet_v3, kzdVar.q);
            f(kzwVar, string4, string4, "");
            return;
        }
        if (str2 != null) {
            if (!TextUtils.isEmpty(null)) {
                nht.VMT_STATUS_COMPLETE.getClass();
            }
            String str6 = kzdVar.b;
            if (str6 != null) {
                str2 = str6;
            }
            if (kzdVar.G) {
                str2 = kzdVar.e;
            }
            String string5 = resources.getString(yyb.v(str2));
            if (G) {
                if (c && a != null && !z5) {
                    f(kzwVar, resources.getString(R.string.snippet, a, string5), string5, resources.getString(R.string.conversation_list_item_view_sent_from_other_prefix, a));
                    return;
                }
                z2 = true;
            } else {
                z2 = false;
            }
            if ((i3 != 0 && !z2) || kzdVar.G) {
                f(kzwVar, resources.getString(R.string.snippet_from_you, string5), string5, resources.getString(R.string.conversation_list_item_view_sent_from_you_prefix));
                return;
            } else {
                f(kzwVar, string5, string5, "");
                return;
            }
        }
        if (TextUtils.isEmpty(str)) {
            kzwVar.i(2);
            if (rtp.e(kzdVar.M)) {
                string = this.c.getString(R.string.mms_pending_download_default_snippet);
            } else {
                string = this.c.getString(R.string.no_message_preview_default_snippet);
            }
            f(kzwVar, string, string, "");
        }
    }

    @Override // defpackage.kzy
    public final /* synthetic */ kzx a(kzx kzxVar) {
        return kzxVar;
    }
}
