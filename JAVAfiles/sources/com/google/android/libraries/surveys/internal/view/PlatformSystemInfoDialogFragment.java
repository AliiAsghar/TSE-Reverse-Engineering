package com.google.android.libraries.surveys.internal.view;

import android.app.Dialog;
import android.app.DialogFragment;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.messaging.R;
import defpackage.agrb;
import defpackage.ahnz;
import defpackage.ajaj;
import defpackage.ajbt;
import defpackage.eu;
import defpackage.ev;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class PlatformSystemInfoDialogFragment extends DialogFragment {
    public static final /* synthetic */ int a = 0;

    @Override // android.app.DialogFragment
    public final Dialog onCreateDialog(Bundle bundle) {
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(getActivity(), R.style.SurveyTheme);
        View inflate = ((LayoutInflater) contextThemeWrapper.getSystemService("layout_inflater")).inflate(R.layout.survey_system_info_dialog, (ViewGroup) null);
        inflate.getContext().setTheme(R.style.SurveyAlertDialogCustomViewTheme);
        eu T = ahnz.T(contextThemeWrapper);
        T.setView(inflate);
        ev create = T.create();
        inflate.findViewById(R.id.survey_system_info_dialog_ok_button).setOnClickListener(new agrb(create, 17, null));
        Bundle arguments = getArguments();
        String string = arguments.getString("EXTRA_ACCOUNT_NAME");
        Bundle bundle2 = arguments.getBundle("EXTRA_PSD_BUNDLE");
        RecyclerView recyclerView = (RecyclerView) inflate.findViewById(R.id.survey_system_info_dialog_list_items);
        recyclerView.aj(new LinearLayoutManager());
        ajbt ajbtVar = new ajbt();
        recyclerView.ag(ajbtVar);
        recyclerView.aL(new ajaj(this, inflate));
        ajbtVar.m(ahnz.O(contextThemeWrapper, string, bundle2));
        return create;
    }
}
