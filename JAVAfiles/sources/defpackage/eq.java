package defpackage;

import android.support.v7.app.AlertController;
import android.view.View;
import android.widget.AdapterView;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class eq implements AdapterView.OnItemClickListener {
    final /* synthetic */ AlertController.RecycleListView a;
    final /* synthetic */ AlertController b;
    final /* synthetic */ er c;

    public eq(er erVar, AlertController.RecycleListView recycleListView, AlertController alertController) {
        this.c = erVar;
        this.a = recycleListView;
        this.b = alertController;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        boolean[] zArr = this.c.u;
        if (zArr != null) {
            zArr[i] = this.a.isItemChecked(i);
        }
        this.c.y.onClick(this.b.b, i, this.a.isItemChecked(i));
    }
}
