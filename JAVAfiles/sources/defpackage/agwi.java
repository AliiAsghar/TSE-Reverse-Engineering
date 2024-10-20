package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.google.android.apps.messaging.R;
import com.google.android.libraries.inputmethod.emoji.view.EmojiView;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class agwi extends FrameLayout {
    private static final alvi l = alvi.m("com/google/android/libraries/inputmethod/emoji/picker/EmojiPickerPopupView");
    private static final anbm m = anbm.c(R.style.EmojiSkintoneSelectorLight, R.style.EmojiSkintoneSelectorMediumLight, R.style.EmojiSkintoneSelectorMedium, R.style.EmojiSkintoneSelectorMediumDark, R.style.EmojiSkintoneSelectorDark);
    private static final alor n;
    private static final alpt o;
    private static final int[][] p;
    private static final anbm q;
    private static final String[][] r;
    public final AtomicReference a;
    public FrameLayout b;
    public LinearLayout c;
    public LinearLayout d;
    public int e;
    public int f;
    public int g;
    public int h;
    public int i;
    public boolean j;
    public int k;
    private final agxv s;
    private View.OnClickListener t;
    private alog u;
    private int v;
    private final String w;

    static {
        alok alokVar = new alok();
        alokVar.h("🤝", anbm.b(R.drawable.handshake_skintone_shadow, R.drawable.handshake_shadow_skintone));
        alokVar.h("👭", anbm.b(R.drawable.holding_women_skintone_shadow, R.drawable.holding_women_shadow_skintone));
        alokVar.h("👫", anbm.b(R.drawable.holding_woman_man_skintone_shadow, R.drawable.holding_woman_man_shadow_skintone));
        alokVar.h("👬", anbm.b(R.drawable.holding_men_skintone_shadow, R.drawable.holding_men_shadow_skintone));
        alokVar.h("🧑\u200d🤝\u200d🧑", anbm.b(R.drawable.holding_people_skintone_shadow, R.drawable.holding_people_shadow_skintone));
        alokVar.h("💏", anbm.b(R.drawable.kiss_people_skintone_shadow, R.drawable.kiss_people_shadow_skintone));
        alokVar.h("👩\u200d❤️\u200d💋\u200d👨", anbm.b(R.drawable.kiss_woman_man_skintone_shadow, R.drawable.kiss_woman_man_shadow_skintone));
        alokVar.h("👨\u200d❤️\u200d💋\u200d👨", anbm.b(R.drawable.kiss_men_skintone_shadow, R.drawable.kiss_men_shadow_skintone));
        alokVar.h("👩\u200d❤️\u200d💋\u200d👩", anbm.b(R.drawable.kiss_women_skintone_shadow, R.drawable.kiss_women_shadow_skintone));
        alokVar.h("💑", anbm.b(R.drawable.couple_heart_people_skintone_shadow, R.drawable.couple_heart_people_shadow_skintone));
        alokVar.h("👩\u200d❤️\u200d👨", anbm.b(R.drawable.couple_heart_woman_man_skintone_shadow, R.drawable.couple_heart_woman_man_shadow_skintone));
        alokVar.h("👨\u200d❤️\u200d👨", anbm.b(R.drawable.couple_heart_men_skintone_shadow, R.drawable.couple_heart_men_shadow_skintone));
        alokVar.h("👩\u200d❤️\u200d👩", anbm.b(R.drawable.couple_heart_women_skintone_shadow, R.drawable.couple_heart_women_shadow_skintone));
        n = alokVar.b();
        o = new altx("👪");
        p = new int[][]{new int[]{0, 2, 3, 4, 5, 6}, new int[]{0, 7, 8, 9, 10, 11}, new int[]{0, 12, 13, 14, 15, 16}, new int[]{0, 17, 18, 19, 20, 21}, new int[]{1, 22, 23, 24, 25, 26}};
        q = anbm.c(R.string.emoji_skin_tone_light_content_desc, R.string.emoji_skin_tone_medium_light_content_desc, R.string.emoji_skin_tone_medium_content_desc, R.string.emoji_skin_tone_medium_dark_content_desc, R.string.emoji_skin_tone_dark_content_desc);
        r = new String[][]{new String[]{"light_shadow", "medium_light_shadow", "medium_shadow", "medium_dark_shadow", "dark_shadow"}, new String[]{"shadow_light", "shadow_medium_light", "shadow_medium", "shadow_medium_dark", "shadow_dark"}};
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x019d, code lost:
    
        if (r18.i == r1) goto L62;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:11:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0249 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x00ad  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public agwi(android.content.Context r19, defpackage.alog r20, android.view.View.OnClickListener r21, int r22, int r23, float r24, defpackage.agxv r25) {
        /*
            Method dump skipped, instructions count: 673
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.agwi.<init>(android.content.Context, alog, android.view.View$OnClickListener, int, int, float, agxv):void");
    }

    private static int d(boolean z, int i, int i2) {
        if (i2 != -1) {
            if (z) {
                if (i == 0) {
                    return q.a(i2);
                }
                return R.string.emoji_skin_tone_shadow_content_desc;
            }
            if (i != 0) {
                return q.a(i2);
            }
            return R.string.emoji_skin_tone_shadow_content_desc;
        }
        return R.string.emoji_skin_tone_shadow_content_desc;
    }

    private final Drawable e(Context context, int i, int i2) {
        anbm anbmVar = (anbm) n.get(this.u.get(0));
        if (anbmVar != null) {
            ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, m.a(i2));
            Resources resources = getResources();
            int a = anbmVar.a(i);
            Resources.Theme theme = contextThemeWrapper.getTheme();
            WeakHashMap weakHashMap = ean.a;
            return resources.getDrawable(a, theme);
        }
        return null;
    }

    private static String f(Context context, int i, int i2) {
        return context.getString(R.string.emoji_variant_content_desc_template, context.getString(d(true, i, i2)), context.getString(d(false, i, i2)));
    }

    private final void g(View view) {
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) view.getLayoutParams();
        layoutParams.width = (this.v * this.e) / 2;
        layoutParams.height = this.g;
        view.setLayoutParams(layoutParams);
    }

    private final void h(View view) {
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) view.getLayoutParams();
        layoutParams.width = this.v;
        layoutParams.height = this.g;
        view.setLayoutParams(layoutParams);
    }

    private final void i(EmojiView emojiView, String str) {
        emojiView.setClickable(true);
        agxu a = agxv.a();
        a.d(str);
        agxv agxvVar = this.s;
        a.b(agxvVar.d);
        a.g(agxvVar.c);
        a.c(agxvVar.e);
        int i = alog.d;
        a.h(alsx.a);
        a.e(true);
        agxu agxuVar = new agxu(a.a());
        agxuVar.f(false);
        emojiView.c(agxuVar.a());
        emojiView.setOnClickListener(this.t);
        if (this.a.get() == null) {
            ((alvg) ((alvg) l.d()).h("com/google/android/libraries/inputmethod/emoji/picker/EmojiPickerPopupView", "setupEmojiView", 599, "EmojiPickerPopupView.java")).t("The first EmojiView is: %s", emojiView);
            this.a.set(emojiView);
        }
    }

    private final void j(Context context, LinearLayout linearLayout, Drawable drawable, String str, ColorStateList colorStateList) {
        inflate(context, R.layout.emoji_picker_popup_image_view, linearLayout);
        ImageView imageView = (ImageView) linearLayout.getChildAt(1);
        g(imageView);
        int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.emoji_popup_image_view_result_emoji_vertical_padding);
        imageView.setPadding(0, dimensionPixelSize, 0, dimensionPixelSize);
        imageView.setImageDrawable(drawable);
        imageView.setContentDescription(str);
        imageView.setImageTintList(colorStateList);
    }

    private static void k(View view, float f) {
        float paddingStart = view.getPaddingStart();
        float paddingTop = view.getPaddingTop();
        float f2 = paddingTop * f;
        view.setPaddingRelative((int) (paddingStart * f), (int) f2, (int) (view.getPaddingEnd() * f), (int) (view.getPaddingBottom() * f));
    }

    private final boolean l() {
        if (this.h != -1) {
            return true;
        }
        return false;
    }

    private final boolean m() {
        if (this.i != -1) {
            return true;
        }
        return false;
    }

    public final int a() {
        return (this.e * this.v) + this.c.getPaddingStart() + this.c.getPaddingEnd() + this.b.getPaddingStart() + this.b.getPaddingEnd();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void b(int i, int i2, boolean z, LinearLayout linearLayout) {
        int i3;
        inflate(getContext(), R.layout.emoji_picker_popup_view, linearLayout);
        EmojiView emojiView = (EmojiView) linearLayout.getChildAt(i2);
        int i4 = i + i;
        if (z) {
            i3 = this.e;
        } else {
            i4++;
            i3 = this.e;
        }
        int i5 = (i4 * i3) + i2;
        if (i5 >= this.u.size()) {
            emojiView.setVisibility(4);
        } else {
            i(emojiView, (String) this.u.get(i5));
        }
        h(emojiView);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void c(LinearLayout linearLayout) {
        if (linearLayout == null) {
            return;
        }
        int childCount = linearLayout.getChildCount();
        if (childCount <= 0 || childCount > 2) {
            ((alvg) ((alvg) l.h()).h("com/google/android/libraries/inputmethod/emoji/picker/EmojiPickerPopupView", "processResultEmojiForRectangleLayout", 421, "EmojiPickerPopupView.java")).q("processResultEmojiForRectangleLayout(): unexpected emoji result row size");
        }
        if (childCount == 2) {
            linearLayout.removeViewAt(1);
        }
        Context context = getContext();
        if (l() && m()) {
            inflate(context, R.layout.emoji_picker_popup_view, linearLayout);
            EmojiView emojiView = (EmojiView) linearLayout.getChildAt(1);
            g(emojiView);
            i(emojiView, (String) this.u.get((this.h * this.e) + this.i + 1));
            return;
        }
        if (l()) {
            j(context, linearLayout, e(context, 0, this.h), f(context, 0, this.h), null);
        } else {
            if (m()) {
                j(context, linearLayout, e(context, 1, this.i), f(context, 1, this.i), null);
                return;
            }
            Drawable e = e(context, 0, 0);
            int i = this.h;
            j(context, linearLayout, e, f(context, i, i), ColorStateList.valueOf(-7829368));
        }
    }
}
