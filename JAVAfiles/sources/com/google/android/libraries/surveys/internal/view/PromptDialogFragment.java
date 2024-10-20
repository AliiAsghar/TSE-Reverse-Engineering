package com.google.android.libraries.surveys.internal.view;

import android.app.Activity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import defpackage.ajao;
import defpackage.ajap;
import defpackage.bw;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class PromptDialogFragment extends bw implements ajao {
    private final ajap ag = new ajap(this);

    @Override // defpackage.cg
    public final View K(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return this.ag.l(viewGroup);
    }

    @Override // defpackage.cg
    public final void aa() {
        this.ag.d();
        super.aa();
    }

    @Override // defpackage.cg
    public final void af() {
        super.af();
        this.ag.e(this.Q);
    }

    @Override // defpackage.bw, defpackage.cg
    public final void g(Bundle bundle) {
        super.g(bundle);
        this.ag.k();
    }

    @Override // defpackage.ajao
    public final /* bridge */ /* synthetic */ Activity getActivity() {
        return super.fe();
    }
}
