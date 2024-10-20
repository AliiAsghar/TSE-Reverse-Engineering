package com.google.android.apps.messaging.diagnostics.ui;

import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import com.google.android.apps.messaging.R;
import defpackage.klx;
import defpackage.kmw;
import defpackage.kow;
import defpackage.koy;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class DiagnosticsFragment extends koy {
    public kmw a;
    public Button b;
    public Button c;
    private kow d;

    @Override // defpackage.cg
    public final View K(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i = 0;
        View inflate = layoutInflater.inflate(R.layout.diagnostics_fragment, viewGroup, false);
        Button button = (Button) inflate.findViewById(R.id.diagnostics_start_button);
        this.c = button;
        button.setOnClickListener(new klx(this, 5));
        RecyclerView recyclerView = (RecyclerView) inflate.findViewById(R.id.diagnostics_recycler_view);
        recyclerView.aF();
        x();
        recyclerView.aj(new LinearLayoutManager());
        recyclerView.ag(this.d);
        Button button2 = (Button) inflate.findViewById(R.id.diagnostics_share_log_button);
        this.b = button2;
        if (true != this.a.e.d()) {
            i = 8;
        }
        button2.setVisibility(i);
        this.b.setOnClickListener(new klx(this, 6));
        return inflate;
    }

    @Override // defpackage.cg
    public final void g(Bundle bundle) {
        super.g(bundle);
        this.d = new kow(this.a.a(), x());
    }
}
