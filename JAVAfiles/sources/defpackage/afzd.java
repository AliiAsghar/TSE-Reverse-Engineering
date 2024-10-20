package defpackage;

import android.R;
import android.content.Context;
import android.graphics.Canvas;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import defpackage.dli;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class afzd extends afze {
    static final /* synthetic */ artm[] a;
    private static final alvi q;
    public final dli.a b;
    public agak c;
    public dqv d;
    public final arsn e;
    public final arsn f;
    public final arsn g;
    public final arsn h;
    public final arsn i;
    public final arsn j;
    public final arsn k;
    public final arsn l;
    public boolean m;
    public boolean n;
    public final arsn o;
    public aiim p;
    private final arml r;
    private boolean s;
    private final arsn t;

    static {
        arrr arrrVar = new arrr(afzd.class, "textStyle", "getTextStyle$java_com_google_android_libraries_compose_ui_composable_text_emoji_text_field_AUTO_DEPS_ORIGINAL()Landroidx/compose/ui/text/TextStyle;", 0);
        int i = arsc.a;
        a = new artm[]{arrrVar, new arrr(afzd.class, "layoutDirection", "getLayoutDirection$java_com_google_android_libraries_compose_ui_composable_text_emoji_text_field_AUTO_DEPS_ORIGINAL()Landroidx/compose/ui/unit/LayoutDirection;", 0), new arrr(afzd.class, "keyboardOptions", "getKeyboardOptions$java_com_google_android_libraries_compose_ui_composable_text_emoji_text_field_AUTO_DEPS_ORIGINAL()Landroidx/compose/foundation/text/KeyboardOptions;", 0), new arrr(afzd.class, "keyboardActions", "getKeyboardActions$java_com_google_android_libraries_compose_ui_composable_text_emoji_text_field_AUTO_DEPS_ORIGINAL()Landroidx/compose/foundation/text/KeyboardActions;", 0), new arrr(afzd.class, "verticalPadding", "getVerticalPadding-D9Ej5fM$java_com_google_android_libraries_compose_ui_composable_text_emoji_text_field_AUTO_DEPS_ORIGINAL()F", 0), new arrr(afzd.class, "minHeight", "getMinHeight-D9Ej5fM$java_com_google_android_libraries_compose_ui_composable_text_emoji_text_field_AUTO_DEPS_ORIGINAL()F", 0), new arrr(afzd.class, "maxHeight", "getMaxHeight-D9Ej5fM$java_com_google_android_libraries_compose_ui_composable_text_emoji_text_field_AUTO_DEPS_ORIGINAL()F", 0), new arrr(afzd.class, "maxLength", "getMaxLength$java_com_google_android_libraries_compose_ui_composable_text_emoji_text_field_AUTO_DEPS_ORIGINAL()Ljava/lang/Integer;", 0), new arrr(afzd.class, "placeholder", "getPlaceholder$java_com_google_android_libraries_compose_ui_composable_text_emoji_text_field_AUTO_DEPS_ORIGINAL()Lcom/google/android/libraries/compose/ui/composable/text/TextPlaceholder;", 0), new arrr(afzd.class, "hasExplicitFocus", "getHasExplicitFocus$java_com_google_android_libraries_compose_ui_composable_text_emoji_text_field_AUTO_DEPS_ORIGINAL()Ljava/lang/Boolean;", 0)};
        q = alvi.m("com/google/android/libraries/compose/ui/composable/text/EmojiTextFieldView");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public afzd(Context context, dli.a aVar) {
        super(context);
        aVar.getClass();
        this.b = aVar;
        this.r = armd.a(new afzg(this, 1));
        this.e = new afyu(dje.a, this);
        this.f = new afyv(this);
        this.g = new afyw(ayc.a, this);
        this.h = new afyx(ayb.a, this);
        this.i = new afyy(new dqy(Float.NaN), this);
        this.j = new afyz(new dqy(Float.NaN), this);
        this.k = new afza(new dqy(Float.NaN), this);
        this.l = new afzb(this);
        this.t = new afzc(this);
        this.o = new afyt(this);
    }

    public final dqv b() {
        dqv dqvVar = this.d;
        if (dqvVar != null) {
            return dqvVar;
        }
        arro.b("density");
        return null;
    }

    public final aflf c() {
        return (aflf) this.r.a();
    }

    public final agak d() {
        agak agakVar = this.c;
        if (agakVar != null) {
            return agakVar;
        }
        arro.b("keyboardManager");
        return null;
    }

    public final Boolean e() {
        return (Boolean) this.o.c(a[9]);
    }

    public final void f() {
        agaq d = d().d();
        if (d != agaq.a && d != agaq.b) {
            return;
        }
        d().e(this, true);
    }

    public final void g() {
        agaq d = d().d();
        if (d == agaq.d || d == agaq.c) {
            d().f(this, false);
        }
    }

    public final void h(afzq afzqVar) {
        this.t.d(a[8], afzqVar);
    }

    @Override // defpackage.ekf, defpackage.kn, android.widget.TextView, android.view.View
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        editorInfo.getClass();
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        onCreateInputConnection.getClass();
        if (d.F(e(), true)) {
            if (!hasFocus()) {
                requestFocus();
            }
            g();
        } else if (d.F(e(), false)) {
            f();
        }
        return onCreateInputConnection;
    }

    @Override // android.widget.TextView, android.view.View
    protected final void onDraw(Canvas canvas) {
        canvas.getClass();
        if (!this.n) {
            super.onDraw(canvas);
            return;
        }
        try {
            super.onDraw(canvas);
            if (this.s) {
                alvg alvgVar = (alvg) q.i();
                alvgVar.Z(alwk.FULL);
                ((alvg) alvgVar.h("com/google/android/libraries/compose/ui/composable/text/EmojiTextFieldView", "onDraw", 355, "HugoEmojiTextField.kt")).q("Recovered from NPE");
                this.s = false;
            }
        } catch (NullPointerException e) {
            this.s = true;
            if (getLayout() == null && getHint() == null) {
                ((alvg) ((alvg) q.h()).g(e).h("com/google/android/libraries/compose/ui/composable/text/EmojiTextFieldView", "onDraw", 361, "HugoEmojiTextField.kt")).q("null hint & layout");
                return;
            }
            if (getLayout() != null && getHint() == null) {
                ((alvg) ((alvg) q.h()).g(e).h("com/google/android/libraries/compose/ui/composable/text/EmojiTextFieldView", "onDraw", 362, "HugoEmojiTextField.kt")).q("null hint");
                return;
            }
            if (getLayout() == null && getHint() != null) {
                ((alvg) ((alvg) q.h()).g(e).h("com/google/android/libraries/compose/ui/composable/text/EmojiTextFieldView", "onDraw", 363, "HugoEmojiTextField.kt")).q("null layout");
            } else if (getLayout() != null && getHint() != null) {
                ((alvg) ((alvg) q.h()).g(e).h("com/google/android/libraries/compose/ui/composable/text/EmojiTextFieldView", "onDraw", 364, "HugoEmojiTextField.kt")).q("No null");
            }
        }
    }

    @Override // defpackage.kn, android.widget.EditText, android.widget.TextView
    public final boolean onTextContextMenuItem(int i) {
        if (i == 16908322) {
            if (this.m) {
                return super.onTextContextMenuItem(R.id.pasteAsPlainText);
            }
            i = 16908322;
        }
        return super.onTextContextMenuItem(i);
    }
}
