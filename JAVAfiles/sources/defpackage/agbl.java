package defpackage;

import android.R;
import android.app.Activity;
import android.view.ViewGroup;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class agbl extends arrp implements arqg {
    final /* synthetic */ Activity a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public agbl(Activity activity) {
        super(0);
        this.a = activity;
    }

    @Override // defpackage.arqg
    public final /* bridge */ /* synthetic */ Object a() {
        return (ViewGroup) this.a.findViewById(R.id.content);
    }
}
