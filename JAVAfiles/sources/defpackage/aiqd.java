package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import com.google.android.apps.messaging.R;
import com.google.android.libraries.social.licenses.LicenseMenuActivity;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aiqd extends cg implements epi {
    public LicenseMenuActivity a;
    private ArrayAdapter b;

    @Override // defpackage.cg
    public final View K(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(R.layout.libraries_social_licenses_license_menu_fragment, viewGroup, false);
    }

    @Override // defpackage.epi
    public final epr a(int i, Bundle bundle) {
        return new aiqc(fe());
    }

    @Override // defpackage.cg
    public final void aa() {
        super.aa();
        epj.a(fe()).b(54321);
    }

    @Override // defpackage.cg
    public final void ag(View view, Bundle bundle) {
        cj fe = fe();
        this.b = new ArrayAdapter(fe, R.layout.libraries_social_licenses_license, R.id.license, new ArrayList());
        epj.a(fe).d(54321, null, this);
        ListView listView = (ListView) view.findViewById(R.id.license_list);
        listView.setAdapter((ListAdapter) this.b);
        listView.setOnItemClickListener(new ov(this, 3, null));
    }

    @Override // defpackage.epi
    public final /* bridge */ /* synthetic */ void b(epr eprVar, Object obj) {
        this.b.clear();
        this.b.addAll((List) obj);
        this.b.notifyDataSetChanged();
    }

    @Override // defpackage.epi
    public final void c(epr eprVar) {
        this.b.clear();
        this.b.notifyDataSetChanged();
    }

    @Override // defpackage.cg
    public final void f(Context context) {
        super.f(context);
        cj fe = fe();
        if (fe instanceof LicenseMenuActivity) {
            this.a = (LicenseMenuActivity) fe;
        }
    }

    @Override // defpackage.cg
    public final void i() {
        super.i();
        this.a = null;
    }
}
