package defpackage;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.google.android.apps.messaging.R;
import com.google.android.ims.rcsservice.businessinfo.BusinessInfoData;
import com.google.android.ims.rcsservice.businessinfo.BusinessInfoProperty;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class izk extends iyz {
    public armf a;
    public znj b;
    public znj c;
    public znj d;

    @Override // defpackage.cg
    public final View K(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        LinearLayout linearLayout = (LinearLayout) layoutInflater.inflate(R.layout.info_and_options_page_info_tab_fragment, viewGroup, false);
        izh izhVar = this.e;
        if (izhVar != null) {
            BusinessInfoData businessInfoData = (BusinessInfoData) izhVar.b().orElse(null);
            if (businessInfoData == null) {
                xzb.g("Bugle", "Can't load business info contact actions: business info is null");
            } else {
                alog<BusinessInfoProperty> phoneNumbers = businessInfoData.getPhoneNumbers();
                alog<BusinessInfoProperty> websites = businessInfoData.getWebsites();
                alog<BusinessInfoProperty> emailAddresses = businessInfoData.getEmailAddresses();
                ArrayList arrayList = new ArrayList();
                arrayList.addAll(phoneNumbers);
                arrayList.addAll(websites);
                arrayList.addAll(emailAddresses);
                List[] listArr = {phoneNumbers, websites, emailAddresses};
                ArrayList arrayList2 = new ArrayList();
                int i = -1;
                for (int i2 = 0; i2 < 3; i2++) {
                    List list = listArr[i2];
                    if (list != null && list.size() > 0) {
                        i += list.size();
                        arrayList2.add(Integer.valueOf(i));
                    }
                }
                if (!arrayList2.isEmpty()) {
                    arrayList2.remove(arrayList2.size() - 1);
                }
                izj izjVar = new izj(this, F(), arrayList, arrayList, businessInfoData, phoneNumbers, websites, emailAddresses, arrayList2);
                for (int i3 = 0; i3 < izjVar.getCount(); i3++) {
                    linearLayout.addView(izjVar.getView(i3, null, linearLayout));
                }
            }
        }
        return linearLayout;
    }
}
