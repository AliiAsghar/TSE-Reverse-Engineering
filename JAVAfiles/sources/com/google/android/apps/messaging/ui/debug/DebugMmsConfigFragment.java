package com.google.android.apps.messaging.ui.debug;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.TextView;
import com.google.android.apps.messaging.R;
import defpackage.aafl;
import defpackage.aajp;
import defpackage.aalh;
import defpackage.aamg;
import defpackage.cj;
import defpackage.ev;
import defpackage.xan;
import defpackage.xbf;
import defpackage.yck;
import defpackage.ycl;
import defpackage.yjy;
import defpackage.ykb;
import defpackage.yyz;
import defpackage.zjq;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class DebugMmsConfigFragment extends aamg {
    public ev a;
    public yck ag;
    public zjq ah;
    private ListView ai;
    private View aj;
    public int[] b;
    public int c;
    public aajp d;
    public yjy e;

    @Override // defpackage.cg
    public final View K(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.mms_config_debug_fragment, viewGroup, false);
        this.aj = inflate;
        this.ai = (ListView) inflate.findViewById(android.R.id.list);
        Spinner spinner = (Spinner) this.aj.findViewById(R.id.sim_selector);
        List l = this.e.l();
        Integer[] numArr = new Integer[l.size()];
        for (int i = 0; i < l.size(); i++) {
            numArr[i] = Integer.valueOf(((ykb) l.get(i)).a());
        }
        ArrayAdapter arrayAdapter = new ArrayAdapter(fe(), android.R.layout.simple_spinner_item, numArr);
        arrayAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter((SpinnerAdapter) arrayAdapter);
        spinner.setOnItemSelectedListener(new aalh(this, numArr, 1));
        ((TextView) this.aj.findViewById(R.id.sim_title)).setOnClickListener(new aafl(this, 8));
        return this.aj;
    }

    public final void a() {
        d(true);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v0, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v2, types: [armf, java.lang.Object] */
    public final void d(boolean z) {
        zjq zjqVar = this.ah;
        ?? r1 = zjqVar.c;
        cj fe = fe();
        int i = this.c;
        xbf xbfVar = (xbf) r1.b();
        xbfVar.getClass();
        xan xanVar = (xan) zjqVar.b.b();
        xanVar.getClass();
        yyz yyzVar = (yyz) zjqVar.a.b();
        yyzVar.getClass();
        fe.getClass();
        aajp aajpVar = new aajp(xbfVar, xanVar, yyzVar, fe, i, z);
        this.d = aajpVar;
        this.ai.setAdapter((ListAdapter) aajpVar);
        this.b = ((ycl) this.ag.e.b()).a(this.c);
        TextView textView = (TextView) this.aj.findViewById(R.id.sim_title);
        int[] iArr = this.b;
        textView.setText("(" + iArr[0] + "/" + iArr[1] + ") " + fe().getString(R.string.debug_sub_id_spinner_text));
    }
}
