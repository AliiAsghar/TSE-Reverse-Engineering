package defpackage;

import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;
import com.google.android.apps.messaging.R;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final /* synthetic */ class ajbe implements View.OnFocusChangeListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ View b;
    public final /* synthetic */ TextView c;
    public final /* synthetic */ Object d;
    private final /* synthetic */ int e;

    public /* synthetic */ ajbe(ajac ajacVar, int i, CheckBox checkBox, EditText editText, int i2) {
        this.e = i2;
        this.d = ajacVar;
        this.a = i;
        this.c = checkBox;
        this.b = editText;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.List, java.lang.Object] */
    @Override // android.view.View.OnFocusChangeListener
    public final void onFocusChange(View view, boolean z) {
        if (this.e != 0) {
            View view2 = this.b;
            Object obj = this.d;
            if (z) {
                TextView textView = this.c;
                ajac ajacVar = (ajac) obj;
                ajacVar.a[this.a] = true;
                ((CheckBox) textView).setChecked(true);
                ((EditText) view2).setHintTextColor(ajacVar.getContext().getColor(R.color.survey_hint_text_color));
                ajacVar.c.a(new agrk(ajacVar.b, ajacVar.a, (byte[]) null));
                return;
            }
            ((EditText) view2).setHintTextColor(((ajac) obj).getContext().getColor(R.color.survey_hint_text_unfocused_color));
            return;
        }
        TextView textView2 = this.c;
        View view3 = this.b;
        if (z) {
            int i = this.a;
            ?? r1 = this.d;
            ajbh ajbhVar = (ajbh) view3;
            ((EditText) textView2).setHintTextColor(ajbhVar.getContext().getColor(R.color.survey_hint_text_color));
            ajbhVar.a.a(new aspl(4, "", ((apqg) r1.get(i)).d));
            return;
        }
        ((EditText) textView2).setHintTextColor(((ajbh) view3).getContext().getColor(R.color.survey_hint_text_unfocused_color));
    }

    public /* synthetic */ ajbe(ajbh ajbhVar, EditText editText, List list, int i, int i2) {
        this.e = i2;
        this.b = ajbhVar;
        this.c = editText;
        this.d = list;
        this.a = i;
    }
}
