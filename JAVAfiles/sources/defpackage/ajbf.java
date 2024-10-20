package defpackage;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.View;
import android.widget.CheckBox;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ajbf implements TextWatcher {
    final /* synthetic */ int a;
    final /* synthetic */ Object b;
    final /* synthetic */ View c;
    private final /* synthetic */ int d;

    public ajbf(ajac ajacVar, int i, CheckBox checkBox, int i2) {
        this.d = i2;
        this.a = i;
        this.c = checkBox;
        this.b = ajacVar;
    }

    /* JADX WARN: Type inference failed for: r3v3, types: [java.util.List, java.lang.Object] */
    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        if (this.d != 0) {
            String trim = charSequence.toString().trim();
            if (!TextUtils.isEmpty(trim)) {
                Object obj = this.b;
                ((ajac) obj).a[this.a] = true;
                ((CheckBox) this.c).setChecked(true);
                ajac ajacVar = (ajac) this.b;
                ajacVar.b = trim;
                ajacVar.c.a(new agrk(ajacVar.b, ajacVar.a, (byte[]) null));
                return;
            }
            return;
        }
        String trim2 = charSequence.toString().trim();
        if (!TextUtils.isEmpty(trim2)) {
            ((ajbh) this.c).a.a(new aspl(4, trim2, ((apqg) this.b.get(this.a)).d));
        }
    }

    public ajbf(ajbh ajbhVar, List list, int i, int i2) {
        this.d = i2;
        this.b = list;
        this.a = i;
        this.c = ajbhVar;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }
}
