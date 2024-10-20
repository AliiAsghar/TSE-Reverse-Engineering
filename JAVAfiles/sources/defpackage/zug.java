package defpackage;

import android.text.TextUtils;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class zug {
    public final armf b;
    public final armf c;
    public final mho d;
    public final anen e;
    public final yfp f;
    public final armf g;
    public final Long h;
    public final int i;
    public tay j;
    public scm k;
    public agmc l;
    public agmc m;
    public final AtomicBoolean n = new AtomicBoolean(true);
    public final qya o;
    public final ahiy p;
    public final ansy q;
    private final ytk s;
    private static final xze r = xze.g("Bugle", "AddContactBanner2o");
    public static final alvi a = alvi.m("com/google/android/apps/messaging/ui/conversation/banners2o/addcontact/dataservice/AddContactBannerDataServiceImpl");

    public zug(ansy ansyVar, ahiy ahiyVar, armf armfVar, armf armfVar2, qya qyaVar, ytk ytkVar, mho mhoVar, yfp yfpVar, anen anenVar, armf armfVar3, Long l, Long l2) {
        this.q = ansyVar;
        this.p = ahiyVar;
        this.b = armfVar;
        this.c = armfVar2;
        this.o = qyaVar;
        this.s = ytkVar;
        this.d = mhoVar;
        this.e = anenVar;
        this.f = yfpVar;
        this.g = armfVar3;
        this.h = l;
        this.i = l2.intValue();
    }

    public static final boolean b(ParticipantsTable.BindData bindData) {
        if (bindData == null) {
            return false;
        }
        String O = bindData.O();
        if (msx.i(O) && !msx.g(O)) {
            return false;
        }
        return true;
    }

    private static boolean c(ryi ryiVar) {
        if (ryiVar != null && ryiVar.b().isPresent()) {
            return true;
        }
        return false;
    }

    private final boolean d(ParticipantsTable.BindData bindData) {
        if (bindData.A().a() && this.s.d()) {
            return true;
        }
        return false;
    }

    public final boolean a(ParticipantsTable.BindData bindData, ryi ryiVar) {
        boolean z;
        if (bindData != null && TextUtils.isEmpty(bindData.O())) {
            r.q("AddContactBannerDataServiceImpl#isParticipantValidForAddContact: 1:1 conversation, but otherParticipant's normalizedDestination is empty. Without this, we can't correctly add the destination as a contact, nor report it as spam.");
            return false;
        }
        if (bindData == null) {
            alvw g = a.g();
            g.X(alwp.a, "BugleBanners");
            ((alvg) ((alvg) g).h("com/google/android/apps/messaging/ui/conversation/banners2o/addcontact/dataservice/AddContactBannerDataServiceImpl", "isParticipantValidForBanner", 288, "AddContactBannerDataServiceImpl.java")).q("Invalid participant for add contact, group conversation");
            return false;
        }
        alvw g2 = a.g();
        g2.X(alwp.a, "BugleBanners");
        alvg alvgVar = (alvg) g2;
        alvgVar.X(zuc.a, Boolean.valueOf(bindData.T()));
        alvgVar.X(zuc.b, Boolean.valueOf(bindData.R()));
        alvgVar.X(zuc.d, Boolean.valueOf(!TextUtils.isEmpty(bindData.N())));
        alvgVar.X(zuc.c, Boolean.valueOf(c(ryiVar)));
        alvgVar.X(zuc.e, Boolean.valueOf(!b(bindData)));
        alvgVar.X(zuc.f, Boolean.valueOf(d(bindData)));
        alvz alvzVar = zuc.g;
        if (bindData.n() == 1) {
            z = true;
        } else {
            z = false;
        }
        alvgVar.X(alvzVar, Boolean.valueOf(z));
        ((alvg) alvgVar.h("com/google/android/apps/messaging/ui/conversation/banners2o/addcontact/dataservice/AddContactBannerDataServiceImpl", "isParticipantValidForBanner", 303, "AddContactBannerDataServiceImpl.java")).q("Check add contact banner is participant valid for add contact banner");
        if (bindData.n() == 1 || d(bindData) || ((!lbp.c() && !b(bindData)) || !TextUtils.isEmpty(bindData.N()) || c(ryiVar) || bindData.R() || bindData.T())) {
            return false;
        }
        return true;
    }
}
