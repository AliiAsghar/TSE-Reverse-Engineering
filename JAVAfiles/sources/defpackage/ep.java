package defpackage;

import android.support.v7.app.AlertController;
import android.view.View;
import android.widget.AdapterView;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class ep implements AdapterView.OnItemClickListener {
    final /* synthetic */ AlertController a;
    final /* synthetic */ er b;

    public ep(er erVar, AlertController alertController) {
        this.b = erVar;
        this.a = alertController;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        this.b.s.onClick(this.a.b, i);
        if (!this.b.w) {
            this.a.b.dismiss();
        }
    }
}
