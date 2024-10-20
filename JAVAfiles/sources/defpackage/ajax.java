package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.LocaleList;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.apps.messaging.R;
import com.google.android.material.card.MaterialCardView;
import java.text.NumberFormat;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ajax extends LinearLayout {
    public static final /* synthetic */ int b = 0;
    private static final alog c = alog.v(Integer.valueOf(R.drawable.very_dissatisfied), Integer.valueOf(R.drawable.dissatisfied), Integer.valueOf(R.drawable.neutral), Integer.valueOf(R.drawable.satisfied), Integer.valueOf(R.drawable.very_satisfied));
    public ajaw a;
    private aprq d;

    public ajax(Context context) {
        super(context);
        setOrientation(1);
        LayoutInflater.from(context).inflate(R.layout.survey_question_rating_container, (ViewGroup) this, true);
    }

    public static void b(ViewGroup viewGroup) {
        for (int i = 0; i < viewGroup.getChildCount(); i++) {
            viewGroup.getChildAt(i).setOnClickListener(null);
            viewGroup.getChildAt(i).setClickable(false);
        }
    }

    public static void c(ViewGroup viewGroup, int i, Drawable drawable, Drawable drawable2) {
        Drawable drawable3;
        for (int i2 = 0; i2 < viewGroup.getChildCount(); i2++) {
            ImageView imageView = (ImageView) viewGroup.getChildAt(i2).findViewById(R.id.survey_rating_image_icon);
            if (i2 >= i) {
                drawable3 = drawable;
            } else {
                drawable3 = drawable2;
            }
            imageView.setImageDrawable(drawable3);
        }
    }

    public static boolean e(MotionEvent motionEvent, View view) {
        if (motionEvent.getX() >= brg.a && motionEvent.getX() < view.getWidth() && motionEvent.getY() >= brg.a && motionEvent.getY() < view.getHeight()) {
            return true;
        }
        return false;
    }

    private final Drawable f(int i, int i2) {
        return ahnz.N(getContext().getDrawable(i), getContext(), i2);
    }

    private static void g(TextView textView, String str) {
        textView.setText(str);
        textView.setContentDescription(str);
    }

    private final void h(View view, int i, int i2, int i3) {
        LocaleList locales;
        Locale locale;
        String string;
        locales = getContext().getResources().getConfiguration().getLocales();
        locale = locales.get(0);
        NumberFormat numberFormat = NumberFormat.getInstance(locale);
        String format = numberFormat.format(i);
        String format2 = numberFormat.format(i2);
        String string2 = getContext().getString(R.string.survey_num_rating, format, format2);
        if (i3 == 4) {
            string2 = getResources().getQuantityString(R.plurals.survey_star_rating, i, Integer.valueOf(i), Integer.valueOf(i2));
            i3 = 4;
        }
        if (i == 1) {
            string2 = string2 + " " + this.d.e;
        } else if (i == i2) {
            string2 = string2 + " " + this.d.f;
        }
        if (i3 == 3) {
            Context context = getContext();
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            if (i != 5) {
                                string = "";
                            } else {
                                string = getContext().getString(R.string.survey_very_satisfied);
                            }
                        } else {
                            string = getContext().getString(R.string.survey_somewhat_satisfied);
                        }
                    } else {
                        string = getContext().getString(R.string.survey_neutral);
                    }
                } else {
                    string = getContext().getString(R.string.survey_somewhat_dissatisfied);
                }
            } else {
                string = getContext().getString(R.string.survey_very_dissatisfied);
            }
            string2 = context.getString(R.string.survey_smiley_rating, format, format2, string);
        }
        view.setContentDescription(string2);
    }

    public final int a(int i) {
        return getContext().getColor(i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void d(aprq aprqVar) {
        this.d = aprqVar;
        int i = aprqVar.c;
        int i2 = 2;
        if (i >= 2 && i <= 7) {
            int T = a.T(aprqVar.b);
            int i3 = 6;
            if (T == 0 || T != 6) {
                g((TextView) findViewById(R.id.survey_rating_low_value_text), aprqVar.e);
                g((TextView) findViewById(R.id.survey_rating_high_value_text), aprqVar.f);
            }
            int i4 = aprqVar.b;
            int T2 = a.T(i4);
            int i5 = R.id.survey_rating_image_icon;
            int i6 = R.id.survey_rating_image_layout;
            int i7 = R.layout.survey_question_rating_image_item;
            int i8 = -2;
            int i9 = R.color.survey_grey_icon_color;
            int i10 = 5;
            int i11 = 0;
            if (T2 != 0 && T2 == 3) {
                ViewGroup viewGroup = (ViewGroup) findViewById(R.id.survey_rating_images_container);
                LayoutInflater from = LayoutInflater.from(getContext());
                int i12 = ((alsx) c).c;
                int i13 = 0;
                while (i13 < i12) {
                    View inflate = from.inflate(i7, viewGroup, false);
                    if (i13 == 0) {
                        inflate.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
                        i13 = 0;
                    }
                    FrameLayout frameLayout = (FrameLayout) inflate.findViewById(i6);
                    ImageView imageView = (ImageView) frameLayout.findViewById(i5);
                    imageView.setImageDrawable(ahnz.N(getContext().getDrawable(((Integer) c.get(i13)).intValue()), getContext(), a(i9)));
                    i13++;
                    imageView.setTag(Integer.valueOf(i13));
                    h(imageView, i13, i12, 3);
                    frameLayout.setOnTouchListener(new aizz(this, frameLayout, imageView, i2));
                    frameLayout.setOnClickListener(new aarn(this, viewGroup, i13, i10));
                    viewGroup.addView(inflate);
                    i5 = R.id.survey_rating_image_icon;
                    i6 = R.id.survey_rating_image_layout;
                    i7 = R.layout.survey_question_rating_image_item;
                    i9 = R.color.survey_grey_icon_color;
                }
                return;
            }
            int T3 = a.T(i4);
            int i14 = 4;
            if (T3 != 0 && T3 == 5) {
                ViewGroup viewGroup2 = (ViewGroup) findViewById(R.id.survey_rating_images_container);
                LayoutInflater from2 = LayoutInflater.from(getContext());
                int i15 = this.d.c;
                int i16 = 0;
                while (i16 < i15) {
                    View inflate2 = from2.inflate(R.layout.survey_question_rating_number_item, viewGroup2, false);
                    if (i16 == 0) {
                        inflate2.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
                        i16 = 0;
                    }
                    final FrameLayout frameLayout2 = (FrameLayout) inflate2.findViewById(R.id.survey_rating_number_layout);
                    int dimensionPixelOffset = getResources().getDimensionPixelOffset(R.dimen.survey_rating_number_large_button_horizontal_padding);
                    viewGroup2.setPadding(dimensionPixelOffset, 0, dimensionPixelOffset, 0);
                    final MaterialCardView materialCardView = (MaterialCardView) frameLayout2.findViewById(R.id.survey_rating_number_card);
                    int dimension = (int) getResources().getDimension(R.dimen.survey_rating_number_large_side_length);
                    ViewGroup.LayoutParams layoutParams = materialCardView.getLayoutParams();
                    layoutParams.width = dimension;
                    layoutParams.height = dimension;
                    materialCardView.setLayoutParams(layoutParams);
                    final TextView textView = (TextView) materialCardView.findViewById(R.id.survey_rating_number_text);
                    i16++;
                    textView.setTag(Integer.valueOf(i16));
                    textView.setText(String.valueOf(i16));
                    h(textView, i16, i15, 5);
                    frameLayout2.setOnTouchListener(new View.OnTouchListener() { // from class: ajau
                        @Override // android.view.View.OnTouchListener
                        public final boolean onTouch(View view, MotionEvent motionEvent) {
                            FrameLayout frameLayout3 = frameLayout2;
                            ajax ajaxVar = ajax.this;
                            MaterialCardView materialCardView2 = materialCardView;
                            TextView textView2 = textView;
                            int action = motionEvent.getAction();
                            if (action != 0) {
                                if (action != 1) {
                                    if (action != 2) {
                                        return false;
                                    }
                                    if (ajax.e(motionEvent, view)) {
                                        return true;
                                    }
                                    frameLayout3.setPressed(false);
                                    materialCardView2.p(ajaxVar.a(R.color.google_transparent));
                                    textView2.setTextColor(ajaxVar.a(R.color.survey_primary_text_color));
                                    return true;
                                }
                                if (!frameLayout3.isPressed()) {
                                    return true;
                                }
                                frameLayout3.performClick();
                                return true;
                            }
                            if (!ajax.e(motionEvent, view)) {
                                return true;
                            }
                            frameLayout3.setPressed(true);
                            materialCardView2.p(ajaxVar.a(R.color.survey_accent_color));
                            textView2.setTextColor(ajaxVar.a(R.color.survey_surface_color_elevation_2));
                            return true;
                        }
                    });
                    frameLayout2.setOnClickListener(new aarn(this, viewGroup2, i16, i14));
                    viewGroup2.addView(inflate2);
                }
                return;
            }
            int T4 = a.T(i4);
            if (T4 != 0 && T4 == 4) {
                int a = a(R.color.survey_accent_color);
                final Drawable f = f(R.drawable.quantum_ic_star_border_grey600_36, a(R.color.survey_grey_icon_color));
                final Drawable f2 = f(R.drawable.quantum_ic_star_grey600_36, a);
                final ViewGroup viewGroup3 = (ViewGroup) findViewById(R.id.survey_rating_images_container);
                LayoutInflater from3 = LayoutInflater.from(getContext());
                int i17 = this.d.c;
                final int i18 = 0;
                while (i18 < i17) {
                    View inflate3 = from3.inflate(R.layout.survey_question_rating_image_item, viewGroup3, false);
                    if (i18 == 0) {
                        inflate3.setLayoutParams(new LinearLayout.LayoutParams(i8, i8));
                        i18 = 0;
                    }
                    final FrameLayout frameLayout3 = (FrameLayout) inflate3.findViewById(R.id.survey_rating_image_layout);
                    int dimensionPixelOffset2 = getResources().getDimensionPixelOffset(R.dimen.survey_rating_image_large_button_horizontal_padding);
                    viewGroup3.setPadding(dimensionPixelOffset2, 0, dimensionPixelOffset2, 0);
                    ImageView imageView2 = (ImageView) frameLayout3.findViewById(R.id.survey_rating_image_icon);
                    imageView2.setImageDrawable(f);
                    i18++;
                    imageView2.setTag(Integer.valueOf(i18));
                    h(imageView2, i18, i17, 4);
                    frameLayout3.setOnTouchListener(new View.OnTouchListener() { // from class: ajav
                        @Override // android.view.View.OnTouchListener
                        public final boolean onTouch(View view, MotionEvent motionEvent) {
                            int i19 = ajax.b;
                            ViewGroup viewGroup4 = viewGroup3;
                            FrameLayout frameLayout4 = frameLayout3;
                            int i20 = i18;
                            Drawable drawable = f;
                            int action = motionEvent.getAction();
                            Drawable drawable2 = f2;
                            if (action != 0) {
                                if (action != 1) {
                                    if (action != 2) {
                                        return false;
                                    }
                                    if (ajax.e(motionEvent, view)) {
                                        return true;
                                    }
                                    frameLayout4.setPressed(false);
                                    ajax.c(viewGroup4, 0, drawable, drawable2);
                                    return true;
                                }
                                if (!frameLayout4.isPressed()) {
                                    return true;
                                }
                                frameLayout4.performClick();
                                ajax.c(viewGroup4, i20, drawable, drawable2);
                                return true;
                            }
                            if (!ajax.e(motionEvent, view)) {
                                return true;
                            }
                            frameLayout4.setPressed(true);
                            ajax.c(viewGroup4, i20, drawable, drawable2);
                            return true;
                        }
                    });
                    frameLayout3.setOnClickListener(new aarn(this, viewGroup3, i18, i3));
                    viewGroup3.addView(inflate3);
                    i8 = -2;
                }
                return;
            }
            int T5 = a.T(i4);
            if (T5 != 0 && T5 == 6) {
                int a2 = a(R.color.survey_grey_icon_color);
                Drawable f3 = f(R.drawable.quantum_ic_thumb_up_grey600_36, a2);
                Drawable f4 = f(R.drawable.quantum_ic_thumb_down_grey600_36, a2);
                LinearLayout linearLayout = (LinearLayout) findViewById(R.id.survey_rating_images_container);
                linearLayout.setGravity(17);
                View inflate4 = LayoutInflater.from(getContext()).inflate(R.layout.survey_question_rating_thumb_item, (ViewGroup) linearLayout, false);
                ImageView imageView3 = (ImageView) inflate4.findViewById(R.id.survey_rating_thumb_up_icon);
                imageView3.setImageDrawable(f3);
                imageView3.setOnClickListener(new ajat(this, linearLayout, i11));
                ImageView imageView4 = (ImageView) inflate4.findViewById(R.id.survey_rating_thumb_down_icon);
                imageView4.setImageDrawable(f4);
                imageView4.setOnClickListener(new ajat(this, linearLayout, i2));
                linearLayout.addView(inflate4);
                return;
            }
            return;
        }
        throw new IllegalArgumentException("Number of ratings must be between 2 and 7.");
    }
}
