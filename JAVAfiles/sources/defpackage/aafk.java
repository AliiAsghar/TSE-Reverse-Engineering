package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.LayerDrawable;
import android.net.Uri;
import android.os.Handler;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.compose.ui.platform.ComposeView;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.shared.datamodel.data.suggestions.SmartSuggestionData;
import com.google.android.apps.messaging.shared.datamodel.data.suggestions.SuggestionData;
import com.google.android.apps.messaging.shared.datamodel.data.suggestions.impl.RbmSuggestionData;
import com.google.android.apps.messaging.ui.conversation.suggestions.common.ConversationSuggestionContainerView;
import com.google.android.apps.messaging.ui.conversation.suggestions.common.ConversationSuggestionStickerView;
import j$.util.Optional;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class aafk {
    public static final xze k = xze.g("Bugle", "ConversationSuggestionsController");
    private final ydc a;
    private final ksi b;
    private final mho c;
    private final xnv d;
    private final armf e;
    private final apwt f;
    private final armf g;
    private final armf h;
    private LinearLayout i;
    private final rgp j;
    public zxp l;
    public final Context m;
    public yif n;
    public final List o = new ArrayList();
    public final ykw p;
    public final aksr q;
    public final yyb r;
    private final znp s;

    public aafk(Context context, ydc ydcVar, ksi ksiVar, yyb yybVar, ykw ykwVar, mho mhoVar, xnv xnvVar, armf armfVar, rgp rgpVar, znp znpVar, apwt apwtVar, aksr aksrVar, armf armfVar2, armf armfVar3) {
        this.m = context;
        this.a = ydcVar;
        this.b = ksiVar;
        this.r = yybVar;
        this.p = ykwVar;
        this.c = mhoVar;
        this.d = xnvVar;
        this.e = armfVar;
        this.j = rgpVar;
        this.s = znpVar;
        this.f = apwtVar;
        this.q = aksrVar;
        this.g = armfVar2;
        this.h = armfVar3;
    }

    private static void j(View view, aafw aafwVar) {
        Handler handler = view.getHandler();
        if (handler != null) {
            aafwVar.getClass();
            handler.postDelayed(new aafg(aafwVar, 0), 500L);
        }
    }

    private final void k(ConversationSuggestionContainerView conversationSuggestionContainerView, SuggestionData suggestionData, aafw aafwVar) {
        List list = this.o;
        aahj b = this.s.b(conversationSuggestionContainerView, suggestionData);
        list.add(b);
        e(b, aafwVar);
        if (aafwVar.e()) {
            i(conversationSuggestionContainerView, suggestionData, aafwVar);
        }
        conversationSuggestionContainerView.setVisibility(0);
        conversationSuggestionContainerView.setTag(suggestionData);
        if (ryj.b(suggestionData) == aqbc.ASSISTANT_QUERY) {
            conversationSuggestionContainerView.setTag(R.id.growthkit_view_tag, "ASSISTANT_SUGGESTION");
            this.b.a();
        } else {
            conversationSuggestionContainerView.setTag(R.id.growthkit_view_tag, null);
        }
    }

    public abstract int a();

    protected abstract int b();

    protected abstract int c();

    protected abstract int d();

    /* JADX INFO: Access modifiers changed from: protected */
    public void e(aahj aahjVar, aafw aafwVar) {
        boolean z;
        boolean z2;
        int dimensionPixelSize;
        int i;
        int i2;
        boolean z3;
        int i3;
        int i4;
        ConversationSuggestionContainerView e = aahjVar.e();
        SuggestionData suggestionData = aahjVar.b;
        if ((suggestionData instanceof SmartSuggestionData) && ryj.b(suggestionData) == aqbc.EMOTION) {
            SmartSuggestionData smartSuggestionData = (SmartSuggestionData) suggestionData;
            e.a.setVisibility(8);
            if (TextUtils.isEmpty(smartSuggestionData.n())) {
                e.b.setVisibility(8);
            } else {
                e.b(e.getResources().getDimensionPixelSize(R.dimen.sticker_container_margin_top));
                e.b.setVisibility(0);
                ConversationSuggestionStickerView conversationSuggestionStickerView = e.b;
                Uri parse = Uri.parse(smartSuggestionData.n());
                if (conversationSuggestionStickerView.e == null) {
                    conversationSuggestionStickerView.e = aktp.x(conversationSuggestionStickerView.b).c().b(hxc.e()).f(new aaws(conversationSuggestionStickerView, 1)).o(huz.b());
                }
                conversationSuggestionStickerView.e.h(parse).t(conversationSuggestionStickerView.c);
                if (xyp.d()) {
                    if (((Boolean) yig.q.e()).booleanValue()) {
                        ((TextView) conversationSuggestionStickerView.d.b()).setText(smartSuggestionData.l());
                    } else {
                        conversationSuggestionStickerView.d.g(8);
                    }
                }
            }
        } else {
            e.b(0);
            e.b.setVisibility(8);
            e.a.setVisibility(0);
            TextView d = aahjVar.d(c());
            d.setText(aahjVar.c());
            m(aahjVar);
            int g = g(aafwVar);
            int f = f(aafwVar);
            d.setTextColor(g);
            int b = b();
            ImageView imageView = aahjVar.c;
            if (imageView == null) {
                aahjVar.c = (ImageView) aahjVar.a.findViewById(b);
                imageView = aahjVar.c;
            }
            SuggestionData suggestionData2 = aahjVar.b;
            Optional a = aahjVar.a(f);
            aqbc b2 = ryj.b(suggestionData2);
            if (b2 == aqbc.CONTACT) {
                z = true;
            } else {
                z = false;
            }
            if (z && (suggestionData2 instanceof SmartSuggestionData) && !TextUtils.isEmpty(((SmartSuggestionData) suggestionData2).k())) {
                z2 = true;
            } else {
                z2 = false;
            }
            Resources resources = this.m.getResources();
            LinearLayout linearLayout = (LinearLayout) imageView.getParent();
            if (z) {
                if (true != z2) {
                    i4 = R.dimen.conversation_suggestion_view_contact_share_bubble_container_start_padding;
                } else {
                    i4 = R.dimen.conversation_suggestion_contact_share_bubble_container_start_padding;
                }
                dimensionPixelSize = resources.getDimensionPixelSize(i4);
                i = resources.getDimensionPixelSize(R.dimen.conversation_suggestion_contact_share_bubble_container_end_padding);
            } else {
                dimensionPixelSize = resources.getDimensionPixelSize(a());
                i = dimensionPixelSize;
            }
            linearLayout.setPadding(dimensionPixelSize, linearLayout.getPaddingTop(), i, linearLayout.getPaddingBottom());
            if (a.isEmpty()) {
                imageView.setVisibility(8);
            } else {
                if (z2) {
                    i2 = R.dimen.conversation_suggestion_contact_icon_size;
                    z3 = true;
                } else {
                    i2 = R.dimen.conversation_suggestion_icon_size;
                    z3 = false;
                }
                int dimensionPixelSize2 = resources.getDimensionPixelSize(i2);
                if (true != z3) {
                    i3 = R.dimen.conversation_suggestion_icon_right_margin;
                } else {
                    i3 = R.dimen.conversation_suggestion_view_contact_share_icon_end_margin;
                }
                int dimensionPixelSize3 = resources.getDimensionPixelSize(i3);
                imageView.setAdjustViewBounds(false);
                if (b2 == aqbc.ASSISTANT_QUERY || b2 == aqbc.EMOTION) {
                    imageView.setAdjustViewBounds(true);
                }
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(dimensionPixelSize2, dimensionPixelSize2);
                layoutParams.setMarginEnd(dimensionPixelSize3);
                imageView.setLayoutParams(layoutParams);
                ((hlp) a.get()).v(new aafj(imageView, suggestionData2, imageView));
                imageView.setVisibility(0);
            }
        }
        e.setContentDescription(aahjVar.b());
        if (e.isAccessibilityFocused()) {
            j(e, aafwVar);
        }
    }

    protected abstract int f(aafw aafwVar);

    protected abstract int g(aafw aafwVar);

    /* JADX INFO: Access modifiers changed from: protected */
    public void h(SuggestionData suggestionData, aafw aafwVar, View view) {
        l(suggestionData, aafwVar);
    }

    protected void i(View view, SuggestionData suggestionData, aafw aafwVar) {
        view.setOnClickListener(new akwb(this.q, "ConversationSuggestionsController#onClick", new ivq(this, suggestionData, aafwVar, 10), 1));
    }

    public final void l(SuggestionData suggestionData, aafw aafwVar) {
        if (aafwVar != null) {
            if (suggestionData instanceof SmartSuggestionData) {
                yyb.ar(suggestionData, aqba.CLICKED);
            }
            aafwVar.c(suggestionData);
            if (!suggestionData.e()) {
                this.j.a(aafwVar.b(), this.d.f().toEpochMilli()).t();
                boolean z = suggestionData instanceof RbmSuggestionData;
                this.c.ah(z);
                if (z) {
                    this.c.ai();
                    this.c.aj();
                }
            }
        }
    }

    public final void m(aahj aahjVar) {
        float f;
        GradientDrawable gradientDrawable;
        aqbc b;
        SuggestionData suggestionData = aahjVar.b;
        TextView d = aahjVar.d(c());
        CharSequence text = d.getText();
        float dimensionPixelSize = this.m.getResources().getDimensionPixelSize(R.dimen.conversation_suggestion_text_size);
        if ((suggestionData instanceof SmartSuggestionData) && this.a.e() && ((b = ryj.b(suggestionData)) == aqbc.EMOJI || (b == aqbc.FULL_MESSAGE && text != null && this.a.f(text)))) {
            k.p("Setting emoji suggestion text size");
            if (this.m.getResources().getDimensionPixelSize(R.dimen.conversation_suggestion_emoji_only_text_size) < this.m.getResources().getDimensionPixelSize(R.dimen.conversation_suggestion_bubble_height)) {
                dimensionPixelSize = this.m.getResources().getDimensionPixelSize(R.dimen.conversation_suggestion_emoji_only_text_size);
            }
        }
        if (((Optional) this.f.b()).isPresent()) {
            f = ((zxq) ((Optional) this.f.b()).get()).a();
            float floatValue = ((f - ((Float) zxq.b.e()).floatValue()) / 2.0f) + ((Float) zxq.b.e()).floatValue();
            ViewGroup viewGroup = aahjVar.e().a;
            LayerDrawable layerDrawable = (LayerDrawable) viewGroup.getBackground();
            if (layerDrawable != null && (gradientDrawable = (GradientDrawable) layerDrawable.findDrawableByLayerId(R.id.conversation_suggestion_bubble)) != null) {
                gradientDrawable.setCornerRadius(this.m.getResources().getDimensionPixelSize(R.dimen.conversation_suggestion_bubble_corner_radius_m2) * floatValue);
                viewGroup.setBackground(layerDrawable);
            }
            ViewGroup.LayoutParams layoutParams = viewGroup.getLayoutParams();
            layoutParams.height = (int) (this.m.getResources().getDimensionPixelSize(R.dimen.min_touch_target_size) * floatValue);
            viewGroup.setLayoutParams(layoutParams);
            viewGroup.setMinimumWidth((int) (this.m.getResources().getDimensionPixelOffset(R.dimen.conversation_suggestion_bubble_min_width) * floatValue));
        } else {
            f = 1.0f;
        }
        d.setTextSize(0, dimensionPixelSize * f);
    }

    public final boolean n(LinearLayout linearLayout, List list, aafw aafwVar) {
        ((Optional) this.f.b()).ifPresent(new aacm(this, 20));
        this.l = new zrd(this, 4);
        ((Optional) this.f.b()).ifPresent(new aagi(this, 1));
        this.o.clear();
        this.i = linearLayout;
        if (linearLayout != null) {
            int i = 0;
            while (true) {
                if (i >= linearLayout.getChildCount()) {
                    break;
                }
                if (linearLayout.getChildAt(i).isAccessibilityFocused()) {
                    j(linearLayout, aafwVar);
                    break;
                }
                i++;
            }
        }
        if (adom.o(list)) {
            this.i.setVisibility(8);
            return false;
        }
        this.i.setVisibility(0);
        if (list.get(0) instanceof SmartSuggestionData) {
            aqba aqbaVar = aqba.SHOWN;
            list.getClass();
            aqbaVar.getClass();
            if (((Boolean) ((utz) yig.M.get()).e()).booleanValue() && ((Optional) ((apxx) this.g).a).isPresent()) {
                linearLayout.removeAllViews();
                for (int i2 = 0; i2 < list.size(); i2++) {
                    SuggestionData suggestionData = (SuggestionData) list.get(i2);
                    aeyt a = ((khi) ((Optional) ((apxx) this.g).a).get()).a();
                    if (a != null) {
                        armf armfVar = this.h;
                        aafh aafhVar = new aafh(this, suggestionData, aafwVar, linearLayout, 0);
                        armfVar.getClass();
                        linearLayout.getClass();
                        Context context = linearLayout.getContext();
                        context.getClass();
                        ComposeView composeView = new ComposeView(context, null, 0, 6, null);
                        composeView.a(new cdj(1231917205, true, new keh(armfVar, a, aafhVar, 6)));
                        linearLayout.addView(composeView);
                    }
                }
                return true;
            }
        }
        int childCount = this.i.getChildCount();
        int size = list.size();
        int min = Math.min(childCount, size);
        for (int i3 = 0; i3 < min; i3++) {
            SuggestionData suggestionData2 = (SuggestionData) list.get(i3);
            ConversationSuggestionContainerView conversationSuggestionContainerView = (ConversationSuggestionContainerView) this.i.getChildAt(i3);
            conversationSuggestionContainerView.setHapticFeedbackEnabled(false);
            k(conversationSuggestionContainerView, suggestionData2, aafwVar);
        }
        LayoutInflater from = LayoutInflater.from(this.m);
        while (min < size) {
            SuggestionData suggestionData3 = (SuggestionData) list.get(min);
            ConversationSuggestionContainerView conversationSuggestionContainerView2 = (ConversationSuggestionContainerView) from.inflate(R.layout.conversation_suggestion_container_view, (ViewGroup) linearLayout, false);
            conversationSuggestionContainerView2.a = (ViewGroup) LayoutInflater.from(conversationSuggestionContainerView2.getContext()).inflate(d(), (ViewGroup) conversationSuggestionContainerView2, false);
            conversationSuggestionContainerView2.addView(conversationSuggestionContainerView2.a);
            linearLayout.addView(conversationSuggestionContainerView2);
            k(conversationSuggestionContainerView2, suggestionData3, aafwVar);
            min++;
        }
        while (size < childCount) {
            this.i.getChildAt(size).setVisibility(8);
            size++;
        }
        return true;
    }
}
