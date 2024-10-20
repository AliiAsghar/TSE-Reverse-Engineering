package com.google.android.libraries.surveys.internal.view;

import android.app.Dialog;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.messaging.R;
import defpackage.ahnz;
import defpackage.ajbs;
import defpackage.ajbt;
import defpackage.ajeg;
import defpackage.bw;
import defpackage.eu;
import defpackage.ev;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class SystemInfoDialogFragment extends bw {
    @Override // defpackage.bw
    public final Dialog gM(Bundle bundle) {
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(fe(), R.style.SurveyTheme);
        View inflate = ((LayoutInflater) contextThemeWrapper.getSystemService("layout_inflater")).inflate(R.layout.survey_system_info_dialog, (ViewGroup) null);
        inflate.getContext().setTheme(R.style.SurveyAlertDialogCustomViewTheme);
        eu T = ahnz.T(contextThemeWrapper);
        T.setView(inflate);
        ev create = T.create();
        inflate.findViewById(R.id.survey_system_info_dialog_ok_button).setOnClickListener(new ajeg(create, 1));
        Bundle bundle2 = this.m;
        String string = bundle2.getString("EXTRA_ACCOUNT_NAME");
        Bundle bundle3 = bundle2.getBundle("EXTRA_PSD_BUNDLE");
        RecyclerView recyclerView = (RecyclerView) inflate.findViewById(R.id.survey_system_info_dialog_list_items);
        recyclerView.aj(new LinearLayoutManager());
        ajbt ajbtVar = new ajbt();
        recyclerView.ag(ajbtVar);
        recyclerView.aL(new ajbs(this, inflate));
        ajbtVar.m(ahnz.O(contextThemeWrapper, string, bundle3));
        return create;
    }
}
