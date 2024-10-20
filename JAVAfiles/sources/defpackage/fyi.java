package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.apps.messaging.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class fyi extends no {
    protected List d = new ArrayList();
    public final /* synthetic */ fyj e;

    /* JADX INFO: Access modifiers changed from: protected */
    public fyi(fyj fyjVar) {
        this.e = fyjVar;
    }

    protected abstract void G(ajbx ajbxVar);

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.CharSequence, java.lang.Object] */
    @Override // defpackage.no
    /* renamed from: H, reason: merged with bridge method [inline-methods] */
    public void g(ajbx ajbxVar, int i) {
        boolean z;
        ert ertVar = this.e.D;
        if (ertVar == null) {
            return;
        }
        if (i == 0) {
            G(ajbxVar);
            return;
        }
        apuv apuvVar = (apuv) this.d.get(i - 1);
        esa esaVar = ((esf) apuvVar.c).b;
        int i2 = 0;
        if (ertVar.I().A.get(esaVar) != null && apuvVar.q()) {
            z = true;
        } else {
            z = false;
        }
        ((TextView) ajbxVar.t).setText((CharSequence) apuvVar.b);
        Object obj = ajbxVar.s;
        if (true != z) {
            i2 = 4;
        }
        ((View) obj).setVisibility(i2);
        ajbxVar.a.setOnClickListener(new kov(this, ertVar, esaVar, apuvVar, 1));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void I() {
        this.d = Collections.emptyList();
    }

    @Override // defpackage.no
    public final int b() {
        if (this.d.isEmpty()) {
            return 0;
        }
        return this.d.size() + 1;
    }

    @Override // defpackage.no
    public final /* bridge */ /* synthetic */ oo e(ViewGroup viewGroup, int i) {
        return new ajbx(LayoutInflater.from(this.e.getContext()).inflate(R.layout.exo_styled_sub_settings_list_item, viewGroup, false), (char[]) null);
    }

    public abstract void m(String str);
}
