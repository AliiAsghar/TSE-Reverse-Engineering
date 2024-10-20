package defpackage;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ajby extends no {
    public alog c;
    public final asqc d;
    private final String e;

    public ajby(asqc asqcVar, String str) {
        int i = alog.d;
        this.c = alsx.a;
        this.d = asqcVar;
        this.e = str;
    }

    @Override // defpackage.no
    public final int b() {
        return this.c.size();
    }

    @Override // defpackage.no
    public final /* bridge */ /* synthetic */ oo e(ViewGroup viewGroup, int i) {
        return new ajbx(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.list_item_country_code, viewGroup, false));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.no
    public final /* bridge */ /* synthetic */ void g(oo ooVar, int i) {
        ajbx ajbxVar = (ajbx) ooVar;
        ajcb ajcbVar = (ajcb) this.c.get(i);
        Context context = ajbxVar.a.getContext();
        ((TextView) ajbxVar.s).setText(ajcbVar.b);
        ((TextView) ajbxVar.t).setText(context.getString(R.string.country_code_format, String.valueOf(ajcbVar.d)));
        ((TextView) ajbxVar.t).setSelected(true);
        boolean equals = TextUtils.equals(ajcbVar.c, this.e);
        ((TextView) ajbxVar.s).setTypeface(null, equals ? 1 : 0);
        ((TextView) ajbxVar.t).setTypeface(null, equals ? 1 : 0);
        ajbxVar.a.setOnClickListener(new ajat(this, ajcbVar, 7, null));
    }
}
