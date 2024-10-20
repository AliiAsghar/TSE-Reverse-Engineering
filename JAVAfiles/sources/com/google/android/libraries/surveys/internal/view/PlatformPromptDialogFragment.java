package com.google.android.libraries.surveys.internal.view;

import android.app.DialogFragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import defpackage.ajao;
import defpackage.ajap;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class PlatformPromptDialogFragment extends DialogFragment implements ajao {
    private final ajap a = new ajap(this);

    @Override // android.app.DialogFragment, android.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.a.k();
    }

    @Override // android.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return this.a.l(viewGroup);
    }

    @Override // android.app.Fragment
    public final void onDestroy() {
        this.a.d();
        super.onDestroy();
    }

    @Override // android.app.Fragment
    public final void onResume() {
        super.onResume();
        this.a.e(getView());
    }
}
