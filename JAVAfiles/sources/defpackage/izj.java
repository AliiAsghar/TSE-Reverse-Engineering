package defpackage;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.conversation.settings.BusinessContactActionView;
import com.google.android.ims.rcsservice.businessinfo.BusinessInfoData;
import com.google.android.ims.rcsservice.businessinfo.BusinessInfoProperty;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class izj extends ArrayAdapter {
    final /* synthetic */ List a;
    final /* synthetic */ BusinessInfoData b;
    final /* synthetic */ List c;
    final /* synthetic */ List d;
    final /* synthetic */ List e;
    final /* synthetic */ List f;
    final /* synthetic */ izk g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public izj(izk izkVar, Context context, List list, List list2, BusinessInfoData businessInfoData, List list3, List list4, List list5, List list6) {
        super(context, 0, list);
        this.a = list2;
        this.b = businessInfoData;
        this.c = list3;
        this.d = list4;
        this.e = list5;
        this.f = list6;
        this.g = izkVar;
    }

    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        xvd xvdVar;
        View view2 = view;
        if (view == null) {
            View inflate = this.g.F().getLayoutInflater().inflate(R.layout.business_contact_action, viewGroup, false);
            iyj iyjVar = new iyj();
            iyjVar.a = (TextView) inflate.findViewById(R.id.business_contact_action_header);
            iyjVar.b = (TextView) inflate.findViewById(R.id.business_contact_action_sub_header);
            iyjVar.c = (ImageView) inflate.findViewById(R.id.business_contact_action_icon);
            iyjVar.d = inflate.findViewById(R.id.business_contact_action_group_divider);
            iyjVar.e = inflate.findViewById(R.id.business_contact_action_row);
            inflate.setTag(iyjVar);
            view2 = inflate;
        }
        BusinessInfoProperty businessInfoProperty = (BusinessInfoProperty) this.a.get(i);
        String value = businessInfoProperty.getValue();
        msh a = ((msk) this.g.a.b()).a(this.b.getRbmBotId());
        if (this.c.contains(businessInfoProperty)) {
            xvdVar = this.g.d.O(a, value);
        } else if (this.d.contains(businessInfoProperty)) {
            xvdVar = this.g.b.M(a, value);
        } else if (this.e.contains(businessInfoProperty)) {
            xvdVar = this.g.c.N(a, value);
        } else {
            xvdVar = null;
        }
        String header = businessInfoProperty.getHeader();
        String subHeader = businessInfoProperty.getSubHeader();
        BusinessContactActionView businessContactActionView = (BusinessContactActionView) view2;
        if (this.f.contains(Integer.valueOf(i))) {
            businessContactActionView.a(xvdVar, header, subHeader, true);
        } else {
            businessContactActionView.a(xvdVar, header, subHeader, false);
        }
        return view2;
    }
}
