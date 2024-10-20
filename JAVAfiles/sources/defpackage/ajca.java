package defpackage;

import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ViewFlipper;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ajca extends ajcd {
    public static final alwo a = alwo.o("TachyonCountryCodeSel");
    public boolean ag;
    public aazm ah;
    public ViewFlipper b;
    public RecyclerView c;
    public ajby d;
    public LinearLayoutManager e;

    @Override // defpackage.cg
    public final View K(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(R.layout.fragment_country_code, viewGroup, false);
    }

    /* JADX WARN: Type inference failed for: r5v6, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v9, types: [java.lang.Object, anen] */
    @Override // defpackage.cg
    public final void ag(View view, Bundle bundle) {
        this.b = (ViewFlipper) view.findViewById(R.id.country_code_view_flipper);
        this.c = (RecyclerView) view.findViewById(R.id.country_code_list);
        x();
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager();
        this.e = linearLayoutManager;
        this.c.aj(linearLayoutManager);
        boolean z = false;
        this.b.setDisplayedChild(0);
        albo.bR(((zfh) this.ah.c.b()).a.submit(new ajcc()), new adnx(this, 19), andi.a);
        ajby ajbyVar = new ajby(new asqc(this), this.m.getString("com.google.android.libraries.tachyon.countrycode.arg.COUNTRY_CODE_SELECTED"));
        this.d = ajbyVar;
        this.c.ag(ajbyVar);
        if (bundle != null) {
            z = true;
        }
        this.ag = z;
    }
}
