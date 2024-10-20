package android.support.v7.view.menu;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.TextView;
import com.google.android.apps.messaging.R;
import defpackage.gc;
import defpackage.ij;
import defpackage.im;
import defpackage.iw;
import defpackage.ktk;

/* compiled from: PG */
/* loaded from: classes.dex */
public class ListMenuItemView extends LinearLayout implements AbsListView.SelectionBoundsAdjuster, iw {
    public im a;
    public ImageView b;
    public boolean c;
    public boolean d;
    public boolean e;
    private ImageView f;
    private RadioButton g;
    private TextView h;
    private CheckBox i;
    private TextView j;
    private ImageView k;
    private LinearLayout l;
    private Drawable m;
    private int n;
    private Context o;
    private Drawable p;
    private LayoutInflater q;

    public ListMenuItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.listMenuViewStyle);
    }

    private final LayoutInflater b() {
        if (this.q == null) {
            this.q = LayoutInflater.from(getContext());
        }
        return this.q;
    }

    private final void c(View view) {
        d(view, -1);
    }

    private final void d(View view, int i) {
        LinearLayout linearLayout = this.l;
        if (linearLayout != null) {
            linearLayout.addView(view, i);
        } else {
            addView(view, i);
        }
    }

    @Override // defpackage.iw
    public final im a() {
        return this.a;
    }

    @Override // android.widget.AbsListView.SelectionBoundsAdjuster
    public final void adjustListItemSelectionBounds(Rect rect) {
        ImageView imageView = this.b;
        if (imageView != null && imageView.getVisibility() == 0) {
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.b.getLayoutParams();
            rect.top += this.b.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
        }
    }

    @Override // defpackage.iw
    public final boolean e() {
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v0, types: [android.support.v7.view.menu.ListMenuItemView, iw, android.view.ViewGroup] */
    /* JADX WARN: Type inference failed for: r4v3, types: [android.widget.CheckBox] */
    /* JADX WARN: Type inference failed for: r4v7, types: [android.widget.CompoundButton] */
    /* JADX WARN: Type inference failed for: r4v9, types: [android.widget.RadioButton] */
    /* JADX WARN: Type inference failed for: r5v4, types: [android.widget.CheckBox] */
    @Override // defpackage.iw
    public final void f(im imVar) {
        int i;
        ?? r4;
        RadioButton radioButton;
        CheckBox checkBox;
        int i2;
        ImageView imageView;
        int i3;
        String sb;
        this.a = imVar;
        int i4 = 0;
        if (true != imVar.isVisible()) {
            i = 8;
        } else {
            i = 0;
        }
        setVisibility(i);
        CharSequence f = imVar.f(this);
        if (f != null) {
            this.h.setText(f);
            if (this.h.getVisibility() != 0) {
                this.h.setVisibility(0);
            }
        } else if (this.h.getVisibility() != 8) {
            this.h.setVisibility(8);
        }
        boolean isCheckable = imVar.isCheckable();
        if (isCheckable || this.g != null || this.i != null) {
            if (this.a.p()) {
                if (this.g == null) {
                    RadioButton radioButton2 = (RadioButton) b().inflate(R.layout.abc_list_menu_item_radio, (ViewGroup) this, false);
                    this.g = radioButton2;
                    c(radioButton2);
                }
                r4 = this.g;
                ?? r5 = this.i;
                radioButton = r5;
                checkBox = r5;
            } else {
                if (this.i == null) {
                    CheckBox checkBox2 = (CheckBox) b().inflate(R.layout.abc_list_menu_item_checkbox, (ViewGroup) this, false);
                    this.i = checkBox2;
                    c(checkBox2);
                }
                r4 = this.i;
                radioButton = this.g;
                checkBox = r4;
            }
            if (isCheckable) {
                r4.setChecked(this.a.isChecked());
                if (r4.getVisibility() != 0) {
                    r4.setVisibility(0);
                }
                if (radioButton != null && radioButton.getVisibility() != 8) {
                    radioButton.setVisibility(8);
                }
            } else {
                if (checkBox != null) {
                    checkBox.setVisibility(8);
                }
                RadioButton radioButton3 = this.g;
                if (radioButton3 != null) {
                    radioButton3.setVisibility(8);
                }
            }
        }
        boolean t = imVar.t();
        imVar.e();
        if (t && this.a.t()) {
            i2 = 0;
        } else {
            i2 = 8;
        }
        if (i2 == 0) {
            TextView textView = this.j;
            im imVar2 = this.a;
            char e = imVar2.e();
            if (e == 0) {
                sb = "";
            } else {
                Resources resources = imVar2.j.a.getResources();
                StringBuilder sb2 = new StringBuilder();
                if (ViewConfiguration.get(imVar2.j.a).hasPermanentMenuKey()) {
                    sb2.append(resources.getString(R.string.abc_prepend_shortcut_label));
                }
                if (imVar2.j.x()) {
                    i3 = imVar2.i;
                } else {
                    i3 = imVar2.g;
                }
                im.g(sb2, i3, 65536, resources.getString(R.string.abc_menu_meta_shortcut_label));
                im.g(sb2, i3, 4096, resources.getString(R.string.abc_menu_ctrl_shortcut_label));
                im.g(sb2, i3, 2, resources.getString(R.string.abc_menu_alt_shortcut_label));
                im.g(sb2, i3, 1, resources.getString(R.string.abc_menu_shift_shortcut_label));
                im.g(sb2, i3, 4, resources.getString(R.string.abc_menu_sym_shortcut_label));
                im.g(sb2, i3, 8, resources.getString(R.string.abc_menu_function_shortcut_label));
                if (e != '\b') {
                    if (e != '\n') {
                        if (e != ' ') {
                            sb2.append(e);
                        } else {
                            sb2.append(resources.getString(R.string.abc_menu_space_shortcut_label));
                        }
                    } else {
                        sb2.append(resources.getString(R.string.abc_menu_enter_shortcut_label));
                    }
                } else {
                    sb2.append(resources.getString(R.string.abc_menu_delete_shortcut_label));
                }
                sb = sb2.toString();
            }
            textView.setText(sb);
        }
        if (this.j.getVisibility() != i2) {
            this.j.setVisibility(i2);
        }
        Drawable icon = imVar.getIcon();
        ij ijVar = this.a.j;
        boolean z = this.e;
        if ((z || this.c) && ((imageView = this.f) != null || icon != null || this.c)) {
            if (imageView == null) {
                ImageView imageView2 = (ImageView) b().inflate(R.layout.abc_list_menu_item_icon, (ViewGroup) this, false);
                this.f = imageView2;
                d(imageView2, 0);
            }
            if (icon == null && !this.c) {
                this.f.setVisibility(8);
            } else {
                ImageView imageView3 = this.f;
                if (true != z) {
                    icon = null;
                }
                imageView3.setImageDrawable(icon);
                if (this.f.getVisibility() != 0) {
                    this.f.setVisibility(0);
                }
            }
        }
        setEnabled(imVar.isEnabled());
        boolean hasSubMenu = imVar.hasSubMenu();
        ImageView imageView4 = this.k;
        if (imageView4 != null) {
            if (true != hasSubMenu) {
                i4 = 8;
            }
            imageView4.setVisibility(i4);
        }
        setContentDescription(imVar.l);
    }

    @Override // android.view.View
    protected final void onFinishInflate() {
        super.onFinishInflate();
        setBackground(this.m);
        TextView textView = (TextView) findViewById(R.id.title);
        this.h = textView;
        int i = this.n;
        if (i != -1) {
            textView.setTextAppearance(this.o, i);
        }
        this.j = (TextView) findViewById(R.id.shortcut);
        ImageView imageView = (ImageView) findViewById(R.id.submenuarrow);
        this.k = imageView;
        if (imageView != null) {
            imageView.setImageDrawable(this.p);
        }
        this.b = (ImageView) findViewById(R.id.group_divider);
        this.l = (LinearLayout) findViewById(R.id.content);
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected final void onMeasure(int i, int i2) {
        if (this.f != null && this.c) {
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) this.f.getLayoutParams();
            if (layoutParams.height > 0 && layoutParams2.width <= 0) {
                layoutParams2.width = layoutParams.height;
            }
        }
        super.onMeasure(i, i2);
    }

    public ListMenuItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet);
        ktk A = ktk.A(getContext(), attributeSet, gc.s, i, 0);
        this.m = A.p(5);
        this.n = A.n(1, -1);
        this.c = A.u(7, false);
        this.o = context;
        this.p = A.p(8);
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(null, new int[]{android.R.attr.divider}, R.attr.dropDownListViewStyle, 0);
        this.d = obtainStyledAttributes.hasValue(0);
        A.t();
        obtainStyledAttributes.recycle();
    }
}
