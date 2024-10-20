package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.ui.mediapicker.c2o.gallery.PermissionContentItemView;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aarq extends akhz {
    final /* synthetic */ aarm a;

    public aarq(aarm aarmVar) {
        this.a = aarmVar;
    }

    @Override // defpackage.akhz
    public final /* bridge */ /* synthetic */ View a(ViewGroup viewGroup) {
        return (PermissionContentItemView) LayoutInflater.from(this.a.d).inflate(R.layout.compose2o_permissions_item_view, viewGroup, false);
    }

    @Override // defpackage.akhz
    public final /* bridge */ /* synthetic */ void b(View view, Object obj) {
        ((PermissionContentItemView) view).setOnClickListener(new aarv(this, 1));
    }

    @Override // defpackage.akhz
    public final /* bridge */ /* synthetic */ void c(View view) {
        ((PermissionContentItemView) view).setOnClickListener(null);
    }
}
