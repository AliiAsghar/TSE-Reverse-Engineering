package defpackage;

import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import com.google.android.ims.message.rbm.RbmSpecificMessage;
import com.google.android.ims.rcsservice.businessinfo.BusinessInfoData;
import com.google.android.ims.rcsservice.businessinfo.BusinessInfoDatabaseConstants;
import com.google.android.ims.rcsservice.chatsession.message.RichCardContainer;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class vxv {
    public static final xze a = xze.g("BugleDataModel", "IncomingRbmMessageHandler");
    public final armf b;
    public final armf c;
    public final vqy d;
    public final prd e;
    public final alhr f;
    public boolean g;
    public ParticipantsTable.BindData h;
    public boolean i;
    public RichCardContainer j;
    public BusinessInfoData k;
    public final wfh l;

    public vxv(armf armfVar, armf armfVar2, wfh wfhVar, prd prdVar, msk mskVar, vqy vqyVar) {
        this.b = armfVar;
        this.c = armfVar2;
        this.l = wfhVar;
        this.d = vqyVar;
        this.e = prdVar;
        this.f = albo.D(new ubu(mskVar, vqyVar, 13));
    }

    public final ParticipantsTable.BindData a(msh mshVar, String str, String str2) {
        String str3 = (String) Optional.ofNullable(mshVar.g()).orElse(this.d.c.d);
        xyo c = a.c();
        c.H("No existing bot participant. Creating one.");
        c.L("id", str3);
        c.L("name", str);
        c.z(BusinessInfoDatabaseConstants.BusinessInfoTableConstants.Columns.COLOR, str2);
        c.q();
        return rxn.a(str3, str, str2);
    }

    public final boolean b() {
        d.t(this.g, "Did you forget to call validateMessageAndInit()?");
        if (this.j != null) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean c() {
        d.t(this.g, "Did you forget to call validateMessageAndInit()?");
        return this.i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean d() {
        return RbmSpecificMessage.CONTENT_TYPE.equals(this.d.l);
    }
}
